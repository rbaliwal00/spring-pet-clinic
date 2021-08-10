package services;

import java.beans.JavaBean;

import com.example.springpetclinic.model.Owner;

@JavaBean
public interface OwnerService extends CrudService<Owner, Long> {
	
	Owner findByLastName(String lastName);

}
