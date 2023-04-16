package com.web.KJY.service;

import java.util.List;

import com.web.KJY.domain.entity.Member;
import com.web.KJY.dto.request.MemberRequestDto;
import com.web.KJY.dto.response.MemberResponseDto;

public interface MemberService {

	public void saveMember(MemberRequestDto memberRequestDto);
	List<MemberResponseDto> getMembers();
}
