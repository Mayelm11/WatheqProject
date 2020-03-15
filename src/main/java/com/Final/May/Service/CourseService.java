package com.Final.May.Service;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.Final.May.DTO.CouDTO;
import com.Final.May.ExceptionHandler.NotFoundException;
import com.Final.May.ModelMapper.CourseMapperImp;
import com.Final.May.model.Course;
import com.Final.May.repository.CourseRepository;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service
public class CourseService {
	private CourseRepository courseRepository;
	private static final CourseMapperImp CouMapper = new CourseMapperImp();
	public CouDTO createCourseDTO(CouDTO CourseDTO) {

		Course course = Course.builder()

				.courseID(CourseDTO.getCourseID())
				.nameCourse(CourseDTO.getNameCourse())
				.addedBy(CourseDTO.getAddedBy())
				.startDate(CourseDTO.getStartDate())
				.endDate(CourseDTO.getEndDate())
				.nameInstittion(CourseDTO.getNameInstittion())
				.courseAttch(CourseDTO.getCourseAttch())




				.build();
		Course saveCourse = courseRepository.save(course);
		return CouMapper.domainToDto(saveCourse);

	}
	public void deleteCourse (String CourseID) {
		try {
			Course course=courseRepository.findById(CourseID).get();
			courseRepository.delete(course);
		}catch (NoSuchElementException ex) {
			throw new NotFoundException(String.format("No Record with the nationalID [%s] was found in our database", CourseID));
		}
	}



}


