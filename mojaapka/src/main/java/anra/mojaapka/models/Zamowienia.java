package anra.mojaapka.models;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "zamowienia")
public class Zamowienia {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "nr_zamowienia")
	@NotNull
	private String nrZamowienia;
	
	@Column(name = "data_zamowienia")
	@NotNull
	private Date dataZamowienia;
	
	@Column(name = "ilosc_zamowiona")
	@NotNull
	private int iloscZamowiona;
	
	@Column(name = "data_przyjecia")
	private Date dataPrzyjecia;
	
	@Column(name= "ilosc_przyjeta")
	private int iloscPrzyjeta;
	
	@Column(name = "kompletne")
	@NotNull
	private String kompletne;
	
	@Transient
	private String operacja;

	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	
	/**
	 * @return the nrZamowienia
	 */
	public String getNrZamowienia() {
		return nrZamowienia;
	}

	
	/**
	 * @param nrZamowienia the nrZamowienia to set
	 */
	public void setNrZamowienia(String nrZamowienia) {
		this.nrZamowienia = nrZamowienia;
	}

	
	/**
	 * @return the dataZamowienia
	 */
	public Date getDataZamowienia() {
		return dataZamowienia;
	}

	
	/**
	 * @param dataZamowienia the dataZamowienia to set
	 */
	public void setDataZamowienia(Date dataZamowienia) {
		this.dataZamowienia = dataZamowienia;
	}

	
	/**
	 * @return the iloscZamowiona
	 */
	public int getIloscZamowiona() {
		return iloscZamowiona;
	}

	
	/**
	 * @param iloscZamowiona the iloscZamowiona to set
	 */
	public void setIloscZamowiona(int iloscZamowiona) {
		this.iloscZamowiona = iloscZamowiona;
	}

	
	/**
	 * @return the dataPrzyjecia
	 */
	public Date getDataPrzyjecia() {
		return dataPrzyjecia;
	}

	
	/**
	 * @param dataPrzyjecia the dataPrzyjecia to set
	 */
	public void setDataPrzyjecia(Date dataPrzyjecia) {
		this.dataPrzyjecia = dataPrzyjecia;
	}

	
	/**
	 * @return the iloscPrzyjeta
	 */
	public int getIloscPrzyjeta() {
		return iloscPrzyjeta;
	}

	
	/**
	 * @param iloscPrzyjeta the iloscPrzyjeta to set
	 */
	public void setIloscPrzyjeta(int iloscPrzyjeta) {
		this.iloscPrzyjeta = iloscPrzyjeta;
	}

	
	/**
	 * @return the kompletne
	 */
	public String getKompletne() {
		return kompletne;
	}

	
	/**
	 * @param kompletne the kompletne to set
	 */
	public void setKompletne(String kompletne) {
		this.kompletne = kompletne;
	}

	
	/**
	 * @return the operacja
	 */
	public String getOperacja() {
		return operacja;
	}

	
	/**
	 * @param operacja the operacja to set
	 */
	public void setOperacja(String operacja) {
		this.operacja = operacja;
	}
	
}
