package com.debanjan.demo1.entity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "calculator_attempt")
public class CalculatorAttempt {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cal_id")
	long calId;
	
	@Column(name = "a")
	int a;
	
	@Column(name = "b")
	int b;
	
	@Column(name = "res")
	int res;
	
	@Column(name = "my_flag")
	String myFlag;
	
	@Column(name = "op_dt")
	Date opDt;

	public long getCalId() {
		return calId;
	}

	public void setCalId(long calId) {
		this.calId = calId;
	}

	

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getRes() {
		return res;
	}

	public void setRes(int res) {
		this.res = res;
	}

	public String getMyFlag() {
		return myFlag;
	}

	public void setMyFlag(String myFlag) {
		this.myFlag = myFlag;
	}

	public Date getOpDt() {
		return opDt;
	}

	public void setOpDt(Date opDt) {
		this.opDt = opDt;
	}
	
	
}
