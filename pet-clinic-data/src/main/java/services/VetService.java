package services;

import java.util.Set;

import com.example.springpetclinic.model.Vet;

public interface VetService {
	Vet findById(Long id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
}
