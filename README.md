# SimpleWebApp
Very simple web application for testing imports from REST and SOAP in the Teiid Designer.

Application contains six endpoints:

These are unsecure:

* rest/unsecured/json
* rest/unsecured/xml
* soap/unsecured?wsdl


These are secure with basic auth. Only users who are in the *user* role on the server have an access.

* rest/secure/json
* rest/secure/xml
* soap/secure?wsdl


The server also has to contain this security domain:

```
<security-domain name="configAppSecurityDomain" cache-type="default">
        <authentication>
                <login-module code="RealmDirect" flag="required">
                    <module-option name="password-stacking" value="useFirstPass"/>
                </login-module>
        </authentication>
</security-domain>
```

