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
		DonneeEconomique deB=new DonneeEconomique();
		DonneeEconomique deC=new DonneeEconomique();
		
		deA.setMonaie("monnaieA");
		deB.setMonaie("monnaieA");
		deC.setMonaie("monnaieA");
		

		Pib pibA=new Pib();
		pibA.setPib(2500);
		pibA.setUnite("$ par hab");
		Pib pibB=new Pib();
		pibB.setPib(1500);
		pibB.setUnite("$ par hab");
		Pib pibC=new Pib();
		pibC.setPib(3500);
		pibC.setUnite("$ par hab");
		
		deA.setPib(pibA);
		deB.setPib(pibB);
		deC.setPib(pibC);
		
		DonneeDemographique ddA = new DonneeDemographique();
		DonneeDemographique ddB = new DonneeDemographique();
		DonneeDemographique ddC = new DonneeDemographique();
		
		Fecondite fA=new Fecondite();
		fA.setFecondite("1.2");
		fA.setUnite("enf par femme");
		Fecondite fB=new Fecondite();
		fB.setFecondite("1.5");
		fB.setUnite("enf par femme");
		Fecondite fC=new Fecondite();
		fC.setFecondite("12.0");
		fC.setUnite("enf par femme");
		
		ddA.setFecondite(fA);
		ddB.setFecondite(fB);
		ddC.setFecondite(fC);
		
		Population pA =new Population();
		pA.setPopulation(123);
		pA.setUnite("million");
		Population pB =new Population();
		pB.setPopulation(456);
		pB.setUnite("million");
		Population pC =new Population();
		pC.setPopulation(789);
		pC.setUnite("million");
		
		ddA.setPopulation(pA);
		ddB.setPopulation(pB);
		ddC.setPopulation(pC);
		
		Pays paysA=new Pays();
		Pays paysB=new Pays();
		Pays paysC=new Pays();
		

		paysA.setNomPays("paysA");
		paysA.setDateReleve(LocalDate.of(2020, 1, 8));
		paysA.setDonneeDemographique(ddA);
		paysA.setDonneeEconomique(deA);
		
		paysB.setNomPays("paysB");
		paysB.setDateReleve(LocalDate.of(2020, 1, 8));
		paysB.setDonneeDemographique(ddB);
		paysB.setDonneeEconomique(deB);
		
		paysC.setNomPays("paysC");
		paysC.setDateReleve(LocalDate.of(2020, 1, 8));
		paysC.setDonneeDemographique(ddC);
		paysC.setDonneeEconomique(deC);
		

		String target ="C:/Temp/listePays_out.xml";
		JAXBContext jc = JAXBContext.newInstance(ListePays.class);
		Marshaller marshaller = jc.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		ListePays listPays = new ListePays();
		listPays.getListPays().add(paysA);
		listPays.getListPays().add(paysB);
		listPays.getListPays().add(paysC);
		File os = new File ( target );
		marshaller.marshal(listPays, os);	
		System.out.println("fichier generé dans "+target);

		

	}

}
