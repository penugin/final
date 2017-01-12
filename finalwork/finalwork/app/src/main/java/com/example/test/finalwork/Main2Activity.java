package com.example.test.finalwork;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


/*public class myAdapter extends BaseAdapter{
    private Data[] data;
    private int view;

    public myAdapter(Data[] data, int view){
        this.data=data;
        this.view=view;
    }
    @Override
    public int getCount(){return data.length}
}*/
public class Main2Activity extends AppCompatActivity {
    Button back, FB,add;
    TextView name,tell,name2,tell2,add2;
    Double a,b,c;
    Bundle bundle2 = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        back = (Button) findViewById(R.id.back);
        add = (Button) findViewById(R.id.add);
        FB = (Button) findViewById(R.id.FB);
        add2 = (TextView) findViewById(R.id.add2);
        name = (TextView) findViewById(R.id.name);
        tell = (TextView) findViewById(R.id.tell);
        name2 = (TextView) findViewById(R.id.name2);
        tell2 = (TextView) findViewById(R.id.tell2);


        final ImageView photo = (ImageView) findViewById(R.id.photo);


       // MyDBHelper dbHelper=new MyDBHelper(this);
      //  db=dbHelper.getWritableDatabase();

       // String namm = "廖添富";
      //  String tee = "0975001717";
       // String addd = "桃園";

       // ContentValues cv=new ContentValues();
       // cv.put("NAME", namm);
       // cv.put("TELL", tee);
       // cv.put("ADD", addd);
       // db.insert("myTable",null,cv);
     //   cv.clear();

      //  String[] colum={"NAME", "TELL", "ADD"};
        //cursor=db.query("myTable ", colum, null, null, null, null, null);


        //getall();


        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();

        a = bundle.getDouble("a0");
        b = bundle.getDouble("b0");
        c = bundle.getDouble("c0");


        if (a == 1 && b == 1 && c == 1) {

            name2.setText("徐銘群");
            tell2.setText("0988-298-921");
            add2.setText("玉山首邸大廈\n" +
                      "台北市萬華區愛國西路");
            photo.setBackgroundResource(R.drawable.f07);
            FB.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View view) {
                    Uri uri = Uri.parse("https://www.facebook.com/qi.e.3914207");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
        } else if (a == 1 && b == 1 && c == 2) {

            name2.setText("陳建安");
            tell2.setText("0988-352-118");
            add2.setText("中山國小");
            photo.setBackgroundResource(R.drawable.f03);
            FB.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View view) {
                    Uri uri = Uri.parse("https://www.facebook.com/profile.php?id=100002516212563&fref=ts");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
        } else if (a == 1 && b == 2 && c == 1) {

            name2.setText("楊騏瑋");
            tell2.setText("0905-121-312");
            add2.setText("台北市大安區金華街193號");
            photo.setBackgroundResource(R.drawable.f04);
            FB.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View view) {
                    Uri uri = Uri.parse("https://www.facebook.com/profile.php?id=100000346246889&fref=ts");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
        } else if (a == 2 && b == 1 && c == 1) {

            name2.setText("廖添富");
            tell2.setText("0975-001-717");
            add2.setText("台北市大安區龍泉街7號");
            photo.setBackgroundResource(R.drawable.f05);
            FB.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View view) {
                    Uri uri = Uri.parse("https://www.facebook.com/fu.rock.3?fref=ts");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
        } else {

            name2.setText("郭冠景");
            tell2.setText("0921-289-289");
            add2.setText("台北市松山區南京東路五段10號");
            photo.setBackgroundResource(R.drawable.f06);
            FB.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View view) {
                    Uri uri = Uri.parse("https://www.facebook.com/Maxwell.kuo.3314?ref=ts&fref=ts&qsefr=1");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
        }

        back.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Main2Activity.this, MainActivity.class);
                startActivity(intent);
                Main2Activity.this.finish();
            }
        });

        add.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Main2Activity.this, Main3Activity.class);
                bundle2.putDouble("aa",a);
                bundle2.putDouble("bb",b);
                bundle2.putDouble("cc",c);
                intent.putExtras(bundle2);
                startActivityForResult(intent,88);
                Main2Activity.this.finish();
            }
        });



        //UpdateAdapter(cursor);
    }

    /*public void  UpdateAdapter(Cursor cursor){
         String name,tell,add;
         if(cursor!=null && cursor.getCount()>0){
             cursor.moveToFirst();
             name=cursor.getString(0);
             tell=cursor.getString(1);
             add=cursor.getString(2);

             name2.setText(name);
             tell2.setText(tell);
             add2.setText(add);
         }
     }
    public void getall(){
         String name="",tell="",add="";
         String[]colum={"NAME","TELL","ADD"};
         Cursor cursor;
         cursor=db.query("myTable ",colum,null,null,null,null,null );

         if(cursor.getCount()>0) {
             cursor.moveToFirst();

             for(int i=0;i<cursor.getCount();i++) {
                 name += cursor.getString(0);
                 tell += cursor.getString(1);
                 add  += cursor.getString(2);
                 cursor.moveToNext();
             }
             name2.setText(name);
             tell2.setText(tell);
             add2.setText(add);
             Toast.makeText(this,"end",Toast.LENGTH_SHORT).show();
         }
     }*/


}
