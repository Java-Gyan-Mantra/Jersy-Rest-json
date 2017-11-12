package com.rest.model;

import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({ "input1", "input2", "result" })
public class Result {
	private int input1;
	private int input2;
	private int result;

	public int getInput1() {
		return input1;
	}

	public void setInput1(int input1) {
		this.input1 = input1;
	}

	public int getInput2() {
		return input2;
	}

	public void setInput2(int input2) {
		this.input2 = input2;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

}
