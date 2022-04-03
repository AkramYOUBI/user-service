package com.aye.usersservice.domain;

import com.aye.usersservice.domain.support.BaseEntity;
import com.aye.usersservice.domain.support.CommonId;
import com.aye.usersservice.domain.support.Prefix;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@SuperBuilder
@Entity
public class User extends BaseEntity<CommonId> {
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private Double age;

    @PrePersist
    protected void onPrepersiste(){
        if(this.getId() == null){
            this.setId(new CommonId(Prefix.USER));
        }
        this.setCreated_at(new Date());
    }


}
