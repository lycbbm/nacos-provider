package com.tencent.citycode.ext.service.screenshot;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tencent.citycode.ext.pojo.dto.ScreenShotDTO;
import com.tencent.citycode.ext.pojo.domain.ScreenShotDO;
import com.tencent.gov.goff.common.core.bean.QueryParamDTO;
import com.tencent.gov.goff.common.core.bean.ServerResponse;

/**
 * ScreenShotService接口
 *
 * @author annabian
 */
public interface ScreenShotService {
    /**
     * 更新ScreenShot
     *
     * @param screenShotDTO ScreenShot信息
     * @return id
     */
    ServerResponse saveScreenShot(ScreenShotDTO screenShotDTO);
}
