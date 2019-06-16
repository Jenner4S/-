/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2018 isoftbao All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Title      : JsCreditClient.java</li>
 * <li>Package     : com.isoftbao.jscredit.service.client</li>
 * <li>Description : 描述</li>
 * <li>Version     : 1.0</li>
 * <li>Creation    : 2019年6月16日 下午5:03:32</li>
 * <li>Author      : Jenner</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
package com.isoftbao.jscredit.service.client;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.isoftbao.jscredit.conf.AppContext;
import com.les.common.util.DataProtect;
import com.les.util.CommWebServiceUtil;

import net.sf.json.JSONObject;

/**
 * <p>****************************************************************************</p>
 * <ul style="margin:15px;">
 * <li>Title      : JsCreditClient</li>
 * <li>Description : 描述</li>
 * <li>Version     : 1.0</li>
 * <li>Creation    : 2019年6月16日 下午5:03:32</li>
 * <li>Author      : Jenner</li>
 * </ul>
 * <p> 
 * </p>
 * <p>****************************************************************************</p>
 */
public class JsCreditClient {
	private static Logger log = Logger.getLogger(JsCreditClient.class);
	
	public static String queryShfrXyByQyid(String token, String qyid) {
		String url = AppContext.getAppConf().getAppServiceClientUrl();
		String targetNamespace   = AppContext.getAppConf().getAppServiceClientTargetNamespace();
		String method = "queryShfrXyByQyid";
		Map<String, Object> map = new HashMap<String, Object>();
		String loginStr=DataProtect.LoginStrEncrypt(AppContext.getAppConf().getAppServiceClientUserName(), AppContext.getAppConf().getAppServiceClientPassword(),token);
		map.put("token", token);
		map.put("loginstr", loginStr);
		map.put("qyid",qyid);
		
		log.debug("queryShfrXyByQyid:参数==>token:"+token);
		log.debug("queryShfrXyByQyid:参数==>loginStr:"+loginStr);
		log.debug("queryShfrXyByQyid:参数==>qyid:"+qyid);
		
		JSONObject param = JSONObject.fromObject(map);
		String result = CommWebServiceUtil.axis(url, targetNamespace, method, param),jsondata= "";
		try{
			jsondata=DataProtect.LoginStrDecrypt(result, token);
			log.debug("queryShfrXyByQyid:服务返回信息==>result:"+result);
			log.debug("queryShfrXyByQyid:服务返回信息==>jsondata:"+jsondata);
			
		}catch(Exception e){
			log.error(e.getStackTrace());
		}
		return jsondata;
	}
	
	public static String queryShfrList(String token, String qymc, String tyshxydm, String frsfzhm, String pageSize,
			String pageNo) {
		String url = AppContext.getAppConf().getAppServiceClientUrl();
		String targetNamespace   = AppContext.getAppConf().getAppServiceClientTargetNamespace();
		String method = "queryShfrList";
		Map<String, Object> map = new HashMap<String, Object>();
		String loginStr=DataProtect.LoginStrEncrypt(AppContext.getAppConf().getAppServiceClientUserName(), AppContext.getAppConf().getAppServiceClientPassword(),token);
		map.put("token", token);
		map.put("loginstr", loginStr);
		map.put("qymc",qymc); //4
		map.put("tyshxydm",tyshxydm);
		map.put("frsfzhm",frsfzhm);
		map.put("pageSize",pageSize);
		map.put("pageNo",pageNo); 
		
		log.debug("queryShfrList:参数==>token:"+token);
		log.debug("queryShfrList:参数==>loginStr:"+loginStr);
		log.debug("queryShfrList:参数==>qymc:"+qymc);
		log.debug("queryShfrList:参数==>tyshxydm:"+tyshxydm);
		log.debug("queryShfrList:参数==>frsfzhm:"+frsfzhm);
		log.debug("queryShfrList:参数==>pageSize:"+pageSize);
		log.debug("queryShfrList:参数==>pageNo:"+pageNo);
		
		System.out.println(loginStr);
		JSONObject param = JSONObject.fromObject(map);
		String result = CommWebServiceUtil.axis(url, targetNamespace, method, param),jsondata= "";
		try{
			jsondata=DataProtect.LoginStrDecrypt(result, token);
			log.debug("queryShfrList:服务返回信息==>result:"+result);
			log.debug("queryShfrList:服务返回信息==>jsondata:"+jsondata);
		}catch(Exception e){
			e.getStackTrace();
		}
		return jsondata;
	}
}
