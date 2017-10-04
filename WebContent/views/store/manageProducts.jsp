<%@ taglib prefix="s" uri="/struts-tags" %> 
<input type="hidden" id="userName" data-value="<s:property value="userName" />" />
<input type="hidden" id="password" data-value="<s:property value="password" />" />
<input type="hidden" id="storeId" data-value="<s:property value="storeId" />" />
<div class="form_popup">
	<!--Add new product form-->
	<h2>Add your product</h2>
	<s:form id="add_product" method="POST" enctype="multipart/form-data">
		<s:textfield name="productName" placeholder="Product's Name"/>
		<s:select name="category" headerKey="" headerValue="Category" list="listCategoryInfo" listKey="categoryId" listValue="categoryName" />
		<s:textfield name="property" placeholder="Product's Properties"/>
		<s:textfield type="number" name="price" placeholder="Product's Price"/>
		<s:textfield type="number" name="count" placeholder="Products Quantity"/>
		<s:textfield type="number" name="discount" min="0" max="100" placeholder="Discount(%)"/>
		<s:file name="image" accept="image/*" />
	</s:form>
	<button id="add-product-button" class="btn btn-default">Add</button>
</div> 
<div class="lean_overlay"></div>	
<section id="cart_items">
   <div class="container">
      <div class="breadcrumbs">
         <ol class="breadcrumb">
            <li><a href="${pageContext.request.contextPath}">Home</a></li>
            <li class="active">Store</li>
         </ol>
      </div>
      <div class="table-responsive cart_info">
         <table class="table table-condensed">
            <thead>
               <tr class="cart_menu">
                  <td class="stt text_align_center">STT</td>
                  <td class="name">Name</td>
                  <td class="category">Category</td>
                  <td class="property">Property</td>
                  <td class="price">Price</td>
                  <td class="image">Image</td>
                  <td class="quantity">Quantity</td>
                  <td class="lastupdate">Last Update</td>
                  <td></td>
               </tr>
            </thead>
            <tbody id="tbody-cart-info">
               <s:if test="listProductInfo != null">
                  <s:iterator value="listProductInfo" status="stat">
                     <tr>
                        <td class="cart_stt text_align_center">
                           <p><s:property value="#stat.count" /></p>
                        </td>
                        <td class="cart_name">
                           <h4><a href=""><s:property value="productName" /></a></h4>
                           <p>Product ID: <s:property value="productId" /></p>
                        </td>
                        <td class="cart_category">
                           <p><s:property value="category.categoryName" /></p>
                        </td>
                        <td class="cart_property">
                           <p><s:property value="property" /></p>
                        </td>
                        <td class="cart_price">
                           <p><s:property value="getText('{0,number,#,##0.00}',{price})"/></p>
                        </td>
                        <td>
	                   		<a href=""><img class="cart_image" src="${pageContext.request.contextPath}/assets/images/home/product1.jpg" alt=""></a>
	                 	</td>
                        <td class="cart_quantity text">
                           <p><s:property value="count" /></p>
                        </td>
                        <td class="cart_lastupdate">
                           <p><s:date name="updateAt" /></p>
                        </td>
                        <td class="cart_action text_align_center">
                        	<a class="cart_action_search" href=""><span class="glyphicon glyphicon-search"></span></a>
                        	<a class="cart_action_edit" href=""><span class="glyphicon glyphicon-edit"></span></a>
                        	<a class="cart_action_remove" href=""><span class="glyphicon glyphicon-remove"></span></a>
                        </td>
                     </tr>
                  </s:iterator>
               </s:if>
               <tr>
               	  <td colspan="9" class="text_align_center none_padding">
                  	 <a class="cart_action_add"><span class="glyphicon glyphicon-plus"></span></a>
                  </td>	
               </tr>
            </tbody>
         </table>
      </div>
      <s:submit type="button" class="btn float_right" key="Submit" />
   </div>
</section>
<!--/#cart_items-->