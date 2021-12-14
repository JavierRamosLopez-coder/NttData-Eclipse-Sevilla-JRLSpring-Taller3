package com.nttdata.spring;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.spring.persistence.NttDataSpringContract;
import com.nttdata.spring.services.NttDataSpringContractServiceImpl;

/**
 * 
 * Clase main - NttDataSpringMain
 * 
 * @author jramlope
 *
 */
@SpringBootApplication
public class NttDataSpringMain implements CommandLineRunner {

	@Autowired
	/** Instanciación del servicio **/
	private NttDataSpringContractServiceImpl contractService;

	public static void main(String[] args) {
		SpringApplication.run(NttDataSpringMain.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		NttDataSpringContract contract = new NttDataSpringContract();
		contract.setContractNumericIdentifier(1L);
		contract.setEffectiveDate(new Date());
		contract.setExpiryDate(new Date());
		contract.setMonthlyPrice(200.9);

		contractService.addContract(contract);

	}

}
