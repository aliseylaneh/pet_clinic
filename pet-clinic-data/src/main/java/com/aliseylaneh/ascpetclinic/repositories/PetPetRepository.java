package com.aliseylaneh.ascpetclinic.repositories;

import com.aliseylaneh.ascpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetPetRepository extends CrudRepository<Pet, Long> {
}
