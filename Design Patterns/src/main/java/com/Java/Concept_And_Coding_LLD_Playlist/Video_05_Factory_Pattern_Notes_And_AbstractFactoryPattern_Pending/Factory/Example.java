package com.Java.Concept_And_Coding_LLD_Playlist.Video_05_Factory_Pattern_Notes_And_AbstractFactoryPattern_Pending.Factory;

public class Example {

    /**
     * This design pattern is simple
     * We just have a factory class
     *
     * **/

    public static void main(String[] args) {

        Shape squareShape = ShapeFactory.getShape("Square");
        Shape circleShape = ShapeFactory.getShape("Circle");
        Shape rectangleShape = ShapeFactory.getShape("Rectangle");

        squareShape.draw();
        circleShape.draw();
        rectangleShape.draw();
    }
}

interface Shape {

    void draw();
}

class ShapeFactory {



    public static Shape getShape(String requirement) {

        Shape shape;
        shape = switch (requirement) {

            /**
             * we are using switch expression
             * case N -> Label we are using
             * */

            case "Circle" -> new Circle();

            case "Rectangle" -> new Rectangle();

            case "Square" -> new Square();

            default -> new Rectangle();

        };
        return shape;
    }
}

class Square implements Shape {

    public void draw() {
        System.out.println("Square");
    }
}

class Circle implements Shape {

    public void draw() {
        System.out.println("Circle");
    }
}

class Rectangle implements Shape {

    public void draw() {
        System.out.println("Rectangle");
    }
}
