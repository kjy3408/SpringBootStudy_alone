package com.web.KJY.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.web.KJY.domain.entity.Member;
import com.web.KJY.dto.request.MemberRequestDto;
import com.web.KJY.dto.response.MemberResponseDto;
import com.web.KJY.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

	private final MemberRepository memberRepository;
	
	@Override
	public void saveMember(MemberRequestDto memberRequestDto) {
		
		System.out.println(memberRequestDto.getUsername());
		
		
		memberRepository.saveMember(memberRequestDto.toEntity());
		
	}
	
	@Override
	public List<MemberResponseDto> getMembers() {
		List<MemberResponseDto> memberList = new ArrayList<>();
		
		memberRepository.getMembers().forEach(entity -> {
			memberList.add(entity.toDto());
		});
		return memberList;
	}
}
