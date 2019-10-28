package com.chat.connectionmanager.model;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportActiveConnectionsRequest {
	private Set<String> userIds;
	private ServerDetails serverDetails;
}
