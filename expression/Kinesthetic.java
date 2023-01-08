package com.example.demo.nlp.expression;

public class Kinesthetic implements Expression {
    // touch, smell, taste
    private String sense;

    public Kinesthetic(String sense) {
        this.sense = sense;
    }

    @Override
    public void sense() {
        System.out.println("감촉이 느껴짐");
    }
}
