package com.example.demo.nlp;
import com.example.demo.nlp.emotion.Emotion;
import com.example.demo.nlp.emotion.Happy;
import com.example.demo.nlp.expression.Auditory;
import com.example.demo.nlp.expression.Expression;
import com.example.demo.nlp.objects.Apple;
import com.example.demo.nlp.objects.DefaultObject;
import com.example.demo.nlp.objects.Food;
import com.example.demo.nlp.objects.Sound;
import com.example.demo.nlp.objects.Thing;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

// 모든 사람들의 특징
@Setter
public class Person {
    // 자주 바뀌지 않는 속성
    // 생존 여부 ( default : true )
    private boolean alive = true;
    private int visual_ = 0;
    private int auditory_ = 0;
    private int kinesthetic_ = 0;


    // 상시 바뀌는 속성
    // 에너지 ( default : 100 )
    private double energy = 100;
    // 만족도
    private double satisfaction = 0;
    // 가치관
    private Values values;


    public Person(){
        // 초기화
        this.values = new Values(); // 가치관

        Apple apple = new Apple(100,10);
        Sound sound = new Sound("이건 사과야.");

        // 살아있는 동안 반복하는 것
        while(alive) {
            // 경험
            experience(apple, sound);
            // 에너지를 소모함
            this.energy -= 0.1;
            // 에너지가 떨어지면 죽음
            if(this.energy <= 0) {
                this.alive = false;
                System.out.println("죽음");
            }
        }
    }
    //==================================================================================================
    // 먹는다.
    //==================================================================================================
    public void eat(Food food){
        // 에너지를 먹은 만큼 증가시킨다.
        this.energy += food.getCalorie();
        // 만족도를 먹은 만큼 증가시킨다.
        increaseSatisfaction(food.getCalorie());
    }
    //==================================================================================================
    // 만족도 올라감
    //==================================================================================================
    void increaseSatisfaction(double value){
        this.satisfaction += value;
    }
    //==================================================================================================
    // 만족도 떨어짐
    //==================================================================================================
    void decreaseSatisfaction(double value){
        this.satisfaction -= value;
    }

    //==================================================================================================
    // 봄 ( see )
    //==================================================================================================
    public void see(Thing thing){
        System.out.println(thing.getName() + "본다");
    }
    //==================================================================================================
    // 듣는다 ( hear )
    //==================================================================================================
    public void hear(Sound sound){
        System.out.println(sound.getSound() + "듣는다");
    }
    //==================================================================================================
    // 만진다 ( touch )
    //==================================================================================================
    public void feel(Thing thing){
        System.out.println(thing.getName() + "만진다");
    }


    //==================================================================================================
    // 감각을 느낌 ( 경험 )
    //==================================================================================================
    void experience(Thing thing, Sound sound){
        // 봄
        see(thing);
        // 듣는다
        hear(sound);
        // 만진다
        feel(thing);

        // 사건 발생
        /*
          사건은, 우연히, 무작위로 발생하는 것 처럼 보이지만,
          아주 세세한 규칙들이 모이고, 하나의 톱니바퀴가 되어 발생한다.

          "세상에 우연은 없다."
          - 성공하는 방법, 실패하는 방법은 정해져 있다.
         */
        int myValue = 0;

        if()
        if(Math.random() > 0.5) { // 세상에 대한 잘못된 가정
            goodEvent();
        } else {
            badEvent();
        }
    }

    //==================================================================================================
    // 사건이 벌어짐
    //==================================================================================================
    String goodEvent(){
        return "좋은 일이 일어남";
    }
    String badEvent(){
        return "나쁜 일이 일어남";
    }


    //==================================================================================================
    // 가치관 형성
    //==================================================================================================
    public void formValues(Thing thing, Sound sound, Emotion emotion){

    }
}
