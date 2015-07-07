package gwt.material.design.demo.client.panel.table;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.google.gwt.cell.client.SelectionCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.ColumnSortEvent.ListHandler;
import com.google.gwt.user.cellview.client.DataGrid;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.SimplePager.TextLocation;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.MultiSelectionModel;
import com.google.gwt.view.client.ProvidesKey;
import com.google.gwt.view.client.SelectionModel;

public class MaterialCellTable extends Composite {

	private static OrderDTOTableUiBinder uiBinder = GWT.create(OrderDTOTableUiBinder.class);

	interface OrderDTOTableUiBinder extends UiBinder<Widget, MaterialCellTable> {
	}

	private List<OrderDTO> orders = new ArrayList<OrderDTO>();

	private DataGrid<OrderDTO> dataGrid;
	private ListDataProvider<OrderDTO> orderDTOProvider;
	private ListHandler<OrderDTO> sortDataHandler;
	private final ProvidesKey<OrderDTO> KEY_PROVIDER = new ProvidesKey<OrderDTO>() {

		@Override
		public Object getKey(OrderDTO item) {
			return item.getId();
		}
	};

	private final SelectionModel<OrderDTO> selectionModel = new MultiSelectionModel<OrderDTO>(KEY_PROVIDER);

	private OrderDTO OrderDTO;

	@UiField
	SimplePanel gridPanel, pagerPanel;

	public MaterialCellTable() {
		initWidget(uiBinder.createAndBindUi(this));
		setGrid();
	}

	private void setGrid() {
		dataGrid = createDatagrid();
		gridPanel.setWidget(dataGrid);
		refreshData();
	}

	private void refreshData() {
		orderDTOProvider.setList(new ArrayList<OrderDTO>());
		getAllOrderDTO();
	}

	private DataGrid<OrderDTO> createDatagrid() {

		this.sortDataHandler = new ListHandler<OrderDTO>(new ArrayList<OrderDTO>());

		Column<OrderDTO, Boolean> checkColumn = new Column<OrderDTO, Boolean>(new MaterialCheckboxCell(true, false)) {
			@Override
			public Boolean getValue(OrderDTO object) {
				boolean value = selectionModel.isSelected(object);

				return value;
			}
		};

		TextColumn<OrderDTO> colUser = new TextColumn<OrderDTO>() {
			@Override
			public String getValue(OrderDTO object) {

				return object.getUser();
			}
		};
		colUser.setSortable(true);
		sortDataHandler.setComparator(colUser, new Comparator<OrderDTO>() {

			@Override
			public int compare(OrderDTO o1, OrderDTO o2) {

				return o1.getUser().compareTo(o2.getUser());
			}
		});

		TextColumn<OrderDTO> colName = new TextColumn<OrderDTO>() {
			@Override
			public String getValue(OrderDTO object) {

				return object.getName();
			}
		};
		colName.setSortable(true);
		sortDataHandler.setComparator(colName, new Comparator<OrderDTO>() {

			@Override
			public int compare(OrderDTO o1, OrderDTO o2) {

				return o1.getName().compareTo(o2.getName());
			}
		});

		TextColumn<OrderDTO> colPrice = new TextColumn<OrderDTO>() {
			@Override
			public String getValue(OrderDTO object) {

				return object.getPrice();
			}
		};
		colPrice.setSortable(true);
		sortDataHandler.setComparator(colPrice, new Comparator<OrderDTO>() {

			@Override
			public int compare(OrderDTO o1, OrderDTO o2) {

				return o1.getPrice().compareTo(o2.getPrice());
			}
		});

		SelectionCell versionCell = new SelectionCell(getVersions());
		Column<OrderDTO, String> versionCol = new Column<OrderDTO, String>(versionCell) {
			@Override
			public String getValue(OrderDTO object) {
				return object.getVersion();
			}
		};

		final DataGrid<OrderDTO> dataGrid = new DataGrid<OrderDTO>(100, KEY_PROVIDER);
		dataGrid.setSize("100%", "75vh");

		dataGrid.addColumn(checkColumn, "Action");
		dataGrid.setColumnWidth(checkColumn, "40px");
		dataGrid.addColumn(colUser, "User");
		dataGrid.addColumn(colName, "Item Name");
		dataGrid.addColumn(colPrice, "Price");
		dataGrid.addColumn(versionCol, "Version");

		dataGrid.addStyleName("responsive-table");

		SimplePager.Resources pagerResources = GWT.create(SimplePager.Resources.class);
		SimplePager pager = new SimplePager(TextLocation.CENTER, pagerResources, false, 0, true);
		pager.setDisplay(dataGrid);

		orderDTOProvider = new ListDataProvider<OrderDTO>();
		orderDTOProvider.addDataDisplay(dataGrid);
		dataGrid.addColumnSortHandler(sortDataHandler);

		return dataGrid;

	}

	private void getAllOrderDTO() {
		orders.add(new OrderDTO(1, "Marjorie", "Nexus", "Php 30000"));
		orders.add(new OrderDTO(1, "Karah", "Asus", "Php 23000"));
		orders.add(new OrderDTO(1, "Xenia", "Oppo", "Php 30000"));
		orders.add(new OrderDTO(1, "Alejandria", "Samsung", "Php 40000"));
		orderDTOProvider.setList(orders);
		sortDataHandler.setList(orderDTOProvider.getList());
	}

	public OrderDTO getOrderDTO() {
		return OrderDTO;
	}

	public void setOrderDTO(OrderDTO OrderDTO) {
		this.OrderDTO = OrderDTO;
	}

	private List<String> getVersions() {
		List<String> versions = new ArrayList<String>();
		versions.add("Lollipop");
		versions.add("Kitkat");
		versions.add("Jelly Bean");
		return versions;
	}

}
