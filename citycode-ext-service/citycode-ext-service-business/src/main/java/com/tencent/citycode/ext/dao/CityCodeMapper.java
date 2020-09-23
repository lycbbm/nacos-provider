package com.tencent.citycode.ext.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tencent.citycode.ext.pojo.domain.CityCodeDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 城市码 dao层
 * </p>
 *
 * @author linhui
 * @since 2020/5/21 13:34
 */
@Mapper
public interface CityCodeMapper extends BaseMapper<CityCodeDO> {
}