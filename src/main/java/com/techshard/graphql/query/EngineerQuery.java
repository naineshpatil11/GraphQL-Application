package com.techshard.graphql.query;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.techshard.graphql.dao.entity.HigherEngineer;
import com.techshard.graphql.service.EngineerService;

@Component
public class EngineerQuery implements GraphQLQueryResolver{

	@Autowired
	private EngineerService engineerService;
	
	public List<HigherEngineer> getEngineers(){
		return this.engineerService.getEngineers();
	}
	
	public Optional<HigherEngineer> getEngineer(int id){
		return this.engineerService.getEngineer(id);
	}
}
