package com.example.model;


import javax.persistence.*;

import lombok.Data;


@Entity
@Data

public class Employee {

	    @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "employee_id")
	    private int employeeId;
	
	    @Column(name = "first_name")
	    private String firstName;
	    @Column(name = "last_name")
	    private String lastName;
	    private String email;
	    
	    
		public Employee() {
			super();
		}


		public Employee( String firstName, String lastName, String email) {
			super();
			
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
		}
	
	    
	    
	
}
