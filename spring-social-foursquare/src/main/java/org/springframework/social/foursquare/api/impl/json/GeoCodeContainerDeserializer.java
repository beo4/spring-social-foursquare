package org.springframework.social.foursquare.api.impl.json;

import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.springframework.social.foursquare.api.GeoCode;

public class GeoCodeContainerDeserializer extends AbstractFoursquareDeserializer<GeoCodeContainer> {
	@Override
	public GeoCodeContainer deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		return new GeoCodeContainer(deserializeNestedResponseObject(jp, "geocode", GeoCode.class));
	}
}
