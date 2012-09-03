package org.springframework.social.foursquare.api.impl.json;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.springframework.social.foursquare.api.GeoCode;

@JsonDeserialize(using=GeoCodeContainerDeserializer.class)
public class GeoCodeContainer {
	private GeoCode geoCode;
	
	public GeoCodeContainer(GeoCode geoCode) {
		this.geoCode = geoCode;
	}
	
	public GeoCode getGeoCode() {
		return geoCode;
	}
}
