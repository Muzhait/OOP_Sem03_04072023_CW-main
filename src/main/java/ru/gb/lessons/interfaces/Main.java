package ru.gb.lessons.interfaces;

import ru.gb.lessons.interfaces.core.VetClinic;
import ru.gb.lessons.interfaces.core.clients.home.impl.Cat;
import ru.gb.lessons.interfaces.core.clients.home.impl.Dog;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.impl.Duck;
import ru.gb.lessons.interfaces.core.clients.wild.impl.Fish;
import ru.gb.lessons.interfaces.core.personal.Doctor;
import ru.gb.lessons.interfaces.core.personal.Nurse;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        VetClinic catDog = new VetClinic();

        Cat homeCat =
                new Cat(2, "Tom", 4, LocalDate.of(2022, 4,13), new Owner("Ivanov Ivan"));

        ru.gb.lessons.interfaces.core.clients.wild.impl.WildCat wildCat =
                new ru.gb.lessons.interfaces.core.clients.wild.impl.WildCat(
                        1, 4, LocalDate.of(2023, 1, 5), new Owner("incognito"));

        Dog sharik = new Dog(5,"Шарик",4,null,null);
        Fish nemo = new Fish();

        homeCat.hunt();
        wildCat.hunt();

        Duck greenNeck = new Duck(15,2,"Дональд", null, null);
        System.out.println();

        homeCat.run();
        homeCat.fly();
        homeCat.sound();
        homeCat.swim();
        System.out.println();

        sharik.run();
        sharik.fly();
        sharik.sound();
        sharik.swim();

        System.out.println();

        nemo.run();
        nemo.fly();
        nemo.sound();
        nemo.swim();
        System.out.println();

        catDog.addAnimal(nemo);
        catDog.addAnimal(sharik);
        catDog.addAnimal(homeCat);
        catDog.addAnimal(greenNeck);
        catDog.addAnimal(wildCat);

        System.out.println("Пациенты: ");
        catDog.printPatients();
        System.out.println();
        System.out.println("Могут лететь: ");
        catDog.printFlyingPatients();
        System.out.println();
        System.out.println("Могут плыть: ");
        catDog.printSwimingPatients();
        System.out.println();
        System.out.println("Могут бегать: ");
        catDog.printRunningPatients();
        System.out.println();
        System.out.println("Они говорят: ");
        catDog.printSpeakingPatients();

        Doctor haus = new Doctor(1,"Паровозов", "кастратор");
        System.out.println();
        haus.makeBandages(sharik);
        haus.giveInjections(homeCat);
        haus.diagnosis(greenNeck);
        System.out.println();

        Nurse shot = new Nurse(8,"Петренко", "укольщица");
        System.out.println();
        shot.giveInjections(homeCat);
        shot.makeBandages(homeCat);
        shot.temperMeasuring(greenNeck);
        shot.writePrescriptions(sharik);

    }
}
