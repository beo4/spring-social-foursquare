package org.springframework.social.foursquare.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.foursquare.api.GeoCodeGeoPt;

@JsonIgnoreProperties(ignoreUnknown=true)
abstract class GeoCodeGeoPtMixin {
	@JsonCreator
	GeoCodeGeoPtMixin(
			@JsonProperty("lat") Double lat,
			@JsonProperty("lng") Double lon){}
}
