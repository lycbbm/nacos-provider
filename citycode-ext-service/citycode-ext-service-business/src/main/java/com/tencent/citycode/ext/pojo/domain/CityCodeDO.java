package com.tencent.citycode.ext.pojo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @description:
 * @author: bbm
 * @Date: 2020/9/23 10:05 上午
 */
@TableName("t_city_code")
@ApiModel("城市码")
public class CityCodeDO {
    @TableId(type = IdType.AUTO)
    @ApiModelProperty("主键id")
    private Long id;

    @TableField("created_by")
    @ApiModelProperty("创建人")
    private String createdBy;

    @TableField("created_time")
    @ApiModelProperty("创建时间")
    private Long createdTime;

    @TableField("disabled")
    @ApiModelProperty("是否删除")
    private Integer disabled;

    @TableField("update_by")
    @ApiModelProperty("更新人")
    private String updateBy;

    @TableField("update_time")
    @ApiModelProperty("更新时间")
    private Long updateTime;

    @TableField("city_code_id")
    @ApiModelProperty("业务主键")
    private String cityCodeId;

    @TableField("code_key")
    @ApiModelProperty("码关键信息唯一标识")
    private String codeKey;

    @TableField("app_id")
    @ApiModelProperty("应用id")
    private String appId;

    @TableField("def_info_id")
    @ApiModelProperty("码定义业务id")
    private String defInfoId;

    @TableField("config_id")
    @ApiModelProperty("码版本业务id")
    private String configId;

    @TableField("code_version")
    @ApiModelProperty("码版本号")
    private Integer codeVersion;

    @TableField("code_style")
    @ApiModelProperty("码形态 二维码/葵花码/条形码/数字码")
    private Integer codeStyle;

    @TableField("code_type")
    @ApiModelProperty("码类型 人/物/事码")
    private Integer codeType;

    @TableField("code_fun")
    @ApiModelProperty("码功能 动态码/静态码")
    private Integer codeFun;

    @TableField("logo_url")
    @ApiModelProperty("logo图 码中间的Logo图地址")
    private String logoUrl;

    @TableField("logo_width")
    @ApiModelProperty("logo宽度")
    private String logoWidth;

    @TableField("logo_height")
    @ApiModelProperty("logo高度")
    private String logoHeight;

    @TableField("label_content")
    @ApiModelProperty("label内容")
    private String labelContent;

    @TableField("label_font_size")
    @ApiModelProperty("label字体大小")
    private Integer labelFontSize;

    @TableField("label_font_type")
    @ApiModelProperty("label字体类型 枚举字体类型")
    private Integer labelFontType;

    @TableField("label_font_color")
    @ApiModelProperty("label字体颜色")
    private String labelFontColor;

    @TableField( "bg_url")
    @ApiModelProperty("背景图 码的背景图地址")
    private String bgUrl;

    @TableField("a_algorithm")
    @ApiModelProperty("A段身份加密算法 A段身份加密算法枚举")
    private Integer aAlgorithm;

    @TableField("b_algorithm")
    @ApiModelProperty("B段加密算法 B段省份加密算法")
    private Integer bAlgorithm;

    @TableField("code_content")
    @ApiModelProperty("码内容 码内的文本内容")
    private String codeContent;

    @TableField("check_num_max")
    @ApiModelProperty("可验次数 码可以验证的次数")
    private Integer checkNumMax;

    @TableField("check_num")
    @ApiModelProperty("已验次数 码已经被验证的次数")
    private Integer checkNum;

    @TableField( "business_extend_val")
    @ApiModelProperty("业务扩展值")
    private String businessExtendVal;

    @TableField("lng")
    @ApiModelProperty("经度")
    private String lng;

    @TableField("lat")
    @ApiModelProperty("纬度")
    private String lat;

    @TableField( "refresh_interval")
    @ApiModelProperty("定时刷新间隔")
    private Integer refreshInterval;

    @TableField("is_refresh")
    @ApiModelProperty("定时刷新开关")
    private Integer isRefresh;

    @TableField( "check_num_enable")
    @ApiModelProperty("可验次数开关")
    private Integer checkNumEnable;

    @TableField("gather_field")
    @ApiModelProperty("采集字段")
    private String gatherField;

    @TableField("fixed")
    @ApiModelProperty("固定标识")
    private String fixed;

    @TableField("channel_no")
    @ApiModelProperty("应用id")
    private String channelNo;

    @TableField("biz_id")
    @ApiModelProperty("业务id")
    private String bizId;

    @TableField("user_id")
    @ApiModelProperty("用户id")
    private String userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getCityCodeId() {
        return cityCodeId;
    }

    public void setCityCodeId(String cityCodeId) {
        this.cityCodeId = cityCodeId;
    }

    public String getCodeKey() {
        return codeKey;
    }

    public void setCodeKey(String codeKey) {
        this.codeKey = codeKey;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getDefInfoId() {
        return defInfoId;
    }

    public void setDefInfoId(String defInfoId) {
        this.defInfoId = defInfoId;
    }

    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    public Integer getCodeVersion() {
        return codeVersion;
    }

    public void setCodeVersion(Integer codeVersion) {
        this.codeVersion = codeVersion;
    }

    public Integer getCodeStyle() {
        return codeStyle;
    }

    public void setCodeStyle(Integer codeStyle) {
        this.codeStyle = codeStyle;
    }

    public Integer getCodeType() {
        return codeType;
    }

    public void setCodeType(Integer codeType) {
        this.codeType = codeType;
    }

    public Integer getCodeFun() {
        return codeFun;
    }

    public void setCodeFun(Integer codeFun) {
        this.codeFun = codeFun;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getLogoWidth() {
        return logoWidth;
    }

    public void setLogoWidth(String logoWidth) {
        this.logoWidth = logoWidth;
    }

    public String getLogoHeight() {
        return logoHeight;
    }

    public void setLogoHeight(String logoHeight) {
        this.logoHeight = logoHeight;
    }

    public String getLabelContent() {
        return labelContent;
    }

    public void setLabelContent(String labelContent) {
        this.labelContent = labelContent;
    }

    public Integer getLabelFontSize() {
        return labelFontSize;
    }

    public void setLabelFontSize(Integer labelFontSize) {
        this.labelFontSize = labelFontSize;
    }

    public Integer getLabelFontType() {
        return labelFontType;
    }

    public void setLabelFontType(Integer labelFontType) {
        this.labelFontType = labelFontType;
    }

    public String getLabelFontColor() {
        return labelFontColor;
    }

    public void setLabelFontColor(String labelFontColor) {
        this.labelFontColor = labelFontColor;
    }

    public String getBgUrl() {
        return bgUrl;
    }

    public void setBgUrl(String bgUrl) {
        this.bgUrl = bgUrl;
    }

    public Integer getaAlgorithm() {
        return aAlgorithm;
    }

    public void setaAlgorithm(Integer aAlgorithm) {
        this.aAlgorithm = aAlgorithm;
    }

    public Integer getbAlgorithm() {
        return bAlgorithm;
    }

    public void setbAlgorithm(Integer bAlgorithm) {
        this.bAlgorithm = bAlgorithm;
    }

    public String getCodeContent() {
        return codeContent;
    }

    public void setCodeContent(String codeContent) {
        this.codeContent = codeContent;
    }

    public Integer getCheckNumMax() {
        return checkNumMax;
    }

    public void setCheckNumMax(Integer checkNumMax) {
        this.checkNumMax = checkNumMax;
    }

    public Integer getCheckNum() {
        return checkNum;
    }

    public void setCheckNum(Integer checkNum) {
        this.checkNum = checkNum;
    }

    public String getBusinessExtendVal() {
        return businessExtendVal;
    }

    public void setBusinessExtendVal(String businessExtendVal) {
        this.businessExtendVal = businessExtendVal;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public Integer getRefreshInterval() {
        return refreshInterval;
    }

    public void setRefreshInterval(Integer refreshInterval) {
        this.refreshInterval = refreshInterval;
    }

    public Integer getCheckNumEnable() {
        return checkNumEnable;
    }

    public void setCheckNumEnable(Integer checkNumEnable) {
        this.checkNumEnable = checkNumEnable;
    }

    public Integer getIsRefresh() {
        return isRefresh;
    }

    public void setIsRefresh(Integer isRefresh) {
        this.isRefresh = isRefresh;
    }

    public String getGatherField() {
        return gatherField;
    }

    public void setGatherField(String gatherField) {
        this.gatherField = gatherField;
    }

    public String getFixed() {
        return fixed;
    }

    public void setFixed(String fixed) {
        this.fixed = fixed;
    }

    public String getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
