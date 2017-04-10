package pl.pcz.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.TextBox;


public class petstore implements EntryPoint {

	private Label id = new Label("Id:");
	private Label name = new Label("Name:");    
	private Label category = new Label("Category:");

	private TextBox Tid = new TextBox();
	private TextBox Tname = new TextBox();
	private TextBox Tcategory = new TextBox();

    public void onModuleLoad() {

	//glowny verticalPanel
	VerticalPanel vp1 = new VerticalPanel();
	Label l1 = new Label("Petstore");  
	//l1.setStyleName("test");
	//class = "gwt-label sec"
	vp1.addStyleName("body");
	l1.addStyleName("test");

	l1.setStylePrimaryName("etykieta");
	vp1.setSpacing(8);
    	vp1.add(l1);

	//srodkowa tabela
	HorizontalPanel hp1 = new HorizontalPanel();
	FlexTable ft = new FlexTable();
	ft.setText(0, 0, "12345");
	ft.setText(0, 1, "Slot"); 
	VerticalPanel vp2 = new VerticalPanel();
	

	ft.setStylePrimaryName("ft");

	//id, name, category
	HorizontalPanel Hid= new HorizontalPanel();
	Hid.add(id);
	Hid.add(Tid);

	id.addStyleName("id");
	name.addStyleName("name");
	category.addStyleName("category");
	
	HorizontalPanel Hname= new HorizontalPanel();
	Hname.add(name);
	Hname.add(Tname);
	

	HorizontalPanel Hcategory= new HorizontalPanel();
	Hcategory.add(category);
	Hcategory.add(Tcategory);
	


	vp2.add(Hid);
	vp2.add(Hname);
	vp2.add(Hcategory);
	//stopka

 	FlowPanel flow = new FlowPanel(); 
	Label kontakt = new Label("Kontak: ");
	Anchor link = new Anchor("office@petstore.pcz.pl");
	flow.add(kontakt);
	flow.add(link);
	flow.addStyleName("stopka");

	// dodanie do srodkowej czesci tabeli i danych
	hp1.add(ft);
	hp1.add(vp2);
	// dodanie drugiego wiersza i stopki
	vp1.add(hp1);
	vp1.add(flow);

    	RootPanel.get().add(vp1);
	


  }
}
