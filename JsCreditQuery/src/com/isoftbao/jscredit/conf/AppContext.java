/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2018 isoftbao All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Title      : AppContext.java</li>
 * <li>Package     : com.isoftbao.jscredit.conf</li>
 * <li>Description : 描述</li>
 * <li>Version     : 1.0</li>
 * <li>Creation    : 2019年6月16日 下午4:37:39</li>
 * <li>Author      : Jenner</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
package com.isoftbao.jscredit.conf;

/**
 * <p>****************************************************************************</p>
 * <ul style="margin:15px;">
 * <li>Title      : AppContext</li>
 * <li>Description : 描述</li>
 * <li>Version     : 1.0</li>
 * <li>Creation    : 2019年6月16日 下午4:37:39</li>
 * <li>Author      : Jenner</li>
 * </ul>
 * <p> 
 * </p>
 * <p>****************************************************************************</p>
 */
public class AppContext {
	
	private static AppConf CONF = new AppConf();

	
	public static AppConf getAppConf() {
		return CONF;
	}

	public static void setAppConf(AppConf conf) {
		CONF = conf;
	}
}
