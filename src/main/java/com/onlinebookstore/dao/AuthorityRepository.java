package com.onlinebookstore.dao;

import com.onlinebookstore.entity.Authority;
import com.onlinebookstore.entity.AuthorityId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AuthorityRepository extends JpaRepository<Authority, AuthorityId> {

}
