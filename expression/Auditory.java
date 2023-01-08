package com.example.demo.nlp.expression;

// 청각
public class Auditory implements Expression {
    private String language;

    public Auditory(String language) {
        this.language = language;
    }

    @Override
    public void sense() {
        System.out.println("언어가 들림");
    }
}
