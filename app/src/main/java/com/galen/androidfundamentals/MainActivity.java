
/**
 * MAINACTIVITY CLASS
 * Handles functions contained within the MainActivity activity.
 */

package com.galen.androidfundamentals;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
    // Define key for Intent's extra using package prefix for uniqueness
    public final static String EXTRA_MESSAGE = "com.galen.androidFundamentals.MESSAGE";


    // Custom method for sending message on button press
    public void sendMessage(View view) {
        // Create Intent for binding separate activities
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        // Create EditText element from edit_message ID
        EditText editText = (EditText) findViewById(R.id.edit_message);
        // Assign text to local variable
        String message = editText.getText().toString();
        // Add text value to Intent via putExtra(NAME, value)
        intent.putExtra(EXTRA_MESSAGE, message);
        // Finish Intent by calling activity start
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search:
                // openSearch();
                return true;
            case R.id.action_settings:
                // openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
