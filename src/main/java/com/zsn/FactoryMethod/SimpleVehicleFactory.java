package com.zsn.FactoryMethod;

/**
 * @Author: zsn
 * @Date: 2020/5/10 21:20
 */
//简单工厂
public class SimpleVehicleFactory {
    /**
     * 简单工厂的可扩展性并不好
     *
     */
    public Car createCar(){
//        before processing
        return new Car();
    }
    public Plane createPlane(){
        return new Plane();
    }
}
