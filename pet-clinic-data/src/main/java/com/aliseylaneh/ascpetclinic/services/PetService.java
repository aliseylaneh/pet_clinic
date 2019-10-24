package com.aliseylaneh.ascpetclinic.services;

import com.aliseylaneh.ascpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
