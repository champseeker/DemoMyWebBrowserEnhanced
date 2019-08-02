package sg.edu.rp.c346.demomywebbrowserenhanced;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnLoadURL;
    EditText etURL;
    WebView wvMyPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoadURL = findViewById(R.id.buttonLoad);
        etURL = findViewById(R.id.etUrl);
        wvMyPage = findViewById(R.id.webViewMyPage);

        wvMyPage.setWebViewClient(new WebViewClient());

        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = etURL.getText().toString();
                wvMyPage.loadUrl(url);
                etURL.setVisibility(View.GONE);
                WebSettings webSettings = wvMyPage.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webSettings.setAllowFileAccess(false);
                webSettings.setBuiltInZoomControls(true);

            }
        });

    }
}
