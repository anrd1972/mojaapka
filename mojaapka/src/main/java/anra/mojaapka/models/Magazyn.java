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
@Table(name = "magazyn")
public class Magazyn {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	@NotNull
	private int id;
	
	@Column(name = "id_zamowienia")
	@NotNull
	private int idZamowienia;
	
	@Column(name = "nr_zamowienia")
	@NotNull
	private String nrZamowienia;
	
	@Column(name = "ilosc_zamowiona")
	@NotNull
	private int iloscZamowiona;
	
	@Column(name = "ilosc_przyjeta")
	@NotNull
	private int iloscPrzyjeta;
	
	@Column(name = "data_przyjecia")
	@NotNull
	private Date dataPrzyjecia;
	
	@Column(name = "osoba")
	@NotNull
	private String osoba;
	
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
	 * @return the idZamowienia
	 */
	public int getIdZamowienia() {
		return idZamowienia;
	}

	
	/**
	 * @param idZamowienia the idZamowienia to set
	 */
	public void setIdZamowienia(int idZamowienia) {
		this.idZamowienia = idZamowienia;
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
	 * @return the osoba
	 */
	public String getOsoba() {
		return osoba;
	}

	
	/**
	 * @param osoba the osoba to set
	 */
	public void setOsoba(String osoba) {
		this.osoba = osoba;
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
