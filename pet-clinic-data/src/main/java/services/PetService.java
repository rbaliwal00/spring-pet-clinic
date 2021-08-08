package services;

import java.util.Set;

import com.example.springpetclinic.model.Pet;

public interface PetService {
	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();
}
