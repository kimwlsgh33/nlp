package com.example.demo.nlp.emotion;

import com.example.demo.nlp.emotion.Emotion;

public class Fear implements Emotion {
    @Override
    public void feeling() {
        System.out.println("두려움을 느낌");
    }
}
