$(document).ready(function(){
	$('.cart_action_add').click(function(){
		$('.lean_overlay').fadeIn();
		$('.form_popup').animate({
			top: '80px',
		});
	});
	$('.lean_overlay').click(function(){
		$('.lean_overlay').fadeOut();
		$('.form_popup').animate({
			top: '-1000px',
		});
	});
	$('#add-product-button').click(function(){
		$.ajax({
			url: "/ecommerce_12/product/create",
			type: "POST",
			data: {
				userName : $('#userName').data('value'),
				password : $('#password').data('value'),
				productName : $('#add_product_productName').val(),
				storeId: $('#storeId').data('value'),
				categoryId : $('#add_product_category').val(),
				property : $('#add_product_property').val(),
				price : $('#add_product_price').val(),
				count : $('#add_product_count').val(),
				discount : $('#add_product_discount').val(),
			},
			dataType: "json",
			success: function(data){
				console.log(JSON.stringify(data));
				console.log("success");
				$('.lean_overlay').fadeOut();
				$('.form_popup').animate({
					top: '-1000px',
				});
				alert("Success!");
				$('#tbody-cart-info').append('<tr>'+ 
                        '<td class="cart_stt text_align_center">'+
                        '<p></p>'+
                     '</td>'+
                     '<td class="cart_name">'+
                        '<h4><a href="">'+ data.productName +'</a></h4>'+
                        '<p>Product ID: '+ data.productId +'</p>'+
                     '</td>'+
                     '<td class="cart_category">'+
                        '<p>'+ data.categoryName +'</p>'+
                     '</td>'+
                     '<td class="cart_property">'+
                        '<p>'+ data.property +'</p>'+
                     '</td>'+
                     '<td class="cart_price">'+
                        '<p>'+ data.price +'</p>'+
                     '</td>'+
                     '<td>'+
	                   		'<a href=""><img class="cart_image" src="http://localhost:8080/ecommerce_12/assets/images/home/product1.jpg" alt=""></a>'+
	                 	'</td>'+
                     '<td class="cart_quantity text">'+
                        '<p>'+ data.count +'</p>'+
                     '</td>'+
                     '<td class="cart_lastupdate">'+
                        '<p>'+ data.updateAt +'</p>'+
                     '</td>'+
                     '<td class="cart_action text_align_center">'+
                     	'<a class="cart_action_search" href=""><span class="glyphicon glyphicon-search"></span></a>'+
                     	'<a class="cart_action_edit" href=""><span class="glyphicon glyphicon-edit"></span></a>'+
                     	'<a class="cart_action_remove" href=""><span class="glyphicon glyphicon-remove"></span></a>'+
                     '</td>'+
                  '</tr>');
			},
			error: function(data){
				console.log("error");
				alert("Error!");
			}
		});
	});
});