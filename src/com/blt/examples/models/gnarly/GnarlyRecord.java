package com.blt.examples.models.gnarly;

/**
 * <p>
 * Description
 * </p>
 *
 * @author Macon Pegram
 * @version {version}
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

	public String toString() {
		return contact == null ? "" : contact.toString();
	}
}
