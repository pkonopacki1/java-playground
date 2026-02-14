# Class path example

Example to the article <https://medium.com/javarevisited/back-to-the-basics-of-java-part-1-classpath-47cf3f834ff>

## Running

Compile the classes:

`javac src/App.java src/utils/Util.java -d bin/`

The compiled classes will be in the `bin` foler and you should be able to run them:

`java --class-path bin App`

## Tesing classpaths modification

Move `Util.class` to `lib` folder and try to run the program again

```sh
$ java --class-path bin App
Exception in thread "main" java.lang.NoClassDefFoundError: utils/Util
        at App.main(App.java:5)
Caused by: java.lang.ClassNotFoundException: utils.Util
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:580)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:490)
        ... 1 more
```

This will not work as the class was mvoed out of the classpath. Run it again, this time adding new path to the classpath:

```sh
~/my_repos/java-playground/classpath on  main! ⌚ 10:32:43
$ java --class-path bin:lib App
The number is : 743810212
``
And now it work again 😊
