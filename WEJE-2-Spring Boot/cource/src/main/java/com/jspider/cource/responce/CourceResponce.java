package com.jspider.cource.responce;

import java.util.List;

import com.jspider.cource.enitity.Cource;

public class CourceResponce {
	private String status;
	private String msg;
	private Cource cource;
	private List<Cource> cources;

	public CourceResponce() {

	}

	public CourceResponce(String status, String msg, Cource cource, List<Cource> cources) {
		super();
		this.status = status;
		this.msg = msg;
		this.cource = cource;
		this.cources = cources;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Cource getCource() {
		return cource;
	}

	public void setCource(Cource cource) {
		this.cource = cource;
	}

	public List<Cource> getCources() {
		return cources;
	}

	public void setCources(List<Cource> cources) {
		this.cources = cources;
	}

	@Override
	public String toString() {
		return "CourceResponce [status=" + status + ", msg=" + msg + ", cource=" + cource + ", cources=" + cources
				+ "]";
	}

}
