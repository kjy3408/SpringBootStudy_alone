package com.web.KJY.dto.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MemberResponseDto {

	private int id;
	private String username;
	private String password;
}
