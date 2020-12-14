package testXml.parseXml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlAccessorType(XmlAccessType.FIELD)

@XmlRootElement(name = "DonneeDemographique")

public class DonneeDemographique {
	@XmlElement
	protected double population;
	@XmlElement
	protected double fecondite;

}
