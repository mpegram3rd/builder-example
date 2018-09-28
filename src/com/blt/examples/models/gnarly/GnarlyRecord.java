package com.blt.examples.models.gnarly;

/**
 * <p>
 * An overly complex data model to demonstrate how a Fluent Builder can help with mapping data
 * and handling deeply nested values.
 * </p>
 *
 * @author Macon Pegram
 * @version 1.0.0
 */
public class GnarlyRecord {

	private GnarlyContact contact;

	/**
	 * Getter for <code>contact</code>
	 *
	 * @return a {@link com.blt.examples.models.gnarly.GnarlyContact} object
	 */
	public GnarlyContact getContact() {
		return contact;
	}

	/**
	 * Setter for <code>contact</code>
	 *
	 * @param contact the contact
	 */
	public void setContact(GnarlyContact contact) {
		this.contact = contact;
	}

	/**
	 * String representation of the nested structure in this record.
	 *
	 * @return this record as a string.
	 */
	public String toString() {
		return contact == null ? "" : contact.toString();
	}
}
