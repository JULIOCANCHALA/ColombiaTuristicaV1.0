package com.canchala.julio.colombiaturisticav10;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class LugaresTu extends AppCompatActivity {

    private turis[] datos=new turis[]{
            new turis(R.string.namet1,R.string.subnamet1,R.string.inft1,R.drawable.malecom, R.drawable.mohan,R.drawable.gaitana),
            new turis(R.string.namet2,R.string.subnamet2,R.string.inft2,R.drawable.liber1, R.drawable.liber2,R.drawable.liber3),
            new turis(R.string.namet3,R.string.subnamet3,R.string.inft3,R.drawable.pn1, R.drawable.pn2,R.drawable.pn3),
            new turis(R.string.namet4,R.string.subnamet4,R.string.inft4,R.drawable.paspe1, R.drawable.paspe2,R.drawable.paspe3),
            new turis(R.string.namet5,R.string.subnamet5,R.string.inft5,R.drawable.tcolo1, R.drawable.tcolo2,R.drawable.tcolo3),
            new turis(R.string.namet6,R.string.subnamet6,R.string.inft6,R.drawable.cab1,R.drawable.cab2,R.drawable.cab3)

    };

    private ListView lugar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugares_tu);

        adapter adaptador=new adapter(this,datos);

        lugar=(ListView)findViewById(R.id.menuluga);

        lugar.setAdapter(adaptador);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lugares_tu, menu);
        return true;
    }

    class adapter extends ArrayAdapter<turis> {
        public adapter(Context context,turis[] datos){
            super(context, R.layout.item4,datos);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {


            LayoutInflater inflater=LayoutInflater.from(getContext());
            View item=inflater.inflate(R.layout.item4, null);

            TextView lugar=(TextView) item.findViewById(R.id.nomtu);
            lugar.setText(datos[position].getLugar());

            TextView infosub=(TextView) item.findViewById(R.id.subtu);
            infosub.setText(datos[position].getSubname());

            TextView info=(TextView) item.findViewById(R.id.infotu);
            info.setText(datos[position].getInfturis());

            ImageView tu1=(ImageView) item.findViewById(R.id.ftu1);
            tu1.setImageResource(datos[position].getIdtu1());

            ImageView tu2=(ImageView) item.findViewById(R.id.ftu2);
            tu2.setImageResource(datos[position].getIdtu2());

            ImageView tu3=(ImageView) item.findViewById(R.id.ftu3);
            tu3.setImageResource(datos[position].getIdtu3());

            return(item);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
