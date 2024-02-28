package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.NgosRepository;
import com.model.Ngos;

import java.util.List;

@Service
public class NgosService {
    @Autowired
    private NgosRepository ngoRepository;
    
    public Ngos saveNgo(Ngos ngo) {
        return ngoRepository.save(ngo);
    }

    public Ngos getNgoById(int id) {
        return ngoRepository.findById(id).orElse(null);
    }

    public List<Ngos> getAllNgos() {
        return ngoRepository.findAll();
    }
   
    public Ngos updateNgo(int id, Ngos updatedNgo) {
    	Ngos existingNgo = ngoRepository.findById(id).orElse(null);

        if (existingNgo != null) {
        	existingNgo.setName(updatedNgo.getName());
        	existingNgo.setDescription(updatedNgo.getDescription());

            return ngoRepository.save(existingNgo);
        }

        return null;
    }

    public void deleteNgo(int id) {
    	Ngos existingNgo = ngoRepository.findById(id).orElse(null);
    	ngoRepository.delete(existingNgo);
    }
}
