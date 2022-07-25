package com.anshu.controller;

public class GitAdd {

	int status;
	String msg;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "GitAdd [status=" + status + ", msg=" + msg + "]";
	}
	
}
