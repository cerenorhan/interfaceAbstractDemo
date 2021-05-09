package interfaceAbstractDemo.concretes;

import interfaceAbstractDemo.abstracts.BaseCustomerManager;
import interfaceAbstractDemo.abstracts.CustomerCheckService;
import interfaceAbstractDemo.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
			this.customerCheckService  = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		if(CustomerCheckService.checkIfRealPerson(customer)) {
					
		}else {
			System.out.println("Not a valid person");
		}
	
	}
}
