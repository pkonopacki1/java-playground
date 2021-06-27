package com.pkonopacki1;

public class Interfaces
{
    public static void main( String[] args )
    {
        MovableSquare square = new MovableSquare(new Point(0.0, 0.0));
        System.out.println(square.getFigurePostion());
        square.move(5.0, 10.0);
        System.out.println(square.getFigurePostion());        
    }
}
