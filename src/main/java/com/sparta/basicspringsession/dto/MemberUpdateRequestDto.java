package com.sparta.basicspringsession.dto;

import lombok.Getter;

@Getter
public class MemberUpdateRequestDto {
    private String name;


    public MemberUpdateRequestDto(String name) {
        this.name = name;
    }
}
