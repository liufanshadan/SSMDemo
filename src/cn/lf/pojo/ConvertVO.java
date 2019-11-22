package cn.lf.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ConvertVO {
	 private int id;
	 private String name;
	private short age;
	/* private Clob detail;*/
	  private Date birthday;
	  private Integer luckNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public short getAge() {
		return age;
	}
	public void setAge(short age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	/*	public Clob getDetail() {
		return detail;
	}
	public void setDetail(Clob detail) {
		this.detail = detail;
	}*/
	public Integer getLuckNumber() {
		return luckNumber;
	}
	public void setLuckNumber(Integer luckNumber) {
		this.luckNumber = luckNumber;
	}
	 

}
