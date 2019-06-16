/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2018 isoftbao All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Title      : AppConfigListener.java</li>
 * <li>Package     : com.isoftbao.jscredit.listener</li>
 * <li>Description : 描述</li>
 * <li>Version     : 1.0</li>
 * <li>Creation    : 2019年6月16日 下午4:21:45</li>
 * <li>Author      : Jenner</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
package com.isoftbao.jscredit.listener;

import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

import com.isoftbao.jscredit.conf.AppConf;
import com.isoftbao.jscredit.conf.AppContext;

import javax.servlet.ServletContextEvent;
import java.io.InputStream;
import java.util.Properties;

/**
 * <p>****************************************************************************</p>
 * <ul style="margin:15px;">
 * <li>Title      : AppConfigListener</li>
 * <li>Description : 描述</li>
 * <li>Version     : 1.0</li>
 * <li>Creation    : 2019年6月16日 下午4:21:45</li>
 * <li>Author      : Jenner</li>
 * </ul>
 * <p> 
 * </p>
 * <p>****************************************************************************</p>
 */
public class AppConfigListener implements ServletContextListener {
	private Logger log = Logger.getLogger(getClass());
	private static Properties prop = new Properties();

	/** 
	* (non-Javadoc)
	* <p>Title:contextDestroyed</p> 
	* <p>Description: </p> 
	* @param sce 
	* @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent) 
	*/
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		log.debug("contextDestroyed");
	}

	/** 
	* (non-Javadoc)
	* <p>Title:contextInitialized</p> 
	* <p>Description: </p> 
	* @param sce 
	* @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent) 
	*/
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		log.debug("contextInitialized:加载配置文件....");
		InputStream inputStream;
		try {
			inputStream = getClass().getResourceAsStream("/appConfig.properties");
			if(inputStream != null){
				prop.load(inputStream);
				
				initConf();
				
				log.debug("contextInitialized:加载配置文件完成");
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.debug("contextInitialized:加载配置文件异常！"+e.getMessage());
		}
	}
	
	/**
	 * <li>Title       : initConf</li>
	 * <li>Description : 描述</li>
	 * <li>Version     : 1.0</li>
	 * <li>Creation    : 2019年6月16日 下午4:42:14</li>
	 * <li>Author      : Jenner</li>
	 * </ul>
	 * <p> 
	 * </p>
	 */
	private void initConf() {
		AppConf appConf = new AppConf();
		appConf.setAppName(get("app.name"));
		appConf.setAppVersion(get("app.version"));
		appConf.setAppServiceClientUrl(get(""));
		
		appConf.setAppServiceClientTargetNamespace(get("app.service.client.targetNamespace"));
		appConf.setAppServiceClientUrl(get("app.service.client.url"));
		appConf.setAppServiceClientUserName(get("app.service.client.username"));
		appConf.setAppServiceClientPassword(get("app.service.client.password"));
		appConf.setAppServiceClientToken(get("app.service.client.token"));
		log.debug("AppConf:"+appConf.toString());
		AppContext.setAppConf(appConf);
	}

	/**
	 * 取值
	 * <li>Title       : get</li>
	 * <li>Description : 描述</li>
	 * <li>Version     : 1.0</li>
	 * <li>Creation    : 2019年6月16日 下午4:30:12</li>
	 * <li>Author      : Jenner</li>
	 * </ul>
	 * <p>
	 * @param params
	 * @return 
	 * </p>
	 */
	public static String get(String params){
		return prop.getProperty(params);
	}
}
