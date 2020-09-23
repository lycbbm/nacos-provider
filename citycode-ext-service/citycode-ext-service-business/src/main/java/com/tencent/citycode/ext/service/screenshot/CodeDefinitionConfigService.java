package com.tencent.citycode.ext.service.screenshot;

import com.tencent.citycode.ext.pojo.domain.CodeDefinitionConfigureDO;

/**
 * @description:
 * @author: bbm
 * @Date: 2020/9/22 10:10 下午
 */
public interface CodeDefinitionConfigService {
    /**
     * 根据configid 查询配置信息
     * @param configId 配置id
     * @return 配置信息
     */
    CodeDefinitionConfigureDO getByConfigId(String configId);
}
