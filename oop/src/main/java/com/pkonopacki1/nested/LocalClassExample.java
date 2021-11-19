package com.pkonopacki1.nested;


class OuterLocalClass {
    private int length = 10;
    private int height = 5;
    
    public OuterLocalClass() {
        height = height *2;
    }

    public int outerClassMethod() {
        int width;
        width = 5;
        // width = 10; // If this line would be ucommented, widht would no longer be effectively final
        // and could no longer be uses in a local class
        class LocalClass {
            private int volume() {
                // height is not effectively final but it is an instance field, not a local one
                return length * width * height;
            }
            
        }

        return new LocalClass().volume();
    }
}

public class LocalClassExample {
    public static void main(String[] args) {
        System.out.println(new OuterLocalClass().outerClassMethod());
    }
    
}
