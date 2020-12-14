package testXml.parseXml;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class testXml {
	public static void main(String[] args) throws JAXBException {
		JAXBContext jc=JAXBContext.newInstance(ListePays.class);
		Unmarshaller unmarch = jc.createUnmarshaller();
		
		ListePays racine=(ListePays) unmarch.unmarshal(new File("src/main/resources/tp1.xml"));
		
		List<Pays> listPays=racine.getListPays();		
		
		System.out.println(listPays.size());
		
		
		for (Pays pays : listPays) {
			System.out.println(pays.getNomPays());
			System.out.println(pays.getDonneeEconomique().getPib());
		}
		
	}
}
