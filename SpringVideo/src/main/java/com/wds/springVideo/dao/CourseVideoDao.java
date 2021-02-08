package com.wds.springVideo.dao;

import com.wds.springVideo.entity.CourseVideo;

import java.util.List;
import java.util.Map;

public interface CourseVideoDao {

    int insertCourseVideo(CourseVideo courseVideo);

    List<CourseVideo> findCourseVideoByCondition(Map<String,Object> map);

    int updateCourseVideo(Map<String,Object> map);
}
