package com.example.demo.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString 
public class User {
	private Integer id;
	private String username;
	private String password;

}
