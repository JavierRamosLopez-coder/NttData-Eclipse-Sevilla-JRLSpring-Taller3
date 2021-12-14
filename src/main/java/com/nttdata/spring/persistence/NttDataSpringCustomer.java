package com.nttdata.spring.persistence;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "NTTDATA_CUSTOMER")
public class NttDataSpringCustomer implements Serializable {

	/** Atributo Serial **/
	private static final long serialVersionUID = 1L;

	/** Customer identifier (PK) **/
	private Long numericIdentifier;

	/** Customer name **/
	private String name;

	/** Customer firstSurname **/
	private String firstSurname;

	/** Customer secondSurname **/
	private String secondSurname;

	/** Customer dateOfBirth **/
	private Date dateOfBirth;

	/** Customer dni **/
	private String dni;

	/** Customer contracts **/
	private List<NttDataSpringContract> contracts;

	/**
	 * @return the numericIdentifier
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "NUMERIC_IDENTIFIER")
	public Long getNumericIdentifier() {
		return numericIdentifier;
	}

	/**
	 * @param numericIdentifier the numericIdentifier to set
	 */
	public void setNumericIdentifier(Long numericIdentifier) {
		this.numericIdentifier = numericIdentifier;
	}

	/**
	 * @return the name
	 */
	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the firstSurname
	 */
	@Column(name = "FIRST_SURNAME")
	public String getFirstSurname() {
		return firstSurname;
	}

	/**
	 * @param firstSurname the firstSurname to set
	 */
	public void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}

	/**
	 * @return the secondSurname
	 */
	@Column(name = "SECOND_SURNAME")
	public String getSecondSurname() {
		return secondSurname;
	}

	/**
	 * @param secondSurname the secondSurname to set
	 */
	public void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}

	/**
	 * @return the dateOfBirth
	 */
	@Column(name = "DATE_OF_BIRTH")
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the dni
	 */
	@Column(name = "DNI")
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the contracts
	 */
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "customer")
	public List<NttDataSpringContract> getContracts() {
		return contracts;
	}

	/**
	 * @param contracts the contracts to set
	 */
	public void setContracts(List<NttDataSpringContract> contracts) {
		this.contracts = contracts;
	}

	@Override
	public String toString() {
		return "NttDataSpringCustomer [numericIdentifier=" + numericIdentifier + ", name=" + name + ", firstSurname="
				+ firstSurname + ", secondSurname=" + secondSurname + ", dateOfBirth=" + dateOfBirth + ", dni=" + dni
				+ ", contracts=" + contracts + "]";
	}

}
