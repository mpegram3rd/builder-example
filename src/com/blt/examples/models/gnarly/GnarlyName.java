package com.blt.examples.models.gnarly;

import static com.blt.examples.utils.TransformUtils.nullSafe;

/**
 * <p>
 * A slightly more complicated than necessary representation of a name.
 * </p>
 *
 * @author Macon Pegram
 * @version 1.0.0
 */
public class GnarlyName {

	private String lastName;
	private String firstname;
	private String middleName;
	private String suffix;

	/**
	 * Getter for <code>lastName</code>
	 *
	 * @return a {@link String} object
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Setter for <code>lastName</code>
	 *
	 * @param lastName the lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Getter for <code>firstname</code>
	 *
	 * @return a {@link String} object
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * Setter for <code>firstname</code>
	 *
	 * @param firstname the firstname
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * Getter for <code>middleName</code>
	 *
	 * @return a {@link String} object
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * Setter for <code>middleName</code>
	 *
	 * @param middleName the middleName
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * Getter for <code>suffix</code>
	 *
	 * @return a {@link String} object
	 */
	public String getSuffix() {
		return suffix;
	}

	/**
	 * Setter for <code>suffix</code>
	 *
	 * @param suffix the suffix
	 */
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	/**
	 * Outputs the full name.
	 *
	 * @return the full name as a string
	 */
	public String toString() {
		return new StringBuilder().append(nullSafe(getFirstname())).append(" ")
				.append(nullSafe(getMiddleName())).append(" ")
				.append(nullSafe(getLastName())).append(" ")
				.append(nullSafe(getSuffix()))
				.toString();
	}

}
