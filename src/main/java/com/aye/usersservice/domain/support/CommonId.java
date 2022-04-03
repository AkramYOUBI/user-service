package com.aye.usersservice.domain.support;

import javax.persistence.Column;

public class CommonId implements EntityId<String>{
    @Column(name = "id")
    private String value;


}
