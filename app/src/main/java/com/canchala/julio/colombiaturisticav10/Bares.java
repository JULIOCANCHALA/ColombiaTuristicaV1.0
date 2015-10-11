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

public class Bares extends AppCompatActivity {

    private bar[] datos=new bar[]{
            new bar(R.string.nameb1,R.string.clubnybar,R.string.dirb1,R.string.tc,R.drawable.ryj1,R.drawable.ryj2),
            new bar(R.string.nameb2,R.string.clubnybar,R.string.dirb2,R.string.tc,R.drawable.ole1,R.drawable.ole2),
            new bar(R.string.nameb3,R.string.barypar,R.string.dirb3,R.string.tc,R.drawable.m1,R.drawable.m2),
            new bar(R.string.nameb4,R.string.clubn,R.string.dirb4,R.string.tc,R.drawable.man1,R.drawable.man2),

    };

    private ListView baress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bares);

        adapter adaptador=new adapter(this,datos);

        baress=(ListView)findViewById(R.id.menubares);

        baress.setAdapter(adaptador);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bares, menu);
        return true;
    }

    class adapter extends ArrayAdapter<bar>{
        public adapter(Context context,bar[] datos){
            super(context, R.layout.item3,datos);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {


            LayoutInflater inflater=LayoutInflater.from(getContext());
            View item=inflater.inflate(R.layout.item3, null);

            TextView bar=(TextView) item.findViewById(R.id.nombar);
            bar.setText(datos[position].getNbar());

            TextView tipo=(TextView) item.findViewById(R.id.tipobar);
            tipo.setText(datos[position].getTbar());

            TextView dir=(TextView) item.findViewById(R.id.dircbar);
            dir.setText(datos[position].getDirc());

            TextView tar=(TextView) item.findViewById(R.id.tjt);
            tar.setText(datos[position].getTj());

            ImageView fbar1=(ImageView) item.findViewById(R.id.fotobar1);
            fbar1.setImageResource(datos[position].getIdfotobar1());

            ImageView fbar2=(ImageView) item.findViewById(R.id.fotobar2);
            fbar2.setImageResource(datos[position].getIdfotobar2());

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
