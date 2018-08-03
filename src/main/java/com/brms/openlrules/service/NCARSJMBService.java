package com.brms.openlrules.service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openl.dependency.IDependencyManager;
import org.openl.rules.runtime.RulesEngineFactory;

public class NCARSJMBService{
	public static String root = "D:/Alvaro/Eclipse Workspace/openl-rulesengine-service/";
	public static String repositoryPath = 
			root+"src/main/resources/bfiqca/";
	public static String fileName ="Scoring NCARSJMB.xlsx";
		
	public static RulesEngineFactory<?> rulesFactory = 
		new RulesEngineFactory<Object>(repositoryPath+fileName);
	public static IDependencyManager dep = rulesFactory.getDependencyManager();
	
	public static Object rules = rulesFactory.newInstance();
	public static Class<?> dynamicClass = rulesFactory.getInterfaceClass();
	

	
	public static double UmurDebitur(Integer umurDebitur) {
		double score = 0;
		try{
			Method method = dynamicClass.getMethod("UmurDebitur", Integer.class);
			score = (double) method.invoke(rules, umurDebitur);
			
		}catch(NoSuchMethodException e){
		}catch (InvocationTargetException e) {
		}catch (IllegalAccessException e) {
		}
		return score;
	}
}
