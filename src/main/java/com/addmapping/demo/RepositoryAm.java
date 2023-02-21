package com.addmapping.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositoryAm extends JpaRepository<EntityDao, Integer>{

}
