package com.atgugui.exceptions;

import java.io.Serializable;

import com.atgugui.enums.exceptionals.StateEnum;



/**
 * @author dkzadmin
 * 自定义全局异常抛出,逻辑处理层使用
 */
public class BaseException  extends RuntimeException implements Serializable{
	private static final long serialVersionUID = -4333316296251054416L;
	private int code = 200;

	public int getcode() {
		return code;
	}

	public void setcode(int code) {
		this.code = code;
	}

	public BaseException() {
	}

	public BaseException(String message, int code) {
		super(message);
		this.code = code;
	}

	public BaseException(String message, String code) {
		super(message);
		this.code = Integer.parseInt(code);
	}

	public BaseException(String message) {
		super(message);
	}

	public BaseException(String message, Throwable cause) {
		super(message, cause);
	}

	public BaseException(Throwable cause) {
		super(cause);
	}

	public BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BaseException(StateEnum stateEnum) {
		super(stateEnum.getMessage());
		code = stateEnum.getCode();
	}
}
