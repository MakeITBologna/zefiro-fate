package it.makeit.fatturazione.commons.jaxb;

import java.lang.reflect.Type;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class XmlGregocarianCalendarConverter {
		public static class Serializer implements JsonSerializer<XMLGregorianCalendar> {
			public Serializer() {
				super();
			}

			public JsonElement serialize(XMLGregorianCalendar t, Type type, JsonSerializationContext jsonSerializationContext) {
				return new JsonPrimitive(t.toXMLFormat());
			}

			
		}

		public static class Deserializer implements JsonDeserializer<XMLGregorianCalendar> {

			public XMLGregorianCalendar deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {

				if ("".equals(jsonElement.getAsString().trim())) {
					return null;
				}
				try {
					return DatatypeFactory.newInstance().newXMLGregorianCalendar(jsonElement.getAsString());
				} catch (DatatypeConfigurationException ex) {
					throw new RuntimeException("non è possibile decodificare la data " + jsonElement.getAsString());
				}
			}
		}
	}