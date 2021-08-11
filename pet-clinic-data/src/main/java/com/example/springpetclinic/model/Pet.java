package com.example.springpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity{

    private PetType petype;
    private Owner owner;
    private LocalDate birthDate;

    public PetType getPetype() {
        return petype;
    }

    public void setPetype(PetType petype) {
        this.petype = petype;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
