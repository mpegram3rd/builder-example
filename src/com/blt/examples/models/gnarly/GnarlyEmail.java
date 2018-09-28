package com.blt.examples.models.gnarly;

import static com.blt.examples.utils.TransformUtils.nullSafe;

/**
 * <p>
 * An overly complex email address.
 * </p>
 *
 * @author Macon Pegram
 * @version 1.0.0
 */
public class GnarlyEmail {

	private String account;
	private String hostname;

	/**
	 * Getter for <code>account</code>
	 *
	 * @return a {@link String} object
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * Setter for <code>account</code>
	 *
	 * @param account the account
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * Getter for <code>hostname</code>
	 *
	 * @return a {@link String} object
	 */
	public String getHostname() {
		return hostname;
	}

	/**
	 * Setter for <code>hostname</code>
	 *
	 * @param hostname the hostname
	 */
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	/**
	 * Returns the email address as a string (puts Humpty Dumpty back together again)
	 *
	 * @return the string representation of the email.
	 */
	public String toString() {
		return nullSafe(getAccount()) + "@" + nullSafe(getHostname());
	}
}
