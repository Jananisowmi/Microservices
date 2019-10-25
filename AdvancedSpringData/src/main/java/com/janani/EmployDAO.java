package com.janani;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployDAO extends CrudRepository<Employ,Integer>  {
	
}


