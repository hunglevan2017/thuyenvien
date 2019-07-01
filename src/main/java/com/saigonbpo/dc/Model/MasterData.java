package com.saigonbpo.dc.Model;


public class MasterData {
	
	

	private String CODE;
	private String TEXT;
	private String val;
	public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}
	private Lov lov;
	

	public Lov getLov() {
		return lov;
	}
	public void setLov(Lov lov) {
		this.lov = lov;
	}
	public String getCODE() {
		return CODE;
	}
	public void setCODE(String cODE) {
		CODE = cODE;
	}
	public String getTEXT() {
		return TEXT;
	}
	public void setTEXT(String tEXT) {
		TEXT = tEXT;
	}
	
	
	
}
