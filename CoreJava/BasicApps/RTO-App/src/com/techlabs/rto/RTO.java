package com.techlabs.rto;

public class RTO implements Comparable<RTO> {
	private String state;
	private int code;

	public RTO(String state, int code) {
		this.state = state;
		this.code = code;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public int compareTo(RTO rto) {
		if (code == rto.code)
			return 0;
		else if (code > rto.code)
			return 1;
		else
			return -1;
	}

}
