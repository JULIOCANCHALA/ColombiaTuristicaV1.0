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
            new turis("Malecón del Rio Magdalena","(Mirador Monumento el Mohán, restaurantes, artesanías, parque el Caracolí, Monumento La Gaitana, etc.)",
                    "En la zona hay artesanos y empresarios en pequeña escala que comercialización productos que reflejan la riqueza cultural huilense. También dispone de una plazoleta para eventos varios y de un polideportivo",
                    R.drawable.malecom, R.drawable.mohan,R.drawable.gaitana),
            new turis("Parque los Libertadores","(Monumentos públicos, centro comercial Los Comuneros, Almacen Éxito)",
                    "Inaugurada en diciembre de 2002, en homenaje a los Libertadores, precisamente en el lugar donde funcionaba la antigua Galería Central o Plaza de mercado del Centro, para dar paso a la modernidad.",
                    R.drawable.liber1, R.drawable.liber2,R.drawable.liber3),
            new turis("Parque de los niños","(Especial para llevar los niños a montar en bicicleta y a patinar)",
                    "El propósito es masificar la actividad recreativa, lúdica y de esparcimiento de la primera infancia, como una salida correcta en prevención de la drogadicción, indigencia, abuso laboral, aportando de forma concreta a que estos menores tengan su propio espacio recreativo, especialmente en los sectores marginados de la ciudad.",
                    R.drawable.pn1, R.drawable.pn2,R.drawable.pn3),
            new turis("Paseo Peatonal La Quinta","(Cra. 5 entre la Calle 8 y el Puente rio las Ceibas)",
                    "Desde el centro de la ciudad pasando por la Alcaldía Municipal, centro comercial Olímpica, La Avenida La Toma hasta el centro de convenciones “José Eustacio Rivera” donde podrán disfrutar sin costo alguno de exposiciones de arte en el Museo de Arte Contemporáneo del Huila",
                    R.drawable.paspe1, R.drawable.paspe2,R.drawable.paspe3),
            new turis("Templo Colonial","(Antigua edificación religiosa ubicada en pleno parque Santander)",
                    "Este monumento data del siglo XVII.  Durante muchos años prestó el servicio de Catedral de Neiva. Ha sufrido el furor de varios terremotos; ha sido restaurado varias veces, pero hasta el presente, conserva sus pisos de ladrillo asado, gradas de monolitos, paredes de tapia pisada y techo de madera rolliza.",
                    R.drawable.tcolo1, R.drawable.tcolo2,R.drawable.tcolo3),
            new turis("El Caballo Colombiano","Este bello monumento se encuentra en el costado sur del Estadio de Fútbol Guillermo Plazas Alcid muy cerca al Hospital general, donde empieza la avenida “La Toma",
                    "Está constituida por  tres figuras cilíndricas con cabezas en formas de caballos, luciendo los colores de la bandera de la patria. La estructura está elaborada en hierro,  las cabezas en plástico, con poliéster reforzado en fibra de vidrio; sobre la escultura se le aplicó  pintura sintética para exteriores, tiene una  altura de ocho metros.",
                    R.drawable.cab1,R.drawable.cab2,R.drawable.cab3)

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
