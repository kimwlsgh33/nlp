package com.example.demo.nlp;

import java.util.ArrayList;

public class Values {
    private ArrayList<Value> values;

    // 가치관을 생성함
    public void add(Reason reason, Result result) {
        values.add(new Value(reason, result));
    }

    // 원인을 기준으로, 가치관에 맞는 결과를 찾는다.
    public Result getValue(Reason reason) {
        for(Value value : values) {
            if(value.getReason().equals(reason)) {
                return value.getResult();
            }
        }
        // 아직 가치관을 만들지 않은, 새로운 원인이 들어왔을 때
        return null;
    }
}
