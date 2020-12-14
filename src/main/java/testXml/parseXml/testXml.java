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
		
		
		
		for (Pays pays : listPays) {
			System.out.println("nom : "+pays.getNomPays());
			
			System.out.println("date de relevé : "+pays.getDateReleve());
			System.out.println("population : "+pays.getDonneeDemographique().getPopulation().getPopulation()+pays.getDonneeDemographique().getPopulation().getUnite());
			System.out.println("taux de fecondité : "+pays.getDonneeDemographique().getFecondite().getFecondite()+pays.getDonneeDemographique().getFecondite().getUnite());
			System.out.println("pib : "+pays.getDonneeEconomique().getPib().getPib()+pays.getDonneeEconomique().getPib().getUnite());
			System.out.println("monnaie : "+pays.getDonneeEconomique().getMonaie());
			

			
		}
		
	}
}
