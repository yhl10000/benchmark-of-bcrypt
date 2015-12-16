package com.yhl10000.research;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.util.StopWatch;

/**
 * Created by yhl10000 on 12/16/15.
 */
public class BenchmarkOfBcrypt {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Following is stopwatch records that the durations of Bcrypt hashing some random string.\n");

        for (String arg : args) {
            sb.append(arg).append("\n");
        }

        StopWatch stopWatch = new StopWatch(sb.toString());

        for (int i = 8; i < 15; i++) {
            getDurationBasedOnCost(i, stopWatch);
        }

        System.out.println(stopWatch.prettyPrint());

    }

    static void getDurationBasedOnCost(int cost, StopWatch stopWatch)
    {
        stopWatch.start(new StringBuilder().append("the cost is ").append(cost).toString());
        String hash = new BCryptPasswordEncoder(cost).encode(RandomStringUtils.randomAscii(10));
        stopWatch.stop();
    }
}
