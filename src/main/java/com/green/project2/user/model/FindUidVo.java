package com.green.project2.user.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
public class FindUidVo {
    private String uid;

    @JsonIgnore
    private int iuser;
}
