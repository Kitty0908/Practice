package com.wds.springVideo.dao;

import com.wds.springVideo.entity.ToolsType;

import java.util.List;
import java.util.Map;

public interface ToolsTypeDao {

    int insertToolsType(ToolsType toolsType);

    List<ToolsType> findToolsTypeByCondition(Map<String,Object> map);

    int updateToolsType(Map<String,Object> map);

}
