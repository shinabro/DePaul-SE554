package edu.depaul.cdm.se.ejb.impl;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

@Stateless
@LocalBean
public class SimpleGreaterBean {
    public String greetMe(String name) {
        return "Hello " + name;
    }
}