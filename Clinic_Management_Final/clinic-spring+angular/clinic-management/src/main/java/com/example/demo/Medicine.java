package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Medicine {
	
	@Id
	private String mid;
	private String mname;
	private double price;
	private long qty;
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getQty() {
		return qty;
	}
	public void setQty(long qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Medicine [mid=" + mid + ", mname=" + mname + ", price=" + price + ", qty=" + qty + "]";
	}
	
	
}
