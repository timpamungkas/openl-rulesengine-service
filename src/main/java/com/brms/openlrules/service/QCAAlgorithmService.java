package com.brms.openlrules.service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openl.rules.project.instantiation.RulesInstantiationException;
import org.openl.rules.project.resolving.ProjectResolvingException;

import com.brms.openlrules.builders.ProjectBuilder;
import com.brms.openlrules.datatypes.Application;
import com.brms.openlrules.datatypes.Customer;

public class QCAAlgorithmService extends ProjectBuilder{
	
	public Object QCAAlgorithmInstance;
	public Class<?> dynamicClass;
	
	public QCAAlgorithmService() throws ProjectResolvingException, ClassNotFoundException, RulesInstantiationException {
		QCAAlgorithmInstance = projectEngineFactory.newInstance();
		dynamicClass = projectEngineFactory.getInterfaceClass();
	}
	
	public double QCAAlgorithm(Application application) throws ProjectResolvingException, ClassNotFoundException, RulesInstantiationException {
		double score = 0;

		try {
			Method method = dynamicClass.getMethod("QCAAlgorithm",Application.class);
			score = (double) method.invoke(QCAAlgorithmInstance, application);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return score;
	}
	
	public double calculateScoreBySchemeId(String schemeId, Customer customer) throws ProjectResolvingException, ClassNotFoundException, RulesInstantiationException {
		double score = 0;
		try {
			Method method = dynamicClass.getMethod("calculateScoreBySchemeId",String.class,Customer.class);
			score = (double) method.invoke(QCAAlgorithmInstance, schemeId,customer);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return score;
	}
	
	public String determineSchemeId(String branchId, String groupSchemeId, Integer insRateCategoryId, String assetCondition) 
			throws ProjectResolvingException, ClassNotFoundException, RulesInstantiationException {
		String id = "";
		try {
			Method method = dynamicClass.getMethod("determineSchemeId",String.class,String.class,Integer.class,String.class);
			id = (String) method.invoke(QCAAlgorithmInstance, branchId,groupSchemeId,insRateCategoryId,assetCondition);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id;
	}
}
