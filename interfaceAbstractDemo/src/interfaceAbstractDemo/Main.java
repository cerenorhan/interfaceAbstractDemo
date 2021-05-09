package interfaceAbstractDemo;

import interfaceAbstractDemo.concretes.NeroCustomerManager;
import interfaceAbstractDemo.concretes.StarbucksCustomerManager;
import interfaceAbstractDemo.entities.Customer;
import interfaceAbstractDemo.mernis.MernisService;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1, "Ceren", "Orhan", 1988-11-15, "12345678978");
		StarbucksCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisService());
		starbucksCustomerManager.save(customer1);
	
		Customer customer2 = new Customer(2, "Ayþe", "Fatma", 1987-9-17, "23456789123");
		NeroCustomerManager neroCustomerManager = new NeroCustomerManager();
		neroCustomerManager.save(customer2);
		
		
						
	}

}
