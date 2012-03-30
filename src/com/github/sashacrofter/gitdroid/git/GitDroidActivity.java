package com.github.sashacrofter.gitdroid.git;

import com.github.sashacrofter.gitdroid.R;
import com.github.sashacrofter.gitdroid.R.layout;
import com.github.sashacrofter.gitdroid.io.TerminalEmulator;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GitDroidActivity extends Activity {
	
	private TerminalEmulator session;
	
	private Button goButton;
	private EditText commandInput;
	private TextView outputTextView;
	
	private final String tag = "GD";
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
    	Log.d(tag, "called onCreate()");
    	this.session = new TerminalEmulator();
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Log.d(tag, "making View objects");
        
        goButton = (Button) findViewById(R.id.goButton);
        commandInput = (EditText) findViewById(R.id.commandInput);
        outputTextView = (TextView) findViewById(R.id.outputTextView);
        
        goButton.setOnClickListener(
        		new View.OnClickListener() {
					public void onClick(View v) {
						Log.d(tag, "executing command");
						session.execute(commandInput.getText().toString());
					}
				});
    }
    
    public void output(String string)
    {
    	outputTextView.append("\n"+string);
    }
}