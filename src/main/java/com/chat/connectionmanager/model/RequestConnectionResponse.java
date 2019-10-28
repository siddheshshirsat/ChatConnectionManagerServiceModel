package com.chat.connectionmanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestConnectionResponse {
	private GrantStatus grantStatus;
	private String url;
}
