package com.blt.examples.builder;

import com.blt.examples.models.gnarly.*;

/**
 * <p>
 * Description
 * </p>
 *
 * @author Macon Pegram
 * @version {version}
 */
public class GnarlyRecordBuilder {

	private final GnarlyRecord record;

	public GnarlyRecordBuilder() {
		record = new GnarlyRecord();
	}

	public GnarlyRecordBuilder email(final String email) {
		// super naive but good enough for now.
		final String [] emailParts = email.split("@");
		getGnarlyEmail().setAccount(emailParts[0]);
		getGnarlyEmail().setHostname(emailParts[1]);

		return this; // return the builder
	}

	public GnarlyRecordBuilder phone(final String areaCode, final String num) {
		final GnarlyPhone phone = getGnarlyPhone();
		phone.setAreacode(areaCode);
		phone.setPhonenum(num);

		return this; // return the builder
	}

	public GnarlyRecordBuilder firstName(final String name) {
		getGnarlyName().setFirstname(name);

		return this; // return the builder
	}

	public GnarlyRecordBuilder middleName(final String name) {
		getGnarlyName().setMiddleName(name);

		return this; // return the builder
	}

	public GnarlyRecordBuilder lastName(final String name) {
		getGnarlyName().setLastName(name);

		return this; // return the builder
	}

	public GnarlyRecordBuilder suffix(final String suffix) {
		getGnarlyName().setSuffix(suffix);

		return this; // return the builder
	}

	public GnarlyRecord build() {
		return record;
	}

	///// Handle null-safe access to sub-elements of the model
	private GnarlyContact getGnarlyContact() {
		if (record.getContact() == null) {
			record.setContact(new GnarlyContact());
		}
		return record.getContact();
	}

	private GnarlyName getGnarlyName() {
		final GnarlyContact contact = getGnarlyContact();
		if (contact.getName() == null) {
			contact.setName(new GnarlyName());
		}
		return contact.getName();
	}

	private GnarlyPhone getGnarlyPhone() {
		final GnarlyContact contact = getGnarlyContact();
		if (contact.getPhone() == null) {
			contact.setPhone(new GnarlyPhone());
		}
		return contact.getPhone();
	}

	private GnarlyEmail getGnarlyEmail() {
		final GnarlyContact contact = getGnarlyContact();
		if (contact.getEmail() == null) {
			contact.setEmail(new GnarlyEmail());
		}
		return contact.getEmail();
	}


}
