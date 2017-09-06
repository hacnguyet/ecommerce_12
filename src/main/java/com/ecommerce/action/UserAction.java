package com.ecommerce.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import com.ecommerce.service.UserService;
import com.ecommerce.model.User;
import com.ecommerce.common.Validator;
import com.ecommerce.common.Constant;
import com.ecommerce.info.UserInfo;

/**
 * User Action
 * @author ManhTT 
 * 新規作成 2017/08/25
 */
public class UserAction extends ActionSupport implements MessageSourceAware {

	private static final long serialVersionUID = 1L;
	
	// Logger
	private static final Logger logger = Logger.getLogger(UserAction.class);
	
	private UserService userService;
	
	// Login info
	private UserInfo userInfo;
	
	// Message
	private MessageSource messageSource;
	private String message;

	/*
	 * Process login action
	 * @param none
	 * @return string
	 */
	public String login(){
		try {
			// Get session
			Map<String, Object> session = ActionContext.getContext().getSession();
	
			// Check if user is already logged in
			if (session.get("userName") != null)
				return SUCCESS;
	
			// Check login form request, if don't have, return login form
			if (userInfo == null)
				return ERROR;
			
			// Check login info
			if (StringUtils.isBlank(userInfo.getUserName())) {
				// Rerurn signup form with warning message
				setMessage(messageSource.getMessage("warning.username_empty", null, Locale.US));
				return ERROR;
			}
	
			// Get user info from db with login info
			User user = userService.findByUsername(userInfo.getUserName());
	
			// Continue check login info
			if (user == null) {
				// Rerurn login form with warning message
				setMessage(messageSource.getMessage("warning.user_does_not_exist", null, Locale.US));
				return ERROR;
			} else if (StringUtils.isBlank(userInfo.getPassword())) {
				// Rerurn signup form with warning message
				setMessage(messageSource.getMessage("warning.password_empty", null, Locale.US));
				return ERROR;
			} else if (!userInfo.getPassword().equals(user.getPassword())) {
				// Return login form with warning message
				setMessage(messageSource.getMessage("warning.wrong_password", null, Locale.US));
				return ERROR;
			} 
	
			// If login info is correct, insert into session
			session.put("userId", user.getUserId());
			session.put("userName", user.getUserName());
			session.put("userType", user.getUserType());
			
		} catch (Exception e) {
			logger.error("Threw a Exception in UserAction::login, full stack trace follows:", e);
			return Constant.SYS_ERROR;
		}	
			
		return SUCCESS;
	}

	/*
	 * Process logout action
	 * @param none
	 * @return string
	 */
	public String logout() {
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
	
	/*
	 * Process signup action
	 * @param none
	 * @return string
	 */
	public String signup(){
		try {
			// Get session
			Map<String, Object> session = ActionContext.getContext().getSession();
	
			// Check signup form request, if dont have, return signup form
			if (userInfo == null)
				return ERROR;
	
			// Check signup info
			String mess = Validator.signupValidator(userInfo.getUserName(), userInfo.getUserEmail(), userInfo.getPassword(), userInfo.getConfirm_password());
			if (mess != null) {
				if(mess.equals(Constant.SYS_ERROR)) {
					return mess;
				} else {	
					// Rerurn signup form with warning message
					setMessage(messageSource.getMessage(mess, null, Locale.US));
					return ERROR;
				}	
			} else if (userService.findByUsername(userInfo.getUserName()) != null) {
				// Rerurn signup form with warning message
				setMessage(messageSource.getMessage("warning.username_already_exist", null, Locale.US));
				return ERROR;
			} else if (userService.findByEmail(userInfo.getUserEmail()) != null) {
				// Rerurn signup form with warning message
				setMessage(messageSource.getMessage("warning.email_already_exist", null, Locale.US));
				return ERROR;
			} 
			
			// Create new user
			User user = userService.create(userInfo);
	
			if(user != null) {
				// Login new user
				session.put("userId", user.getUserId());
				session.put("userName", user.getUserName());
				session.put("userType", user.getUserType());
			} else {
				setMessage(messageSource.getMessage("warning.create_user_fail", null, Locale.US));
				return ERROR;
			}	
		} catch (Exception e) {
			logger.error("Threw a Exception in UserAction::signup, full stack trace follows:", e);
			return Constant.SYS_ERROR;
		}	

		return SUCCESS;
	}
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
