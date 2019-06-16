package com.sjq.webservices.hello;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.util.Properties;

import org.codehaus.xfire.client.Client;

import com.sjq.webservice.FwjkUtil;


/*
 * 地址:
 * http://10.32.92.161:8080/WebserviceDemo/services/HELLOWORLD?wsdl
 */
public class HelloWorldServiceImpl implements HelloWorldServiceInter {
	@Override
	public String helloWorld2(String value,String world) {
		String result = FwjkUtil.Query1(value,world);
		return result;
	}
}
