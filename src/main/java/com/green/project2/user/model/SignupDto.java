package com.green.project2.user.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class SignupDto {
    private int iaddr;
    private String restAddr;
    private String uid;
    private String upw;
    private String nick;
    private String pic;
    private String phone;
    private String email;

    @JsonIgnore
    private int x;
    @JsonIgnore
    private int y;
}
