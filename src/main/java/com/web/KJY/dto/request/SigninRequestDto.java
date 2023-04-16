package com.web.KJY.dto.request;

import com.web.KJY.domain.entity.Member;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class SigninRequestDto {

	private String username;
	private String password;
	
	public Member toEntity() {
		return Member.builder()
				.username(username)
				.password(password)
				.build();
	}
}
