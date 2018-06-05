package net.akaideveloper.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.akaideveloper.shoppingbackend.dao.CategoryDAO;
import net.akaideveloper.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories = new ArrayList<>();
	
	static {
		
		Category category = new Category();
		
		//Adding first example
		category.setId(1);
		category.setName("Atasan-Tunik");
		category.setDescription("Pakaian atasan dan Tunik.");
		category.setImageURL("ex-bawahan-rok-celana-1.jpg");
		
		categories.add(category);
		
		//Adding second example
		category = new Category();
		category.setId(2);
		category.setName("Bawahan-Rok-Celana");
		category.setDescription("Pakaian bawahan, rok, dan celana.");
		category.setImageURL("ex-atasan-tunik-1.jpg");
		
		categories.add(category);
		
		//Adding third example
		category = new Category();
		category.setId(3);
		category.setName("Cardigan-Blazzer-Vest");
		category.setDescription("Pakaian cardigan, blazzer, dan vest.");
		category.setImageURL("ex-cardigan-blazzer-vest-1.jpg");
		
		categories.add(category);
	}
	
	@Override
	public List<Category> list() {
		
		return categories;
	}

	@Override
	public Category get(int id) {
		
		for(Category category : categories){
			
			if(category.getId() == id) 
				return category;
		}
		
		return null;
	}

}
