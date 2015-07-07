package gwt.material.design.demo.client.panel.table;

import gwt.material.design.client.ui.MaterialCheckBox;

import com.google.gwt.cell.client.CheckboxCell;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;

public class MaterialCheckboxCell extends CheckboxCell {

	public MaterialCheckboxCell() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MaterialCheckboxCell(boolean dependsOnSelection, boolean handlesSelection) {
		super(dependsOnSelection, handlesSelection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(com.google.gwt.cell.client.Cell.Context context, Boolean value, SafeHtmlBuilder sb) {
		// TODO Auto-generated method stub
		MaterialCheckBox checkBox = new MaterialCheckBox();
		SafeHtml html = SafeHtmlUtils.fromTrustedString(checkBox.toString());
		sb.append(html);
		super.render(context, value, sb);
	}

}
