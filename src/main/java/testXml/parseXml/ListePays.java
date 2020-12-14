package testXml.parseXml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "listePays")

public class ListePays {

	@XmlElement
	protected List<Pays> pays = new ArrayList<Pays>();

	public List<Pays> getListPays() {
		return pays;
	}

	public void setListPays(List<Pays> listPays) {
		this.pays = listPays;
	}

}
