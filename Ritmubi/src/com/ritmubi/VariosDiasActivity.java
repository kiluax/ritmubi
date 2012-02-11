package com.ritmubi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class VariosDiasActivity extends Activity {
	
	private Button 
				botonVolver,
				botonCalcular;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.varios_dias);
        Bundle bundle = getIntent().getExtras();
        Toast.makeText(getApplicationContext(), "Varios Dias, Presentacion: "+
        		bundle.getString("tipoPresentacion"), Toast.LENGTH_LONG).show();
    
        botonVolver = (Button) findViewById(R.id.botonVolver);
        botonCalcular = (Button) findViewById(R.id.botonCalcular);
        
        botonVolver.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// Cerramos la activity
				finish();				
			}
		});
        
        botonCalcular.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "A calcular!!!",
						Toast.LENGTH_LONG).show();				
			}
		});
    }
}
