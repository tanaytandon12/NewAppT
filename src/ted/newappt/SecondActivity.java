package ted.newappt;

import ted.example.newappt.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState);
		 setContentView(R.layout.second);
		 
		 Intent intent = getIntent();
		 String someRandomText = intent.getStringExtra("tag");
		 
		 TextView textView1 = (TextView) findViewById(R.id.text2);
		 textView1.setText(someRandomText);
		 
		 Button button1 = (Button) findViewById(R.id.button2);
		 button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(SecondActivity.this,FirstActivity.class);
				startActivity(intent);	}
		});
	}

}
