package com.xProject.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.xProject.entity.UserEntity;


public interface UserRepository extends Repository<UserEntity, Integer> {
	
	public UserEntity findById(int id);
	
	public List<UserEntity> findAll();
	
	public void save(UserEntity user);
	
	//@Query("SELECT user FROM UserEntity user WHERE txt like :txt")
	//public List<UserEntity> findBookBysearchText(@Param("txt") String searchText);
}
