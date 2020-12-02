package com.aberimen.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aberimen.springboot.Model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
