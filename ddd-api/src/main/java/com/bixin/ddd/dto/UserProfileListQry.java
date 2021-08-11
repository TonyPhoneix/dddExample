package com.bixin.ddd.dto;

import lombok.Data;

@Data
public class UserProfileListQry extends CommonCommand {
    private String dep;
}
