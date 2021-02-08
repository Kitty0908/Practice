package com.wds.springVideo.dao;

import com.wds.springVideo.entity.Banner;

import java.util.List;
import java.util.Map;

public interface BannerDao {

    int insertBanner(Banner banner);

    List<Banner> findBannerByCondition(Map<String,Object> map);

    int updateBanner(Map<String,Object> map);
}
