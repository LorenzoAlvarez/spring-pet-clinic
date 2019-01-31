package org.pet.clinic.data.model.services.map;

import java.util.Set;

import org.pet.clinic.data.model.Owner;
import org.pet.clinic.data.model.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

	@Override
	public Set<Owner> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return super.findByID(id);
	}

	@Override
	public Owner save(Owner object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(), object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(Owner object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}
	
}
