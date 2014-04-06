package ted.newappt;

import ted.example.newappt.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState);
		 setContentView(R.layout.first);
		 
		 Button button1 = (Button) findViewById(R.id.button1);
		 button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				EditText editText1 = (EditText) findViewById(R.id.edit1);
				String text = editText1.getText().toString();
				Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
				intent.putExtra("tag", text);
				startActivity(intent);
			}
		});
	}
}
