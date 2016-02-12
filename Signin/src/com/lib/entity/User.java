package com.lib.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "user")//定义表名称
public class User implements Serializable{
	private static final long serialVersionUID = 6982530460850367621L;
	
	
	
	public User() {
		super();
	}

	public User(String uName, String uPassword) {
		super();
		this.uName = uName;
		this.uPassword = uPassword;
	}

	//定义主键
	@Id @Column(name = "uid")
	//定义主键由数据库自动生成（主要是自动增长型） 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer uId;
	
	@Column(name = "uname")
	private String uName;
	
	@Column(name = "upassword")
	private String uPassword;
	
	@OneToMany(targetEntity = Record.class)
	/*@JoinColumn(name = "uId", referencedColumnName = "uId", nullable=false)*/
	private List<Record> record = new ArrayList<>();
	
	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	
	public List<Record> getRecord() {
		return record;
	}

	public void setRecord(List<Record> records) {
		this.record = records;
	}
	
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	
	

}
