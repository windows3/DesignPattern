package com.zsn.abstractFactory;

/**
 * @Author: zsn
 * @Date: 2020/5/10 22:06
 */
public abstract class AbstractFactory {
    abstract  Food createFood();
    abstract  Weapon createWeapon();
    abstract  Vehicle createVehicle();
}
