package com.tencent.citycode.ext.Utils;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

public abstract class BaseToString implements Serializable {
    @Override
    public String toString() {
        //通过反射获取所有类的当前字段
        return ReflectionToStringBuilder.toString(this, ToStringStyle.DEFAULT_STYLE);
    }
}