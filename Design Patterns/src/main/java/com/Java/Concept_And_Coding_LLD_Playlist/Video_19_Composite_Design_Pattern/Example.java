package com.Java.Concept_And_Coding_LLD_Playlist.Video_19_Composite_Design_Pattern;

public class Example {

    /***
     * This pattern invovles having an interface
     * which is implemented by two classes
     * 1. BaseObject
     * 2. CompositeObject
     *
     * The CompositeObject will have a 1 to many mapping of the interface reference
     * lets see my arthmetic expression
     * **/

    public static void main(String[] args) {

        Number no1 = new Number(1.0);
        Number no2 = new Number(2.0);
        Number no3 = new Number(3.0);

        ArithmeticExpression arithmeticExpression = new ArithmeticExpression(no1 , no2 , "+");
        // (1 + 2 )
        ArithmeticExpression finalExpression = new ArithmeticExpression(arithmeticExpression , no3 , "-");
        // (1 + 2 ) - 3
        System.out.println(finalExpression.evaluate());
    }
}

interface Expression {

    public double evaluate();
}

class Number implements Expression {

    double val;

    public Number(double val) {
        this.val = val;
    }

    public double evaluate() {
        return val;
    }
}

class ArithmeticExpression implements Expression {

    Expression leftExpression;
    Expression rightExpression;
    String operation;

    public ArithmeticExpression(Expression leftExpression, Expression rightExpression,
                                String operation) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    public double evaluate() {

        return switch (operation) {

            case "+" -> leftExpression.evaluate() + rightExpression.evaluate();
            case "-" -> leftExpression.evaluate() - rightExpression.evaluate();
            case "/" -> leftExpression.evaluate() / rightExpression.evaluate();
            case "*" -> leftExpression.evaluate() * rightExpression.evaluate();
            default -> 0.0;
        };
    }
}
