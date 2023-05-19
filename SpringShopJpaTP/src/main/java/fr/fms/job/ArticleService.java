package fr.fms.job;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.fms.dao.ArticleDao;
import fr.fms.dao.CategoryDao;
import fr.fms.entities.Article;
import fr.fms.entities.Category;

@Service
public class ArticleService {
	@Autowired
	public ArticleDao article;
	@Autowired
	public CategoryDao category;
	
	public void UpdateArticle(int id ,String description, String brand, double price, long categoryId) {
		
		Optional<Article> articleToUpdate = article.findById((long)id);
		if(articleToUpdate.isPresent()) {
			Article articleUpdated = articleToUpdate.get();
			articleUpdated.setDescription(description);
			articleUpdated.setBrand(brand);
			articleUpdated.setPrice(price);
			
			
			Optional<Category> categoryToUpdate = category.findById( categoryId);
			if(categoryToUpdate.isPresent()) {
				Category categoryUpdated = categoryToUpdate.get();
				articleUpdated.setCategory(categoryUpdated);
			}
			
			article.save(articleUpdated);
		}
	}
}
