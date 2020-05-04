package com.structural.bridge.m1;

//Implementor
public interface DrawingAPI {
void drawCircle(double x, double y, double radius);
}

class DrawingAPI1 implements DrawingAPI{
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("API1.circle at %f:%f radius %f\n", x, y, radius);
    }
}

class DrawingAPI2 implements DrawingAPI {

    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("API2.circle at %f:%f radius %f\n", x, y, radius);
    }
}
//Abstraction
interface Shape{
    void  draw();
    void resizeByPercentage(double pct);
}


class CircleShape implements Shape{
    private double x, y, radius;
    private DrawingAPI drawingAPI;

    public CircleShape(double x, double y, double radius, DrawingAPI drawingAPI) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.drawingAPI = drawingAPI;
    }

    @Override
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }

    @Override
    public void resizeByPercentage(double pct) {
radius=radius*pct;
    }
}

class BridgePattern{
    public static void main(String[] args) {
    Shape[] shapes=new Shape[2];
    shapes[0]=new CircleShape(1,2,3, new DrawingAPI1());
    shapes[1]=new CircleShape(5,7,11, new DrawingAPI2());

    for(Shape shape:shapes){
        shape.resizeByPercentage(2.5);
        shape.draw();
    }
    }
}
