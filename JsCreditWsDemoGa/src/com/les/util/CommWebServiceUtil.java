package com.les.util;

import java.util.Iterator;


import net.sf.json.JSONObject;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;


public class CommWebServiceUtil {
		//通过axis方式调用webservice接口
		public static String axis(String url ,String targetNamespace ,String method,JSONObject jsonobj ) {
			 try{       
	                Service service = new Service();
	                //通过service创建call对象     
	                Call call = (Call) service.createCall();
	                //设置服务地址
	                call.setTargetEndpointAddress(new java.net.URL(url)); 
	                //设置调用方法
	                call.setOperationName(new QName(targetNamespace, method));
	                call.setUseSOAPAction(true);
	                if(jsonobj == null || jsonobj.isEmpty()){
	                	return "-1";
	                }
	                //添加方法的参数，有几个添加几个\
	                Iterator iterator = jsonobj.keys();
	                Object object[] = new Object[jsonobj.size()];
	                int index = 0;
	                while(iterator.hasNext()){
	                	String key = (String) iterator.next();
	                	Object value = jsonobj.get(key);
	                	object[index] = value ;
	                	call.addParameter(key, XMLType.XSD_STRING,ParameterMode.IN);
	                	index++;
	                }
	                //设置返回类型  
	                call.setReturnType(XMLType.XSD_STRING);
	                Object ret= null;
	                try{
	                    //使用invoke调用方法，Object数据放传入的参数值
	                    ret = call.invoke(object);  
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
