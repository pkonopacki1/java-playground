package com.pkonopacki1;

public class Overriding {
    public static void main(String[] args) {
        System.out.println(new ChildOverrriding().method());
        System.out.println(new SuperOverriding().method());        
    }
}

class SuperOverriding {
    public CharSequence method() {
        return "Hello Charsequence";
    }
}

class ChildOverrriding extends SuperOverriding{
    //This overriden method shows, that we can use different return type, which must be a subtype of overriden method
    @Override
    public String method() {
        return "Hello String";

    }
}
