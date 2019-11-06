package com.techshard.graphql.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techshard.graphql.dao.entity.HigherEngineer;
import com.techshard.graphql.dao.repository.EngineerRepository;
@Service
public class EngineerService {

	@Autowired
	private EngineerRepository engineerRepository;
	
	public EngineerService (EngineerRepository engineerRepository) {
		this.engineerRepository = engineerRepository;
	}
	
	 
	@Transactional
	public List<HigherEngineer> getEngineers() {
		return this.engineerRepository.findAll();
	}

	@Transactional
	public Optional<HigherEngineer> getEngineer(int id) {
		return this.engineerRepository.findById(id);
	}
 
//	@Transactional
//	public HigherEngineer addEnginner(String collageName, String email, String higherDate, String name,
//			String higherCity, String mobileNumber, String degree) {
//		HigherEngineer engineer = new HigherEngineer();
//		engineer.setCollageName(collageName);
//		engineer.setEmail(email);
//		engineer.setHigherDate(higherDate);
//		engineer.setName(name);
//		engineer.setHigherCity(higherCity);
//		engineer.setMobileNumber(mobileNumber);
//		engineer.setDegree(degree);
//		return this.engineerRepository.save(engineer);
//	}
 
}
