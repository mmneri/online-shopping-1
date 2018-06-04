package net.akaideveloper.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import net.akaideveloper.shoppingbackend.dao.CategoryDAO;
import net.akaideveloper.shoppingbackend.dto.Category;

public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories = new ArrayList<>();
	
	static {
		Category category = new Category();
		
		//Adding first example
		category.setId(1);
		category.setName("ATASAN/TUNIK");
		category.setDescription("Pakaian atasan dan Tunik.");
		category.setImageURL("ex-bawahan-rok-celana-1.jpg");
		
		categories.add(category);
		
		//Adding second example
		category.setId(2);
		category.setName("BAWAHAN/ROK/CELANA");
		category.setDescription("Pakaian bawahan, rok, dan celana.");
		category.setImageURL("ex-atasan-tunik-1.jpg");
		
		categories.add(category);
		
		//Adding third example
		category.setId(3);
		category.setName("CARDIGAN/BLAZZER/VEST");
		category.setDescription("Pakaian cardigan, blazzer, dan vest.");
		category.setImageURL("ex-cardigan-blazzer-vest-1.jpg");
		
		categories.add(category);
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
