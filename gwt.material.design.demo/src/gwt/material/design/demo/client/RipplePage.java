package gwt.material.design.demo.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class RipplePage extends Composite {

	private static RipplePageUiBinder uiBinder = GWT.create(RipplePageUiBinder.class);

	interface RipplePageUiBinder extends UiBinder<Widget, RipplePage> {
	}

	public RipplePage() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
