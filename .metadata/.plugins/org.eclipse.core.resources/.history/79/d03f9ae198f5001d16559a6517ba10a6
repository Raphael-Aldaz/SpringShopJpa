package fr.fms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.fms.dao.ArticleDao;
import fr.fms.dao.CategoryDao;
import fr.fms.entities.Article;
import fr.fms.entities.Category;
import fr.fms.job.ArticleServices;



@SpringBootApplication

public class SpringShopJpaExoApplication implements CommandLineRunner {
	@Autowired
	public ArticleDao article;
	@Autowired
	public ArticleServices articleService;
	@Autowired
	public CategoryDao category;

	public static void main(String[] args) {
		SpringApplication.run(SpringShopJpaExoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		for(Category categories : category.findAllByOrderByNameAsc()) {
			System.out.println(categories);
		}
		for(Category categories : category.findAllByOrderByNameDesc()) {
			System.out.println(categories);
		}
		for(Article articles : article.findAll()) {
			System.out.println(articles);
		}
	
   
 }

}
