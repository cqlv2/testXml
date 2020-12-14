package testXml.parseXml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.txw2.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "DonneeDemographique")
public class DonneeDemographique {

	@XmlElement
	private Population population;
	@XmlElement
	private Fecondite fecondite;

	// geteur Setteur
	public Population getPopulation() {
		return population;
	}

	public void setPopulation(Population population) {
		this.population = population;
	}

	public Fecondite getFecondite() {
		return fecondite;
	}

	public void setFecondite(Fecondite fecondite) {
		this.fecondite = fecondite;
	}

}
