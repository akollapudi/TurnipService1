package com.miracle.service;

import java.util.List;

import com.miracle.bean.TurnipBean;
import com.miracle.dao.TurnipDAOService;

public class TurnipServiceImpl implements ITurnipService {
	TurnipDAOService dao= new TurnipDAOService();

	@Override
	public List<TurnipBean> getVendorCustomersList(TurnipBean bean) {
		List<TurnipBean> list = dao.getVendorCustomersList(bean);
		return list;
	}

	@Override
	public List<TurnipBean> getCustomerVendorList(TurnipBean bean) {
		List<TurnipBean> list = dao.getCustomerVendorList(bean);
		return list;
	}

	
	@Override
	public List<TurnipBean> getOrganizationList(TurnipBean bean) {		
		List<TurnipBean> list = dao.getOrganizationList(bean);
		return list;
	}

	@Override
	public List<TurnipBean> getResourcesInfo(TurnipBean bean) {		
		List<TurnipBean> list = dao.getResourcesInfo(bean);
		return list;
	}

	@Override
	public List<String> getCustomerVendorList() {
		List<String> list = dao.getCustomerVendorList();
		return list;
	}

}
