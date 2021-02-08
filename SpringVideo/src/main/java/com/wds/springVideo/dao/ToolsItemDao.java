package com.wds.springVideo.dao;

import com.wds.springVideo.entity.ToolsItem;

import java.util.List;
import java.util.Map;

public interface ToolsItemDao {

    int insertToolsItem(ToolsItem toolsItem);

    List<ToolsItem> findToolsItemByCondition(Map<String,Object> map);

    int updateToolsItem(Map<String,Object> map);
}
