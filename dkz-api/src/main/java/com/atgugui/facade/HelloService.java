package com.atgugui.facade;

import com.atgugui.exceptions.BaseException;
import com.atgugui.model.Employee;

public interface HelloService {
	
	public String getStr();

	public Employee insert(Employee employeein) throws BaseException;
	
	
}
