package com.macro.mall.portal.service.impl;

import com.macro.mall.portal.domain.UmsConfig;
import com.macro.mall.portal.dao.UmsConfigDao;
import com.macro.mall.portal.service.UmsConfigService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 品牌配置信息列表(UmsConfig)表服务实现类
 *
 * @author makejava
 * @since 2020-10-10 21:43:21
 */
@Service("umsConfigService")
public class UmsConfigServiceImpl implements UmsConfigService {
    @Resource
    private UmsConfigDao umsConfigDao;


    /**
     * 查询指定子域名的配置
     *
     * @param subDomain 子域名
     * @return 对象列表
     */
    @Override
    public List<UmsConfig> queryBySubDomain(String subDomain) {
        return this.umsConfigDao.queryBySubDomain(subDomain);
    }


}
