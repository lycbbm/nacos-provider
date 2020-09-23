package com.tencent.citycode.ext.service.screenshot;

import com.tencent.citycode.ext.pojo.domain.CityCodeDO;

/**
 * @description:
 * @author: bbm
 * @Date: 2020/9/22 5:15 下午
 */
public interface CityCodeService {
    /**
     * 根据cityCodeId 查询码定义Id、appid、configId
     * @param cityCodeId 码业务id
     * @return 码实例信息
     */
     CityCodeDO getCityCode(String cityCodeId);
}
