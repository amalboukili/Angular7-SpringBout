package com.webservices.Logiciel_GestionActivite.LogicielGestion.controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.Logiciel_GestionActivite.LogicielGestion.model.Employees;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class HelloWorldController {
	
	
	
	//GET
		//URL - /hello-world
		//method - "Hello World"
		
	
		private List<Employees> employees = createList();
		
		private static List<Employees> createList() {
			List<Employees> tempEmployees = new ArrayList<>();
			Employees emp1 = new Employees();
			emp1.setName("emp1");
			emp1.setDesignation("manager");
			emp1.setEmpId("1");
			emp1.setSalary(3000);

			Employees emp2 = new Employees();
			emp2.setName("emp2");
			emp2.setDesignation("developer");
			emp2.setEmpId("2");
			emp2.setSalary(3000);
			tempEmployees.add(emp1);
			tempEmployees.add(emp2);
			return tempEmployees;
		}

		
			
		
		
		@RequestMapping(method=RequestMethod.GET, path="/hello-world")
		 public String helloWorld(){
			 return "Hello World";

		}
		
		
		@RequestMapping(value = "/employees", method = RequestMethod.GET, produces = "application/json")
		public List<Employees> firstPage() {
			return employees;
		}
}