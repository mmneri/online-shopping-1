package net.akaideveloper.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.akaideveloper.shoppingbackend.dao.CategoryDAO;
import net.akaideveloper.shoppingbackend.dto.Category;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("title", "Home");
		mv.addObject("userClickHome", true);
		
		//Passing list of categories
		mv.addObject("categories", categoryDAO.list());
		
		return mv;
	}
	
	@RequestMapping(value = {"about"})
	public ModelAndView about(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;
	}
	
	@RequestMapping(value = {"contact"})
	public ModelAndView contact(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact");
		mv.addObject("userClickContact", true);
		return mv;
	}
	
	/* Method to load all products and based on category */
	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts(){
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("title", "All Products");
		mv.addObject("userClickAllProducts", true);
		//Passing list of categories
		mv.addObject("categories", categoryDAO.list());
		
		return mv;
	}
	
	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id){
		ModelAndView mv = new ModelAndView("page");
		
		/* categoryDAO to fetch a single category */
		Category category = null;
		
		category = categoryDAO.get(id);
		
		mv.addObject("title", category.getName());
		mv.addObject("userClickCategoryProducts", true);
		//Passing list of categories
		mv.addObject("categories", categoryDAO.list());
		//Passing single category object
		mv.addObject("category", category);
		
		return mv;
	}
}
