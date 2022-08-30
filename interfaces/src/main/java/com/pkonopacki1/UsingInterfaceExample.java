package com.pkonopacki1;

import com.pkonopacki1.figures.Figure;
import com.pkonopacki1.figures.Movable;
import com.pkonopacki1.figures.MovableCircle;
import com.pkonopacki1.figures.MovableSquare;
import com.pkonopacki1.figures.Point;

/* Basic example of how interface can be used */

public class UsingInterfaceExample {
    public static void main(String[] args) {
        MovableSquare square = new MovableSquare(new Point(0.0, 0.0));
        MovableCircle circle = new MovableCircle(new Point(10.0, 10.0));

        Movable[] movableObjects = new Movable[] { square, circle };

        for (Movable movable : movableObjects) {
            Figure movableFigure = (Figure) movable;
            System.out.println(movableFigure.getClass() + " start postion: " + movableFigure.getFigurePostion());
            movable.move(5.0, 10.0);
            System.out.println(movableFigure.getClass() + " end postion: " + movableFigure.getFigurePostion());
        }

    }
}
