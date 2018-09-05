package com.atgugui.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
@TableName("employee")
public class Employee implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@TableId("id")
    private Integer id;
    @TableField("lastName")
    private String lastName;
    @TableField("gender")
    private Integer gender;
    @TableField("email")
    private String email;
    @TableField("d_id")
    private Integer dId;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Integer getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public Integer getdId() {
        return dId;
    }

	@Override
	public String toString() {
		return "Employee [id=" + id + ", lastName=" + lastName + ", gender=" + gender + ", email=" + email + ", dId="
				+ dId + "]";
	}
    
    
    
}
