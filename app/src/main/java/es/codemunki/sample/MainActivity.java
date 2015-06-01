package es.codemunki.sample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;


public class MainActivity extends Activity implements MessageFragment.OnFragmentInteractionListener {
    public final static String EXTRA_MESSAGE = "es.codemunki.sample.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_search:
                openSearch();
                return true;
            case R.id.action_settings:
                openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void openSearch() {

    }

    private void openSettings() {

    }

    public void sendMessage(View view) {
        // Get the message the user has entered
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();

        // Create an instance of the fragment
        MessageFragment messageFragment = MessageFragment.newInstance(message);
        // Add the fragment to the container
        getFragmentManager().beginTransaction().add(R.id.message_container, messageFragment).commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
