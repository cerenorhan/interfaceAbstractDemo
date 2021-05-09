package interfaceAbstractDemo.abstracts;

import interfaceAbstractDemo.entities.Customer;

public interface CustomerCheckService {
	
	static boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}
	

}
