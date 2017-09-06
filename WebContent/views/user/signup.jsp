<%@ taglib prefix="s" uri="/struts-tags" %>
<!--form-->
<section id="form">
	<div class="container">
		<div class="row">
			<div class="col-sm-4"></div>
			<div class="col-sm-4">
				<div class="login-form">
					<!--login form-->
					<h2>Create your account</h2>
					<s:if test="message != null">
						<div class="alert alert-warning">
							<s:property value="message" />
						</div>
					</s:if>	
					<s:form action="/user/signup" method="POST">
						<s:textfield  name="userInfo.userName" placeholder="Username"/>
						<s:textfield  name="userInfo.userEmail" placeholder="Email Address"/>
						<s:password name="userInfo.password" placeholder="Password"/>
						<s:password name="userInfo.confirm_password" placeholder="Confirm Password"/>
						<s:submit type="button" class="btn btn-default" key="Signup" />
					</s:form>
				</div>
				<!--/login form-->
			</div>
			<div class="col-sm-4"></div>
		</div>
	</div>	
</section>
<!--/form-->
