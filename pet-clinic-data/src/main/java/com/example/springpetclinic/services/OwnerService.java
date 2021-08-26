package com.example.springpetclinic.services;

import java.beans.JavaBean;
import java.util.List;

import com.example.springpetclinic.model.Owner;

@JavaBean
public interface OwnerService extends CrudService<Owner, Long> {
	
	Owner findByLastName(String lastName);
	List<Owner> findAllByLastNameLike(String lastName);

}
