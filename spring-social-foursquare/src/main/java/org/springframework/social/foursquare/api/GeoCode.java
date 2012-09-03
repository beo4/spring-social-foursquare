package org.springframework.social.foursquare.api;

import java.util.List;

public class GeoCode {
	
	GeoCodeFeature feature;

    public GeoCode(GeoCodeFeature feature) {
            this.feature = feature;
    }

    public GeoCodeFeature getFeature() {
            return feature;
    }
	
}
