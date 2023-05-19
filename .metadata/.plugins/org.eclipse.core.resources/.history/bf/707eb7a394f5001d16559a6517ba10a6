package fr.fms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.fms.dao.ArticleDao;
import fr.fms.dao.CategoryDao;
import fr.fms.entites.Articles;
import fr.fms.entites.Category;

@SpringBootApplication
public class SpringShopJpaApplication implements CommandLineRunner {
	@Autowired
	private CategoryDao categoryDao;
	
	@Autowired
	private ArticleDao articleDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringShopJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		/*
		 * Category smartphone = categoryDao.save(new Category("Smartphone")); Category
		 * tablet = categoryDao.save(new Category("Tablet")); Category pc =
		 * categoryDao.save(new Category("PC"));
		 * 
		 * articleDao.save(new Articles("S10", "Samsung", 500, smartphone));
		 * articleDao.save(new Articles("S35", "Samsung", 2500, smartphone));
		 * articleDao.save(new Articles("S25", "Iphone", 5500, smartphone));
		 * 
		 * articleDao.save(new Articles("GalaxyTab", "Samsung", 3400, tablet));
		 * articleDao.save(new Articles("Ipad", "Apple", 3800, tablet));
		 * 
		 * articleDao.save(new Articles("R510", "Asus", 600, pc));
		 */
		for(Articles article : articleDao.findByCategoryId((long) 6)) {
			System.out.println(article);
		}
		
		
		
	}

}
