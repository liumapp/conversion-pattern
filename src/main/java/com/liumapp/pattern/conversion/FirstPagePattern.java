package com.liumapp.pattern.conversion;

/**
 * @author liumapp
 * @file FirstPagePattern.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/9/18
 */
public class FirstPagePattern {

    /**
     * 1. oss
     * 2. sys
     */
    private String type;

    private String ossPath;

    private String sysPath;

    private String msg;

    private boolean result;

    public FirstPagePattern() {
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

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "FirstPagePattern{" +
                "type='" + type + '\'' +
                ", ossPath='" + ossPath + '\'' +
                ", sysPath='" + sysPath + '\'' +
                ", msg='" + msg + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
