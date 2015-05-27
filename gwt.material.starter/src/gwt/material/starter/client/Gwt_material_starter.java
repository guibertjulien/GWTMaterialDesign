package gwt.material.starter.client;

import gwt.material.starter.client.panel.HomePanel;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Gwt_material_starter implements EntryPoint {

	public void onModuleLoad() {
		RootPanel.get().add(new HomePanel());
	}
}
