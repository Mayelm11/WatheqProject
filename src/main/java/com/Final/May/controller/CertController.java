package com.Final.May.controller;


import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Final.May.DTO.CertDTO;
import com.Final.May.DTO.IndivDTO;
import com.Final.May.Service.CertificationService;
import com.Final.May.Service.IndividualService;
import com.Final.May.model.Certification;
import com.Final.May.model.Education;
import com.Final.May.model.Individual;
import com.Final.May.repository.CertificationRepository;

@RestController

public class CertController {
@Autowired
CertificationService CertificationService;

CertificationRepository repository;

 CertDTO CertificationDTO =new CertDTO();
@RequestMapping("/create Cert")
public String create() {

	CertificationService.createCertDTO(CertificationDTO);
	return "Create Cert Done";
}}
