package com.brms.openlrules.service;

import com.brms.openlrules.datatypes.Application;
import com.brms.openlrules.datatypes.Asset;
import com.brms.openlrules.datatypes.Customer;
import com.brms.openlrules.datatypes.Financial;
import com.brms.openlrules.datatypes.Others;

public class TestService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testNCARSJMBService();
	}
	public static void testQCAAlgorithm() {
		Asset assetData = new Asset("JEEP","","Children","BMW",4);
		Financial financialData = 
			new Financial(10000000,2,40,"New",30,0,"Consumtive");
		Others othersData = new Others("Pameran");
		Customer customerData = 
			new Customer("BFIC1","Jack",30,"Married","Keluarga","Pria","Dosen",
				"Strata 1","Yes","","",7000000,"",assetData,financialData,othersData);
		Application app = 
			new Application("APP1",customerData,"418","NDF CAR",1,"U");
		
		double result = QCAAlgorithmService.QCAAlgorithm(app);
		System.out.println(result);
	}
	
	public static void testNCARSJMBService() {
		double score = NCARSJMBService.UmurDebitur(40);
		System.out.println(score);
	}
}
