package com.simflow.parycard.member.service;

import com.simflow.parycard.domain.service.MemberDomainService;
import com.simflow.parycard.member.dto.MemberDto;
import com.simflow.parycard.member.dto.MemberDto.ResponseMember;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberDomainService memberDomainService;

    @Transactional(readOnly = true)
    public List<ResponseMember> retrieveMemberList(MemberDto.RequestSearch requestSearch) {
        return memberDomainService.findByMemberName(requestSearch.getMemberName()).stream()
            .map(ResponseMember::of)
            .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public MemberDto.ResponseMember createMember(MemberDto.RequestCreate requestCreate) {
        var member =  memberDomainService.save(requestCreate.getMemberName());
        return MemberDto.ResponseMember.of(member);
    }
}
