package gwt.material.design.demo.client.panel.table;

import gwt.material.design.client.ui.MaterialListBox;

import java.util.List;

import com.google.gwt.cell.client.SelectionCell;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class MaterialSelectionCell extends SelectionCell{

	public MaterialSelectionCell(List<String> options) {
		super(options);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(com.google.gwt.cell.client.Cell.Context context, String value, SafeHtmlBuilder sb) {
		MaterialListBox listbox = new MaterialListBox();
		

		
		super.render(context, value, sb);
	}

	
	
}
