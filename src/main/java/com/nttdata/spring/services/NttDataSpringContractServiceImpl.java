package com.nttdata.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.spring.persistence.NttDataSpringContract;
import com.nttdata.spring.persistence.NttDataSpringContractI;

@Service
public class NttDataSpringContractServiceImpl implements NttDataSpringContractServiceI{

	@Autowired
	private NttDataSpringContractI contractRepository;
	
	@Override
	public void addContract(NttDataSpringContract newContract) {
		contractRepository.save(newContract);
		
	}

	@Override
	public void deleteContract(NttDataSpringContract contract) {
		contractRepository.delete(contract);
		
	}

	@Override
	public List<NttDataSpringContract> contratos() {
		return contractRepository.findAll();
	}


	
}
