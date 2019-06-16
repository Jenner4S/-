package com.sjq.webservices.hello;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface HelloWorldServiceInter {

	@WebMethod
	@WebResult(name = "result")
	public String helloWorld2(@WebParam(name = "helloValue") String helloValue,
			@WebParam(name = "world") String world);

}
