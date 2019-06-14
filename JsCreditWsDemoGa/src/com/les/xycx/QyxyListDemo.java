package com.les.xycx;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import com.les.common.util.DataProtect;
import com.les.util.CommWebServiceUtil;

public class QyxyListDemo {
	public static void main(String[] args) {
		//String url ="http://32.0.23.101:8080/jsxycxws/services/xycx?wsdl";
		String url ="http://172.23.50.244:8289/jsxycxws/services/xycx?wsdl";
		String targetNamespace="http://ws.webservice.les.com/";
		String method = "queryShfrList";
		Map<String, Object> map = new HashMap<String, Object>();
		String token="mjaXLdS6dUHYGIungfAqGAvZ";
		String loginStr=DataProtect.LoginStrEncrypt("gongan", "66W2PO3P9HryjSmD",token);
		map.put("token", token);
		map.put("loginstr", loginStr);
		map.put("qymc","南京莱斯信息" ); //4
		map.put("tyshxydm","" );
		map.put("frsfzhm","" );
		map.put("pageSize","100");
		map.put("pageNo","1"); 
		System.out.println(loginStr);
		JSONObject param = JSONObject.fromObject(map);
		String result = CommWebServiceUtil.axis(url, targetNamespace, method, 
				param);
		String jsondata= "";
		try{
			jsondata=DataProtect.LoginStrDecrypt(result, token);
		}catch(Exception e){
			e.getStackTrace();
		}
		System.out.println(jsondata);
	} 
//	603076943
	
}
