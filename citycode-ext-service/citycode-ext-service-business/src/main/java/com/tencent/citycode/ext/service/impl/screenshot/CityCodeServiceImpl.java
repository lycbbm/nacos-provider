package com.tencent.citycode.ext.service.impl.screenshot;

import com.tencent.citycode.ext.dao.CityCodeMapper;
import com.tencent.citycode.ext.pojo.domain.CityCodeDO;
import com.tencent.citycode.ext.service.screenshot.CityCodeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: bbm
 * @Date: 2020/9/22 5:15 下午
 */
@Service
public class CityCodeServiceImpl implements CityCodeService {
    @Resource
    private CityCodeMapper cityCodeMapper;

    @Override
    public CityCodeDO getCityCode(String cityCodeId) {
        Map<String, Object> columnMap = new HashMap<>();
        columnMap.put("city_code_id", cityCodeId);

        List<CityCodeDO> cityCodeDOList = cityCodeMapper.selectByMap(columnMap);

        if(cityCodeDOList.size() > 0){
            return cityCodeDOList.get(0);
        }
        return null;
    }
}
