package com.project.readBooks.user.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class UserDto {
    String UserNo;
    String UserId;
    String UserPw;
}
