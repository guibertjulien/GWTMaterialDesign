package gwt.material.design.demo.client;

import gwt.material.design.client.ui.MaterialSplashScreen;
import gwt.material.design.demo.client.panel.table.MaterialCellTable;
import gwt.material.design.demo.client.resources.MaterialResources;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Gwt_material_design_demo implements EntryPoint {

	public void onModuleLoad() {
		RootPanel.get().add(new MaterialSplashScreen(5000,new MaterialCellTable(),MaterialResources.INSTANCE.ic_splash(), "gwt-material", "Material Design Look and Feel for GWT Apps", "blue", "white"));
	}

}
