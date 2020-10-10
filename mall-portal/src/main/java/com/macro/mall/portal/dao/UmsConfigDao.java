package com.macro.mall.portal.dao;

import com.macro.mall.portal.domain.UmsConfig;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 品牌配置信息列表(UmsConfig)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-10 21:43:43
 */
public interface UmsConfigDao {


    /**
     * 查询指定子域名的配置
     *
     * @param subDomain 子域名
     * @return 对象列表
     */
    List<UmsConfig> queryBySubDomain(@Param("subDomain") String subDomain);


}
