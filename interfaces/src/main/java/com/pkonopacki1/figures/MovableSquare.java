package com.pkonopacki1.figures;

public class MovableSquare extends Square implements Movable {

    public MovableSquare(Point figurePosition) {
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
