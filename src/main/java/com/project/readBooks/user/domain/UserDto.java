package com.project.readBooks.user.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {
    private String UserNo;
    private String UserId;
    private String UserPw;
}
