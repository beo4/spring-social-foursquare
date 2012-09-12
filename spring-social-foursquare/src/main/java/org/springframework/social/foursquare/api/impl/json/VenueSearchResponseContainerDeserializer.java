package org.springframework.social.foursquare.api.impl.json;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.springframework.social.foursquare.api.VenueSearchResponse;

public class VenueSearchResponseContainerDeserializer extends AbstractFoursquareDeserializer<VenueSearchResponseContainer> {
    
	@SuppressWarnings("unchecked") 
	@Override
	public VenueSearchResponseContainer deserialize(JsonParser jp, DeserializationContext ctxt) 
			throws IOException, JsonProcessingException {
	    
		VenueSearchResponseContainer venueSearchContainer = deserializeResponseObject(jp, VenueSearchResponseContainer.class, VenueSearchResponse.class);
		return venueSearchContainer;
	}
}
