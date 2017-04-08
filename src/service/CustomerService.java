package service;

import java.util.HashMap;
import java.util.Map;

import model.Customer;

//ID를 받아서 해당되는 customer 정보를 조회해서 return해주자
public class CustomerService {

	private Map<String, Customer> customers;

	public CustomerService() {
		customers = new HashMap<String, Customer>();

		addCustomer(new Customer("id001", "Alice", "alice@hansug.ac.kr"));
		addCustomer(new Customer("id002", "Jang", "jang@hansug.ac.kr"));
		addCustomer(new Customer("id003", "Ju", "ju@hansug.ac.kr"));
		addCustomer(new Customer("id004", "Kim", "kim@hansug.ac.kr"));
		addCustomer(new Customer("id005", "Jo", "jo@hansug.ac.kr"));
	}

	public void addCustomer(Customer customer) {
		customers.put(customer.getId(), customer);
	}
	
	public Customer findCustomer(String id){
		if(id!=null)
			return (customers.get(id.toLowerCase()));	//get()은 value를 return함
		else
			return null;
		
	}

}
