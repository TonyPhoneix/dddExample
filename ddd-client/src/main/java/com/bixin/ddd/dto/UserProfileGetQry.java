package com.bixin.ddd.dto;

import lombok.Data;

@Data
public class UserProfileGetQry extends CommonCommand {
    private String userId;
    private String id;

    public UserProfileGetQry(){

    }

}