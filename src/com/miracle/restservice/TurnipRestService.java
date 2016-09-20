package com.miracle.restservice;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.codehaus.jettison.json.JSONObject;

import com.google.gson.Gson;
import com.miracle.bean.TurnipBean;
import com.miracle.service.ITurnipService;
import com.miracle.service.TurnipServiceImpl;
/*
   http://localhost:9080/TurnipService/rest/dashBoardInfo/customersInfo

*/
@Path("/dashBoardInfo")
public class TurnipRestService {
	Response response = null;
	TurnipBean bean = null;
	ITurnipService service =null;
	JSONObject personsInJSon =null;
	List<TurnipBean> list=null;
	List<String> samplelist=null;
	//List<TurnipBean> orgList=null;
	final static Logger logger = Logger.getLogger(TurnipRestService.class);

	@GET
	@Path("/customersInfo")
	@Produces(MediaType.APPLICATION_JSON)
	//@Consumes(MediaType.TEXT_PLAIN)
	public String getCustomerInfo() {
		bean = new TurnipBean();
		
		service = new TurnipServiceImpl();
		//personsInJSon = new JSONObject();
		ITurnipService ser = new TurnipServiceImpl();
		samplelist = ser.getCustomerVendorList();		
		String bottleBeanResp = new Gson().toJson(samplelist);
		System.out.println(bottleBeanResp);
		

		return bottleBeanResp;

	}
	
	
	

}