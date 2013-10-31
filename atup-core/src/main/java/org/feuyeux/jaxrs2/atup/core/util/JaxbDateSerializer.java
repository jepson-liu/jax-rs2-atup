package org.feuyeux.jaxrs2.atup.core.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class JaxbDateSerializer extends XmlAdapter<String, Date> {
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

    @Override
    public String marshal(Date date) throws Exception {
        if (date == null) {
            return "";
        } else {
            return dateFormat.format(date);
        }
    }

    @Override
    public Date unmarshal(String date) throws Exception {
        if (date == null || date.isEmpty()) {
            return null;
        } else {
            return dateFormat.parse(date);
        }
    }
}
