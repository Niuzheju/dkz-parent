package com.atgugui.web;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atgugui.consumer.UserService;
import com.atgugui.enums.exceptionals.StateEnum;
import com.atgugui.exceptions.BaseException;
import com.atgugui.model.Employee;
import com.atgugui.result.BaseResult;

 
///**
// * @author zhuzhe
// * @date 2018/5/25 16:00
// * @email 1529949535@qq.com
// */
@RestController
public class SendController {
 
	@Autowired
	private UserService userService;
	
    @GetMapping("/send")
    public String send(){
    	String hello = userService.hello();
        return hello;
    }
    
    @GetMapping("/insert")
    public BaseResult insert(){
    	try {
    		Employee hello = userService.insert();
    		return BaseResult.newSuccess(hello);
		} catch (BaseException e) {
			return BaseResult.newFailed(e.getcode(),e.getMessage());
		}
    }
}
