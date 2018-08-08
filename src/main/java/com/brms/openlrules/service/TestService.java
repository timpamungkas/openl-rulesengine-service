package com.brms.openlrules.service;

import org.openl.rules.project.instantiation.RulesInstantiationException;
import org.openl.rules.project.resolving.ProjectResolvingException;

import com.brms.openlrules.datatypes.Application;
import com.brms.openlrules.datatypes.Asset;
import com.brms.openlrules.datatypes.Customer;
import com.brms.openlrules.datatypes.Financial;
import com.brms.openlrules.datatypes.Others;

// TODO use JUnit jupiter instead of creating main class for testing
public class TestService {

	public static void main(String[] args)
			throws ProjectResolvingException, ClassNotFoundException, RulesInstantiationException {
		testNCARSJMBService();
		testQCAAlgorithm();
	}

	public static void testQCAAlgorithm()
			throws ProjectResolvingException, ClassNotFoundException, RulesInstantiationException {
		Asset assetData = new Asset("JEEP", "", "Children", "BMW", 4);
		Financial financialData = new Financial(10000000, 2, 40, "New", 30, 0, "Consumtive");
		Others othersData = new Others("Pameran");
		Customer customerData = new Customer("BFIC1", "Jack", 30, "Married", "Keluarga", "Pria", "Dosen", "Strata 1",
				"Yes", "", "", 7000000, "", assetData, financialData, othersData);
		Application app = new Application("APP1", customerData, "418", "NDF CAR", 1, "U");

		double result = 0;
		String id = "";
		QCAAlgorithmService service = new QCAAlgorithmService();

		try {
			// result = service.QCAAlgorithm(app);
			result = service.calculateScoreBySchemeId("418", customerData);
			// id = service.determineSchemeId("418", "NDF CAR",1,"U");
		} catch (ProjectResolvingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RulesInstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(id);
	}

	public static void testNCARSJMBService()
			throws ProjectResolvingException, ClassNotFoundException, RulesInstantiationException {
		NCARSJMBService service = new NCARSJMBService();
		double score = service.UmurDebitur(50);
		System.out.println(score);
	}
}
