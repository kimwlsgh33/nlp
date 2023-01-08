package com.example.demo.nlp.expression;

public class Visual implements Expression {
    private String object;

    public Visual(String object) {
        this.object = object;
    }

    @Override
    public void sense() {
        System.out.println("객체가 보임");
    }
}
