package service;

import java.util.HashMap;
import java.util.Map;

import model.Customer;

//ID�� �޾Ƽ� �ش�Ǵ� customer ������ ��ȸ�ؼ� return������
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
			return (customers.get(id.toLowerCase()));	//get()�� value�� return��
		else
			return null;
		
	}

}
