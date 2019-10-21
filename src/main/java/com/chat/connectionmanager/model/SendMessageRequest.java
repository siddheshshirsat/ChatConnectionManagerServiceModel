package com.chat.connectionmanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SendMessageRequest {
	private Message message;
}
