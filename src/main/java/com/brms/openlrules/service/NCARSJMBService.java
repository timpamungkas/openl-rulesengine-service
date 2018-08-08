package com.brms.openlrules.service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openl.rules.context.IRulesRuntimeContext;
import org.openl.rules.context.RulesRuntimeContextFactory;
import org.openl.rules.project.instantiation.RulesInstantiationException;
import org.openl.rules.project.resolving.ProjectResolvingException;
import org.openl.runtime.IEngineWrapper;
import org.openl.vm.IRuntimeEnv;

import com.brms.openlrules.builders.ProjectBuilder;

public class NCARSJMBService extends ProjectBuilder {

	public Object NCARSJMBInstance;
	public IRuntimeEnv env;
	public IRulesRuntimeContext context;
	public Class<?> dynamicClass;

	public NCARSJMBService() throws ProjectResolvingException, ClassNotFoundException, RulesInstantiationException {
		NCARSJMBInstance = projectEngineFactory.newInstance();
		env = ((IEngineWrapper) NCARSJMBInstance).getRuntimeEnv();
		context = RulesRuntimeContextFactory.buildRulesRuntimeContext();
		env.setContext(context);
		// TODO : Avoid hardcode. If need constant string, extract it to constant.
		context.setLob("NCARSJMB");
		dynamicClass = projectEngineFactory.getInterfaceClass();
	}

	public double UmurDebitur(Integer umurDebitur)
			throws ProjectResolvingException, ClassNotFoundException, RulesInstantiationException {
		double score = 0;
		try {
			// TODO : Avoid hardcode. If need constant string, extract it to constant.
			Method method = this.dynamicClass.getMethod("UmurDebitur", Integer.class);
			score = (double) method.invoke(NCARSJMBInstance, umurDebitur);

		} catch (NoSuchMethodException e) {
			// TODO : don't eat exception. At minimum, log error (Google for logback +
			// slf4j, or see my sample project)
		} catch (InvocationTargetException e) {
			// TODO : don't eat exception. At minimum, log error (Google for logback +
			// slf4j, or see my sample project)
		} catch (IllegalAccessException e) {
			// TODO : don't eat exception. At minimum, log error (Google for logback +
			// slf4j, or see my sample project)
		}
		return score;
	}

}
