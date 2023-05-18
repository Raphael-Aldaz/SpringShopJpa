package fr.fms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.fms.entities.Article;

@Repository
public interface ArticleDao extends JpaRepository<Article, Long> {
	List<Article> findAll();
	//Article By id
	List<Article>findArticleById(long id);
	//All articles that contains x description and y brand
	List<Article> findByBrandAndDescription(String brand, String description);
	

	
	List<Article> findByBrand(String brand);
	List<Article> findByBrandContains(String brand);
	List<Article> findByCategoryId(Long categoryId); 

	
	

}
