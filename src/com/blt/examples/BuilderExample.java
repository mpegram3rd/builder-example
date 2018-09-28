package com.blt.examples;

import com.blt.examples.builder.GnarlyRecordBuilder;
import com.blt.examples.models.gnarly.GnarlyRecord;

/**
 * This is an example of a Fluent Builder pattern.  It helps to show how you can simplify and hide the details of
 * mapping deeply nested structures into a model that is very complicated.
 *
 * @author Macon Pegram
 * @version 1.0.0
 */
public class BuilderExample {

	/**
	 * The entry point for the application.  Demonstrates how to use the FluentBuilder.  Try adding/removing
	 * calls to the builder fields and see how it impacts the internal structure of the
	 * {@link com.blt.examples.models.gnarly.GnarlyRecord}   Also note that because it's a builder, these
	 * methods can be called in any arbitrary order as long as the call to
	 * {@link com.blt.examples.builder.GnarlyRecordBuilder#build()} comes last.
 	 *
	 * @param args
	 */
    public static void main(String[] args) {
	    final GnarlyRecord record = new GnarlyRecordBuilder()
			    .email("jd@mailinator.com")
			    .lastName("Doe")
                .firstName("John")
                .middleName("C")
                .phone("804", "555-1212")
                .build();

	    // Display the result.
	    System.out.println(record);
    }
}
