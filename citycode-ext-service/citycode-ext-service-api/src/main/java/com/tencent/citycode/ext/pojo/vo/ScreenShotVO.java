package com.tencent.citycode.ext.pojo.vo;

import java.io.Serializable;

/**
 * 截屏信息表 
 *
 * @author annabian
 */
public class ScreenShotVO implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 码业务id
     */
    private String cityCodeId;

    /**
     * 截屏时间
     */
    private Long screenShotTime;

    /**
     * 用户id
     */
    private String userId;

    public String getCityCodeId() {
        return cityCodeId;
    }
    public void setCityCodeId(String cityCodeId) {
        this.cityCodeId = cityCodeId;
    }
    public Long getScreenShotTime() {
        return screenShotTime;
    }
    public void setScreenShotTime(Long screenShotTime) {
        this.screenShotTime = screenShotTime;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
}
