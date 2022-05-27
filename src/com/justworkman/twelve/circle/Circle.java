package com.justworkman.twelve.circle;

public record Circle(int XPoint, int YPoint, int round) {

    public boolean inCircle(Point point) {
        boolean isXIn = point.XPoint() > XPoint() - round() && point.XPoint() < XPoint() + round();
        boolean isYIn = point.YPoint() > YPoint() - round() && point.YPoint() < YPoint() + round();
        return isXIn && isYIn;
    }

}
