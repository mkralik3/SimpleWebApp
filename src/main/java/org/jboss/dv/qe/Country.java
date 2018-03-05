package org.jboss.dv.qe;

public class Country
{
  private String isoCode;
  private String name;
  private String capitalCity;
  private String phoneCode;
  private String continentCode;
  private String currencyIsoCode;
  
  public Country() {}
  
  public Country(String isoCode, String name, String capitalCity, String phoneCode, String continentCode, String currencyIsoCode) {
    this.isoCode = isoCode;
    this.name = name;
    this.capitalCity = capitalCity;
    this.phoneCode = phoneCode;
    this.continentCode = continentCode;
    this.currencyIsoCode = currencyIsoCode;
  }
  
  public String getIsoCode() {
    return isoCode;
  }
  
  public void setIsoCode(String isoCode) {
    this.isoCode = isoCode;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getCapitalCity() {
    return capitalCity;
  }
  
  public void setCapitalCity(String capitalCity) {
    this.capitalCity = capitalCity;
  }
  
  public String getPhoneCode() {
    return phoneCode;
  }
  
  public void setPhoneCode(String phoneCode) {
    this.phoneCode = phoneCode;
  }
  
  public String getContinentCode() {
    return continentCode;
  }
  
  public void setContinentCode(String continentCode) {
    this.continentCode = continentCode;
  }
  
  public String getCurrencyIsoCode() {
    return currencyIsoCode;
  }
  
  public void setCurrencyIsoCode(String currencyIsoCode) {
    this.currencyIsoCode = currencyIsoCode;
  }
}
