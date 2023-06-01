package com.squad.seoulculture.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Result {
    @JsonProperty("CODE")
    private String code;
    @JsonProperty("MESSAGE")
    private String message;

    public Result(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(){

    }

    public String getCODE() {
        return code;
    }

    public void setCODE(String code) {
        this.code = code;
    }

    public String getMESSAGE() {
        return message;
    }

    public void setMESSAGE(String message) {
        this.message = message;
    }

    // 생성자, getter, setter 생략
}
