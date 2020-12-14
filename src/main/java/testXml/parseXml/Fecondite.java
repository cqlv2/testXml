package testXml.parseXml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "fecondite")
public class Fecondite {

	@XmlValue
	private String fecondite;
	@XmlAttribute
	private String unite;

	// method
	public String getInfo() {
		return fecondite + " " + unite;
	}

	// geteur Setteur

	public String getFecondite() {
		return fecondite;
	}

	public void setFecondite(String fecondite) {
		this.fecondite = fecondite;
	}

	public String getUnite() {
		return unite;
	}

	public void setUnite(String unite) {
		this.unite = unite;
	}

}
