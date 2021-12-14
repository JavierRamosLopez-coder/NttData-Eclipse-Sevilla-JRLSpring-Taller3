package com.nttdata.spring.services;

import java.util.List;

import com.nttdata.spring.persistence.NttDataSpringContract;

public interface NttDataSpringContractServiceI {
	
	/**
	 * Insercción de contrato
	 * @param newContract
	 */
	public void addContract(final NttDataSpringContract contract);
	
	/**
	 * Eliminación de contrato
	 * @param contract
	 */
	public void deleteContract(final NttDataSpringContract contract);
	
	/**
	 * Muestra de todos los contratos
	 * @return
	 */
	public List<NttDataSpringContract> contratos();

}
