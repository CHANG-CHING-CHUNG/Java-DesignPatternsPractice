package com.duck;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }
}
