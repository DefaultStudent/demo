package com.example.entity;

import java.io.Serializable;
import java.util.Objects;

public class Users implements Serializable {
    // 用户Id
    private String usersId;

    // 用户密码
    private String userPwd;

    public String getUsersId() {
        return usersId;
    }

    public void setUsersId(String usersId) {
        this.usersId = usersId;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(usersId, users.usersId) &&
                Objects.equals(userPwd, users.userPwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usersId, userPwd);
    }
}
