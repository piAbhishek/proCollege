package com.example.procollege;


import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class Syllabus extends AppCompatActivity {

    //PDFView pdfView;

    //String pdfurl = "https://www.cit.ac.in/uploads/1562816131.pdf";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);
        WebView myWebView_syllabus = (WebView)findViewById(R.id.webview_syllabus);
        myWebView_syllabus.loadUrl("https://www.cit.ac.in/pages/uploads/syllabus");

        //pdfView = findViewById(R.id.pdf_syllabus);
        //new RetrivePDFfromUrl().execute(pdfurl);
    }

    /*class RetrivePDFfromUrl extends AsyncTask<String, Void, InputStream>{
        @Override
        protected InputStream doInBackground(String... strings){
            InputStream inputStream = null;
            try {
                URL url = new URL(strings[0]);
                HttpsURLConnection urlConnection = (HttpsURLConnection) url.openConnection();
                if (urlConnection.getResponseCode() == 200){
                    inputStream = new BufferedInputStream(urlConnection.getInputStream());
                }
            } catch (IOException e){
                e.printStackTrace();
                return null;
            }
            return inputStream;
        }

        @Override
        protected void onPostExecute(InputStream inputStream){
            pdfView.fromStream(inputStream).load();
        }*/
}