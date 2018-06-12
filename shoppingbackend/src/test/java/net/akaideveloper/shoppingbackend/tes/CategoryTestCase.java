package net.akaideveloper.shoppingbackend.tes;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.akaideveloper.shoppingbackend.dao.CategoryDAO;
import net.akaideveloper.shoppingbackend.dto.Category;

public class CategoryTestCase {
	
	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;
	private Category category;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.akaideveloper.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}
	
	/*@Test
	public void testAddCategory(){
		
		category = new Category();
		
		category.setName("Sweater-Jacket-Couple");
		category.setDescription("Pakaian sweater, jacket, dan couple.");
		category.setImageURL("ex-sweater-jacket-couple-1.jpg");
		
		
		assertEquals("Successfully added data.", true, categoryDAO.add(category));
	}*/
	
	/*@Test
	public void testGetCategory(){
		
		category = categoryDAO.get(3);
		
		assertEquals("Successfully fetch a single category from database", "Cardigan-Blazzer-Vest", category.getName());
	}*/
	
	/*@Test
	public void testUpdateCategory(){
		
		category = categoryDAO.get(3);
		category.setName("Cardigan-Blazzer-Vest");
		
		assertEquals("Successfully updated.", true, categoryDAO.update(category));
		
	}*/
	
	/*@Test
	public void testDeleteCategory(){
		
		category = categoryDAO.get(3);
		
		assertEquals("Successfully deleted.", true, categoryDAO.delete(category));
		
	}*/
	
	/*@Test
	public void testListCategory(){
		
		assertEquals("Successfully fetch all categories.", 3, categoryDAO.list().size());
		
	}*/
	
	@Test
	public void testCRUDCategory(){
		
		//Adding Datas
		category = new Category();
		category.setName("Atasan-Tunik");
		category.setDescription("Pakaian atasan dan Tunik.");
		category.setImageURL("ex-atasan-tunik-1.jpg");
		assertEquals("Successfully added data.", true, categoryDAO.add(category));
		
		category = new Category();		
		category.setName("Bawahan-Rok-Celana");
		category.setDescription("Pakaian bawahan, rok, dan celana.");
		category.setImageURL("ex-bawahan-rok-celana-1.jpg");		
		assertEquals("Successfully added data.", true, categoryDAO.add(category));
		
		category = new Category();		
		category.setName("Cardigan-Blazzer-Vest");
		category.setDescription("Pakaian cardigan, blazzer, dan vest.");
		category.setImageURL("ex-cardigan-blazzer-vest-1.jpg");	
		assertEquals("Successfully added data.", true, categoryDAO.add(category));
		
		category = new Category();	
		category.setName("Sweater-Jacket-Couple");
		category.setDescription("Pakaian sweater, jacket, dan couple.");
		category.setImageURL("ex-sweater-jacket-couple-1.jpg");	
		assertEquals("Successfully added data.", true, categoryDAO.add(category));
		
		//Get a single data and update data
		category = categoryDAO.get(3);
		category.setName("Cardigan-Vest-Blazzer");
		assertEquals("Successfully updated.", true, categoryDAO.update(category));
		
		//Delete data from category	
		assertEquals("Successfully deleted.", true, categoryDAO.delete(category));
		
		//Fetch All data from categor
		assertEquals("Successfully fetch all categories.", 3, categoryDAO.list().size());
		
	}
}
