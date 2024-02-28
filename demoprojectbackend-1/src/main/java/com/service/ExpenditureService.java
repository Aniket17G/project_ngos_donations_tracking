package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ExpenditureRepository;
import com.model.Expenditures;

@Service
public class ExpenditureService {
    @Autowired
    private ExpenditureRepository expenditureRepository;
    
    public Expenditures saveExpenditure(Expenditures expenditure) {
        return expenditureRepository.save(expenditure);
    }

    public List<Expenditures> getAllExpenditures() {
        return expenditureRepository.findAll();
    }

    public Expenditures getExpenditureById(int id) {
        return expenditureRepository.findById(id).orElse(null);
    }
  
    public void deleteExpenditure(int id) {
    	Expenditures existingExpenditure=expenditureRepository.findById(id).orElse(null);
    	expenditureRepository.delete(existingExpenditure);
    }
    
    public List<Expenditures> getAllExpendituresByNgoId(int ngo_id) {
        return expenditureRepository.findByNgo_Ngo_Id(ngo_id);
    }
}
