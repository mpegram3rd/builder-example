package com.blt.examples.models.gnarly;

/**
 * <p>
 * A contact model.  This is here just to add another
 * layer of complexity to the {@link com.blt.examples.models.gnarly.GnarlyRecord}
 * </p>
 *
 * @author Macon Pegram
 * @version 1.0.0
 */
public class GnarlyContact {

	private GnarlyName name;
	private GnarlyPhone phone;
	private GnarlyEmail email;

	/**
	 * Getter for <code>name</code>
	 *
	 * @return a {@link com.blt.examples.models.gnarly.GnarlyName} object
	 */
	public GnarlyName getName() {
		return name;
	}

	/**
	 * Setter for <code>name</code>
	 *
	 * @param name the name
	 */
	public void setName(GnarlyName name) {
		this.name = name;
	}

	/**
	 * Getter for <code>phone</code>
	 *
	 * @return a {@link com.blt.examples.models.gnarly.GnarlyPhone} object
	 */
	public GnarlyPhone getPhone() {
		return phone;
	}

	/**
	 * Setter for <code>phone</code>
	 *
	 * @param phone the phone
	 */
	public void setPhone(GnarlyPhone phone) {
		this.phone = phone;
	}

	/**
	 * Getter for <code>email</code>
	 *
	 * @return a {@link com.blt.examples.models.gnarly.GnarlyEmail} object
	 */
	public GnarlyEmail getEmail() {
		return email;
	}

	/**
	 * Setter for <code>email</code>
	 *
	 * @param email the email
	 */
	public void setEmail(GnarlyEmail email) {
		this.email = email;
	}

	/**
	 * Extracts the contact as a string.
	 *
	 * @return the string representation of the contact values.
	 */
	public String toString() {
		final StringBuilder sb = new StringBuilder("GnarlyContact: \n");
		if (getName() != null)
			sb.append("\tName: ").append(getName().toString()).append("\n");
		if (getEmail() != null)
			sb.append("\tEmail: ").append(getEmail().toString()).append("\n");
		if (getPhone() != null)
			sb.append("\tPhone: ").append(getPhone().toString()).append("\n");

		return sb.toString();
	}

}
