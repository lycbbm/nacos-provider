package com.tencent.citycode.ext.service.impl.screenshot;

import com.tencent.citycode.ext.dao.CodeDefinitionConfigureMapper;
import com.tencent.citycode.ext.pojo.domain.CodeDefinitionConfigureDO;
import com.tencent.citycode.ext.service.screenshot.CodeDefinitionConfigService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: bbm
 * @Date: 2020/9/22 10:11 下午
 */
@Service
public class CodeDefinitionConfigServiceImpl implements CodeDefinitionConfigService {
    @Resource
    private CodeDefinitionConfigureMapper codeDefinitionConfigureMapper;

    @Override
    public CodeDefinitionConfigureDO getByConfigId(String configId) {
        Map<String, Object> columnMap = new HashMap<>();
        columnMap.put("config_id", configId);

        List<CodeDefinitionConfigureDO> codeConfigureS = codeDefinitionConfigureMapper.selectByMap(columnMap);
        if (codeConfigureS.size() > 0) {
            return codeConfigureS.get(0);
        }
        return null;
    }
}
