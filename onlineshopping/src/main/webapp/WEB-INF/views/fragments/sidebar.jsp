<h2 class="my-4">Butik Ophelia</h2>
<div class="list-group">
	<c:forEach items="${categories}" var="category">
		<a href="${contextRoot}/show/category/${category.id}/products" class="list-group-item" id="id_${category.name}">${category.name}</a>
	</c:forEach>
</div>