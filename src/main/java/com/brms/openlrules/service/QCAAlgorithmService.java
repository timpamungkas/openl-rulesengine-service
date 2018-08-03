package com.brms.openlrules.service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openl.rules.runtime.RulesEngineFactory;

import com.brms.openlrules.datatypes.Application;

public class QCAAlgorithmService {
	public static String root = "D:/Alvaro/Eclipse Workspace/openl-rulesengine-service/";
	public static String repositoryPath = 
			root+"src/main/resources/bfiqca/";
	public static String fileName ="QCA Algorithm.xlsx";
		
	public static RulesEngineFactory<?> rulesFactory = 
		new RulesEngineFactory<Object>(repositoryPath+fileName);
	public static Object rules = rulesFactory.newInstance();
	public static Class<?> dynamicClass = rulesFactory.getInterfaceClass();
	
	
	
	public static double QCAAlgorithm(Application application) {
		double score = 0;
		try{
			Method method = dynamicClass.getMethod("QCAAlgorithm", Application.class);
			score = (double) method.invoke(rules, application);
			
		}catch(NoSuchMethodException e){
		}catch (InvocationTargetException e) {
		}catch (IllegalAccessException e) {
		}
		return score;
	}
}
