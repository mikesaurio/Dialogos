package com.cursos.dialogos;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DialogosMainActivity extends Activity {

	
	private Button btn_simple,btn_sino,btn_lista,btn_check,btn_radio,btn_custome;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dialogos_main);
		
		btn_simple =(Button)findViewById(R.id.dialogos_btn_simple);
		btn_simple.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				new MisDialogos(DialogosMainActivity.this).dialogoSimple().show();;
				
			}
		});
		
		btn_sino =(Button)findViewById(R.id.dialogos_btn_sino);
		btn_sino.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				new MisDialogos(DialogosMainActivity.this).dialogoSiNo().show();
				
			}
		});
		
		btn_lista =(Button)findViewById(R.id.dialogos_btn_lista);
		btn_lista.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				new MisDialogos(DialogosMainActivity.this).dialogoLista().show();
				
			}
		});
		
		btn_check =(Button)findViewById(R.id.dialogos_btn_check);
		btn_check.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				new MisDialogos(DialogosMainActivity.this).dialogoCheck().show();
				
			}
		});
		
		btn_radio =(Button)findViewById(R.id.dialogos_btn_radio);
		btn_radio.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				new MisDialogos(DialogosMainActivity.this).dialogoRadio().show();
				
			}
		});
		
		btn_custome =(Button)findViewById(R.id.dialogos_btn_custome);
		btn_custome.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				new MisDialogos(DialogosMainActivity.this).dialogCustome(DialogosMainActivity.this).show();
				
			}
		});
		
		
	}
}
