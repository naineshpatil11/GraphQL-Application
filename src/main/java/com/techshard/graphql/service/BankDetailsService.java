package com.techshard.graphql.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.techshard.graphql.dao.entity.BankDetails;
import com.techshard.graphql.dao.repository.BankDetailsRepository;
@Service
public class BankDetailsService {

	@Autowired
	private BankDetailsRepository detailsRepository;
	
	@Transactional
	public BankDetails addBankDetails(String name, String accountNumber, String ifscCode, String panNumber,
			String addharNumber) {
		BankDetails bankDetails = new BankDetails();
		bankDetails.setName(name);
		bankDetails.setAccountNumber(accountNumber);
		bankDetails.setIfscCode(ifscCode);
		bankDetails.setPanNumber(panNumber);
		bankDetails.setAddharNumber(addharNumber);
		return detailsRepository.save(bankDetails);
	}

	@Transactional
	public List<BankDetails> getAllBankDetails() {
		return detailsRepository.findAll();
	}

	@Transactional
	public Optional<BankDetails> bankDetails(int id) {
		return detailsRepository.findById(id);
	}
}
