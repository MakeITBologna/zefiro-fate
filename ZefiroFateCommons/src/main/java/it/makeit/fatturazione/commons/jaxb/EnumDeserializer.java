package it.makeit.fatturazione.commons.jaxb;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class EnumDeserializer implements JsonSerializer<Object>, JsonDeserializer<Object> {

		@Override
		public Object deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)	throws JsonParseException {
			try {
				return ((Class<?>) typeOfT).getMethod("fromValue", String.class).invoke(null, json.getAsJsonPrimitive().getAsString());
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
					| NoSuchMethodException | SecurityException e) {
				throw new RuntimeException(e);
			}
			
		}

		@Override
		public JsonElement serialize(Object src, Type typeOfSrc, JsonSerializationContext context) {
			try {
				return context.serialize(((Class<?>) typeOfSrc).getMethod("value").invoke(src), typeOfSrc);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
					| NoSuchMethodException | SecurityException e) {
				throw new RuntimeException(e);
			}
		}
		
	}