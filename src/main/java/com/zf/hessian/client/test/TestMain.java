package com.zf.hessian.client.test;

import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;
import com.zf.hessian.client.MyService;

public class TestMain {

	public static void main(String[] args) throws MalformedURLException {

		HessianProxyFactory proxyFactory = new HessianProxyFactory();;  

		MyService service = (MyService)proxyFactory.create(MyService.class,  

				"http://localhost:8080/hessian-web/myservice");

		System.out.println(service.hello());  
		
		System.out.println("ok!");;

	}

}
