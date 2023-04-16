package com.web.KJY.dto.request;

import com.web.KJY.domain.entity.Member;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class MemberRequestDto {
	private String username;
	private String password;
	
	public Member toEntity() {
		return Member.builder()
				.username(username)
				.password(password)
				.build();
	}
}
