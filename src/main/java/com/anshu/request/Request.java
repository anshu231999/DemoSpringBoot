package com.anshu.request;

public class Request {
	private int user_id;
	String msg;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		System.out.println("This is called");
		return "Request [user_id=" + user_id + ", msg=" + msg + "]";
	}
	

}
