package com.pkonopacki1.assertions;

public class Assertions {

    public static void main(String[] args) {
        // Remember that for assertions we need to enable them (-ea in the console or in settings of IE)
        short maxValue = Byte.MAX_VALUE +1;

        // Below are two examples, :obj or :method is optional but method can't return void
        // assert maxValue >= Byte.MIN_VALUE && maxValue <= Byte.MAX_VALUE:
        //         "Error happend";
        assert maxValue >= Byte.MIN_VALUE && maxValue <= Byte.MAX_VALUE:
                errorInfo();   
    }

    private static String errorInfo() {
        return "Error happend from method";
    }

    
}
