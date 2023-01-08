package com.example.demo.nlp.objects;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Problem {
    private String problem;
    private String answer;

    public Problem(String problem, String answer) {
        this.problem = problem;
        this.answer = answer;
    }
}
