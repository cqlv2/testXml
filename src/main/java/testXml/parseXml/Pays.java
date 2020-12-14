package testXml.parseXml;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)

@XmlRootElement(name = "pays")

public class Pays {

	@XmlElement
	protected String nomPays;

	@XmlElement
	@XmlJavaTypeAdapter(DateAdapter.class)
	protected LocalDate dateReleve;

	@XmlElement
	protected DonneeDemographique donneeDemographique;
	@XmlElement
	protected DonneeEconomique donneeEconomique;

	//getteur setteur
	
	public String getNomPays() {
		return nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	public LocalDate getDateReleve() {
		return dateReleve;
	}

	public void setDateReleve(LocalDate dateReleve) {
		this.dateReleve = dateReleve;
	}

	public DonneeDemographique getDonneeDemographique() {
		return donneeDemographique;
	}

	public void setDonneeDemographique(DonneeDemographique donneeDemographique) {
		this.donneeDemographique = donneeDemographique;
	}

	public DonneeEconomique getDonneeEconomique() {
		return donneeEconomique;
	}

	public void setDonneeEconomique(DonneeEconomique donneeEconomique) {
		this.donneeEconomique = donneeEconomique;
	}

}
