
/**
 * DISPLAYMESSAGE CLASS
 * Handles functions contained within the DisplayMessageActivity activity.
 */

package com.galen.androidfundamentals;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class DisplayMessageActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set app icon as UP button back to parent activity
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Get message from Intent which called this activity
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        // Assemble text view
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);
        // Set textview as activity layout
        setContentView(textView);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
