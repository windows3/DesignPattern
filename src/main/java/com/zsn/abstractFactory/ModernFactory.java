package com.zsn.abstractFactory;

/**
 * @Author: zsn
 * @Date: 2020/5/10 22:20
 */
public class ModernFactory extends AbstractFactory {
    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Weapon createWeapon() {
        return new AK47();
    }

    @Override
    Vehicle createVehicle() {
        return new Car();
    }
}
