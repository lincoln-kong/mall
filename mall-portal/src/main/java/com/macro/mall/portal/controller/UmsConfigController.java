package com.macro.mall.portal.controller;


import com.macro.mall.common.api.CommonResult;
import com.macro.mall.portal.domain.HomeContentResult;
import com.macro.mall.portal.service.HomeService;
import com.macro.mall.portal.service.UmsConfigService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * 品牌配置信息列表(UmsConfig)表控制层
 *
 * @author makejava
 * @since 2020-10-10 21:20:59
 */
@Controller
@Api(tags = "UmsConfigController", description = "品牌域名配置")
@RequestMapping("/config")
public class UmsConfigController {
    /**
     * 服务对象
     */
    @Autowired
    private UmsConfigService umsConfigService;
    @Autowired
    private HomeService homeService;

    @ApiOperation("查询系统配置")
    @RequestMapping(value = "/systemConfig", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<HomeContentResult> systemConfig(@RequestParam String subDomain) {
//        if (subDomain == null) {
//            return CommonResult.validateFailed("请检查二级域名配置");
//        }
//        Map<String, String> tokenMap = new HashMap<>();
//        tokenMap.put("token", token);
//        tokenMap.put("tokenHead", tokenHead);
//        return CommonResult.success(tokenMap);
        HomeContentResult contentResult = homeService.content();
        return CommonResult.success(contentResult);
    }

}
