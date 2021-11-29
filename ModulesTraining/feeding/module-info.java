/* 
-------------To compile module--------------
javac --module-path mods -d feeding feeding/zoo/animal/feeding/*.java feeding/module-info.java
--moudle-path specifies where module resides, can be replaced with -p
-d specifies where files should be put
at the and we list the files that should be compiled (including module-info.java file)

------------To run compiled module---------
java --module-path feeding --module zoo.animal.feeding/zoo.animal.feeding.Task

------------To create jar file-------------
jar -cvf mods/zoo.animal.feeding.jar -C feeding/ .

------------To run jar file
java -p mods -m zoo.animal.feeding/zoo.animal.feeding.Task

*/

module zoo.animal.feeding {
    exports zoo.animal.feeding;
}