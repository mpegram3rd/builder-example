package com.blt.examples.models.gnarly;

import static com.blt.examples.utils.TransformUtils.nullSafe;

/**
 * <p>
 * A phone number split by area code.
 * </p>
 *
 * @author Macon Pegram
 * @version 1.0.0
 */
public class GnarlyPhone {

	private String areacode;
	private String phonenum;

	/**
	 * Getter for <code>areacode</code>
	 *
	 * @return a {@link String} object
	 */
	public String getAreacode() {
		return areacode;
	}

	/**
	 * Setter for <code>areacode</code>
	 *
	 * @param areacode the areacode
	 */
	public void setAreacode(String areacode) {
		this.areacode = areacode;
	}

	/**
	 * Getter for <code>phonenum</code>
	 *
	 * @return a {@link String} object
	 */
	public String getPhonenum() {
		return phonenum;
	}

	/**
	 * Setter for <code>phonenum</code>
	 *
	 * @param phonenum the phonenum
	 */
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	/**
	 * The phone number as a string.
	 *
	 * @return the phone number as a string
	 */
	public String toString() {
		return new StringBuilder().append("(")
				.append(nullSafe(getAreacode())).append(") ")
				.append(nullSafe(getPhonenum()))
				.toString();
	}

}
