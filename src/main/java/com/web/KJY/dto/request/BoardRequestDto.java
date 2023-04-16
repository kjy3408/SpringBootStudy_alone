package com.web.KJY.dto.request;

import com.web.KJY.domain.entity.Board;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class BoardRequestDto {

	private int boardId;
	private String title;
	private String content;
	private int memberId;
	
	public Board toEntity() {
		return Board.builder()
				.board_id(boardId)
				.title(title)
				.content(content)
				.member_id(memberId)
				.build();
	}

}
