package com.tencent.citycode.ext.pojo.query;

import com.tencent.gov.goff.common.core.bean.QueryParamDTO;

/**
 * @author tianyzzhang
 */
public class ScreenShotQueryParam extends QueryParamDTO {

    private ScreenShotSortEnum sortBy;

    @Override
    public ScreenShotSortEnum getSortBy() {
        return sortBy;
    }

    public void setSortBy(ScreenShotSortEnum sortBy) {
        this.sortBy = sortBy;
    }

    private enum ScreenShotSortEnum {

        /**
         * 排序字段
         */
        id("id"),
        screenShotId("screenShotId"),
        cityCodeId("cityCodeId"),
        codeDefKey("codeDefKey"),
        screenShotTime("screenShotTime"),
        appid("appid"),
        userId("userId");

        private String code;

        ScreenShotSortEnum(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

    }
}
