package com.lib.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "record")
public class Record implements Serializable{
	private static final long serialVersionUID = -1434490985520712976L;
	
	@Id @Column(name = "rid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer rId;
	
	private Date date;
	
	private Integer worktime;
	
	@ManyToOne(targetEntity = User.class)
	@JoinColumn(name = "uid", referencedColumnName = "uid", nullable=false)
	private User user;

	public Integer getrId() {
		return rId;
	}

	public void setrId(Integer rId) {
		this.rId = rId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getWorktime() {
		return worktime;
	}

	public void setWorktime(Integer worktime) {
		this.worktime = worktime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
}
