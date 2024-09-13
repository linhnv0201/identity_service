package com.vulinh.identity_service.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized Error"),
    INVALID_KEY(1001, "Invalid Message Key"),
    USER_EXISTED(1002, "User already existed"),
    USERNAME_INVALID(1003, "Username is invalid or less then 3 characters"),
    INVALID_PASSWORD(1004, "Password >3 characters"),
    ;
    private int code;
    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
