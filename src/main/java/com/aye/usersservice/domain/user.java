package com.aye.usersservice.domain;

import com.aye.usersservice.domain.support.BaseEntity;
import com.aye.usersservice.domain.support.CommonId;

import javax.persistence.Entity;
import javax.persistence.PrePersist;

@Entity
public class user extends BaseEntity<CommonId> {
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private Double age;

    @PrePersist
    protected void onPrepersiste(){
        if()
    }


}
