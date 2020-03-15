package com.Final.May.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Final.May.DTO.IndivDTO;
import com.Final.May.ExceptionHandler.NotFoundException;
import com.Final.May.ModelMapper.IndividualMapperIm;
import com.Final.May.model.Education;
import com.Final.May.model.Individual;
import com.Final.May.repository.IndividualRepository;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service
public class IndividualService {
	private IndividualRepository individualRepository;
	 private static final IndividualMapperIm individualMapper = new IndividualMapperIm();
	 public IndivDTO createIndividualDTO(IndivDTO individualDTO) {
	  
	  Individual individual = Individual.builder()
	                 .email(individualDTO.getEmail())
	                .phone_number(individualDTO.getPhoneNumber())
	                .address(individualDTO.getAddress())
	                .password(individualDTO.getPassword())
	                .NationalID(individualDTO.getNationalID())
	                .Firstname(individualDTO.getFirstName())
	                .MName(individualDTO.getMName())
	                .Lastname(individualDTO.getLastName())
	                .Gender(individualDTO.getGender())
	                .Status(individualDTO.getStatus())
	                .Skills(individualDTO.getSkills())
	                .DOB(individualDTO.getDOB())
	                .Attachments(individualDTO.getAttachments())
	                .JOP(individualDTO.getJOP())
	                .MAJOR(individualDTO.getMAJOR())


	                .build();
	  Individual saveIndividual = individualRepository.save(individual);
	        return individualMapper.domainToDto(saveIndividual);
	        
	        
	    }
	 

		public ResponseEntity<List< Individual>> getindividual(){
	        List< Individual> com = new ArrayList< Individual>();
	        individualRepository.findAll().forEach(com::add);
	         return new ResponseEntity<>(com , HttpStatus.OK);
	 }
	 public void deleteIndividual (String nationalID) {
		  try {
		   Individual individual=individualRepository.findById(nationalID).get();
		   individualRepository.delete(individual);
		  }catch (NoSuchElementException ex) {
		   throw new NotFoundException(String.format("No Record with the nationalID [%s] was found in our database", nationalID));
		  }
		 }
		public IndivDTO updateAddress(String nationalID, String Address){
			try { 
				individualRepository.updateaddress(nationalID, Address);
				return individualRepository.findById(nationalID)
						.map(individualMapper::domainToDto).get(); 
			}catch (NoSuchElementException ex)
			{
				throw new NotFoundException(String.format("No Record with the eduid [%s] was found in our database", nationalID ));
			}
		}
		
		public IndivDTO updatePassword(String nationalID, String Password){
			try { 
				individualRepository.updatepassword(nationalID, Password);
				return individualRepository.findById(nationalID)
						.map(individualMapper::domainToDto).get(); 
			}catch (NoSuchElementException ex)
			{
				throw new NotFoundException(String.format("No Record with the eduid [%s] was found in our database", nationalID ));
			}
		}
		public IndivDTO updateEmail(String nationalID, String Email){
			try { 
				individualRepository.updateEmail(nationalID, Email);
				return individualRepository.findById(nationalID)
						.map(individualMapper::domainToDto).get(); 
			}catch (NoSuchElementException ex)
			{
				throw new NotFoundException(String.format("No Record with the eduid [%s] was found in our database", nationalID ));
			}
		}
	
		public IndivDTO updateStatus(String nationalID, String Status){
			try { 
				individualRepository.updateStatus(nationalID, Status);
				return individualRepository.findById(nationalID)
						.map(individualMapper::domainToDto).get(); 
			}catch (NoSuchElementException ex)
			{
				throw new NotFoundException(String.format("No Record with the eduid [%s] was found in our database", nationalID ));
			}
		}
		
		public IndivDTO updateJOP(String nationalID, String JOP){
			try { 
				individualRepository.updateJOP(nationalID, JOP);
				return individualRepository.findById(nationalID)
						.map(individualMapper::domainToDto).get(); 
			}catch (NoSuchElementException ex)
			{
				throw new NotFoundException(String.format("No Record with the eduid [%s] was found in our database", nationalID ));
			}
		}
		
}
