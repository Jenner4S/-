/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2018 isoftbao All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Title      : JsCreditServiceImpl.java</li>
 * <li>Package     : com.isoftbao.jscredit.service.provider.impl</li>
 * <li>Description : 描述</li>
 * <li>Version     : 1.0</li>
 * <li>Creation    : 2019年6月16日 下午3:58:38</li>
 * <li>Author      : Jenner</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
package com.isoftbao.jscredit.service.provider.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.isoftbao.jscredit.conf.AppContext;
import com.isoftbao.jscredit.service.client.JsCreditClient;
import com.isoftbao.jscredit.service.provider.JsCreditServiceInter;
import com.les.common.util.DataProtect;
import com.les.util.CommWebServiceUtil;

import net.sf.json.JSONObject;

/**
 * <p>****************************************************************************</p>
 * <ul style="margin:15px;">
 * <li>Title      : JsCreditServiceImpl</li>
 * <li>Description : 描述</li>
 * <li>Version     : 1.0</li>
 * <li>Creation    : 2019年6月16日 下午3:58:38</li>
 * <li>Author      : Jenner</li>
 * </ul>
 * <p> 
 * </p>
 * <p>****************************************************************************</p>
 */
public class JsCreditServiceImpl implements JsCreditServiceInter {
	private Logger log = Logger.getLogger(getClass());
	/** 
	 * 
	* (non-Javadoc)
	* <p>Title:queryShfrXyByQyid</p> 
	* <p>Description: </p> 
	* @param token
	* @param qyid
	* @return 
	* @see com.isoftbao.jscredit.service.provider.JsCreditServiceInter#queryShfrXyByQyid(java.lang.String, java.lang.String)
	 */
	@Override
	public String queryShfrXyByQyid(String token, String qyid) {
		return JsCreditClient.queryShfrXyByQyid(token, qyid);
	}
	/** 
	* (non-Javadoc)
	* <p>Title:queryShfrList</p> 
	* <p>Description: </p> 
	* @param token
	* @param qymc
	* @param tyshxydm
	* @param frsfzhm
	* @param pageSize
	* @param pageNo
	* @return 
	* @see com.isoftbao.jscredit.service.provider.JsCreditServiceInter#queryShfrList(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) 
	*/
	@Override
	public String queryShfrList(String token, String qymc, String tyshxydm, String frsfzhm, String pageSize,
			String pageNo) {
		return JsCreditClient.queryShfrList(token, qymc, tyshxydm, frsfzhm, pageSize, pageNo);
	}
}
