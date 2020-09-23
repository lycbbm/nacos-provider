package com.tencent.citycode.ext.service;

import com.tencent.citycode.ext.dao.ScreenShotMapper;
import com.tencent.citycode.ext.pojo.domain.ScreenShotDO;
import com.tencent.citycode.ext.pojo.dto.ScreenShotDTO;
import com.tencent.citycode.ext.service.screenshot.ScreenShotService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.mockito.Mockito.when;

/**
 * @author annabian
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ScreenShotServiceImplTest {

    /**
     * ScreenShot的service组件
     */
    @Resource
    private ScreenShotService screenShotService;

    /**
     * Mock对象
     */
    @MockBean
    private ScreenShotMapper screenShotMapper;


    /**
     * 测试用例：根据ID查询一个ScreenShot
     */
    @Test
    public void getScreenShotByIdTest() {
        Long id = 1L;

        ScreenShotDO screenShot = new ScreenShotDO();
        screenShot.setId(id);

        when(screenShotMapper.selectById(id)).thenReturn(screenShot);
        ScreenShotDTO result = screenShotService.getScreenShotById(id);

        Assert.assertEquals(screenShot.getId(), result.getId());
    }

}
