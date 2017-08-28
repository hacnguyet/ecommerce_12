<%@ taglib prefix="s" uri="/struts-tags" %>
<!--form-->
<section id="form">
	<div class="container">
		<div class="row">
			<div class="col-sm-4"></div>
			<div class="col-sm-4">
				<div class="login-form">
					<!--login form-->
					<h2>Login to your account</h2>
					<s:if test="message != null">
						<div class="alert alert-warning">
							<s:property value="message" />
						</div>
					</s:if>	
					<s:form action="/loginAction" method="POST">
						<s:textfield  name="userName" placeholder="Username"/>
						<s:password name="password" placeholder="Username"/>
						<span>
							<s:checkbox name="signed_in" class="checkbox"/>
							<s:text name="Keep me signed in" /> 
						</span>
						<s:submit type="button" class="btn btn-default" key="Login" />
					</s:form>
				</div>
				<!--/login form-->
			</div>
			<div class="col-sm-4"></div>
		</div>
	</div>	
</section>
<!--/form-->
