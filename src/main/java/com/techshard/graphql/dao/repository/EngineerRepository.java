package com.techshard.graphql.dao.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techshard.graphql.dao.entity.HigherEngineer;

@Repository
public interface EngineerRepository extends JpaRepository<HigherEngineer, Integer>{

	List<HigherEngineer> findByEmail(String email);
}
