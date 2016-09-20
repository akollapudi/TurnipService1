package com.miracle.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.miracle.bean.TurnipBean;
import com.miracle.util.Constants;
import com.sun.istack.logging.Logger;

public class TurnipDAOService {

	static Logger log = Logger.getLogger(TurnipDAOService.class);
	private ResultSet rs = null;
	private Connection connection = null;
	private java.sql.PreparedStatement preparedStatement;
	List<TurnipBean> resultList = null;
	List<TurnipBean> orgList =null;
	TurnipBean bean =null;
	
	public List<TurnipBean> getVendorCustomersList(TurnipBean bean) {
		return orgList;}

	private List<TurnipBean> customerResultSet(ResultSet resultSet) throws Exception {
		return orgList;}

	public List<TurnipBean> getCustomerVendorList(TurnipBean bean) {
		return orgList;}		
	
	
	private List<TurnipBean> vendorResultSet(ResultSet resultSet) throws Exception {return orgList;}	

	public List<TurnipBean> getOrganizationList(TurnipBean bean) {return orgList;}	
	
	
	
	
	private List<TurnipBean> orgResultSet(ResultSet resultSet) throws Exception {return orgList;}	

	
	
	public List<TurnipBean> getResourcesInfo(TurnipBean bean) {return orgList;}	
	
	
	/*SELECT distinct acc.account_name,req.no_of_resources,proj.proj_req_skillset,req.req_skills,req.req_name,req.requirement_id,proj.acc_id,proj.project_id"
			+ "pro.proj_name,proj.proj_status,req.jdid,req.req_type,req.req_status"*/
			
			
	private List<TurnipBean> resourcesResultSet(ResultSet resultSet) throws Exception {
		return orgList;}

public List<String> getCustomerVendorList() {
	
	List<String> s=new ArrayList<String>();
	s.add("Walmart");
	s.add("IBM");
	s.add("Ford");
	System.out.println(s);
	return s;
		}		

}
