package kaneki.com.flutternative;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FlutterNativeActivity extends AppCompatActivity {
	ImageView btnBackFlutterView;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.flutter_native_activity_layout);

		btnBackFlutterView = findViewById(R.id.btnOnBackFlutterView2);
		handleClick();
	}

	public void handleClick() {
		btnBackFlutterView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				final Intent data = new Intent();
				setResult(Activity.RESULT_OK, data);
				finish();
			}
		});
	}
}
