# Compact Headers

In java 25 compact headers were added as a feature (not enabled by default though).
This example showing the difference between used feature and not used.

## Resources

- <https://github.com/smijran/presentations>

## Run

Running without compact headers, just run regular program:

```shell
$ java src/main/java/com/pkonopacki1/App.java
Used memory before: 67
Used memory after: 196
Memory used: 129
```

Running with compact headers mode on:

```shell
$ java -XX:+UseCompactObjectHeaders src/main/java/com/pkonopacki1/App.java
Used memory before: 66
Used memory after: 119
Memory used: 53
```
