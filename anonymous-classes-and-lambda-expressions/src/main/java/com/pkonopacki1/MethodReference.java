package com.pkonopacki1;

interface Creator<T, R> {
    R create(T t);
}

class Log {
    Log() {
        System.out.println(1);
    }

    Log(String s) {
        System.out.println(s);
    }
}

public class MethodReference 
{
    public static void main( String[] args )
    {
        // Below two lines do the same, but first one uses methods referencing
        Creator<String, Log> creator = Log::new;
        Creator<String, Log> creator2 = s -> new Log(s);

        System.out.println(creator.create("test"));
        System.out.println(creator2.create("test"));
    }
}
