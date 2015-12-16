# benchmark-of-bcrypt

a java tool to do a benchmark of bcrypt.

organize by maven.

use `mvn package` to package it to a jar file.

in command line, type 

`java -jar (path)/benchmark-of-bcrypt-0.1.jar  "some info here, maybe on my local machine"`

following is an example:



``` 
$ java -jar target/benchmark-of-bcrypt-0.1.jar  "on my local machine"
StopWatch 'Following is stopwatch records that the durations of Bcrypt hashing some random string.
on my local machine
': running time (millis) = 2896
-----------------------------------------
ms     %     Task name
-----------------------------------------
00066  002%  the cost is 8
00046  002%  the cost is 9
00093  003%  the cost is 10
00188  006%  the cost is 11
00364  013%  the cost is 12
00707  024%  the cost is 13
01432  049%  the cost is 14
```

