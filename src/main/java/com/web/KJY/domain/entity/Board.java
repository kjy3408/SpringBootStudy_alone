package com.web.KJY.domain.entity;

import com.web.KJY.dto.response.BoardResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Board {

	private int board_id;
	private String title;
	private String content;
	private int member_id;
	
	private Member member;
	
	public BoardResponseDto toDto() {
		return BoardResponseDto.builder()
				.board_id(board_id)
				.title(title)
				.content(content)
				.memberName(member.getUsername())
				.build();
	}

	
}
