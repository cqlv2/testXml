package genXml;

import java.io.File;
import java.time.LocalDate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import testXml.parseXml.DonneeDemographique;
import testXml.parseXml.DonneeEconomique;
import testXml.parseXml.Fecondite;
import testXml.parseXml.ListePays;
import testXml.parseXml.Pays;
import testXml.parseXml.Pib;
import testXml.parseXml.Population;

public class GenXml {

	public static void main(String[] args) throws JAXBException {

		
		DonneeEconomique deA=new DonneeEconomique();
		deA.setMonaie("monnaieA");
		Pib pibA=new Pib();
		pibA.setPib(2500);
		pibA.setUnite("$ par hab");
		deA.setPib(pibA);
		
		DonneeDemographique ddA = new DonneeDemographique();
		Fecondite f=new Fecondite();
		f.setFecondite("1.2");
		f.setUnite("enf par femme");
		ddA.setFecondite(f);
		Population p =new Population();
		p.setPopulation(123);
		p.setUnite("million");
		ddA.setPopulation(p);
		
		Pays paysA=new Pays();
		
		
		
		
		paysA.setNomPays("monPays");
		paysA.setDateReleve(LocalDate.of(2020, 1, 8));
		paysA.setDonneeDemographique(ddA);
		paysA.setDonneeEconomique(deA);
		
		
		System.out.println();
		
		
		
		String target ="C:/Temp/listePays_out.xml";
		JAXBContext jc = JAXBContext.newInstance(ListePays.class);
		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		ListePays listPays = new ListePays();
		listPays.getListPays().add(paysA);
		File os = new File ( target );
		marshaller.marshal(listPays, os);	
		System.out.println("fichier generé dans "+target);
		
		
		
		
		
		
		
		

	}

}
