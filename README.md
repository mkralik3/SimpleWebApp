# SimpleWebApp
Very simple web application for testing imports from REST and SOAP in the Teiid Designer.

Application contains six endpoints:

These are unsecure:

* rest/unsecured/json (e.g. http://localhost:8080/web-app/rest/unsecured/json)
* rest/unsecured/xml (e.g. http://localhost:8080/web-app/rest/unsecured/xml)
* soap/unsecured?wsdl (e.g. http://localhost:8080/web-app/soap/unsecured?wsdl)


These are secure with digest auth. Only users who are in the *user* role and who are in the *ApplicationRealm relm* on the server have an access.

* rest/secure/json (e.g. http://localhost:8080/web-app/rest/secure/json)
* rest/secure/xml (e.g. http://localhost:8080/web-app/rest/secure/xml)
* soap/secure?wsdl (e.g. http://localhost:8080/web-app/soap/secure?wsdl)


The server also has to contain this security domain:

```
<security-domain name="digest" cache-type="default">
        <authentication>
                <login-module code="UsersRoles" flag="required">
                    <module-option name="usersProperties" value="${jboss.server.config.dir}/application-users.properties"/>
                    <module-option name="rolesProperties" value="${jboss.server.config.dir}/application-roles.properties"/>
                    <module-option name="hashAlgorithm" value="MD5"/>
                    <module-option name="hashEncoding" value="rfc2617"/>
                    <module-option name="hashUserPassword" value="false"/>
                    <module-option name="hashStorePassword" value="true"/>
                    <module-option name="passwordIsA1Hash" value="true"/>
                    <module-option name="storeDigestCallback" value="org.jboss.security.auth.callback.RFC2617Digest"/>
                </login-module>
        </authentication>
</security-domain>
```

