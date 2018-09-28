package com.blt.examples.builder;

import com.blt.examples.models.gnarly.*;

/**
 * <p>
 * This is an example of a Fluent Builder pattern.  It allows you to gradually construct a complex model and populate
 * only the fields you want.  It shows how to handle, in a null-safe way, retrieving sub-models in a very complex model
 * so you can make sure they are there when they are needed, but not present if not required.
 * </p>
 *
 * <p>
 * Note that each of the property setters, return an instance of the builder.  That is what allows this to be a
 * &quot;Fluent&quot; api.
 * </p>
 * @author Macon Pegram
 * @version 1.0.0
 */
public class GnarlyRecordBuilder {

	// We create an internal copy of the model we want to build and gradually add to it.
	private final GnarlyRecord record;

	/**
	 * Notice that this creates an empty internal model for building, but only the lowest level skeleton.
	 * In some implementations of Fluent Builder, people will make this &quot;private&quot; add
	 * a static &quot;init()&quot; method that returns an instance of the builder.
	 */
	public GnarlyRecordBuilder() {
		record = new GnarlyRecord();
	}

	/**
	 * Sets the email address.
	 *
	 * @param email
	 *      The email address to set.
	 *
	 * @return This builder.
	 */
	public GnarlyRecordBuilder email(final String email) {
		// super naive but good enough for now.
		final String [] emailParts = email.split("@");
		getGnarlyEmail().setAccount(emailParts[0]);
		getGnarlyEmail().setHostname(emailParts[1]);

		return this; // return the builder
	}

	/**
	 * Sets the phone number
	 *
	 * @param areaCode
	 *      The area code of the phone number.
	 * @param num
	 *      The local number portion of the phone.
	 *
	 * @return This builder.
	 */
	public GnarlyRecordBuilder phone(final String areaCode, final String num) {
		final GnarlyPhone phone = getGnarlyPhone();
		phone.setAreacode(areaCode);
		phone.setPhonenum(num);

		return this; // return the builder
	}

	/**
	 * Sets the first name.
	 *
	 * @param name
	 *      The first name to set.
	 *
	 * @return This builder.
	 */
	public GnarlyRecordBuilder firstName(final String name) {
		getGnarlyName().setFirstname(name);

		return this; // return the builder
	}

	/**
	 * Sets the middle name.
	 *
	 * @param name
	 *      The middle name to set
	 *
	 * @return This builder.
	 */
	public GnarlyRecordBuilder middleName(final String name) {
		getGnarlyName().setMiddleName(name);

		return this; // return the builder
	}

	/**
	 * Sets the last name.
	 *
	 * @param name
	 *      The last name to set.
	 *
	 * @return This builder.
	 */
	public GnarlyRecordBuilder lastName(final String name) {
		getGnarlyName().setLastName(name);

		return this; // return the builder
	}

	/**
	 * The name suffix.
	 *
	 * @param suffix
	 *      Sets the name suffix.
	 *
	 * @return This builder.
	 */
	public GnarlyRecordBuilder suffix(final String suffix) {
		getGnarlyName().setSuffix(suffix);

		return this; // return the builder
	}

	/**
	 * Retrieves the built model.  Note this is the only public method on this class that
	 * does not return the builder itself.  This should be called LAST
	 *
	 * @return The build model.
	 */
	public GnarlyRecord build() {
		return record;
	}

	///// Handle null-safe access to sub-elements of the model

	/**
	 * Retrieves (and adds if necessary) a {@link com.blt.examples.models.gnarly.GnarlyContact} from the
	 * {@link com.blt.examples.models.gnarly.GnarlyRecord}
	 *
	 * @return the internal {@link com.blt.examples.models.gnarly.GnarlyContact}
	 */
	private GnarlyContact getGnarlyContact() {
		if (record.getContact() == null) {
			record.setContact(new GnarlyContact());
		}
		return record.getContact();
	}

	/**
	 * Retrieves (and adds if necessary) a {@link com.blt.examples.models.gnarly.GnarlyName} from the
	 * {@link com.blt.examples.models.gnarly.GnarlyContact}
	 *
	 * @return the internal {@link com.blt.examples.models.gnarly.GnarlyName}
	 */
	private GnarlyName getGnarlyName() {
		final GnarlyContact contact = getGnarlyContact();
		if (contact.getName() == null) {
			contact.setName(new GnarlyName());
		}
		return contact.getName();
	}

	/**
	 * Retrieves (and adds if necessary) a {@link com.blt.examples.models.gnarly.GnarlyPhone} from the
	 * {@link com.blt.examples.models.gnarly.GnarlyContact}
	 *
	 * @return the internal {@link com.blt.examples.models.gnarly.GnarlyPhone}
	 */
	private GnarlyPhone getGnarlyPhone() {
		final GnarlyContact contact = getGnarlyContact();
		if (contact.getPhone() == null) {
			contact.setPhone(new GnarlyPhone());
		}
		return contact.getPhone();
	}

	/**
	 * Retrieves (and adds if necessary) a {@link com.blt.examples.models.gnarly.GnarlyEmail} from the
	 * {@link com.blt.examples.models.gnarly.GnarlyContact}
	 *
	 * @return the internal {@link com.blt.examples.models.gnarly.GnarlyContact}
	 */
	private GnarlyEmail getGnarlyEmail() {
		final GnarlyContact contact = getGnarlyContact();
		if (contact.getEmail() == null) {
			contact.setEmail(new GnarlyEmail());
		}
		return contact.getEmail();
	}

}
