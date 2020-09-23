package com.tencent.citycode.ext.dao;

import com.tencent.citycode.ext.pojo.domain.ScreenShotDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author annabian
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Rollback
public class ScreenShotMapperTest {

    /**
     * ScreenShot的DAO组件
     */
    @Resource
    private ScreenShotMapper screenShotMapper;

    /**
     * 测试用例：根据ID查询一个ScreenShot
     */
    @Test
    public void getScreenShotByIdTest() {

        ScreenShotDO screenShot = new ScreenShotDO();

        screenShotMapper.insert(screenShot);
        Long id = screenShot.getId();

        ScreenShotDO result = screenShotMapper.selectById(id);
        // Assert.assertEquals(screenShot.toString(), result.toString());
        Assert.assertEquals(screenShot.getId(), result.getId());
    }

}
