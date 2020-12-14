package testXml.parseXml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlAccessorType(XmlAccessType.FIELD)

@XmlRootElement(name = "DonneeDemographique")

public class DonneeDemographique {
	public double getPopulation() {
		return population;
	}
	public void setPopulation(double population) {
		this.population = population;
	}
	public double getFecondite() {
		return fecondite;
	}
	public void setFecondite(double fecondite) {
		this.fecondite = fecondite;
	}
	@XmlElement
	protected double population;
	@XmlElement
	protected double fecondite;

}
