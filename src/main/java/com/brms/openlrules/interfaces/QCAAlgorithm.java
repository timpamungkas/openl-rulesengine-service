package com.brms.openlrules.interfaces;

import com.brms.openlrules.datatypes.Application;
import com.brms.openlrules.datatypes.Customer;

public interface QCAAlgorithm {
	double QCAAlgorithm(Application app);
	double calculateScoreBySchemeId(String schemeId,Customer customer);
	String determineSchemeId(String branchId, String groupschemeId, Integer insRateCategoryId, 
			String assetCondition);
}
