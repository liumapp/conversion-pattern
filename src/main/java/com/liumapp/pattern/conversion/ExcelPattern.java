package com.liumapp.pattern.conversion;

import java.io.Serializable;

/**
 * @author liumapp
 * @file ExcelPattern.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/9/18
 */
public class ExcelPattern implements Serializable {

    /**
     * 1. oss
     * 2. sys
     */
    private String type;

    private String ossPath;

    private String sysPath;

    private String pdfPath;

    public ExcelPattern() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOssPath() {
        return ossPath;
    }

    public void setOssPath(String ossPath) {
        this.ossPath = ossPath;
    }

    public String getSysPath() {
        return sysPath;
    }

    public void setSysPath(String sysPath) {
        this.sysPath = sysPath;
    }

    public String getPdfPath() {
        return pdfPath;
    }

    public void setPdfPath(String pdfPath) {
        this.pdfPath = pdfPath;
    }

    @Override
    public String toString() {
        return "ExcelPattern{" +
                "type='" + type + '\'' +
                ", ossPath='" + ossPath + '\'' +
                ", sysPath='" + sysPath + '\'' +
                ", pdfPath='" + pdfPath + '\'' +
                '}';
    }
}
