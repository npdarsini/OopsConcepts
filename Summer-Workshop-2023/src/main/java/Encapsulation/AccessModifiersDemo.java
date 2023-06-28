package Encapsulation;

import ClassesAndObjects.ProtectedCar;

public class AccessModifiersDemo {

    public static void main(String[] args) {
        AccessModifierClass accessModifierClass = new AccessModifierClass();
//        System.out.println(accessModifierClass.privateString);
//        System.out.println(accessModifierClass.defaultString);
//        System.out.println(accessModifierClass.protectedString);
//        System.out.println(accessModifierClass.publicString);

        ProtectedCar protectedCar = new ProtectedCar();
        System.out.println(protectedCar.getColor());
        protectedCar.setColor("white");
        System.out.println(protectedCar.getColor());
    }
}
