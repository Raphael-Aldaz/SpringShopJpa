package fr.fms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.fms.entities.Category;


@Repository
public interface CategoryDao extends JpaRepository<Category, Long> {
	List<Category> findAllByOrderByNameAsc();
	List<Category> findAllByOrderByNameDesc();
}
