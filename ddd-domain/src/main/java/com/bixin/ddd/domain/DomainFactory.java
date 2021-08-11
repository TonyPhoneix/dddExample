package com.bixin.ddd.domain;

import com.bixin.ddd.domain.user.UserProfile;

public class DomainFactory {

    public static UserProfile getUserProfile() {
        return new UserProfile();
    }

}
