package com.example.demo.nlp.objects;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Thing {
    String name = "";
    // 무게
    int weight = 0;
    // 크기
    int size = 0;

    public Thing() {}
}