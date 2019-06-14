package com.les.util;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;


public class WebServiceUtil {
		//通过axis方式调用webservice接口
		public static String axis(String url ,String targetNamespace ,String method,String xmlStr
				,String sysType,String systemToken,String accessToken,String adapaterType) {
			 try{       
	                Service service = new Service();
	                //通过service创建call对象     
	                Call call = (Call) service.createCall();
	                //设置服务地址
	                call.setTargetEndpointAddress(new java.net.URL(url)); 
	                //设置调用方法
	                call.setOperationName(new QName(targetNamespace, method));
	                call.setUseSOAPAction(true);
	                //添加方法的参数，有几个添加几个
	                //inLicense是参数名，XSD_STRING是参数类型，IN代表传入
//	                call.addParameter("token", XMLType.XSD_STRING,ParameterMode.IN); 
//	                call.addParameter("loginstr", XMLType.XSD_STRING,ParameterMode.IN);
	                call.addParameter("xmlStr", XMLType.XSD_STRING,ParameterMode.IN);
	                call.addParameter("sysType", XMLType.XSD_STRING,ParameterMode.IN); 
	                call.addParameter("systemToken", XMLType.XSD_STRING,ParameterMode.IN);
	                call.addParameter("accessToken", XMLType.XSD_STRING,ParameterMode.IN);
	                call.addParameter("adapaterType", XMLType.XSD_STRING,ParameterMode.IN);
	                //设置返回类型  
	                call.setReturnType(XMLType.XSD_STRING);
	                Object ret= null;
	                try{
	                    //使用invoke调用方法，Object数据放传入的参数值
	                    ret = call.invoke(new Object[] {xmlStr,sysType,systemToken,accessToken,adapaterType});  
	                }catch(Exception e){
	                    e.printStackTrace();
	                }
	                //输出SOAP请求报文
//	                System.out.println("--SOAP Request: " + call.getMessageContext().getRequestMessage().getSOAPPartAsString());
	                //输出SOAP返回报文
//	                System.out.println("--SOAP Response: " + call.getResponseMessage().getSOAPPartAsString());
	                //输出返回信息
//	                System.out.println("result==="+ret.toString()); 
	                return ret.toString();
	        }catch(Exception e){
	        	e.printStackTrace();
	        	return "-1";
	        }
		}
	}
