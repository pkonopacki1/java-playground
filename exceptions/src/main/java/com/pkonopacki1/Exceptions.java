package com.pkonopacki1;

import java.io.FileInputStream;
import java.io.IOException;

public class Exceptions 
{
    public static void main( String[] args )
    {
        try {
            FileInputStream fileInputStream = new FileInputStream("someFile");
        } catch (Throwable e) {
            printParentClasses(e);
        }
    }

    static void printParentClasses(Object object) {
        String suffix = "--";
        Class objectClass = null;
        if(object != null) {
            objectClass = object.getClass();
        }

        while(objectClass != null && objectClass != Object.class) {            
            System.out.println(suffix + objectClass);            
            objectClass = objectClass.getSuperclass();
            suffix += "--";
        }
    }
}
