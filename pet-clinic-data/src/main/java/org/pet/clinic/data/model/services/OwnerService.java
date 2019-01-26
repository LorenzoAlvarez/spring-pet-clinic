package org.pet.clinic.data.model.services;

import java.util.Set;

import org.pet.clinic.data.model.Owner;

public interface OwnerService {
	Owner findByLastName(String lastName);
	
	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();
}
