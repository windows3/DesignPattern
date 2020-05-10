package com.zsn.abstractFactory;

/**
 * @Author: zsn
 * @Date: 2020/5/10 22:20
 */
public class MagicFactory extends AbstractFactory {
    @Override
    Food createFood() {
        return new Dawdle();
    }

    @Override
    Weapon createWeapon() {
        return new MagicStick();
    }

    @Override
    Vehicle createVehicle() {
        return new Broom();
    }
}
