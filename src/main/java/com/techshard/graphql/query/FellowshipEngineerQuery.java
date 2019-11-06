package com.techshard.graphql.query;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.techshard.graphql.dao.entity.FellowshipEngineers;
import com.techshard.graphql.dao.entity.HigherEngineer;
import com.techshard.graphql.service.FellowshipEngineerService;
@Component
public class FellowshipEngineerQuery implements GraphQLQueryResolver{

	@Autowired
	private FellowshipEngineerService engineerService;
	
	
	public List<FellowshipEngineers> getFellowshipEngineers(){
		return this.engineerService.getFellowshipEngineers();
	}
	
	public Optional<FellowshipEngineers> getFellowshipEngineer(int id){
		return this.engineerService.getFellowshipEngineer(id);
	}
	
 	public List<HigherEngineer> getOnlyFellowshipEngineers(String email){
 		return this.engineerService.getOnlyFellowshipEngineers(email);                           
 		
 	}
	
 	public String totalFellowshipEngineers(){
 		return this.engineerService.totalFellowshipEngineers();
 	}
	
 }
