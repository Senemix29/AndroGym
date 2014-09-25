package br.com.estudo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;;

public class AndroGym extends Activity {
	Button btPeito, btCostas, btPerna, btOmbro, btBiTri, btAbdomen, btVolta, btSerie,btVolta2;
	TextView tv01,tv02,tv03,tv04,tv05,tv06,tv07,tv08,tv09;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		chamaMenuPrincipal();
		inicializaObj();
		mainListerners();
	}

	
	public void chamaMenuPrincipal(){ 
		setContentView(R.layout.main);
		inicializaObj();
		mainListerners();
		
	}
	public void chamaSerie(){
		setContentView(R.layout.tiposerie);
		inicializaObj();
		serieListeners();
	}
	
	public void inicializaObj(){
		btPeito = (Button) findViewById(R.id.btPeito);
		btCostas = (Button) findViewById(R.id.btCostas);
		btPerna = (Button) findViewById(R.id.BtPerna);
		btOmbro = (Button) findViewById(R.id.btOmbro);
		btBiTri = (Button) findViewById(R.id.btBiTri);
		btAbdomen = (Button) findViewById(R.id.btAbdomen);
		btVolta = (Button) findViewById(R.id.btVolta);
		btVolta2 = (Button) findViewById(R.id.btVolta2);
		btSerie = (Button) findViewById(R.id.btSerie);
		tv01 = (TextView) findViewById(R.id.tv01);
		tv02 = (TextView) findViewById(R.id.tv02);
		tv03 = (TextView) findViewById(R.id.tv03);
		tv04 = (TextView) findViewById(R.id.tv04);
		tv05 = (TextView) findViewById(R.id.tv05);
		tv06 = (TextView) findViewById(R.id.tv06);
		tv07 = (TextView) findViewById(R.id.tv07);
		tv08 = (TextView) findViewById(R.id.tv08);
		tv09 = (TextView) findViewById(R.id.tv09);
	}
	public void chamaResult(String tx1,String tx2,String tx3,String tx4,String tx5, String tx6, String tx7, String tx8, String tx9){
		setContentView(R.layout.resultserie);
		inicializaObj();
		tv01.setText(tx1);
		tv02.setText(tx2);
		tv03.setText(tx3);
		tv04.setText(tx4);
		tv05.setText(tx5);
		tv06.setText(tx6);
		tv07.setText(tx7);
		tv08.setText(tx8);
		tv09.setText(tx9);
		resultListeners();
		
	}
	
	public void mainListerners(){
		btSerie.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				chamaSerie();
				
			}
		});
		
	}
	
	public void serieListeners() {
		btPeito.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {

				chamaResult("Supino Reto - 4x12", "Supino 30° - 15 a8", "Supino Canadense - 4x12", "Crucifixo - 3x8 PESADO! ", "Cross Over - 4x12",null,null,null,null);
				
			}
		});
		btCostas.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				chamaResult("Remada Unilateral - 4x12", "Conjugado: Iso(4x12) + Puley por trás(4x15)", "Jet aberto - 15 a 8", "Remada Cavalo 15 a 8", "Jet Fechado(parando 2s) - 4x10",null,null,null,null);
			}
		});
		btPerna.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				chamaResult("Leg Press 45 - 4x12", "Cadeira Extensora - 4x12", "Agachamento Hack - 4x10", "Mesa Flexora - 5x10", null,null,null,null,null);
				
			}
		});
		btOmbro.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				chamaResult("Conjugado: Crucifixo + Desenvolvimento com halteres + Remada Alta - 4x10", "Elevação frontal alternada com halteres - 4x12", "Elevação lateral com halteres - 15 a 8", "Desenvolvimentona máquina - 2x20", null,null,null,null,null);
			}
		});
		btBiTri.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				chamaResult("BÍCEPS: \nRosca alternada - 4x8", "Rosca concentrada - 4x10", "Rosca Scott na máquina - 15 a 8", "Rosca Direta - 12 a 6", "\nTríceps:","Conjugado: Tríceps Pulley + Tríceps Corda - 4x12"," Tríceps Mergulho na Maquina - 4x10",null,null);
			}
		});
		btAbdomen.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				chamaResult("Reto Abdominal - 4x15", "Reto Abdominal Inferior - 4x12", "Oblíquo Interno - 4x10", "Abdominal Crossover - 12 a 6", null,null,null,null,null);
			}
		});
		btVolta.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				chamaMenuPrincipal();
			}
		});
		
	}
	public void resultListeners(){
		btVolta2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				chamaSerie();
			}
		});
	}
	
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.andro_gym, menu);
		return true;
	}

}
