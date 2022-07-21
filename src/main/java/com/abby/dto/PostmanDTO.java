package com.abby.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class PostmanDTO implements Serializable {
    private String user;
    private String msg;
    private LocalDateTime date;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "MsgDTO{" +
                "user='" + user + '\'' +
                ", msg='" + msg + '\'' +
                ", date=" + date +
                '}';
    }
}
