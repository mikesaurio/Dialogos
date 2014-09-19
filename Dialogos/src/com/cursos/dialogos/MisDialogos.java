package com.cursos.dialogos;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MisDialogos {

	private Context context;
	
	public MisDialogos(Context context){
		this.context=context;
	}
	
	
	public AlertDialog dialogoSimple(){
		AlertDialog.Builder builder = new AlertDialog.Builder(context);
		builder.setMessage("Ejemplo de Mensaje Popup para Android")
		        .setTitle("Atenci—n!!")
		        .setCancelable(false)
		        .setNeutralButton("Aceptar",
		                new DialogInterface.OnClickListener() {
		                    public void onClick(DialogInterface dialog, int id) {
		                        dialog.cancel();
		                    }
		                });
		return builder.create();
	}
	
	
	
	public AlertDialog dialogoSiNo(){
		AlertDialog.Builder builder = new AlertDialog.Builder(context);
		builder.setMessage("ÀDesea continuar con la transferencia de dinero?")
		        .setTitle("Advertencia")
		        .setCancelable(false)
		        .setNegativeButton("Cancelar",
		                new DialogInterface.OnClickListener() {
		                    public void onClick(DialogInterface dialog, int id) {
		                        dialog.cancel();
		                    }
		                })
		        .setPositiveButton("Continuar",
		                new DialogInterface.OnClickListener() {
		                    public void onClick(DialogInterface dialog, int id) {
		                        // metodo que se debe implementar
		                    }
		                });
		return builder.create();
	}
	
	
	public AlertDialog dialogoLista(){
		final CharSequence[] items = {"Android OS", "iOS", "Windows Phone", "Meego"};
		 
		AlertDialog.Builder builder = new AlertDialog.Builder(context);
		builder.setTitle("Tu OS m—vil preferido?");
		builder.setItems(items, new DialogInterface.OnClickListener() {
		    public void onClick(DialogInterface dialog, int item) {
		        Toast.makeText(context, "Haz elegido la opcion: " + items[item] , Toast.LENGTH_SHORT).show();;
		        dialog.cancel();
		    }
		});
		return builder.create();
	}
	
	
	public AlertDialog dialogoRadio(){
		final CharSequence[] items = {"Android OS", "iOS", "Windows Phone", "Meego"};
		 
		AlertDialog.Builder builder = new AlertDialog.Builder(context);
		builder.setTitle("Tu OS m—vil preferido?");
		builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
		    public void onClick(DialogInterface dialog, int item) {
		     Toast.makeText(context, "Haz elegido la opcion: " + items[item] , Toast.LENGTH_SHORT).show();;
		    
		        dialog.cancel();
		    }
		});
		return builder.create();
	}
	
	
	public AlertDialog dialogoCheck(){
		final CharSequence[] items = {"Android OS", "iOS", "Windows Phone", "Meego"};
		 
		AlertDialog.Builder builder = new AlertDialog.Builder(context);
		builder.setTitle("Tu OS m—vil preferido?");
		builder.setTitle("Selecci—n")
	    .setMultiChoiceItems(items, null,
	        new DialogInterface.OnMultiChoiceClickListener() {
	        public void onClick(DialogInterface dialog, int item, boolean isChecked) {
	        	Toast.makeText(context, "Haz elegido la opcion: " + items[item] , Toast.LENGTH_SHORT).show();
	       }
	});
		return builder.create();
	}
	
	
	
	
	public AlertDialog dialogCustome(Activity activity){
		AlertDialog.Builder builder = new AlertDialog.Builder(activity);
	    View view = activity.getLayoutInflater().inflate(R.layout.dialogo_custome, null);
	    builder.setView(view)
	    .setCancelable(true);

	    
	  //escucha del boton aceptar
	   
	    Button btnSalir=  ((Button) view.findViewById(R.id.dialogo_btn_Aceptar));
	    btnSalir.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view)
            {
           

            }
        });

       
        return (builder.create());// return customDialog;//regresamos el di‡logo
	}
	
}
