package fr.fms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.fms.entites.Articles;
import fr.fms.entites.Category;

public interface CategoryDao extends JpaRepository<Category, Integer> {
	
}
