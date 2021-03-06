package org.discotools.gwt.leaflet.client.controls.zoom;

import org.discotools.gwt.leaflet.client.controls.ControlOptions;


/**
 * ControlZoomOptions class
 * @author Lionel Leiva-Marcon
 *
 */
public class ZoomOptions extends ControlOptions  {

	public ZoomOptions() {
		 super();
	}

	public ZoomOptions setPosition(String position) {
		 return (ZoomOptions)setProperty("position", position);
	}

}
