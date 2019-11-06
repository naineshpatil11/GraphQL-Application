package com.techshard.graphql.dao.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techshard.graphql.dao.entity.FellowshipEngineers;

@Repository
public interface FellowshipEngineersRepository extends JpaRepository<FellowshipEngineers,Integer>{

	Optional<FellowshipEngineers> findByEmail(String email);
	
}
