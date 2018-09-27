package com.blt.examples;

import com.blt.examples.builder.GnarlyRecordBuilder;
import com.blt.examples.models.gnarly.GnarlyRecord;

public class BuilderExample {

    public static void main(String[] args) {
	    final GnarlyRecord record = new GnarlyRecordBuilder()
			    .email("mp@mailinator.com")
                .firstName("Macon")
                .middleName("N")
                .lastName("Pegram")
                .phone("804", "555-1212")
                .build();

	    System.out.println(record);
    }
}
