package com.example.prodalcamodulaser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;

public class CalcularEstanteriaCarga extends AppCompatActivity implements OnClickListener, OnFocusChangeListener {

    Button menosAltura;
    Button masAltura;
    TextView textoAlturaSelec;

    Button menosCuerpos;
    Button masCuerpos;
    TextView textoCuerposSelec;

    Button menosNiveles;
    Button masNiveles;
    TextView textoNivelesSelec;

    Button menosCuadro;
    Button masCuadro;
    TextView textoCuadroSelec;

    Button menosModulos;
    Button masModulos;
    TextView textoModulosSelec;

    Button menosFondo;
    Button masFondo;
    TextView textoFondoSelec;

    CheckBox checkBoxAceroInoxidable;

    Button calcularEstCanastillas;
    TextView textoResultado;

    estanteriaCarga estanteria = new estanteriaCarga("1.94", "1", "2", "40x90", "1", "1", false);

    int contador_altura = 0;
    int contador_cuerpos = Integer.valueOf(estanteria.getCuerpos());
    int contador_niveles = Integer.valueOf(estanteria.getNiveles());
    int contador_cuadro = 0;
    int contador_modulos = Integer.valueOf(estanteria.getModulos());
    int contador_fondo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_estanteria_carga);

        TextView textView = new TextView(this);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_calcular_estanteria_carga);
        layout.addView(textView);

        // find the elements
        menosAltura = (Button) findViewById(R.id.menosAltura);
        masAltura = (Button) findViewById(R.id.masAltura);
        textoAlturaSelec = (TextView) findViewById(R.id.textoAlturaSelec);

        menosCuerpos = (Button) findViewById(R.id.menosCuerpos);
        masCuerpos = (Button) findViewById(R.id.masCuerpos);
        textoCuerposSelec = (TextView) findViewById(R.id.textoCuerposSelec);

        menosNiveles = (Button) findViewById(R.id.menosNiveles);
        masNiveles = (Button) findViewById(R.id.masNiveles);
        textoNivelesSelec = (TextView) findViewById(R.id.textoNivelesSelec);

        menosCuadro = (Button) findViewById(R.id.menosCuadro);
        masCuadro = (Button) findViewById(R.id.masCuadro);
        textoCuadroSelec = (TextView) findViewById(R.id.textoCuadroSelec);

        menosModulos = (Button) findViewById(R.id.menosModulos);
        masModulos = (Button) findViewById(R.id.masModulos);
        textoModulosSelec = (TextView) findViewById(R.id.textoModulosSelec);

        menosFondo = (Button) findViewById(R.id.menosFondo);
        masFondo = (Button) findViewById(R.id.masFondo);
        textoFondoSelec = (TextView) findViewById(R.id.textoFondoSelec);

        checkBoxAceroInoxidable = (CheckBox) findViewById(R.id.checkBoxAceroInoxidable);

        calcularEstCanastillas = (Button) findViewById(R.id.calcularEstCanastillas);
        textoResultado = (TextView) findViewById(R.id.textoResultado);

        // set a listener
        menosAltura.setOnClickListener(this);
        masAltura.setOnClickListener(this);

        menosCuerpos.setOnClickListener(this);
        masCuerpos.setOnClickListener(this);

        menosNiveles.setOnClickListener(this);
        masNiveles.setOnClickListener(this);

        menosCuadro.setOnClickListener(this);
        masCuadro.setOnClickListener(this);

        menosModulos.setOnClickListener(this);
        masModulos.setOnClickListener(this);

        menosFondo.setOnClickListener(this);
        masFondo.setOnClickListener(this);

        checkBoxAceroInoxidable.setOnClickListener(this);

        /* Se hace este "setOnFocusChangeListener" con el fin de que con solo seleccionar una de
         * opciones de los campos de textos, el resultado total de la estanteria se borra. De este
         * modo se obliga al usuario a actualizar el resultado presionando el boton CALCULAR  */

        calcularEstCanastillas.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        /* Con cualquier cambio en alguno de las entradas el valor de la estantería se borra
         * con esto se obliga al usuario a recalcular luego de alguna modificacion en la cotizacion
         */

        textoResultado.setText("-");

        switch (v.getId()) {
            case R.id.menosAltura:
                if(contador_altura > 0){
                    contador_altura =  contador_altura - 1;
                    estanteria.actEstanteriaCanastillas(contador_altura);
                }
                break;

            case R.id.masAltura:
                if(contador_altura < 1) {
                    contador_altura = contador_altura + 1;
                    estanteria.actEstanteriaCanastillas(contador_altura);
                }
                break;

            case R.id.menosCuerpos:
                if(contador_cuerpos > 1){
                    contador_cuerpos =  contador_cuerpos - 1;
                    estanteria.actCuerpos(Integer.toString(contador_cuerpos));
                }
                break;

            case R.id.masCuerpos:
                if(contador_cuerpos < 60) {
                    contador_cuerpos = contador_cuerpos + 1;
                    estanteria.actCuerpos(Integer.toString(contador_cuerpos));
                }
                break;

            case R.id.menosNiveles:
                if(contador_niveles > estanteria.getNumNivelesMin()){
                    contador_niveles =  contador_niveles - 1;
                    estanteria.actNiveles(Integer.toString(contador_niveles));
                }
                break;

            case R.id.masNiveles:
                if(contador_niveles < estanteria.getNumNivelesMax()) {
                    contador_niveles = contador_niveles + 1;
                    estanteria.actNiveles(Integer.toString(contador_niveles));
                }
                break;

            case R.id.menosCuadro:
                if(contador_cuadro > 0){
                    contador_cuadro =  contador_cuadro - 1;
                    estanteria.actCuadro(contador_cuadro);
                }
                break;

            case R.id.masCuadro:
                if(contador_cuadro < 4) {
                    contador_cuadro = contador_cuadro + 1;
                    estanteria.actCuadro(contador_cuadro);
                }
                break;

            case R.id.menosModulos:
                if(contador_modulos > 1){
                    contador_modulos =  contador_modulos - 1;
                    estanteria.actModulos(Integer.toString(contador_modulos));
                }
                break;

            case R.id.masModulos:
                if(contador_modulos < 99) {
                    contador_modulos = contador_modulos + 1;
                    estanteria.actModulos(Integer.toString(contador_modulos));
                }
                break;

            case R.id.menosFondo:
                if(contador_fondo > 1){
                    contador_fondo =  contador_fondo - 1;
                    estanteria.actFondo(Integer.toString(contador_fondo));
                }
                break;

            case R.id.masFondo:
                if(contador_fondo < 5) {
                    contador_fondo = contador_fondo + 1;
                    estanteria.actFondo(Integer.toString(contador_fondo));
                }
                break;


            case R.id.checkBoxAceroInoxidable:
                if(checkBoxAceroInoxidable.isChecked()) {
                    menosCuadro.setEnabled(false);
                    masCuadro.setEnabled(false);
                    contador_cuadro = 5; // Activa 60x90I
                    estanteria.actCuadro(contador_cuadro);
                }
                else {
                    menosCuadro.setEnabled(true);
                    masCuadro.setEnabled(true);
                    contador_cuadro = 2; // Regresa al valor 60x90
                    estanteria.actCuadro(contador_cuadro);
                }
                break;

            case R.id.calcularEstCanastillas:

                estanteria.calcularCantidades(checkBoxAceroInoxidable.isChecked());
                estanteria.calcularPrecio(checkBoxAceroInoxidable.isChecked());

                estanteria.formatoPrecio(estanteria.getPrecioTotalEstanteria());

                textoResultado.setText(estanteria.getPrecioTotalEstanteria());

                break;

            default:
                break;
        }

        // No es necesario actualizar contador_altura ya que este es el mismo que controla los otro
        // estados

        contador_cuerpos = Integer.valueOf(estanteria.getCuerpos());
        contador_niveles = Integer.valueOf(estanteria.getNiveles());
        //contador_cuadro = Integer.valueOf(estanteria.getCuadro());
        contador_modulos = Integer.valueOf(estanteria.getModulos());

        textoAlturaSelec.setText(estanteria.getAltura());
        textoCuerposSelec.setText(estanteria.getCuerpos());
        textoNivelesSelec.setText(estanteria.getNiveles());
        textoCuadroSelec.setText(estanteria.getCuadro());
        textoModulosSelec.setText(estanteria.getModulos());
        textoFondoSelec.setText(estanteria.getFondo());

    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        textoResultado.setText("-");
    }

}