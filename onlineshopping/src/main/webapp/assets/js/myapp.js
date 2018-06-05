$(function(){
	
	//Solving Active Menu Problem
	switch(menu){
	
		case 'About Us' :
			$('#about').addClass('active');
			break;
			
		case 'Contact' :
			$('#contact').addClass('active');
			break;
			
		case 'All Products' :
			$('#listProducts').addClass('active');
			break;
			
		default :
			$('#listProducts').addClass('active');
			$('#id_'+menu).addClass('active');
			break;
	}
	
});