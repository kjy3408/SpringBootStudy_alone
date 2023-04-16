package com.web.KJY.domain.entity;

import com.web.KJY.dto.request.MemberRequestDto;
import com.web.KJY.dto.response.MemberResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Member {

	private int member_id;
	private String username;
	private String password;
	
//	private List<Board> boardList;
	public MemberResponseDto toDto() {
		return MemberResponseDto.builder()
				.id(member_id)
				.username(username)
				.password(password)
				.build();
	}

}
