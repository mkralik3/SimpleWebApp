package org.jboss.dv.qe;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public abstract interface CountriesSOAP
{
  @WebMethod
  public abstract Country FullCountryInfo(String paramString);
  
  @WebMethod
  public abstract List<Country> FullCountryInfoAllCountries();
}
