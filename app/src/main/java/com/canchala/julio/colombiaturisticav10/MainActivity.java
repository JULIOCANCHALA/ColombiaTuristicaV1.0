package com.canchala.julio.colombiaturisticav10;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    String[] menus = new String[] { "R.string.titleconócenos" };

    private menu[] datos= new menu[]{
                    new menu(R.drawable.destino,R.string.titleconócenos,R.string.title_activity_turismo, Color.argb(180,255,0,0)),
                    new menu(R.drawable.hoteles,R.string.titlequédate,R.string.title_activity_hoteles,Color.argb(180,255,255,0)),
                    new menu(R.drawable.bares,R.string.titlerumbea,R.string.title_activity_bares,Color.argb(180,0,0,255)),
                    new menu(R.drawable.turismo,R.string.titleexplora,R.string.title_activity_lugares_tu,Color.argb(180,0,255,0)),
                    new menu(R.drawable.conoce,R.string.titleinfórmate,R.string.title_activity_demografia,Color.argb(180,255,0,255)),
            };

    private ListView lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter adaptador=new adapter(this,datos) ;

        lista=(ListView)findViewById(R.id.menu);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int opse=((menu)parent.getItemAtPosition(position)).getTitulo();
                Toast.makeText(MainActivity.this, opse, Toast.LENGTH_SHORT).show();


                Intent intent = null;

                if(opse==R.string.titleconócenos)
                {
                    intent = new Intent(getBaseContext(), Turismo.class);
                }
                if(opse==R.string.titlequédate)
                {
                    intent = new Intent(getBaseContext(), Hoteles.class);
                }
                if(opse==R.string.titlerumbea)
                {
                    intent = new Intent(getBaseContext(), Bares.class);
                }
                if(opse==R.string.titleexplora) {
                    intent = new Intent(getBaseContext(), LugaresTu.class);
                }
                if(opse==R.string.titleinfórmate) {
                    intent = new Intent(getBaseContext(), Demografia.class);
                }
                if(intent != null)
                    startActivity(intent);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    class adapter extends ArrayAdapter<menu>{
        public adapter(Context context,menu[] datos){
            super(context, R.layout.item,datos);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater=LayoutInflater.from(getContext());
            View item=inflater.inflate(R.layout.item, null);

            TextView mtitulo=(TextView) item.findViewById(R.id.titulo);
            mtitulo.setText(datos[position].getTitulo());

            TextView msubtitulo=(TextView) item.findViewById(R.id.sutitulo);
            msubtitulo.setText(datos[position].getSubtitulo());

            ImageView icono=(ImageView) item.findViewById(R.id.imagen);
            icono.setImageResource(datos[position].getIdimagen());

            LinearLayout indica=(LinearLayout) item.findViewById(R.id.indico);
            indica.setBackgroundColor(datos[position].getIdcolor());

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


        if(id==R.id.action_about)
        {
            Intent i=new Intent(this,Acercade.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
}
