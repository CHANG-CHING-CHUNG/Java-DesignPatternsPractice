package com.duck;

public class Main {
    public static void main(String []args) {
        MallardDuck m = new MallardDuck();
        m.performFly();
        m.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
