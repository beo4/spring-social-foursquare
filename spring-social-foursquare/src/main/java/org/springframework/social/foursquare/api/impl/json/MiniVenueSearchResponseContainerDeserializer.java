package org.springframework.social.foursquare.api.impl.json;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.social.foursquare.api.MiniVenueSearchResponse;
import org.springframework.social.foursquare.api.Venue;

public class MiniVenueSearchResponseContainerDeserializer extends AbstractFoursquareDeserializer<MiniVenueSearchResponseContainer> {
    
	@SuppressWarnings("unchecked") 
	@Override
	public MiniVenueSearchResponseContainer deserialize(JsonParser jp, DeserializationContext ctxt) 
			throws IOException, JsonProcessingException {
	    List<Venue>result = (List<Venue>) deserializeNestedList(jp, "minivenues", new TypeReference<List<Venue>>(){});
	    //GeoCodeContainer geoCodeContainer = new GeoCodeContainerDeserializer().deserialize(jp, ctxt);
	    
	    return new MiniVenueSearchResponseContainer(new MiniVenueSearchResponse(result));
	}
}
