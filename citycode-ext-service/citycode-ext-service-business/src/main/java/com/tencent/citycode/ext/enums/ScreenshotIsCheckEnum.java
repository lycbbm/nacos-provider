package com.tencent.citycode.ext.enums;

/**
 * <p>
 * 城市码验证开关 枚举类
 * </p>
 *
 * @author linhui
 * @since 2020/5/21 16:56
 */
public enum ScreenshotIsCheckEnum {
    YES(0, "开启"),
    NO(1, "关闭");

    private Integer code;
    private String desc;

    ScreenshotIsCheckEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
