package com.zsn.FactoryMethod;

/**
 * @Author: zsn
 * @Date: 2020/5/10 21:12
 */
//简单工厂模式
public class Main {
    public static void main(String[] args) {
        Moveable move = new CarFactory().createCar();

        move.go();
    }

}
