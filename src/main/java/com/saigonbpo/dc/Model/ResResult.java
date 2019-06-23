package com.saigonbpo.dc.Model;

public class ResResult {

	private boolean status;
	private String message;
	
	public ResResult(){
		status = true;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
