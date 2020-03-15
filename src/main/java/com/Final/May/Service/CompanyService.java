package com.Final.May.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Final.May.DTO.CompDTO;
import com.Final.May.ExceptionHandler.NotFoundException;
import com.Final.May.ModelMapper.CompanyMapperImp;
import com.Final.May.model.Company;
import com.Final.May.repository.CompanyRepository;

import lombok.AllArgsConstructor;
@AllArgsConstructor
@Service
public class CompanyService {

	private CompanyRepository companyRepository;
	private static final CompanyMapperImp ComMapper = new CompanyMapperImp();

	public ResponseEntity<Company> createCompanyDTO(CompDTO companyDTO) {

		Company company = Company.builder()
				.email(companyDTO.getEmail())              
				.phone_number(companyDTO.getPhoneNumber())
				.address(companyDTO.getAddress())
				.password(companyDTO.getPassword())
				.CR(companyDTO.getCR())
				.CompanyName(companyDTO.getCompanyName())
				.StartDate(companyDTO.getStartDate())
				.EndDate(companyDTO.getEndDate())
				.build();

		Company saveCompany = companyRepository.save(company);
		 ComMapper.domainToDto(saveCompany);
		 return new ResponseEntity<>(saveCompany, HttpStatus.CREATED); 
	}
	
	public ResponseEntity<List<Company>> getCompanis(){
        List<Company> com = new ArrayList<Company>();
        companyRepository.findAll().forEach(com::add);
         return new ResponseEntity<>(com , HttpStatus.OK);
 }

		public Company getById(String id) {
	        try {
	            return companyRepository.findById(id).get();
	        }catch (NoSuchElementException ex) {
	            throw new NotFoundException(String.format("No Record with the id [%s] was found in our database", id));
	        }
	    }

	public void deleteCompany (String CR) {
		try {
			Company company=companyRepository.findById(CR).get();
			companyRepository.delete(company);
		}catch (NoSuchElementException ex) {
			throw new NotFoundException(String.format("No Record with the nationalID [%s] was found in our database", CR));
		}
	}
	
	public CompDTO updateCompanyName(String CR, String CompanyName){
		try { 
			companyRepository.updateCompanyName(CR, CompanyName);
			return companyRepository.findById(CR)
					.map(ComMapper::domainToDto).get(); 
		}catch (NoSuchElementException ex)
		{
			throw new NotFoundException(String.format("No Record with the eduid [%s] was found in our database", CR ));
		}
	}
	public CompDTO updatepassword(String CR, String password){
		try { 
			companyRepository.updatePassword(CR, password);
			return companyRepository.findById(CR)
					.map(ComMapper::domainToDto).get(); 
		}catch (NoSuchElementException ex)
		{
			throw new NotFoundException(String.format("No Record with the eduid [%s] was found in our database", CR ));
		}
	}

	public CompDTO updatePhoneNumber(String CR, String PhoneNumber){
		try { 
			companyRepository.updatePassword(CR, PhoneNumber);
			return companyRepository.findById(CR)
					.map(ComMapper::domainToDto).get(); 
		}catch (NoSuchElementException ex)
		{
			throw new NotFoundException(String.format("No Record with the eduid [%s] was found in our database", CR ));
		}}

	public CompDTO updateAddress(String CR, String Address){
		try { 
			companyRepository.updateAddress(CR, Address);
			return companyRepository.findById(CR)
					.map(ComMapper::domainToDto).get(); 
		}catch (NoSuchElementException ex)
		{
			throw new NotFoundException(String.format("No Record with the eduid [%s] was found in our database", CR ));
		}}

	public CompDTO updateEmail(String CR, String Email){
		try { 
			companyRepository.updateEmail(CR, Email);
			return companyRepository.findById(CR)
					.map(ComMapper::domainToDto).get(); 
		}catch (NoSuchElementException ex)
		{
			throw new NotFoundException(String.format("No Record with the eduid [%s] was found in our database", CR ));
		}





	}

	public List<Company> findAll() {
		// TODO Auto-generated method stub
		return (List<Company>) companyRepository.findAll();	}}



