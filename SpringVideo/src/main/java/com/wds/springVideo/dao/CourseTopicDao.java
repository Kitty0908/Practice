package com.wds.springVideo.dao;

import com.wds.springVideo.entity.CourseTopic;

import java.util.List;
import java.util.Map;

public interface CourseTopicDao {

    int insertCourseTopic(CourseTopic courseTopic);

    List<CourseTopic> findCourseTopicByCondition(Map<String,Object> map);

    int updateCourseTopic(Map<String,Object> map);
}
