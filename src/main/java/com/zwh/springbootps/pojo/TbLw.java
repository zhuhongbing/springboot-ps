package com.zwh.springbootps.pojo;

public class TbLw {
    private Integer lid;

    private String lword;

    private Integer uid;

    private String userpic;

    private String username;

    public String getUserpic() {
        return userpic;
    }

    public void setUserpic(String userpic) {
        this.userpic = userpic;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String userame) {
        this.username = username;
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getLword() {
        return lword;
    }

    public void setLword(String lword) {
        this.lword = lword == null ? null : lword.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}