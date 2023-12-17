package com.simflow.parycard.member.dto;

import com.simflow.parycard.domain.entity.Member;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class MemberDto {

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public static class RequestSearch {

        /**
         * 멤버 이름
         */
        private String memberName;
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @AllArgsConstructor
    public static class ResponseSearch {

        /**
         * 멤버 아이디
         */
        private String memberId;

        /**
         * 멤버 이름
         */
        private String memberName;

        public static ResponseSearch of(Member member) {
            return ResponseSearch.builder()
                .memberId(member.getMemberId())
                .memberName(member.getMemberName())
                .build();
        }
    }

}