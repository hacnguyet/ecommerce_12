package com.ecommerce.common;

import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

public class Validator {
	
	// Logger
	private static final Logger logger = Logger.getLogger(Validator.class);

	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	/**
	 * Validate mail with regular expression
	 * @param mail
	 * @return true valid mail, false invalid mail
	 */
	public static boolean mailValidator(final String mail) {
		try {
			return Pattern.compile(EMAIL_PATTERN).matcher(mail).matches();
		} catch (Exception e) {
			logger.error("Threw a Exception in Validator::mailValidator, full stack trace follows:", e);
			return false;
		}	
	}
	
	/**
	 * Validate signup info
	 * @param String userName, String email, String password, String confirm_password
	 * @return String message if invalid, null if valid, 
	 */
	public static String signupValidator(String userName, String userEmail, String password, String confirm_password) {
		try {
			if (StringUtils.isBlank(userName)) {
				return "warning.username_empty";
			} else if (StringUtils.isBlank(userEmail)) {
				return "warning.email_empty";
			} else if (!mailValidator(userEmail)) {
				return "warning.email";
			} else if (StringUtils.isBlank(password)) {
				return "warning.password_empty";
			} else if (password.length() < 6) {
				return "warning.password_length";
			} else if (StringUtils.isBlank(confirm_password)) {
				return "warning.confirm_password_empty";
			} else if (!confirm_password.equals(password)) {
				return "warning.confirm_password";
			}
		} catch (Exception e) {
			logger.error("Threw a Exception in Validator::signupValidator, full stack trace follows:", e);
			return Constant.SYS_ERROR;
		}	
		return null;
	}
}
