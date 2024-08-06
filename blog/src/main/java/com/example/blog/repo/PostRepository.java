package com.example.blog.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.blog.models.Post;
@Repository
public interface PostRepository extends CrudRepository<Post,Long>{
	
}
