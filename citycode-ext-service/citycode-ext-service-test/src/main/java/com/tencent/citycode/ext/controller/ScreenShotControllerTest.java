package com.tencent.citycode.ext.controller;

import com.tencent.citycode.ext.pojo.dto.ScreenShotDTO;
import com.tencent.citycode.ext.service.screenshot.ScreenShotService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.annotation.Resource;

import static org.mockito.Mockito.when;

/**
 * ScreenShotController的单元测试类
 *
 * @author annabian
 */
@RunWith(SpringRunner.class)
@WebMvcTest(ScreenShotController.class)
public class ScreenShotControllerTest {

    /**
     * 注入一个MockMvc，模拟对controller发起http请求
     */
    @Resource
    private MockMvc mockMvc;

    /**
     * 模拟ScreenShotService组件
     */
    @MockBean
    private ScreenShotService screenShotService;


    /**
     * 测试用例：根据ID查询一个ScreenShot
     */
    @Test
    public void getTest() throws Exception {

        Long id = 1L;

        ScreenShotDTO screenShot = new ScreenShotDTO();

        when(screenShotService.getScreenShotById(id)).thenReturn(screenShot);

        mockMvc.perform(MockMvcRequestBuilders.get("/screenShot/v1/get/{id}", id))
                .andExpect(MockMvcResultMatchers.status().is(200))
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(MockMvcResultMatchers.jsonPath("$.errcode").value("0"));
    }

}
