<div class="container">
	<div class="row">
		<!-- Display sidebar -->
		<div class="col-md-3">
			<%@ include file="./fragments/sidebar.jsp" %>
		</div>
		
		<!-- Display the actual product -->
		<div class="col-md-9">
			<!-- Add bootstrap breadcrumb component -->
			<div class="row">
				<div class="col-md-12">
					<c:if test="${userClickAllProducts == true}">
					<nav aria-label="breadcrumb">
					  <ol class="breadcrumb">
					    <li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
					    <li class="breadcrumb-item active" aria-current="page">All Products</li>
					  </ol>
					</nav>
					</c:if>
					
					<c:if test="${userClickCategoryProducts == true}">
					<nav aria-label="breadcrumb">
					  <ol class="breadcrumb">
					    <li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
					    <li class="breadcrumb-item active" aria-current="page">Category</li>
					    <li class="breadcrumb-item active" aria-current="page">${category.name}</li>
					  </ol>
					</nav>
					</c:if>
				</div>
			</div>
		</div>
	</div>
</div>