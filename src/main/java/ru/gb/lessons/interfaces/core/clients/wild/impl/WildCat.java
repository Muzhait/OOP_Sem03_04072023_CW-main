package ru.gb.lessons.interfaces.core.clients.wild.impl;

import ru.gb.lessons.interfaces.core.clients.Runnable;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

import java.time.LocalDate;

public class WildCat extends WildAnimal implements Runnable {
    public WildCat() {
        rDesire = true;
        flyDesire = false;
        swimDesire = false;
        speekDesire = true;
    }

    public WildCat(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
        rDesire = true;
        flyDesire = false;
        swimDesire = false;
        speekDesire = true;
    }

    @Override
    public int run() {
        System.out.println("Бегает со скоростью 15 км/ч");
        return 15;
    }
}
