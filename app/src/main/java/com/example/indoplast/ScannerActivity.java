package com.example.indoplast;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import com.google.android.gms.vision.text.Text;

import java.io.IOException;
import java.util.Arrays;


public class ScannerActivity extends AppCompatActivity {


    SurfaceView surfaceView;
    CameraSource cameraSource;
    TextView qr_text;
    BarcodeDetector barcodeDetector;
    public String qr_text_str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);

        Handler qr_handler = new Handler();

        surfaceView = findViewById(R.id.surfaceView);
        qr_text = findViewById(R.id.textViewQR);

        barcodeDetector = new BarcodeDetector.Builder(this)
                .setBarcodeFormats(Barcode.QR_CODE).build();

        cameraSource = new CameraSource.Builder(this, barcodeDetector)
                .setRequestedPreviewSize(640, 480).build();

        surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(SurfaceHolder holder) {
                if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }

                try {
                    cameraSource.start(holder);
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }

            }

            @Override
            public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

            }

            @Override
            public void surfaceDestroyed(SurfaceHolder holder) {

                cameraSource.stop();

            }
        });

        barcodeDetector.setProcessor(new Detector.Processor<Barcode>() {
            @Override
            public void release() {

            }

            @Override
            public void receiveDetections(Detector.Detections<Barcode> detections) {

                final SparseArray<Barcode> qrCodes  =  detections.getDetectedItems();

                qr_text_str = qrCodes.valueAt(0).toString();


                if (qrCodes.size()!=0 )
                {
                    qr_text.post(new Runnable() {
                        @Override
                        public void run() {

//                           qr_text.setText(qrCodes.valueAt(0).displayValue);

                           //qr_text_str = Arrays.toString(qrCodes);
                           // qr_text_str = qrCodes.indexOfValue(Text);
                           qr_text_str = String.valueOf(qrCodes.valueAt(0).rawValue);

                            qr_text.setText(qr_text_str);



                        }
                    });

                }
                //qr_text_str = qrCodes.valueAt(0).toString();

            }
        });


        Toast.makeText(this, ""+qr_text_str, Toast.LENGTH_SHORT).show();
        Log.i("qr",qr_text_str);



        Toast.makeText(this, ""+qr_text_str, Toast.LENGTH_SHORT).show();
        Log.i("qr",qr_text_str);



        if( qr_text_str == " IP ")
        {
            Toast.makeText(this, " No Mould Code Found ", Toast.LENGTH_SHORT).show();

            qr_handler.postDelayed(new Runnable() {
                public void run() {
                    finish();
                }
            }, 4000);
        }

        else
        {
            Intent scanner_intent = new Intent();
            scanner_intent.putExtra("mould_code", qr_text_str);

            //Log.d("qr", qr_text_str);

            qr_handler.postDelayed(new Runnable() {
                public void run() {
                    finish();
                }
            }, 4000);

        }



    }



}
