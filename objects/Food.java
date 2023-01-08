package com.example.demo.nlp.objects;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Food extends Thing {
    double carbohydrate;
    double protein;
    double fat;
    double calorie;

    public Food(){
        super();
    }
}