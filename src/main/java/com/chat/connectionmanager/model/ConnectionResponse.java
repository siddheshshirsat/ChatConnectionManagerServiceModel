package com.chat.connectionmanager.model;

import lombok.Value;

@Value
public class ConnectionResponse {
	private GrantStatus grantStatus;
	private String url;
}
