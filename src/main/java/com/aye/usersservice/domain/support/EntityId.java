package com.aye.usersservice.domain.support;


import java.io.Serializable;

public interface EntityId <T> extends Serializable {
    T getValue();
}
