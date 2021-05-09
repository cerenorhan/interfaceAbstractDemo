package interfaceAbstractDemo.mernis;

import java.rmi.RemoteException;

import interfaceAbstractDemo.abstracts.CustomerCheckService;
import interfaceAbstractDemo.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisService implements CustomerCheckService{
	
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean result = true;
		
		try {
			result = client.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),
					customer.getDateOfBirth());

		} catch (RemoteException e) {
			result = false;
			System.out.println("Clientte hata");
			e.printStackTrace();
		}
		
		System.out.println(result);
		return result;
	}

}
