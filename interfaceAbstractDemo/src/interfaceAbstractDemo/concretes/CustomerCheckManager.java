package interfaceAbstractDemo.concretes;

import interfaceAbstractDemo.abstracts.CustomerCheckService;
import interfaceAbstractDemo.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	public boolean checkIfRealPerson(Customer customer) {
		
		
		return true;
	}


}
