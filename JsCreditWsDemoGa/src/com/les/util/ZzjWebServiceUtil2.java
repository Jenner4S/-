package com.les.util;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;



public class ZzjWebServiceUtil2 {
		//通过axis方式调用webservice接口
		public static String axis(String url ,String targetNamespace ,String method,String devid,
				String code,String point,String stat,String remark,String time) {
			 try{       
	                Service service = new Service();
	                //通过service创建call对象     
	                Call call = (Call) service.createCall();
	                //设置服务地址
	                call.setTargetEndpointAddress(new java.net.URL(url)); 
	                //设置调用方法
	                call.setOperationName(new QName(targetNamespace, method));
	                call.setUseSOAPAction(true);
//	                HashMap<String,Object> map = new HashMap<String,Object>();
//	                int count = 0 ;
//	                Object[] obj = {};
//	                for (Map.Entry<String, Object> entry : map.entrySet()) {
//	                	call.addParameter(entry.getKey(), XMLType.XSD_STRING,ParameterMode.IN);
//	                	obj[count] = entry.getValue();
//	                	count++;
//	                }
	                //添加方法的参数，有几个添加几个
	                
	                call.addParameter("devid", XMLType.XSD_STRING,ParameterMode.IN);
	                call.addParameter("code", XMLType.XSD_STRING,ParameterMode.IN);
	                call.addParameter("point", XMLType.XSD_STRING,ParameterMode.IN);
	                call.addParameter("stat", XMLType.XSD_STRING,ParameterMode.IN);
	                call.addParameter("time", XMLType.XSD_STRING,ParameterMode.IN);
	                call.addParameter("remark", XMLType.XSD_STRING,ParameterMode.IN);
	                //设置返回类型  
	                call.setReturnType(XMLType.XSD_STRING);
	                Object ret= null;
	                try{
	                    //使用invoke调用方法，Object数据放传入的参数值
	                    ret = call.invoke(new Object[] {devid,code,point,stat,time,remark});  
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
