package com.example.demo.nlp.objects;

public interface Food extends DefaultObject {
    int carbohydrate = 0;
    int protein = 0;
    int fat = 0;
    int calorie = 0;

    int getCarbohydrate();
    int getProtein();
    int getFat();
    int getCalorie();
}