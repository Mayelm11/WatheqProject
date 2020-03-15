package com.Final.May.mapperTest;




import org.junit.Assert;
import org.junit.Test;

import com.Final.May.DTO.IndivDTO;
import com.Final.May.ModelMapper.IndividualMapperIm;
import com.Final.May.model.Individual;



		public class IndividualMapperTest {
			
			final static IndividualMapperIm individualMapper= new IndividualMapperIm();

            @Test
            public void IndividualMapper_domainToDto() {
                   final IndivDTO source =new IndivDTO();

                   source.setNationalID("W");
                   source.setFirstName("W");
                   source.setMName("W");
                   source.setLastName("W");
                   source.setGender(true);
                   source.setStatus("W");
                   source.setSkills("W");
                   source.setDOB(null);
                   source.setMAJOR("W");
                   source.setAttachments("W");
                   source.setJOP("W");

                   final Individual target = individualMapper.dtoToDomain(source);

                   Assert.assertNotNull(target);
                   Assert.assertEquals("W", target.getNationalID());
                   Assert.assertEquals("W", target.getFirstname());
                   Assert.assertEquals("W", target.getMName());
                   Assert.assertEquals("W", target.getLastname());
                   Assert.assertEquals(true, target.getGender());
                   Assert.assertEquals("W", target.getStatus());
                   Assert.assertEquals("W", target.getSkills());
                   Assert.assertEquals(null, target.getDOB());
                   Assert.assertEquals("W", target.getMAJOR());
                   Assert.assertEquals("W", target.getAttachments());
                   Assert.assertEquals("W", target.getJOP());
                   




            }


            @Test
            public void IndividualMapper_dtoToDomain() {
                   final Individual source =new Individual();

                   source.setNationalID("W");
                   source.setFirstname("W");
                   source.setMName("W");
                   source.setLastname("W");
                   source.setGender(true);

                   source.setStatus("W");
                   source.setSkills("W");
                   source.setDOB(null);
                   source.setMAJOR("W");

                   source.setAttachments("W");
                   source.setJOP("W");
            

                   final IndivDTO target = individualMapper.domainToDto(source);

                   Assert.assertNotNull(target);
                   Assert.assertEquals("W", target.getNationalID());
                   Assert.assertEquals("W", target.getFirstName());
                   Assert.assertEquals("W", target.getMName());
                   Assert.assertEquals("W", target.getLastName());
                   Assert.assertEquals(true, target.getGender());
                   Assert.assertEquals("W", target.getStatus());
                   Assert.assertEquals("W", target.getSkills());
                   Assert.assertEquals(null, target.getDOB());
                   Assert.assertEquals("W", target.getAttachments());  
                   

            
            }
            }

     




