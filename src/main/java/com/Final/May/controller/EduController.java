package com.Final.May.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Final.May.DTO.CompDTO;
import com.Final.May.DTO.EduDTO;
import com.Final.May.Service.EducationService;
import com.Final.May.model.Company;
import com.Final.May.model.Education;
import com.Final.May.repository.EduRepository;

@RestController


public class EduController {
@Autowired
EduRepository repository;
// @RequestMapping("/Edu.save")
//    public String process() {
//
// //  repository.save(new Education("kjdjdjjh","hfhhhhd"));
//     // repository.save(new Individual("jhf","hfd","jffhf","kdkf","jfhdjh","May","A","Alrabie","Femle","Singl","d",null,null,"Uugfd","uhfrtre"));
//       return "Edu Done";
//     }

 @PostMapping(value="/EducationSave")
 public EduDTO save(@RequestBody EduDTO educationDTO){
       return EducationService.createEducationDTO(educationDTO); 
  }

@GetMapping("/Education")
  public ResponseEntity<List<Education>> getEducation() {
       return EducationService.getEducation();
  }


 
}
      