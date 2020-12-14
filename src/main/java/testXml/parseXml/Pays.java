package testXml.parseXml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlAccessorType(XmlAccessType.FIELD)

@XmlRootElement(name = "pays")

public class Pays {

	@XmlElement
	protected String nomPays;
	@XmlElement
	protected String dateReleve;
	@XmlElement
	protected DonneeDemographique donneeDemographique;
	@XmlElement
	protected DonneeEconomique donneeEconomique;
	public String getNomPays() {
		return nomPays;
	}
	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}
	public String getDateReleve() {
		return dateReleve;
	}
	public void setDateReleve(String dateReleve) {
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
