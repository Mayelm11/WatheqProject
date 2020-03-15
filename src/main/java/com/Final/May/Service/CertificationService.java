package com.Final.May.Service;

import org.springframework.stereotype.Service;

import com.Final.May.DTO.CertDTO;
import com.Final.May.ModelMapper.CertificationMapperImp;
import com.Final.May.model.Certification;
import com.Final.May.repository.CertificationRepository;

import lombok.AllArgsConstructor;

	@AllArgsConstructor
	@Service
	public class CertificationService {

		private CertificationRepository certificationRepository;
		private static final CertificationMapperImp certificationMapperImp = new CertificationMapperImp();

		public CertDTO createCertDTO(CertDTO certificationDTO) {

			 Certification  certification =  Certification.builder()
					
					.cERT_id(certificationDTO.getCERT_id())
					.uNI_NAME(certificationDTO.getUNI_NAME())
					.aDDBY(certificationDTO.getADDBY())
					.cERT_id(certificationDTO.getCERT_id())
					.gPA(certificationDTO.getGPA())
					.dEGREE(certificationDTO.getDEGREE())
					.mAJOR(certificationDTO.getMAJOR())
					.aTTACH(certificationDTO.getATTACH())


					.build();

			Certification saveCertification = certificationRepository.save(certification);
			return certificationMapperImp.domainToDto(saveCertification);

		}

	}


