/*
------Compile-----
javac -p mods -d talks talks/zoo/animal/talks/content/*.java talks/zoo/animal/talks/media/*.java talks/zoo/animal/talks/schedule/*.java

------Create jar-----
jar -cvf mods/zoo.animal.talks.jar -C talks/ .

*/

module zoo.animal.talks {
    exports zoo.animal.talks.content;
    exports zoo.animal.talks.media;
    exports zoo.animal.talks.schedule;

    requires zoo.animal.feeding;
    requires zoo.animal.care;    
}
