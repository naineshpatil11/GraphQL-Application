package com.techshard.graphql.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techshard.graphql.dao.entity.FellowshipEngineers;
import com.techshard.graphql.dao.entity.HigherEngineer;
import com.techshard.graphql.dao.repository.EngineerRepository;
import com.techshard.graphql.dao.repository.FellowshipEngineersRepository;
@Service
public class FellowshipEngineerService {

	@Autowired
	private FellowshipEngineersRepository felloRepository;
	
	@Autowired
	private EngineerRepository hiredRepository;
	
	@Transactional
	public List<FellowshipEngineers> getFellowshipEngineers() {
		List<FellowshipEngineers> engineers = felloRepository.findAll();
		long total = engineers.stream().count();
		System.out.println("total: "+total);
//		engineers.add(felloRepository.findAll());
		return this.felloRepository.findAll();
	}
	
	@Transactional
	public Optional<FellowshipEngineers> getFellowshipEngineer(int id){
		return this.felloRepository.findById(id);
	}

	@Transactional
	public FellowshipEngineers addfelloEngineers(String collageName, String degree, String email, String higherCity,
			String higherDate, String higherLab, String mobileNumber, String name) {
		FellowshipEngineers engineers = new FellowshipEngineers();
		engineers.setCollageName(collageName);
		engineers.setDegree(degree);
		engineers.setEmail(email);
		engineers.setHigherCity(higherCity);
		engineers.setHigherDate(higherDate);
		engineers.setHigherLab(higherLab);
		engineers.setMobileNumber(mobileNumber);
		engineers.setName(name);
		return this.felloRepository.save(engineers);
	}

	@Transactional
	public List<HigherEngineer> getOnlyFellowshipEngineers(String email) {
		System.out.println("testing");
		Optional<FellowshipEngineers> felloEngineers = felloRepository.findByEmail(email);
		System.out.println(felloEngineers);
		List<HigherEngineer> hiredEngineers = hiredRepository.findByEmail(email);
		System.out.println(hiredEngineers);
		List<HigherEngineer> engineers = new ArrayList<>();
//		ArrayList<FellowshipEngineers> arrayList = new ArrayList<FellowshipEngineers>();
		for(HigherEngineer engineer : hiredEngineers) {
			if(engineer.getEmail().matches(felloEngineers.get().getEmail())){
			engineers.add(engineer);
			}
		}
		System.out.println(engineers);
		return engineers;
	}

	@Transactional
	public String totalFellowshipEngineers() {
		List<FellowshipEngineers>  engineers = felloRepository.findAll();
 		long total = engineers.stream().count();
 		System.out.println("total: "+total);
 		return "Total Fellowship Engineers: "+total;
			
	}
}
