package com.Final.May.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Final.May.model.Course;

@Transactional 
@Repository
public interface CourseRepository extends CrudRepository<Course, String>{

	
	@Modifying
	 @Query("UPDATE Course course SET course.nameCourse = :nameCourse WHERE course.courseID = :courseID")
	 void updatenameCourse(@Param("courseID") String courseID, @Param("nameCourse") String nameCourse);
	
	@Modifying
	 @Query("UPDATE Course course SET course.addedBy = :addedBy WHERE course.courseID = :courseID")
	 void updateaddedBy(@Param("courseID") String courseID, @Param("addedBy") String addedBy);
	
	@Modifying
	 @Query("UPDATE Course course SET course.nameInstittion = :nameInstittion WHERE course.courseID = :courseID")
	 void updatenameInstittion(@Param("courseID") String courseID, @Param("nameInstittion") String nameInstittion);
	
	@Modifying
	 @Query("UPDATE Course course SET course.courseAttch = :courseAttch WHERE course.courseID = :courseID")
	 void updatecourseAttch(@Param("courseID") String courseID, @Param("courseAttch") String courseAttch);

}
