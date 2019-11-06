package com.techshard.graphql.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techshard.graphql.dao.entity.BankDetails;

@Repository
public interface BankDetailsRepository extends JpaRepository<BankDetails, Integer>{

}
