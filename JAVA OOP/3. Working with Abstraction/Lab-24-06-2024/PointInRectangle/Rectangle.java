package PointInRectangle;

public class Rectangle {
    private Point bottomLeftPoint;
    private Point topRightPoint;

    public Rectangle(Point bottomLeftPoint, Point topRightPoint) {
        this.bottomLeftPoint = bottomLeftPoint;
        this.topRightPoint = topRightPoint;
    }

    public Point getBottomLeftPoint() {
        return bottomLeftPoint;
    }

    public Point getTopRightPoint() {
        return topRightPoint;
    }
}
