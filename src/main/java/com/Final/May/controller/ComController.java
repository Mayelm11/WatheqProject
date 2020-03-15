package com.Final.May.controller;



import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Final.May.DTO.CompDTO;
import com.Final.May.Service.CompanyService;
import com.Final.May.model.Company;
import com.Final.May.repository.CompanyRepository;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")

public class ComController {
@Autowired
CompanyRepository repository;
@Autowired
CompanyService companyService;

//CompDTO CompanyDTO = new CompDTO("elm@sa.sa", "0554334455","riyadh", "udfjkfyuiu","6","Elm",
//		Timestamp.valueOf("2018-02-16 04:38:15.123456789"), Timestamp.valueOf("2018-07-16 04:38:15.123456789") );



//@PostMapping(value="/companysave")
//public ResponseEntity<Company> save(@RequestBody CompDTO companyDTO){
//      return companyService.createCompanyDTO(companyDTO); 
//       
//}




















//@RequestMapping("/addcompany")
//public String save() {
// companyService.createCompanyDTO(CompanyDTO);
// 
// 
//// repository.save(new Company("kfrjppttdjd","hllyggyfd",Timestamp.valueOf("2018-02-16 04:38:15.123456789"),Timestamp.valueOf("2018-02-16 04:38:15.123456789")));
// // repository.save(new Individual("jhf","hfd","jffhf","kdkf","jfhdjh","May","A","Alrabie","Femle","Singl","d",null,null,"Uugfd","uhfrtre"));
//   return "Company save";
// }

// @RequestMapping("/Com.found")
//    public String process() {
//	 companyService.getById("674392832");
//	 
	 
  // repository.save(new Company("kfrjppttdjd","hllyggyfd",Timestamp.valueOf("2018-02-16 04:38:15.123456789"),Timestamp.valueOf("2018-02-16 04:38:15.123456789")));
     // repository.save(new Individual("jhf","hfd","jffhf","kdkf","jfhdjh","May","A","Alrabie","Femle","Singl","d",null,null,"Uugfd","uhfrtre"));
//       return "Company found";
//     }




// ************************************
//@RequestMapping("/updateCom")
//public CompDTO updatECom() throws Exception
//
//{
//	return companyService.updateAddress("6", "jdhd");
//}
         
////} 
     @PostMapping(value="/companysave")
    public ResponseEntity<Company> save(@RequestBody CompDTO companyDTO){
          return companyService.createCompanyDTO(companyDTO); 
     }

   @GetMapping("/company")
     public ResponseEntity<List<Company>> getCompanis() {
          return companyService.getCompanis();
     }



}

 
      