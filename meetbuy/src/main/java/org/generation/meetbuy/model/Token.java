package org.generation.meetbuy.model;

public class Token {
	
	private final String accessToken;
	
	//Contructor
	public Token(String accessToken) {
		this.accessToken = accessToken;
	}
	
	//getter
	public String getAccessToken() {
		return accessToken;
	}
}
