package org.pet.clinic.data.model.services;

import java.util.Set;

public interface CrudService<T,ID> {

	Set<T> findByAll();
	
	T findById(ID id);
	
	T save(T object);
	
	void delete(T object);
	
	void deleteById(ID id);
}