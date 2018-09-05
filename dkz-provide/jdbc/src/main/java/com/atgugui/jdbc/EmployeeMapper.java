package com.atgugui.jdbc;

import org.apache.ibatis.annotations.Select;

import com.atgugui.model.Department;
import com.atgugui.model.Employee;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * @program: spring-boot
 * @description:
 * @author: conlon
 * @create: 2018-08-27 19:12
 **/
public interface EmployeeMapper extends BaseMapper<Employee> {
	
	public Employee getEmpById(Integer id);
	
    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);
}
