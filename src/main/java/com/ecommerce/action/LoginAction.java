package com.ecommerce.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import java.util.Locale;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.apache.log4j.Logger;
import com.ecommerce.service.UserService;
import com.ecommerce.model.User;

/**
 * Login Action
 * 
 * @author ManhTT 新規作成 2017/08/25
 */
public class LoginAction extends ActionSupport implements MessageSourceAware {

	private static final long serialVersionUID = 1L;

	// Logger configured using log4j
	private static final Logger logger = Logger.getLogger(LoginAction.class);
	
	private MessageSource messageSource;

	// Login info
	private String userName;
	private String password;
	
	// Message
	private String message;

	private UserService userService;

	public String login() {
		// Get session
		Map<String, Object> session = ActionContext.getContext().getSession();

		// Check if user is already logged in
		if (session.get("userName") != null)
			return ERROR;
		
		return SUCCESS;
	}

	/*
	 * Process login action
	 * 
	 * @parameter none
	 * 
	 * @return string
	 */
	public String loginAction() throws Exception {
		// Get session
		Map<String, Object> session = ActionContext.getContext().getSession();

		// Check if user is already logged in
		if (session.get("userName") != null)
			return SUCCESS;

		try {
			// Get user info from db with login info
			User user = userService.getUserByUsername(userName);

			// Check login info
			if (user == null) {
				setMessage(messageSource.getMessage("error.user_does_not_exist", null, Locale.US));
				return ERROR;
			} else if (!password.equals(user.getPassword())) {
				setMessage(messageSource.getMessage("error.wrong_password", null, Locale.US));
				return ERROR;
			}

			// If login info is correct, insert into session
			session.put("userId", user.getUserId());
			session.put("userName", user.getUserName());
			session.put("userType", user.getUserType());

		} catch (Exception e) {
			logger.error("Threw a Exception in LoginAction::execute, full stack trace follows:", e);
			return ERROR;
		}
		return SUCCESS;
	}

	/*
	 * Process logout action
	 * 
	 * @parameter none
	 * 
	 * @return string
	 */
	public String logoutAction() {
		// Get session
		Map<String, Object> session = ActionContext.getContext().getSession();

		// If username is logged in, remove login info in session
		if (session.get("userName") != null) {
			session.remove("userId");
			session.remove("userName");
			session.remove("userType");
		}

		return SUCCESS;
	}
	
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
