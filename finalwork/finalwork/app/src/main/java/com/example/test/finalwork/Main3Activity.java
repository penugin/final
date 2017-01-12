package com.example.test.finalwork;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class Main3Activity extends AppCompatActivity {
    Button button3;

    Double a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button3 = (Button) findViewById(R.id.button3);

        final Bundle bundle3=getIntent().getExtras();

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);

        mapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {
                if(ActivityCompat.checkSelfPermission(Main3Activity.this,
                        android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                        ActivityCompat.checkSelfPermission(Main3Activity.this,
                                android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                a=bundle3.getDouble("aa");
                b=bundle3.getDouble("bb");
                c=bundle3.getDouble("cc");

                if (a == 1 && b == 1 && c == 1){
                    googleMap.setMyLocationEnabled(true);
                    MarkerOptions m1 = new MarkerOptions();
                    m1.position(new LatLng(25.042442, 121.537808));
                    m1.title("台北科技大學");
                    m1.draggable(true);
                    googleMap.addMarker(m1);

                    MarkerOptions m2 = new MarkerOptions();
                    m2.position(new LatLng(25.037203, 121.506123));
                    m2.title("玉山首邸大廈\n" +
                            "台北市萬華區愛國西路");
                    m2.draggable(true);
                    googleMap.addMarker(m2);

                    PolylineOptions polylineOpt = new PolylineOptions();
                    polylineOpt.add(new LatLng(25.041808, 121.537751));
                    polylineOpt.add(new LatLng(25.047319, 121.513277));
                    polylineOpt.add(new LatLng(25.042385, 121.513145));
                    polylineOpt.add(new LatLng(25.042093, 121.508424));
                    polylineOpt.add(new LatLng(25.037171, 121.506808));
                    polylineOpt.add(new LatLng(25.037203, 121.506123));
                    polylineOpt.color(Color.BLUE);
                    Polyline polyline = googleMap.addPolyline(polylineOpt);
                    polyline.setWidth(10);

                    googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(25.033739,121.527886),11));

                }
                else if (a == 1 && b == 1 && c == 2){

                    googleMap.setMyLocationEnabled(true);
                    MarkerOptions m1 = new MarkerOptions();
                    m1.position(new LatLng(25.042442, 121.537808));
                    m1.title("台北科技大學");
                    m1.draggable(true);
                    googleMap.addMarker(m1);

                    MarkerOptions m2 = new MarkerOptions();
                    m2.position(new LatLng(25.041250, 121.516041));
                    m2.title("台大醫院");
                    m2.draggable(true);
                    googleMap.addMarker(m2);

                    PolylineOptions polylineOpt = new PolylineOptions();
                    polylineOpt.add(new LatLng(25.041250, 121.516041));
                    polylineOpt.add(new LatLng(25.046246, 121.517522));
                    polylineOpt.add(new LatLng(25.042442, 121.537808));
                    polylineOpt.color(Color.BLUE);
                    Polyline polyline = googleMap.addPolyline(polylineOpt);
                    polyline.setWidth(10);

                    googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(25.033739,121.527886),11));
                }
                else if (a == 1 && b == 2 && c == 1){

                    googleMap.setMyLocationEnabled(true);
                    MarkerOptions m1 = new MarkerOptions();
                    m1.position(new LatLng(25.042442, 121.537808));
                    m1.title("台北科技大學");
                    m1.draggable(true);
                    googleMap.addMarker(m1);

                    MarkerOptions m2 = new MarkerOptions();
                    m2.position(new LatLng(25.029963, 121.527990));
                    m2.title("台北市大安區金華街193號");
                    m2.draggable(true);
                    googleMap.addMarker(m2);

                    PolylineOptions polylineOpt = new PolylineOptions();
                    polylineOpt.add(new LatLng(25.042049, 121.537186));
                    polylineOpt.add(new LatLng(25.033550, 121.537569));
                    polylineOpt.add(new LatLng(25.033573, 121.529916));
                    polylineOpt.add(new LatLng(25.031317, 121.529509));
                    polylineOpt.add(new LatLng(25.031450, 121.528298));
                    polylineOpt.add(new LatLng(25.029963, 121.527990));
                    polylineOpt.color(Color.BLUE);
                    Polyline polyline = googleMap.addPolyline(polylineOpt);
                    polyline.setWidth(10);
                }
                else if (a == 2 && b == 1 && c == 1){

                    googleMap.setMyLocationEnabled(true);
                    MarkerOptions m1 = new MarkerOptions();
                    m1.position(new LatLng(25.042442, 121.537808));
                    m1.title("台北科技大學");
                    m1.draggable(true);
                    googleMap.addMarker(m1);

                    MarkerOptions m2 = new MarkerOptions();
                    m2.position(new LatLng(25.026173,121.529290));
                    m2.title("台北市大安區龍泉街7號");
                    m2.draggable(true);
                    googleMap.addMarker(m2);

                    PolylineOptions polylineOpt = new PolylineOptions();
                    polylineOpt.add(new LatLng(25.041765,121.537754));
                    polylineOpt.add(new LatLng(25.041746,121.537057));
                    polylineOpt.add(new LatLng(25.039617,121.537861));
                    polylineOpt.add(new LatLng(25.033552,121.537863));
                    polylineOpt.add(new LatLng(25.025658,121.537530));
                    polylineOpt.add(new LatLng(25.026484,121.529312));
                    polylineOpt.add(new LatLng(25.026173,121.529290));
                    polylineOpt.color(Color.BLUE);
                    Polyline polyline = googleMap.addPolyline(polylineOpt);
                    polyline.setWidth(10);
                }
                else {

                    googleMap.setMyLocationEnabled(true);
                    MarkerOptions m1 = new MarkerOptions();
                    m1.position(new LatLng(25.042442, 121.537808));
                    m1.title("台北科技大學");
                    m1.draggable(true);
                    googleMap.addMarker(m1);

                    MarkerOptions m2 = new MarkerOptions();
                    m2.position(new LatLng(25.051999, 121.564906));
                    m2.title("台北市松山區南京東路五段10號");
                    m2.draggable(true);
                    googleMap.addMarker(m2);

                    PolylineOptions polylineOpt = new PolylineOptions();
                    polylineOpt.add(new LatLng(25.041778, 121.537881));
                    polylineOpt.add(new LatLng(25.041392, 121.557644));
                    polylineOpt.add(new LatLng(25.048246, 121.557842));
                    polylineOpt.add(new LatLng(25.049093, 121.565475));
                    polylineOpt.add(new LatLng(25.051348, 121.565336));
                    polylineOpt.add(new LatLng(25.051999, 121.564906));
                    polylineOpt.color(Color.BLUE);
                    Polyline polyline = googleMap.addPolyline(polylineOpt);
                    polyline.setWidth(10);
                }

            }
        });

        /*sent_btn = (button2) findViewById(R.id.button2);
        sent_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent();
                Bundle b = new Bundle();

                i.putExtras(b);
                setResult(101, i);
                finish();*/









        button3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Main3Activity.this, Main2Activity.class);
                Bundle bundle3 = new Bundle();
                bundle3.putDouble("a0",a);
                bundle3.putDouble("b0",b);
                bundle3.putDouble("c0",c);
                intent.putExtras(bundle3);
                startActivityForResult(intent,88);
                Main3Activity.this.finish();

            }
        });


    }
}
