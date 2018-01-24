package com.sdey.api.vo;

import com.sdey.api.util.LdgDateUtil;

import java.text.ParseException;
import java.util.Date;

public class SearchInfo {
    private String username;
    private String phone;
    private Date start;
    private Date end;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        if(end!=null){
            try {
                this.end= LdgDateUtil.get235959Time(end);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return;
        }
        this.end = end;
    }

    @Override
    public String toString() {
        return "SearchInfo{" +
                "username='" + username + '\'' +
                ", phone='" + phone + '\'' +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
