package com.les.util;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;

public class ZzjWebServiceUtil {
		//通过axis方式调用webservice接口
		public static String axis(String url ,String targetNamespace ,String method,String devid,
				String code ,String address,String sex,String birthday,String dept ,String idcard ,String name ,
				String nation,String sid ,String validdate ,String facepic,String stat,String time) {
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
	                call.addParameter("devid", XMLType.XSD_STRING,ParameterMode.IN);
	                call.addParameter("code", XMLType.XSD_STRING,ParameterMode.IN);
	                call.addParameter("address", XMLType.XSD_STRING,ParameterMode.IN);
	                call.addParameter("sex", XMLType.XSD_STRING,ParameterMode.IN);
	                call.addParameter("birthday", XMLType.XSD_STRING,ParameterMode.IN);
	                call.addParameter("dept", XMLType.XSD_STRING,ParameterMode.IN);
	                call.addParameter("idcard", XMLType.XSD_STRING,ParameterMode.IN);
	                call.addParameter("name", XMLType.XSD_STRING,ParameterMode.IN);
	                call.addParameter("nation", XMLType.XSD_STRING,ParameterMode.IN);
	                call.addParameter("sid", XMLType.XSD_STRING,ParameterMode.IN);
	                call.addParameter("validdate", XMLType.XSD_STRING,ParameterMode.IN);
	                call.addParameter("facepic", XMLType.XSD_STRING,ParameterMode.IN);
	                call.addParameter("stat", XMLType.XSD_STRING,ParameterMode.IN);
	                call.addParameter("time", XMLType.XSD_STRING,ParameterMode.IN);
	                //设置返回类型  
	                call.setReturnType(XMLType.XSD_STRING);
	                Object ret= null;
	                try{
	                    //使用invoke调用方法，Object数据放传入的参数值
	                    ret = call.invoke(new Object[] {devid,code,address,sex,birthday,dept,idcard,
	                    		name,nation,sid,validdate,facepic,stat,time});  
	                }catch(Exception e){
	                    e.printStackTrace();
	                }
	                return ret.toString();
	        }catch(Exception e){
	        	e.printStackTrace();
	        	return "-1";
	        }
		}
	}
