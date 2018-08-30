package com.revature.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import com.revature.model.Person;

public interface PersonRepository extends CassandraRepository<Person, String> {
	@AllowFiltering
	public List<Person> findByFirstname(String firstname);
	
	@AllowFiltering
	public List<Person> findByAgeGreaterThan(int age);

}
