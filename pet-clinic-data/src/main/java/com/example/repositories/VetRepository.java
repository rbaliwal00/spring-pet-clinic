package com.example.repositories;

import com.example.springpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
