package com.chat.connectionmanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {
	private String senderId;
	private String recipientId;
	private String content;
	private long timestamp;
}
