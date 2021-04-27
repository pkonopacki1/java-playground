public class App {
    public static void main(String[] args) throws Exception {

        // Below won't compile, bigger type can't be conver to lower
        // byte bVar = 128;
        
        // The other way round is possible
        byte bVar = 127;
        int iVar = bVar;

        // Float and double differnce
        // float ends with ...f
        float fVar = 1.3f;
        double dVar = 2.3;

        // Same as with integers, won't comiple
        // fVar =  dVar;

        // This works fine
        dVar = fVar;


    }

}
