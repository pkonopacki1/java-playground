/*
-----Compile-----
javac -p mods -d staff staff/zoo/staff/*.java staff/module-info.java

-----Create jar------
jar -cvf mods/zoo.staf.jar -C staff/ .
*/

module zoo.staff {
    requires zoo.animal.feeding;
    requires zoo.animal.care;
    requires zoo.animal.talks;
}
