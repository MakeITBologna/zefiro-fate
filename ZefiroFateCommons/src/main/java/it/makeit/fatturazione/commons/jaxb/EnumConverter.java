package it.makeit.fatturazione.commons.jaxb;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;

import javax.xml.datatype.DatatypeFactory;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonPrimitive;

public class EnumConverter {
	
	public static class Serializer implements JsonSerializer<Object> {
	
		public Serializer() {
			super();
		}
		
		public JsonElement serialize(Object src, Type typeOfSrc, JsonSerializationContext context) {
			try {
				String value = (String) ((Class<?>) typeOfSrc).getMethod("value").invoke(src);
				return new JsonPrimitive(value);
				//return context.serialize(((Class<?>) typeOfSrc).getMethod("value").invoke(src), typeOfSrc);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				throw new RuntimeException(e);
			}
		}
	}
	
	public static class Deserializer implements JsonDeserializer<Object> {
		
		public Object deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)	throws JsonParseException {
			try {
				if(json.isJsonNull()) {
					return null;
				}
				return ((Class<?>) typeOfT).getMethod("fromValue", String.class).invoke(null, json.getAsJsonPrimitive().getAsString());
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
					| NoSuchMethodException | SecurityException e) {
				throw new RuntimeException(e);
			}
		}			
	}

}