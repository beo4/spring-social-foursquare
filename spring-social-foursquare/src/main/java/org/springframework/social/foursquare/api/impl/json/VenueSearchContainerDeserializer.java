package org.springframework.social.foursquare.api.impl.json;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.social.foursquare.api.Venue;
import org.springframework.social.foursquare.api.GeoCode;

public class VenueSearchContainerDeserializer extends AbstractFoursquareDeserializer<VenueSearchContainer> {
    
	@SuppressWarnings("unchecked") 
	@Override
	public VenueSearchContainer deserialize(JsonParser jp, DeserializationContext ctxt) 
			throws IOException, JsonProcessingException {
	    List<Venue>result = (List<Venue>) deserializeNestedList(jp, "venues", new TypeReference<List<Venue>>(){});
	    GeoCode geoCode = deserializeNestedResponseObject(jp, "geocode", GeoCode.class);
		return new VenueSearchContainer(result, geoCode);
	}
}
