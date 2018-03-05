package org.jboss.dv.qe;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "CountriesSOAPService", portName = "Countries", name = "CountriesSOAP", endpointInterface = "org.jboss.dv.qe.CountriesSOAP")
public class CountriesSOAPImpl implements CountriesSOAP {
	Country slovakia = new Country("SK", "Slovak Republic", "Bratislava", "421", "EU", "EUR");
	Country czechRepublic = new Country("CZ", "Czech Republic", "Praha", "420", "EU", "CZK");
	Country usa = new Country("US", "United States", "Washington", "1", "AM", "USD");
	Country unknown = new Country("--", "Unknown country", "--", "--", "--", "---");
	List<Country> countries;

	public CountriesSOAPImpl() {
	}

	@WebMethod
	public Country FullCountryInfo(String code) {
		if (code.equals(czechRepublic.getIsoCode())) {
			return czechRepublic;
		}
		if (code.equals(slovakia.getIsoCode())) {
			return slovakia;
		}
		if (code.equals(usa.getIsoCode())) {
			return usa;
		}
		return unknown;
	}

	public List<Country> FullCountryInfoAllCountries() {
		countries = new ArrayList();
		countries.add(slovakia);
		countries.add(czechRepublic);
		countries.add(usa);
		return countries;
	}
}
