package com.techshard.graphql.query;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.techshard.graphql.dao.entity.BankDetails;
import com.techshard.graphql.service.BankDetailsService;

@Component
public class BankDetailsQuery implements GraphQLQueryResolver{
	@Autowired
	private BankDetailsService detailsService;
	
	public List<BankDetails> getAllBankDetails(){
		return this.detailsService.getAllBankDetails();
	}
	
	public Optional<BankDetails> getBankDetails(int id){
		return this.detailsService.bankDetails(id);
	}
}
