package org.pet.clinic.data.model.services;

import java.util.Set;

import org.pet.clinic.data.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
	Owner findByLastName(String lastName);
	
}
