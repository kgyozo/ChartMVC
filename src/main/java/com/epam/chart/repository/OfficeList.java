package com.epam.chart.repository;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name="officehours")
public class OfficeList {
	
	private static final long serialVersionUID = 1L;
    
    private List<Office> office = new ArrayList<>();
 
    public List<Office> getOffices() {
        return office;
    }
 
    public void setOffices(List<Office> office) {
        this.office = office;
    }
}
