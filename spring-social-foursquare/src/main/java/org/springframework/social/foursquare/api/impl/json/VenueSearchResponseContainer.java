package org.springframework.social.foursquare.api.impl.json;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.springframework.social.foursquare.api.VenueSearchResponse;

@JsonDeserialize(using=VenueSearchResponseContainerDeserializer.class)
public class VenueSearchResponseContainer {
    
	VenueSearchResponse response;
    
    public VenueSearchResponseContainer(VenueSearchResponse response) {
        this.response = response;
    }

    public VenueSearchResponse getVenueSearchResponse() {
        return response;
    }

   
    
}
