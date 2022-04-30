package com.example.herok.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.herok.Entity.*;

@Repository
public interface MovieRepo extends CrudRepository<MovieEntity,Integer>{

}
