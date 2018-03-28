package com.zwh.springbootps.pojo;

public class TbImg {
    private Integer imgid;

    private String imgpic;

    private String imgcate;

    private String imgtitle;

    public Integer getImgid() {
        return imgid;
    }

    public void setImgid(Integer imgid) {
        this.imgid = imgid;
    }

    public String getImgpic() {
        return imgpic;
    }

    public void setImgpic(String imgpic) {
        this.imgpic = imgpic == null ? null : imgpic.trim();
    }

    public String getImgcate() {
        return imgcate;
    }

    public void setImgcate(String imgcate) {
        this.imgcate = imgcate == null ? null : imgcate.trim();
    }

    public String getImgtitle() {
        return imgtitle;
    }

    public void setImgtitle(String imgtitle) {
        this.imgtitle = imgtitle == null ? null : imgtitle.trim();
    }
}