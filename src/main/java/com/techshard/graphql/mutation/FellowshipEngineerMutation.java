package com.techshard.graphql.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.techshard.graphql.dao.entity.FellowshipEngineers;
import com.techshard.graphql.service.FellowshipEngineerService;
@Component
public class FellowshipEngineerMutation implements GraphQLMutationResolver{

	@Autowired
	private FellowshipEngineerService engineerService;
	
	public FellowshipEngineers addfelloEngineers(String collageName, String degree, String email, String higherCity,String higherDate, String higherLab, String mobileNumber, String name) {
		return this.engineerService.addfelloEngineers(collageName,degree,email,higherCity,higherDate,higherLab,mobileNumber,name);
	}
	
}
