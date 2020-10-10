package com.macro.mall.portal.service;

import com.macro.mall.portal.domain.UmsConfig;

import java.util.List;

/**
 * 品牌配置信息列表(UmsConfig)表服务接口
 *
 * @author makejava
 * @since 2020-10-10 21:43:19
 */
public interface UmsConfigService {

    /**
     * 查询指定子域名的配置
     *
     * @param subDomain 子域名
     * @return 对象列表
     */
    List<UmsConfig> queryBySubDomain(String subDomain);



}
