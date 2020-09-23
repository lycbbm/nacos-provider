package com.tencent.citycode.ext.controller;

import com.tencent.citycode.ext.pojo.vo.ScreenShotVO;
import com.tencent.citycode.ext.pojo.dto.ScreenShotDTO;
import com.tencent.citycode.ext.service.screenshot.ScreenShotService;
import com.tencent.gov.goff.common.core.bean.ErrorCode;
import com.tencent.gov.goff.common.core.bean.ServerResponse;
import com.tencent.gov.goff.common.db.util.BeanCopierUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author annabian
 */
@RestController
@RequestMapping("/citycode/screenShot")
public class ScreenShotController {

    @Autowired
    private ScreenShotService screenShotService;

    @PostMapping("/v1/add")
    public ServerResponse saveOrUpdate(@RequestBody ScreenShotVO screenShotVO) {
        ScreenShotDTO screenShotDTO = BeanCopierUtil.copy(screenShotVO, ScreenShotDTO.class);
        return screenShotService.saveScreenShot(screenShotDTO);
    }


}