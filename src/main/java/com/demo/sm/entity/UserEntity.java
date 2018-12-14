package com.demo.sm.entity;

import java.io.Serializable;

public class UserEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String userName;
	private String passWord;
	private String email;
	private String nickName;
	private String regTime;

	public UserEntity(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}

	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserEntity(String userName, String passWord, String email, String nickName, String regTime) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.email = email;
		this.nickName = nickName;
		this.regTime = regTime;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", email=" + email
				+ ", nickName=" + nickName + ", regTime=" + regTime + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getRegTime() {
		return regTime;
	}

	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}

}
