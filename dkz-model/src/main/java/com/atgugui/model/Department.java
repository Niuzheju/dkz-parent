package com.atgugui.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;

import java.io.Serializable;

public class Department implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@TableId("id")
    private Integer id;
    @TableField("departmentName")
    private String departmentName;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getId() {
        return id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + "]";
	}
    
    
    
}
