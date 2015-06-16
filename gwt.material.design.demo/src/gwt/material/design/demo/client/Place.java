package gwt.material.design.demo.client;

import gwt.material.design.client.ui.MaterialScrollspy;
import gwt.material.design.demo.client.panel.MaterialBadges;
import gwt.material.design.demo.client.panel.MaterialButtonPanel;
import gwt.material.design.demo.client.panel.MaterialCard;
import gwt.material.design.demo.client.panel.MaterialCollapsibles;
import gwt.material.design.demo.client.panel.MaterialCollectionPanel;
import gwt.material.design.demo.client.panel.MaterialColors;
import gwt.material.design.demo.client.panel.MaterialDialogs;
import gwt.material.design.demo.client.panel.MaterialDropDowns;
import gwt.material.design.demo.client.panel.MaterialFooterPanel;
import gwt.material.design.demo.client.panel.MaterialForms;
import gwt.material.design.demo.client.panel.MaterialGettingStarted;
import gwt.material.design.demo.client.panel.MaterialGrid;
import gwt.material.design.demo.client.panel.MaterialHelper;
import gwt.material.design.demo.client.panel.MaterialHome;
import gwt.material.design.demo.client.panel.MaterialIcons;
import gwt.material.design.demo.client.panel.MaterialLoaders;
import gwt.material.design.demo.client.panel.MaterialMedia;
import gwt.material.design.demo.client.panel.MaterialNavigations;
import gwt.material.design.demo.client.panel.MaterialScrollspyPanel;
import gwt.material.design.demo.client.panel.MaterialShadow;
import gwt.material.design.demo.client.panel.MaterialShowcase;
import gwt.material.design.demo.client.panel.MaterialTable;
import gwt.material.design.demo.client.panel.MaterialTabsPanel;
import gwt.material.design.demo.client.panel.MaterialTheme;
import gwt.material.design.demo.client.panel.MaterialTransitions;

import com.google.gwt.user.client.ui.Widget;

/**
 * This enum shows all the possible history tokens supported in the application
 */
public enum Place {
	about {
		@Override
		public String getTitle() {
			return "GWT Material";
		}
		@Override
		public String getDescription() {
			return "A  Material Design look and feel for GWT Apps plus Phonegap.";
		}
		@Override
		public Widget getContent() {
			return new MaterialHome();
		}
	},
	gettingstarted {
		@Override
		public String getTitle() {
			return "Getting Started";
		}
		@Override
		public String getDescription() {
			return "Learn how to easily start using GWT Material Design in your app.";
		}
		@Override
		public Widget getContent() {
			return new MaterialGettingStarted();
		}
	},
	buttons {
		@Override
		public String getTitle() {
			return "Buttons";
		}
		@Override
		public String getDescription() {
			return "There are 3 main button types described in material design. The raised button is a standard button that signify actions and seek to give depth to a mostly flat page. The floating circular action button is meant for very important functions. Flat buttons are usually used within elements that already have depth like cards or modals.";
		}
		@Override
		public Widget getContent() {
			return new MaterialButtonPanel();
		}
	},
	forms {
		@Override
		public String getTitle() {
			return "Forms";
		}

		@Override
		public String getDescription() {
			return "Forms are the standard way to receive user inputted data. The transitions and smoothness of these elements are very important because of the inherent user interaction associated with forms.";
		}
		@Override
		public Widget getContent() {
			return new MaterialForms();
		}
	},
	dialogs {
		@Override
		public String getTitle() {
			return "Dialogs";
		}

		@Override
		public String getDescription() {
			return "Dialogs are content that are not original visible on a page but show up with extra information if needed. The transitions should make the appearance of the dialog make sense and not jarring to the user.";
		}
		@Override
		public Widget getContent() {
			return new MaterialDialogs();
		}
	},
	loaders {
		@Override
		public String getTitle() {
			return "Loaders";
		}
		@Override
		public String getDescription() {
			return "If you have content that will take a long time to load, you should give the user feedback. For this reason we provide a number activity + progress indicators.";
		}
		@Override
		public Widget getContent() {
			return new MaterialLoaders();
		}
	},
	media {
		@Override
		public String getTitle() {
			return "Media";
		}
		@Override
		public String getDescription() {
			return "Media components include things that have to do with large media objects like Images, Video, Audio, etc.";
		}
		@Override
		public Widget getContent() {
			return new MaterialMedia();
		}
	},
	cards {
		@Override
		public String getTitle() {
			return "Cards";
		}
		@Override
		public String getDescription() {
			return "Cards are a convenient means of displaying content composed of different types of objects. They are also well-suited for presenting similar objects whose size or supported actions can vary considerably, like photos with captions of variable length.";
		}
		@Override
		public Widget getContent() {
			return new MaterialCard();
		}
	},
	navigations {

		@Override
		public String getTitle() {
			return "NavBar";
		}
		@Override
		public String getDescription() {
			return "The navbar is fully contained by an HTML5 Nav tag. Inside a recommended container div, there are 2 main parts of the navbar. A logo or brand link, and the navigations links. You can align these links to the left or right.";
		}
		@Override
		public Widget getContent() {
			return new MaterialNavigations();
		}
	},
	collapsibles {
		@Override
		public String getTitle() {
			return "Collapsibles";
		}
		@Override
		public String getDescription() {
			return "Collapsibles are accordion elements that expand when clicked on. They allow you to hide content that is not immediately relevant to the user.";
		}
		@Override
		public Widget getContent() {
			return new MaterialCollapsibles();
		}
	},
	dropdowns {
		@Override
		public String getTitle() {
			return "Dropdown";
		}
		@Override
		public String getDescription() {
			return "You can add dropdown easily by specifying it's item content and add a UiHandler on it to implement any event.";
		}
		@Override
		public Widget getContent() {
			return new MaterialDropDowns();
		}
	},
	footer {
		@Override
		public String getTitle() {
			return "Footer";
		}
		@Override
		public String getDescription() {
			return "Footers are a great way to organize a lot of site navigation and information at the end of a page. This is where the user will look once hes finished scrolling through the current page or is looking for additional information about your website.";
		}
		@Override
		public Widget getContent() {
			return new MaterialFooterPanel();
		}
	},
	tabs {
		@Override
		public String getTitle() {
			return "Tabs";
		}
		@Override
		public String getDescription() {
			return "The tabs structure consists of an unordered list of tabs that have hashes corresponding to tab ids. Then when you click on each tab, only the container with the corresponding tab id will become visible.";
		}
		@Override
		public Widget getContent() {
			return new MaterialTabsPanel();
		}
	},
	collections {
		@Override
		public String getTitle() {
			return "Collections";
		}
		@Override
		public String getDescription() {
			return "Collections allow you to group list objects together.";
		}
		@Override
		public Widget getContent() {
			return new MaterialCollectionPanel();
		}
	},
	badges {
		@Override
		public String getTitle() {
			return "Badges";
		}
		@Override
		public String getDescription() {
			return "Badges can notify you that there are new or unread messages or notifications. Add the new class to the badge to give it the background.";
		}
		@Override
		public Widget getContent() {
			return new MaterialBadges();
		}
	},
	grid {
		@Override
		public String getTitle() {
			return "Grid";
		}
		@Override
		public String getDescription() {
			return "We are using a standard 12 column fluid responsive grid system.The grid helps you layout your page in an ordered, easy fashion";
		}
		@Override
		public Widget getContent() {
			return new MaterialGrid();
		}
	},
	showcase {
		@Override
		public String getTitle() {
			return "Showcase";
		}
		@Override
		public String getDescription() {
			return "Great Example showcases about the implementation of Material Design in GWT";
		}
		@Override
		public Widget getContent() {
			return new MaterialShowcase();
		}
	},
	transition {
		@Override
		public String getTitle() {
			return "Transitions";
		}
		@Override
		public String getDescription() {
			return "Motion design can effectively guide the user�s attention in ways that both inform and delight. Use motion to smoothly transport users between navigational contexts, explain changes in the arrangement of elements on a screen, and reinforce element hierarchy";
		}
		@Override
		public Widget getContent() {
			return new MaterialTransitions();
		}
	},
	shadow {
		@Override
		public String getTitle() {
			return "Shadow";
		}
		@Override
		public String getDescription() {
			return "In material design, everything should have a certain z-depth that determines how far raised or close to the page the element is.";
		}
		@Override
		public Widget getContent() {
			return new MaterialShadow();
		}
	},
	theme {
		@Override
		public String getTitle() {
			return "Theming";
		}
		@Override
		public String getDescription() {
			return "You can customize your desired theme for GWT Apps by changing the stylesheet path to any built in theme we made thru SASS.";
		}
		@Override
		public Widget getContent() {
			return new MaterialTheme();
		}
	},
	table {
		@Override
		public String getTitle() {
			return "Table";
		}
		@Override
		public String getDescription() {
			return "Tables are a nice way to organize a lot of data. We provide a few utility classes to help you style your table as easily as possible. In addition, to improve mobile experience, all tables on mobile-screen widths are centered automatically.";
		}
		@Override
		public Widget getContent() {
			return new MaterialTable();
		}
	},
	helper{
		@Override
		public String getTitle() {
			return "Helper";
		}
		@Override
		public String getDescription() {
			return "";
		}
		@Override
		public Widget getContent() {
			return new MaterialHelper();
		}
	},
	gettingStarted{
		@Override
		public String getTitle() {
			return "Getting Started";
		}
		@Override
		public String getDescription() {
			return "Learn how to easily start using GWT Material Design in your app.";
		}
		@Override
		public Widget getContent() {
			return new MaterialGettingStarted();
		}
	},
	icons{
		@Override
		public String getTitle() {
			return "Icons";
		}
		@Override
		public String getDescription() {
			return "We have included 740 Material Design Icons courtesy of Google. You can download them directly from the Material Design specs. The icon font was made and packed by Bootstrap Material Design.";
		}
		@Override
		public Widget getContent() {
			return new MaterialIcons();
		}
	},
	colors{
		@Override
		public String getTitle() {
			return "Colors";
		}
		@Override
		public String getDescription() {
			return "";
		}
		@Override
		public Widget getContent() {
			return new MaterialColors();
		}
	},
	scrollspy{
		@Override
		public String getTitle() {
			return "ScrollSpy";
		}
		@Override
		public String getDescription() {
			return "Scrollspy is a jQuery plugin that tracks certain elements and which element the user's screen is currently centered on. Our main demo of this is our table of contents on every documentation page to the right. Clicking on these links will also scroll the page to that element.";
		}
		@Override
		public Widget getContent() {
			return new MaterialScrollspyPanel();
		}
	};
	public abstract String getTitle();
	public abstract String getDescription();
	public abstract Widget getContent();
}