package zoo.animal.feeding;

/* 
-------------To compile module--------------
javac --module-path feeding -d bin feeding/zoo/animal/feeding/*.java feeding/module-info.java
--moudle-path specifies where module resides
-d specifies where files should be put
at the and we list the files that should be compiled (including module-info.java file)

------------To run compiled module---------
java --module-path bin --module zoo.animal.feeding/zoo.animal.feeding.Task

------------To create jar file-------------
jar -cvf mods/zoo.animal.feeding.jar -C bin/ .

------------To run jar file
java -p mods --module zoo.animal.feeding/zoo.animal.feeding.Task

*/

public class Task {
    public static void main(String[] args) {
        System.out.println("I'm being fed!");
    }
    
}
