package ru.gb.lessons.interfaces.core.clients.owners;

import ru.gb.lessons.interfaces.core.clients.Animal;
import ru.gb.lessons.interfaces.core.clients.Human;

import java.util.ArrayList;
import java.util.List;


public class Owner extends Human {

    private final List<Animal> pets; 

    public Owner(String fullName) {
        super(fullName);
        this.pets = new ArrayList<>();
    }

    public List<Animal> getPets() {

        return pets;
    }

    public void setPet(Animal nextPet) {
        pets.add(nextPet);
    }

    @Override
    public String toString() {
        String result = this.getFullName();
        return result;
    }
}
