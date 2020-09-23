package com.tencent.citycode.ext.pojo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;

/**
 * @description:
 * @author: bbm
 * @Date: 2020/9/23 10:07 上午
 */
@TableName("t_code_definition_configure")
@ApiModel("码定义功能配置信息")
public class CodeDefinitionConfigureDO {
    @TableId(type = IdType.AUTO)
    @ApiModelProperty("主键id")
    private Long id;

    @TableField("config_id")
    @ApiModelProperty("业务主键")
    private String configId;

    @TableField("def_info_id")
    @ApiModelProperty("所属码定义")
    private String defInfoId;

    @TableField("code_version")
    @ApiModelProperty("版本号")
    private Integer codeVersion;

    @TableField("status")
    @ApiModelProperty("当前状态")
    private Integer status;

    @TableField("appearance")
    @ApiModelProperty("二维码外观，0样式一，1样式二，2样式三，3样式四")
    private Integer appearance;


    @TableField("logo_height")
    @ApiModelProperty("logo高度")
    private Integer logoHeight;


    @TableField("logo_width")
    @ApiModelProperty("logo宽度")
    private Integer logoWidth;


    @TableField("logo_type")
    @ApiModelProperty("Logo类型，0自定义，1默认一，2默认二，3默认三，4默认四")
    private Integer logoType;


    @TableField("logo_url")
    @ApiModelProperty("logo地址")
    private String logoUrl;


    @TableField("lable_content")
    @ApiModelProperty("lable内容")
    @Size(max = 10, message = "内容不能超过10个字符！")
    private String lableContent;


    @TableField("lable_font_type")
    @ApiModelProperty("lable字体类型")
    private Integer lableFontType;


    @TableField("lable_font_size")
    @ApiModelProperty("lable字体大小")
    private Integer lableFontSize;


    @TableField("lable_font_color")
    @ApiModelProperty("lable字体颜色")
    private String lableFontColor;


    @TableField("is_refresh")
    @ApiModelProperty("二维码定期刷新")
    private Integer isRefresh;


    @TableField("refresh_interval")
    @ApiModelProperty("定时刷新间隔")
    private Integer refreshInterval;


    @TableField("is_check")
    @ApiModelProperty("是否二维码可验")
    private Integer isCheck;


    @TableField("check_num_max")
    @ApiModelProperty("二维码可验次数")
    private Integer checkNumMax;


    @TableField("is_cache")
    @ApiModelProperty("是否缓存二维码")
    private Integer isCache;


    @TableField("cache_number")
    @ApiModelProperty("缓存二维码个数")
    private Integer cacheNumber;


    @TableField("is_screenshot")
    @ApiModelProperty("是否限制二维码截屏次数")
    private Integer isScreenshot;

    @TableField("screenshot_num")
    @ApiModelProperty("截屏次数")
    private Integer screenshotNumber;


    @TableField("algorithm")
    @ApiModelProperty("加密算法")
    private Integer algorithm;


    @TableField("created_by")
    @ApiModelProperty("创建人")
    private String createdBy;


    @TableField("created_by_name")
    @ApiModelProperty("创建人姓名")
    private String createdByName;


    @TableField("created_time")
    @ApiModelProperty("创建时间")
    private Long createdTime;


    @TableField("updated_by")
    @ApiModelProperty("更新人")
    private String updatedBy;


    @TableField( "updated_time")
    @ApiModelProperty("更新时间")
    private Long updatedTime;


    @TableField("disabled")
    @ApiModelProperty("是否删除")
    private Integer disabled;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    public String getDefInfoId() {
        return defInfoId;
    }

    public void setDefInfoId(String defInfoId) {
        this.defInfoId = defInfoId;
    }

    public Integer getCodeVersion() {
        return codeVersion;
    }

    public void setCodeVersion(Integer codeVersion) {
        this.codeVersion = codeVersion;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLogoHeight() {
        return logoHeight;
    }

    public void setLogoHeight(Integer logoHeight) {
        this.logoHeight = logoHeight;
    }

    public Integer getLogoWidth() {
        return logoWidth;
    }

    public void setLogoWidth(Integer logoWidth) {
        this.logoWidth = logoWidth;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getLableContent() {
        return lableContent;
    }

    public void setLableContent(String lableContent) {
        this.lableContent = lableContent;
    }

    public Integer getLableFontType() {
        return lableFontType;
    }

    public void setLableFontType(Integer lableFontType) {
        this.lableFontType = lableFontType;
    }

    public Integer getLableFontSize() {
        return lableFontSize;
    }

    public void setLableFontSize(Integer lableFontSize) {
        this.lableFontSize = lableFontSize;
    }

    public String getLableFontColor() {
        return lableFontColor;
    }

    public void setLableFontColor(String lableFontColor) {
        this.lableFontColor = lableFontColor;
    }

    public Integer getIsRefresh() {
        return isRefresh;
    }

    public void setIsRefresh(Integer isRefresh) {
        this.isRefresh = isRefresh;
    }

    public Integer getRefreshInterval() {
        return refreshInterval;
    }

    public void setRefreshInterval(Integer refreshInterval) {
        this.refreshInterval = refreshInterval;
    }

    public Integer getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(Integer isCheck) {
        this.isCheck = isCheck;
    }

    public Integer getCheckNumMax() {
        return checkNumMax;
    }

    public void setCheckNumMax(Integer checkNumMax) {
        this.checkNumMax = checkNumMax;
    }

    public Integer getIsCache() {
        return isCache;
    }

    public void setIsCache(Integer isCache) {
        this.isCache = isCache;
    }

    public Integer getCacheNumber() {
        return cacheNumber;
    }

    public void setCacheNumber(Integer cacheNumber) {
        this.cacheNumber = cacheNumber;
    }

    public Integer getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(Integer algorithm) {
        this.algorithm = algorithm;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedByName() {
        return createdByName;
    }

    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName;
    }

    public Long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Long getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }

    public Integer getAppearance() {
        return appearance;
    }

    public void setAppearance(Integer appearance) {
        this.appearance = appearance;
    }

    public Integer getLogoType() {
        return logoType;
    }

    public void setLogoType(Integer logoType) {
        this.logoType = logoType;
    }

    public Integer getIsScreenshot() {
        return isScreenshot;
    }

    public void setIsScreenshot(Integer isScreenshot) {
        this.isScreenshot = isScreenshot;
    }

    public Integer getScreenshotNumber() {
        return screenshotNumber;
    }

    public void setScreenshotNumber(Integer screenshotNumber) {
        this.screenshotNumber = screenshotNumber;
    }
}
