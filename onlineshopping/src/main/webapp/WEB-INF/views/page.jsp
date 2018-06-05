<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Butik Ophelia - ${title}</title>
    
    <script>
    	window.menu = '${title}';
    </script>

    <!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.min.css" rel="stylesheet">
    
    <!-- Bootstrap Spacelab Theme -->
    <link href="${css}/bootstrap-spacelab-theme.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${css}/shop-homepage.css" rel="stylesheet">

  </head>

  <body>
	<div class="wrapper">
	    <!-- Navigation -->
	    <%@include file="./fragments/navigation.jsp" %>
	    <!-- End of Navigation -->

	    <!-- Page Content -->
	    <div class="content">
		    <!-- Home -->
		    <c:if test="${userClickHome == true}">
		    	<%@include file="home.jsp" %>
		    </c:if>
		    <!-- About Us -->
		    <c:if test="${userClickAbout == true}">
		    	<%@include file="about.jsp" %>
		    </c:if>
		    <!-- Products -->
		    <c:if test="${userClickAllProducts == true or userClickCategoryProducts == true}">
		    	<%@include file="listProducts.jsp" %>
		    </c:if>
		    <!-- Contact -->
		    <c:if test="${userClickContact == true}">
		    	<%@include file="contact.jsp" %>
		    </c:if>
	    </div>
	    <!-- End of Page Content -->
	
	    <!-- Footer -->
	    <%@include file="./fragments/footer.jsp" %>
	    <!-- End of Footer -->
	
    <!-- Bootstrap core JavaScript -->
    <script src="${js}/jquery.min.js"></script>
    <script src="${js}/bootstrap.bundle.min.js"></script>
    
    <!-- Self coded JavaScript -->
    <script src="${js}/myapp.js"></script>
	</div>
  </body>

</html>

