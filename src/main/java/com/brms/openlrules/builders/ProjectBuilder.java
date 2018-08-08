package com.brms.openlrules.builders;

import org.openl.rules.project.instantiation.ProjectEngineFactory;
import org.openl.rules.project.instantiation.SimpleProjectEngineFactory;

public class ProjectBuilder {
	public static String pathToOpenLRules = "src/main/openl/bfiqca";
	
	public static ProjectEngineFactory<Object> projectEngineFactory = 
			new SimpleProjectEngineFactory.SimpleProjectEngineFactoryBuilder<Object>()
									  	  .setProject(pathToOpenLRules) 
									  	  .build();

	
}
