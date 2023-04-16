package com.web.KJY.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class BoardResponseDto {

	private int board_id;
	private String title;
	private String content;
	private String memberName;
	
}
