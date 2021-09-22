/*
-------Compile--------
javac -p mods -d care care/zoo/animal/care/details/*.java care/zoo/animal/care/medical/*.java care/module-info.java

-------Create jar-----
 jar -cvf mods/zoo.animal.care.jar -C care/ .
*/

module zoo.animal.care {
    exports zoo.animal.care.medical;
    requires zoo.animal.feeding;    
}
