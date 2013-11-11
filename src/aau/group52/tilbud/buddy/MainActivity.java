package aau.group52.tilbud.buddy;

import aau.group52.tilbud.buddy.fragments.BestOffers;
import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.app.ListActivity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class MainActivity extends Activity {
private String[] leftCatList;
private ListView leftDrawerList ;
private ActionBar bar;
private DrawerLayout drawerLayout;
private Resources res;
private BestOffers bestOffers;
 private FragmentTransaction fTrans;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		// init all Views 
		
		init();
		
	}
    
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.bar_menu, menu);

		return true;
	}
	/**
	 * Method to initialize resources of the app and main gui.
	 */
    private void init(){
    	res = getResources();
    	//Getting action bar object reference and enabling < button with app. icon 
    	bar=getActionBar(); bar.setDisplayHomeAsUpEnabled(true);
    	//loading resources from res folder, string.xml, main.xml
    	leftCatList = res.getStringArray(R.array.settingsList);
    	leftDrawerList = (ListView) findViewById(R.id.left_drawer);
    	
    	
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        //Loading string array defined in /values/strings.xml and passing item layout from Layout/leftitemlayout.xml
        leftDrawerList.setAdapter(new ArrayAdapter<String>(this, R.layout.rightitemlayout, leftCatList));
       
    	bar.show();
    	//Loading fragment into activity
    	bestOffers = new BestOffers();
    	fTrans=getFragmentManager().beginTransaction();
    	fTrans.add(R.id.frgmCont, bestOffers);
    	fTrans.commit();
    }
    
    
}
