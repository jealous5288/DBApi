package com.jq.dbapi.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jq.dbapi.domain.ApiConfig;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ApiConfigMapper extends BaseMapper<ApiConfig> {
}
