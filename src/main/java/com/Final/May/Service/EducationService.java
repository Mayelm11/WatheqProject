package com.Final.May.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Final.May.DTO.EduDTO;
import com.Final.May.ExceptionHandler.NotFoundException;
import com.Final.May.ModelMapper.EducationMapperImp;
import com.Final.May.model.Company;
import com.Final.May.model.Education;
import com.Final.May.repository.EduRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor


public class EducationService {
@Autowired
static
	 EduRepository educationRepository;

	private static final EducationMapperImp educationMapperImp = new EducationMapperImp();


	public static EduDTO createEducationDTO(EduDTO educationDTO) {

		Education education = Education.builder()
				.email(educationDTO.getEmail())              
				.phone_number(educationDTO.getPhoneNumber())              
				.address(educationDTO.getAddress())
				.password(educationDTO.getPassword())
				.edu_iD(educationDTO.getEdu_iD())
				.eDU_NAME(educationDTO.getEDU_NAME())

				.build();

		Education saveEducation = educationRepository.save(education);  
		return educationMapperImp.domainToDto(saveEducation);

	}

	public static  ResponseEntity<List< Education>> getEducation(){
        List< Education> com = new ArrayList< Education>();
        educationRepository.findAll().forEach(com::add);
         return new ResponseEntity<>(com , HttpStatus.OK);
 }

	public void deleteEducation (String Edu_iD) {
		try {
			Education education=educationRepository.findById(Edu_iD).get();
			educationRepository.delete(education);
		}
		catch (NoSuchElementException ex) {
			throw new NotFoundException(String.format("No Record with the nationalID [%s] was found in our database", Edu_iD));
		}
	}
	
	public EduDTO updatepassword(String Edu_iD, String password){
		try { 
			educationRepository.updatePassword(Edu_iD, password);
			return educationRepository.findById(Edu_iD)
					.map(educationMapperImp::domainToDto).get(); 
		}catch (NoSuchElementException ex)
		{
			throw new NotFoundException(String.format("No Record with the eduid [%s] was found in our database", Edu_iD ));
		}
	}

	public EduDTO updatePhoneNumber(String Edu_iD, String PhoneNumber){
		try { 
			educationRepository.updatephoneNumber(Edu_iD, PhoneNumber);
			return educationRepository.findById(Edu_iD)
					.map(educationMapperImp::domainToDto).get(); 
		}catch (NoSuchElementException ex)
		{
			throw new NotFoundException(String.format("No Record with the eduid [%s] was found in our database", Edu_iD ));
		}
	}
	public EduDTO updateEmail(String Edu_iD, String Email){
		try { 
			educationRepository.updateEmail(Edu_iD, Email);
			return educationRepository.findById(Edu_iD)
					.map(educationMapperImp::domainToDto).get(); 
		}catch (NoSuchElementException ex)
		{
			throw new NotFoundException(String.format("No Record with the eduid [%s] was found in our database", Edu_iD ));
		}
	}
	public EduDTO updateAddress(String Edu_iD, String Address){
		try { 
			educationRepository.updateaddress(Edu_iD, Address);
			return educationRepository.findById(Edu_iD)
					.map(educationMapperImp::domainToDto).get(); 
		}catch (NoSuchElementException ex)
		{
			throw new NotFoundException(String.format("No Record with the eduid [%s] was found in our database", Edu_iD ));
		}
	}
	public EduDTO updateEDU_NAME(String Edu_iD, String EDU_NAME){
		try { 
			educationRepository.updateEDU_NAME(Edu_iD, EDU_NAME);
			return educationRepository.findById(Edu_iD)
					.map(educationMapperImp::domainToDto).get(); 
		}catch (NoSuchElementException ex)
		{
			throw new NotFoundException(String.format("No Record with the eduid [%s] was found in our database", Edu_iD ));
		}
	}

}

