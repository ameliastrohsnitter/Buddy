/**
 * 
 */
package aau.group52.tilbud.buddy.actions;

import android.app.Activity;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;
import android.view.View;

/**
 * @author Maksim
 *
 */
public class ActionBarListener extends ActionBarDrawerToggle {

	public ActionBarListener(Activity activity, DrawerLayout drawerLayout,
			int drawerImageRes, int openDrawerContentDescRes,
			int closeDrawerContentDescRes) {
		super(activity, drawerLayout, drawerImageRes, openDrawerContentDescRes,
				closeDrawerContentDescRes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onDrawerClosed(View drawerView) {
		// TODO Auto-generated method stub
		super.onDrawerClosed(drawerView);
	}

	@Override
	public void onDrawerOpened(View drawerView) {
		// TODO Auto-generated method stub
		super.onDrawerOpened(drawerView);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		return super.onOptionsItemSelected(item);
	}
	
	

}
