package com.tencent.citycode.ext.service.impl.screenshot;

import com.tencent.citycode.ext.Utils.SnowFlakeGenId;
import com.tencent.citycode.ext.dao.ScreenShotMapper;

import com.tencent.citycode.ext.enums.ScreenshotIsCheckEnum;
import com.tencent.citycode.ext.pojo.domain.CityCodeDO;
import com.tencent.citycode.ext.pojo.domain.CodeDefinitionConfigureDO;
import com.tencent.citycode.ext.pojo.domain.ScreenShotDO;
import com.tencent.citycode.ext.pojo.dto.ScreenShotDTO;
import com.tencent.citycode.ext.service.screenshot.CityCodeService;
import com.tencent.citycode.ext.service.screenshot.CodeDefinitionConfigService;
import com.tencent.citycode.ext.service.screenshot.ScreenShotService;
import com.tencent.gov.goff.common.core.bean.ServerResponse;
import com.tencent.gov.goff.common.db.util.BeanCopierUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
//import tk.mybatis.mapper.util.StringUtil;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * ScreenShotService实现类
 *
 * @author annabian
 */
@Service
public class ScreenShotServiceImpl implements ScreenShotService {

    /**
     * ScreenShot的DAO组件
     */
    @Resource
    private ScreenShotMapper screenShotMapper;

    /**
     * 码实例
     */
    @Resource
    private CityCodeService cityCodeService;
//
    /**
     * 码配置
     */
    @Resource
    private CodeDefinitionConfigService codeDefinitionConfigService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ServerResponse saveScreenShot(ScreenShotDTO screenShotDTO) {
        // 根据citycodeId查询码实例详情
        CityCodeDO cityCode = cityCodeService.getCityCode(screenShotDTO.getCityCodeId());

        // 根据configId 查询码配置信息
        CodeDefinitionConfigureDO codeDefinitionConfigure = Optional.ofNullable(cityCode)
                .map(s -> codeDefinitionConfigService.getByConfigId(s.getConfigId()))
                .orElse(null);

        // 未开启防截屏配置，不保存截屏数据
        if (!Optional.ofNullable(codeDefinitionConfigure)
                .filter(s -> ScreenshotIsCheckEnum.YES.getCode().equals(s.getIsScreenshot()))
                .isPresent()) {

            // 没有开启防截屏配置，不保存截屏数据
           return ServerResponse.success();
        }

        // 开启防截屏配置，保存截屏数据
        ScreenShotDO screenShotDO = BeanCopierUtil.copy(screenShotDTO, ScreenShotDO.class);
        screenShotDO.setAppid(cityCode.getAppId());
        screenShotDO.setCodeDefKey(cityCode.getDefInfoId());
        screenShotDO.setScreenShotId(new SnowFlakeGenId().genId());
        screenShotMapper.insert(screenShotDO);
        return ServerResponse.success();
    }

}
