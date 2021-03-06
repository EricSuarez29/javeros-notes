package com.javeros.notesapp.models;

import java.io.Serializable;

//@Entity
//@Table(name = "users")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	//@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column(nullable = false, length = 15)
    private String username;

    //@Column(nullable = false, length = 255)
    private String password;
    
    public User() {}

	public User(Long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    
    
}
