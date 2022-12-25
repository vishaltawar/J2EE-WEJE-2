package com.jspider.adapterdesignpattern.adapters;

import com.jspider.adapterdesignpattern.employee.Employee;
import com.jspider.adapterdesignpattern.interfaces.CompanyEvent;

public class EmpCompAdapter extends Employee implements CompanyEvent {
	public static void main(String[] args) {
		EmpCompAdapter adapter=new EmpCompAdapter();
		adapter.womenDay();
	}

	@Override
	public void womenDay() {
		EmpCompAdapter adapter=new EmpCompAdapter();
		adapter.setId(1);
		adapter.setName("Vishal");
		adapter.setEmail("vt2526@gmail.com");
		System.out.println("The Manager of the event is : "+ adapter.getName());

		EmpCompAdapter adapter1=new EmpCompAdapter();
		adapter1.setId(2);
		adapter1.setName("Aakash");
		adapter1.setEmail("at1002@gmail.com");
		System.out.println("The Chif Gest of the event is : "+ adapter.getName());

	}

}
