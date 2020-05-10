package com.zsn.abstractFactory;


/**
 * @Author: zsn
 * @Date: 2020/5/10 21:12
 */
//抽象工厂
public class Main {
    public static void main(String[] args) {
        AbstractFactory f = new ModernFactory();
        Vehicle c = f.createVehicle();
        c.go();
        Food food = f.createFood();
        food.printName();
        Weapon weapon = f.createWeapon();
        weapon.shoot();
    }

}
