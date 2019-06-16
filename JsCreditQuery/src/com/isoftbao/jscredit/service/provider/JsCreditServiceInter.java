package com.isoftbao.jscredit.service.provider;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface JsCreditServiceInter {

	/**
	 * 
	 * 2.2.	法人信用信息<br>
	 * 2.2.1.	服务地址<br>
	 * 电子政务外网地址：<br>
	 * http://172.23.50.244:8289/jsxycxws/services/xycx?wsdl<br>
	 * VPN专网地址：<br>
	 * http://8.8.238.90:8289/jsxycxws/services/xycx?wsdl<br>
	 * <br>
	 * 2.2.2.	 * 服务标识<br>
	 * xycxws<br>
	 * 2.2.3.	 * 方法名称<br>
	 * 查询社会法人信用档案信息（queryShfrXyByQyid）<br>
	 * 2.2.4.	 * 方法描述<br>
	 * 调用该方法返回社会法人的信用档案信息。<br>
	 * 2.2.5.	 * 服务提供方<br>
	 * 江苏信用平台
	 * 2.2.6.	 * 服务调用方<br>
	 * 各部门用户<br>

	 * <li>Title       : queryShfrXyByQyid</li>
	 * <li>Description : 查询社会法人信用档案信息</li>
	 * <li>Version     : 1.0</li>
	 * <li>Creation    : 2019年6月16日 下午3:51:35</li>
	 * <li>Author      : Jenner</li>
	 * </ul>
	 * <p>
	 * @param token
	 * @param qyid
	 * @return 
	 * </p>
	 */
	@WebMethod
	@WebResult(name = "result")
	public String queryShfrXyByQyid(@WebParam(name = "token") String token,
			@WebParam(name = "qyid") String qyid);
	
	
	/**
	 * 
	 * <li>Title       : queryShfrList</li>
	 * <li>Description : 描述</li>
	 * <li>Version     : 1.0</li>
	 * <li>Creation    : 2019年6月16日 下午4:52:21</li>
	 * <li>Author      : Jenner</li>
	 * </ul>
	 * <p>
	 * @param token		部门口令
	 * @param qymc 		企业名称、统一社会信用代码和法定代表人身份证件号码三选一。企业名称支持模糊查询
	 * @param tyshxydm 	统一社会信用代码/企业注册号
	 * @param frsfzhm	法定代表人身份证件号码
	 * @param pageSize	分页参数，每页条数
	 * @param pageNo	分页参数，页码
	 * @return 
	 * </p>
	 */
	@WebMethod
	@WebResult(name = "result")
	public String queryShfrList(@WebParam(name = "token") String token,
			@WebParam(name = "qymc") String qymc,@WebParam(name = "tyshxydm") String tyshxydm,@WebParam(name = "frsfzhm") String frsfzhm,
			@WebParam(name = "pageSize") String pageSize,@WebParam(name = "pageNo") String pageNo);

}
