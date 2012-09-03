package org.springframework.social.foursquare.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.foursquare.api.GeoCodeGeometry;

@JsonIgnoreProperties(ignoreUnknown=true)
abstract class GeoCodeFeatureMixin {
	@JsonCreator
	GeoCodeFeatureMixin(
			@JsonProperty("cc") String cc,
			@JsonProperty("geometry") GeoCodeGeometry geoCodeGeometry,
			@JsonProperty("name") String name,
			@JsonProperty("displayName") String displayName,
			@JsonProperty("woeType") String woeType,
			@JsonProperty("attribution") String[] attribution){}
}
