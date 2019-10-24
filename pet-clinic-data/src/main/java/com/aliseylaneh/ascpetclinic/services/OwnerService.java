package com.aliseylaneh.ascpetclinic.services;

import com.aliseylaneh.ascpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
