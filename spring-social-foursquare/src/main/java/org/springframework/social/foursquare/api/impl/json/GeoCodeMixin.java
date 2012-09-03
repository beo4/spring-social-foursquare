package org.springframework.social.foursquare.api.impl.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.social.foursquare.api.GeoCodeFeature;

@JsonIgnoreProperties(ignoreUnknown=true)
abstract class GeoCodeMixin {
	@JsonCreator
	GeoCodeMixin(
			@JsonProperty("feature") GeoCodeFeature feature){}
}
