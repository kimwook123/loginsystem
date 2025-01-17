package com.itg.examp.dto;

import org.apache.ibatis.type.Alias;

@Alias("memb")
public class MemberDTO {
	private int id;
	private String mid;
	private String mpw;
	private String name;
	private int age;
	private String address;
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", mid=" + mid + ", mpw=" + mpw + ", name=" + name + ", age=" + age
				+ ", address=" + address + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMpw() {
		return mpw;
	}
	public void setMpw(String mpw) {
		this.mpw = mpw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}