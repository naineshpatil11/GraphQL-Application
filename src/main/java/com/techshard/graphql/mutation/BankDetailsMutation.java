package com.techshard.graphql.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.techshard.graphql.dao.entity.BankDetails;
import com.techshard.graphql.service.BankDetailsService;

@Component
public class BankDetailsMutation implements GraphQLMutationResolver{

	@Autowired
	private BankDetailsService detailsService;

	public BankDetails addBankDetails(String name,String accountNumber, String ifscCode,String panNumber, String addharNumber) {
		return this.detailsService.addBankDetails(name,accountNumber,ifscCode,panNumber,addharNumber);
	}
}
