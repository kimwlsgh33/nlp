package com.example.demo.nlp.objects;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter @RequiredArgsConstructor
public class Apple implements Food {
    private int carbohydrate = 10;
    private int protein = 1;
    private int fat = 0;
    private String name = "사과";
    private int weight = 100;
    private int size = 10;
    private int calorie = 50;
}
