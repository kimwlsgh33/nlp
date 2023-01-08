package com.example.demo.nlp;

import lombok.Getter;

@Getter
public class Value {
    private Reason reason;
    private Result result;

    public Value(Reason reason, Result result) {
        this.reason = reason;
        this.result = result;
    }
}