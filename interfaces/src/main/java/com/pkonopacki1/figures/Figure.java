package com.pkonopacki1.figures;

public abstract class Figure {
    Point figurePostion;

    public Figure(Point figurePosition) {
        this.figurePostion = figurePosition;
    }

    public Point getFigurePostion() {
        return figurePostion;
    }

}
