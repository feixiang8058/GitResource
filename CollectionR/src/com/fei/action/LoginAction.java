package com.fei.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fei.entity.Users;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private Users user;
	
	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public String log() {
		System.out.println("进入log方法");
		if ("xiaofeifei".equals(user.getUcode()) && "123456".equals(user.getUpwd())){
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
}
