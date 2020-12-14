package testXml.parseXml;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateAdapter extends XmlAdapter<String, LocalDate> {

	@Override
	public LocalDate unmarshal(String v) throws Exception {
		
		return LocalDate.parse(v, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

	@Override
	public String marshal(LocalDate v) throws Exception {
		return v.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

}
