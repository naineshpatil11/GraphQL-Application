package com.techshard.graphql.mutation;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.techshard.graphql.dao.entity.HigherEngineer;
import com.techshard.graphql.service.EngineerService;

@Component 
public class EngineerMutation implements GraphQLMutationResolver  {

//	@Autowired
//	private EngineerService engineerService;
	
//	public HigherEngineer addEngineer(String collageName, String email, String higherDate, String name,String higherCity,String mobileNumber,String degree) {
//		return this.engineerService.addEnginner(collageName, email,higherDate,name, higherCity,mobileNumber,degree);
//	}
}
