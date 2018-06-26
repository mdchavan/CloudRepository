package com.techlabs.rtoproperties;

public class RTO implements Comparable<RTO> {
	public String state;
	public String code;

	public RTO(String state, String code) {
		this.state = state;
		this.code = code;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public int compareTo(RTO rto) {
		return code.compareTo(rto.code);
	}

}
