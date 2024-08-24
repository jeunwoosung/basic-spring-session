package com.sparta.basicspringsession.dto;

import lombok.Getter;

@Getter
public class MemberSimpleResponseDto {
    public final String name;

    public MemberSimpleResponseDto(String name) {
        this.name = name;
    }
}
