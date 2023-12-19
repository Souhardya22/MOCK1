package com.acc.lkm.mavenmock;
import java.util.*;
public class MockTreeMap {

	public static void main(String[] args) {
		TreeMap<String,String> tmap = new TreeMap<String,String>();
		tmap.put("Java", "AccATCI");
		tmap.put("PL/SQL", "ORACLE-Apex");
		tmap.put("SAP", "NISSAN");
		tmap.put("SFDC", "SALESFORCE");
		
		System.out.println("\nIn Map Order: "+tmap);
		
		System.out.println("\nIn Map-view Order: "+tmap);
		for(Map.Entry m : tmap.entrySet()) {
			System.out.println(m.getKey()+"-> "+m.getValue());
		}
	}

}
