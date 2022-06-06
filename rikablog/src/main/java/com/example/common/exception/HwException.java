package com.example.common.exception;

public class HwException extends RuntimeException {
    private int code;

    public HwException(){

    }

    public HwException(int code){
        this.code = code;
    }

    public HwException(String message){
        super(message);
    }

    public HwException(int code, String message){
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
