package com.canchala.julio.colombiaturisticav10;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class Hoteles extends AppCompatActivity {

    private hotels[] datos=new hotels[]{
            new hotels(R.string.nameh1,"★★★★★",R.string.dirh1,R.string.rph1,R.drawable.ghl),
            new hotels(R.string.nameh2,"★★★★",R.string.dirh2,R.string.rph2,R.drawable.neivaplaza),
            new hotels(R.string.nameh3,"★★★",R.string.dirh3,R.string.rph3,R.drawable.amer),
            new hotels(R.string.nameh4,"★★★",R.string.dirh4,R.string.rph4,R.drawable.metro)

    };

    private ListView hotelss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);

        adapter adaptad=new adapter(this,datos);

        hotelss=(ListView)findViewById(R.id.menuhotel);

        hotelss.setAdapter(adaptad);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hoteles, menu);
        return true;
    }

    class adapter extends ArrayAdapter<hotels>{
        public adapter(Context context,hotels[] datos){
            super(context, R.layout.item2,datos);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {


            LayoutInflater inflater=LayoutInflater.from(getContext());
            View item=inflater.inflate(R.layout.item2, null);

            TextView hotel=(TextView) item.findViewById(R.id.nomhotel);
            hotel.setText(datos[position].getNombrehotel());

            TextView estre=(TextView) item.findViewById(R.id.stars);
            estre.setText(datos[position].getEstrellas());

            TextView dire=(TextView) item.findViewById(R.id.direccion);
            dire.setText(datos[position].getDirecc());

            TextView rang=(TextView) item.findViewById(R.id.precio);
            rang.setText(datos[position].getRango());

            ImageView fhotel=(ImageView) item.findViewById(R.id.fotohotel);
            fhotel.setImageResource(datos[position].getIdfoto());

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
