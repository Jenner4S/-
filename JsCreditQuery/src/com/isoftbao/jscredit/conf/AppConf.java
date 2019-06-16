/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2018 isoftbao All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Title      : AppConf.java</li>
 * <li>Package     : com.isoftbao.jscredit.conf</li>
 * <li>Description : 描述</li>
 * <li>Version     : 1.0</li>
 * <li>Creation    : 2019年6月16日 下午4:03:20</li>
 * <li>Author      : Jenner</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
package com.isoftbao.jscredit.conf;

import java.io.Serializable;

/**
 * <p>****************************************************************************</p>
 * <ul style="margin:15px;">
 * <li>Title      : AppConf</li>
 * <li>Description : 描述</li>
 * <li>Version     : 1.0</li>
 * <li>Creation    : 2019年6月16日 下午4:03:20</li>
 * <li>Author      : Jenner</li>
 * </ul>
 * <p> 
 * </p>
 * <p>****************************************************************************</p>
 */
public class AppConf implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO
	*/ 
	private static final long serialVersionUID = 1L;
	
	private String appName;
	private String appVersion;
	private String appServiceClientUrl;
	private String appServiceClientTargetNamespace;
	private String appServiceClientUserName;
	private String appServiceClientPassword;
	private String appServiceClientToken;
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppVersion() {
		return appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	public String getAppServiceClientUrl() {
		return appServiceClientUrl;
	}
	public void setAppServiceClientUrl(String appServiceClientUrl) {
		this.appServiceClientUrl = appServiceClientUrl;
	}
	public String getAppServiceClientTargetNamespace() {
		return appServiceClientTargetNamespace;
	}
	public void setAppServiceClientTargetNamespace(String appServiceClientTargetNamespace) {
		this.appServiceClientTargetNamespace = appServiceClientTargetNamespace;
	}
	
	public String getAppServiceClientUserName() {
		return appServiceClientUserName;
	}
	public void setAppServiceClientUserName(String appServiceClientUserName) {
		this.appServiceClientUserName = appServiceClientUserName;
	}
	public String getAppServiceClientPassword() {
		return appServiceClientPassword;
	}
	public void setAppServiceClientPassword(String appServiceClientPassword) {
		this.appServiceClientPassword = appServiceClientPassword;
	}
	public String getAppServiceClientToken() {
		return appServiceClientToken;
	}
	public void setAppServiceClientToken(String appServiceClientToken) {
		this.appServiceClientToken = appServiceClientToken;
	}
	@Override
	public String toString() {
		return "AppConf [appName=" + appName + ", appVersion=" + appVersion + ", appServiceClientUrl="
				+ appServiceClientUrl + ", appServiceClientTargetNamespace=" + appServiceClientTargetNamespace
				+ ", appServiceClientUserName=" + appServiceClientUserName + ", appServiceClientPassword="
				+ appServiceClientPassword + ", appServiceClientToken=" + appServiceClientToken + "]";
	}
	
}
