package fr.fms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.fms.entites.Articles;

public interface ArticleDao extends JpaRepository<Articles, Integer>{
	List<Articles> findAll();
	List<Articles> findByBrand(String brand);
	List<Articles> findByBrandContains(String brand);
	List<Articles> findByCategoryId(Long categoryId); 
}

