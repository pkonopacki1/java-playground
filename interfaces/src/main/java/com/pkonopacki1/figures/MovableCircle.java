package com.pkonopacki1.figures;

public class MovableCircle extends Circle implements Movable {

    public MovableCircle(Point figurePosition) {
        super(figurePosition);
    }

    @Override
    public void move(double x, double y) {
        double currentX = this.getFigurePostion().getX();
        double currentY = this.getFigurePostion().getY();
        Point newPosition = new Point(currentX + x, currentY + y);
        this.figurePostion = newPosition;
    }

}
