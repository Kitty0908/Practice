package com.wds.springVideo.dao;

import com.wds.springVideo.entity.CourseType;

import java.util.List;
import java.util.Map;

public interface CourseTypeDao {

    int insertCourseType(CourseType courseType);

    List<CourseType> findCourseTypeByCondition(Map<String,Object> map);

    int updateCourseType(Map<String,Object> map);

}
