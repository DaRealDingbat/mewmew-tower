package com.amazon.mas.kiwi.util;

public class ApkInvalidException extends RuntimeException {
    ApkInvalidException() {
    }

    ApkInvalidException(Throwable cause) {
        super(cause);
    }

    ApkInvalidException(String msg) {
        super(msg);
    }

    ApkInvalidException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
