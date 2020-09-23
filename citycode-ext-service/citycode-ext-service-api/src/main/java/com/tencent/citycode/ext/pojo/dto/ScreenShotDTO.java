package com.tencent.citycode.ext.pojo.dto;

import java.io.Serializable;

/**
 * 截屏信息表 
 *
 * @author annabian
 */
public class ScreenShotDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;
    /**
     * 截屏业务id
     */
    private String screenShotId;
    /**
     * 码业务id
     */
    private String cityCodeId;
    /**
     * 码定义id
     */
    private String codeDefKey;
    /**
     * 截屏时间
     */
    private Long screenShotTime;
    /**
     * 应用id
     */
    private String appid;
    /**
     * 用户id
     */
    private String userId;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getScreenShotId() {
        return screenShotId;
    }
    public void setScreenShotId(String screenShotId) {
        this.screenShotId = screenShotId;
    }
    public String getCityCodeId() {
        return cityCodeId;
    }
    public void setCityCodeId(String cityCodeId) {
        this.cityCodeId = cityCodeId;
    }
    public String getCodeDefKey() {
        return codeDefKey;
    }
    public void setCodeDefKey(String codeDefKey) {
        this.codeDefKey = codeDefKey;
    }
    public Long getScreenShotTime() {
        return screenShotTime;
    }
    public void setScreenShotTime(Long screenShotTime) {
        this.screenShotTime = screenShotTime;
    }
    public String getAppid() {
        return appid;
    }
    public void setAppid(String appid) {
        this.appid = appid;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

}
