package com.liumapp.pattern.conversion;

import java.io.Serializable;

/**
 * @author liumapp
 * @file DocPattern.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/9/18
 */
public class DocPattern implements Serializable {

    private String ossPath;

    private String sysPath;

    private String pdfPath;

    public DocPattern() {
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
        return "DocPattern{" +
                "ossPath='" + ossPath + '\'' +
                ", sysPath='" + sysPath + '\'' +
                ", pdfPath='" + pdfPath + '\'' +
                '}';
    }
}
