package com.example.demo.nlp.objects;

public class Apple extends Food {

    public Apple(int weight, int size ) {
        super();
        this.name = "사과";
        this.weight = weight;
        this.size = size;
        // 탄단지
        this.carbohydrate = weight * 0.8;
        this.protein = weight * 0.1;
        this.fat = weight * 0.1;
        // 에너지
        this.calorie = weight * 0.4;
    }
}
