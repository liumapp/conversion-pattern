package com.liumapp.pattern.conversion;

/**
 * @author liumapp
 * @file PagePattern.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/9/18
 */
public class PagePattern {

    /**
     * 1. oss
     * 2. sys
     */
    private String type;

    private String sysPdfPath;

    private String ossPdfPath;

    private String imgPath;

    public PagePattern() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSysPdfPath() {
        return sysPdfPath;
    }

    public void setSysPdfPath(String sysPdfPath) {
        this.sysPdfPath = sysPdfPath;
    }

    public String getOssPdfPath() {
        return ossPdfPath;
    }

    public void setOssPdfPath(String ossPdfPath) {
        this.ossPdfPath = ossPdfPath;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    @Override
    public String toString() {
        return "PagePattern{" +
                "type='" + type + '\'' +
                ", sysPdfPath='" + sysPdfPath + '\'' +
                ", ossPdfPath='" + ossPdfPath + '\'' +
                ", imgPath='" + imgPath + '\'' +
                '}';
    }
}
