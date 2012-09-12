package org.springframework.social.foursquare.api.impl.json;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.springframework.social.foursquare.api.MiniVenueSearchResponse;

@JsonDeserialize(using=MiniVenueSearchResponseContainerDeserializer.class)
public class MiniVenueSearchResponseContainer {
    
	MiniVenueSearchResponse response;
    
    public MiniVenueSearchResponseContainer(MiniVenueSearchResponse response) {
        this.response = response;
    }

    public MiniVenueSearchResponse getMiniVenueSearchResponse() {
        return response;
    }

   
    
}
