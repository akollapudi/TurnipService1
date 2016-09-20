package com.miracle.service;

import java.util.List;

import com.miracle.bean.TurnipBean;

public interface ITurnipService {

	public List<TurnipBean> getVendorCustomersList(TurnipBean bean);
	public List<TurnipBean> getCustomerVendorList(TurnipBean bean);
	
	public List<TurnipBean> getResourcesInfo(TurnipBean bean);
	public List<TurnipBean> getOrganizationList(TurnipBean bean);
	
	public List<String> getCustomerVendorList();
}
