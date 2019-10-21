package com.chat.connectionmanager.model;

import lombok.Data;

@Data
public class Message {
	private String senderId;
	private String recipientId;
	private String content;
	private long timestamp;
}
