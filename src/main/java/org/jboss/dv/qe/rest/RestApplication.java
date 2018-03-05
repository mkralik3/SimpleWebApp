package org.jboss.dv.qe.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest")
public class RestApplication extends Application {
 
    private Set<Object> singletons = new HashSet<Object>();
 
    public void RestEasyServices() {
        singletons.add(new unsecuredBBCRest());
        singletons.add(new secureBBCRest());
    }
 
    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}