package com.digitalinnovation.api.repository;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.digitalinnovation.api.document.Heroes;

@EnableScan
public interface HeroesRepository extends CrudRepository<Heroes, String>{
}
