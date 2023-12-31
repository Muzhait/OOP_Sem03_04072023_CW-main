package ru.gb.lessons.interfaces.core.clients.home.impl;

import ru.gb.lessons.interfaces.core.clients.Flyable;
import ru.gb.lessons.interfaces.core.clients.Runnable;
import ru.gb.lessons.interfaces.core.clients.Soundable;
import ru.gb.lessons.interfaces.core.clients.Swimable;
import ru.gb.lessons.interfaces.core.clients.home.Pet;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;

import java.time.LocalDate;

public class Cat extends Pet  implements Flyable, Runnable, Soundable, Swimable {
    int flySpeed = 0;
    String flyReaction = "Я не умею летать";
    int runSpeed = 35;
    String speeks = "Мяууу";
    int swimSpeed = 5;
    String swimReaction = " я НЕ умею плавать ";
    public Cat() {
        rDesire = true;
        flyDesire = false;
        swimDesire = false;
        speekDesire = true;
    }

    public Cat(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
        rDesire = true;
        flyDesire = false;
        swimDesire = false;
        speekDesire = true;
    }

    @Override
    public int fly() {
        System.out.println(CLASS_NAME + " говорит: " + '"' + flyReaction + '"' + "- и не летит");
        return 5;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + " бегает со скоростью: " + runSpeed + " км/ч");
        return 3;
    }
    @Override
    public void sound() {
        System.out.println(CLASS_NAME + " говорит: " + speeks);

    }
    @Override
    public void swim() {
        System.out.println(CLASS_NAME + " говорит: " + '"' + swimReaction+ '"'
                + " - и плывет со скоростью " + swimSpeed + " км/ч");

    }
}
