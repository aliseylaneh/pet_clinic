package com.aliseylaneh.ascpetclinic.repositories;

import com.aliseylaneh.ascpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
