package com.brms.openlrules.datatypes;

public class Application {
	public String id;
	public Customer customer;
	public String branchId;
	public String groupSchemeId;
	public Integer insRateCategoryId;
	public String assetCondition;
	public Application(String id, Customer customer, String branchId, String groupSchemeId, Integer insRateCategoryId,
			String assetCondition) {
		super();
		this.id = id;
		this.customer = customer;
		this.branchId = branchId;
		this.groupSchemeId = groupSchemeId;
		this.insRateCategoryId = insRateCategoryId;
		this.assetCondition = assetCondition;
	}
	
	
}
