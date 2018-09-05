package com.atgugui.consumer;


import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atgugui.exceptions.BaseException;
import com.atgugui.facade.HelloService;
import com.atgugui.model.Employee;

@Service
public class UserService{

    @Reference
    HelloService helloService;

    public String hello(){
    	String str = helloService.getStr();
		return str;
    }

	public Employee insert() throws BaseException{
		Employee employeein = new Employee();
		employeein.setEmail("email");
		employeein.setGender(1);
		employeein.setLastName("lastName");
		employeein.setdId(1);
		Employee employee = helloService.insert(employeein);
		return employee;
	}


}
