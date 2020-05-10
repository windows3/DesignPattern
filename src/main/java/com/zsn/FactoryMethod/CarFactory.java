package com.zsn.FactoryMethod;

/**
 * @Author: zsn
 * @Date: 2020/5/10 21:22
 */
public class CarFactory {

    public Car createCar(){
        System.out.println("a car create");
//        before processing
        return new Car();
    }
}
