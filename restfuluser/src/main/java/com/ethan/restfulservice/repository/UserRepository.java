package com.ethan.restfulservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ethan.restfulservice.entity.useraccount;

@RepositoryRestResource(path = "/users")
public interface UserRepository extends JpaRepository<useraccount, String> {

}