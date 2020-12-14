package testXml.parseXml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "DonneeEconomique")
public class DonneeEconomique {

	@XmlElement
	private Pib pib;
	@XmlElement
	private String monaie;
	
	//geteur Setteur
	
	public Pib getPib() {
		return pib;
	}
	public void setPib(Pib pib) {
		this.pib = pib;
	}
	public String getMonaie() {
		return monaie;
	}
	public void setMonaie(String monaie) {
		this.monaie = monaie;
	}

}
