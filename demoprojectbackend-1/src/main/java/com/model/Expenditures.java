package com.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Expenditures {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int expenditure_id;
	 	
	 	@ManyToOne
	    @JoinColumn(name = "ngo_id")
	    private Ngos ngo;
	 	
	 	@Column(name = "Amount")
	    private int exp_amount;
	    
	    private String description;
	    
	    private LocalDateTime expenditureDate;
	
}
