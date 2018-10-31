package com.example.prodalcamodulaser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;

public class CalcularEstanteriaCanastillas extends AppCompatActivity implements OnClickListener, OnFocusChangeListener {

    Button menosAltura;
    Button masAltura;
    TextView textoAlturaSelec;

    Button menosCuerpos;
    Button masCuerpos;
    TextView textoCuerposSelec;

    Button menosPosiciones;
    Button masPosiciones;
    TextView textoPosicionesSelec;

    Button menosCuadroU;
    Button masCuadroU;
    TextView textoCuadroUSelec;

    Button menosModulos;
    Button masModulos;
    TextView textoModulosSelec;

    EditText cuadroExtEst1Selec;
    EditText cuadroExtEst2Selec;
    EditText cuadroExtEst3Selec;
    EditText cuadroExtEst4Selec;
    EditText cuadroExtEst5Selec;
    EditText travesanoEtxModularSelec;

    EditText canastillas13PerforadaSelec;
    EditText canastillas13CerradaSelec;
    EditText canastillas18PerforadaSelec;
    EditText canastillas18CerradaSelec;
    EditText canastillas25PerforadaSelec;
    EditText canastillas25CerradaSelec;
    EditText canastillas33PerforadaSelec;
    EditText canastillas33CerradaSelec;
    EditText canastillas41PerforadaSelec;
    EditText canastillas41CerradaSelec;
    EditText tapaNormatizadaSelec;

    CheckBox checkBoxAceroInoxidable;
    CheckBox checkBoxCostado;

    Button calcularEstCanastillas;
    TextView textoResultado;

    estanteriaCanastillas estanteria = new estanteriaCanastillas("1.94", "1", "4", "3", "1", false, false);

    int contador_altura = 2;
    int contador_cuerpos = Integer.valueOf(estanteria.getCuerpos());
    int contador_posiciones = Integer.valueOf(estanteria.getPosiciones());
    int contador_cuadro_u = Integer.valueOf(estanteria.getCuadroU());
    int contador_modulos = Integer.valueOf(estanteria.getModulos());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_estanteria_canastillas);

        TextView textView = new TextView(this);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_calcular_estanteria_canastillas);
        layout.addView(textView);

        // find the elements
        menosAltura = (Button) findViewById(R.id.menosAltura);
        masAltura = (Button) findViewById(R.id.masAltura);
        textoAlturaSelec = (TextView) findViewById(R.id.textoAlturaSelec);

        menosCuerpos = (Button) findViewById(R.id.menosCuerpos);
        masCuerpos = (Button) findViewById(R.id.masCuerpos);
        textoCuerposSelec = (TextView) findViewById(R.id.textoCuerposSelec);

        menosPosiciones = (Button) findViewById(R.id.menosPosiciones);
        masPosiciones = (Button) findViewById(R.id.masPosiciones);
        textoPosicionesSelec = (TextView) findViewById(R.id.textoPosicionesSelec);

        menosCuadroU = (Button) findViewById(R.id.menosCuadroU);
        masCuadroU = (Button) findViewById(R.id.masCuadroU);
        textoCuadroUSelec = (TextView) findViewById(R.id.textoCuadroUSelec);

        menosModulos = (Button) findViewById(R.id.menosModulos);
        masModulos = (Button) findViewById(R.id.masModulos);
        textoModulosSelec = (TextView) findViewById(R.id.textoModulosSelec);

        cuadroExtEst1Selec = (EditText) findViewById(R.id.cuadroExtEst1Selec);
        cuadroExtEst2Selec = (EditText) findViewById(R.id.cuadroExtEst2Selec);
        cuadroExtEst3Selec = (EditText) findViewById(R.id.cuadroExtEst3Selec);
        cuadroExtEst4Selec = (EditText) findViewById(R.id.cuadroExtEst4Selec);
        cuadroExtEst5Selec = (EditText) findViewById(R.id.cuadroExtEst5Selec);
        travesanoEtxModularSelec = (EditText) findViewById(R.id.travesanoEtxModularSelec);

        canastillas13PerforadaSelec = (EditText) findViewById(R.id.canastillas13PerforadaSelec);
        canastillas13CerradaSelec = (EditText) findViewById(R.id.canastillas13CerradaSelec);
        canastillas18PerforadaSelec = (EditText) findViewById(R.id.canastillas18PerforadaSelec);
        canastillas18CerradaSelec = (EditText) findViewById(R.id.canastillas18CerradaSelec);
        canastillas25PerforadaSelec = (EditText) findViewById(R.id.canastillas25PerforadaSelec);
        canastillas25CerradaSelec = (EditText) findViewById(R.id.canastillas25CerradaSelec);
        canastillas33PerforadaSelec = (EditText) findViewById(R.id.canastillas33PerforadaSelec);
        canastillas33CerradaSelec = (EditText) findViewById(R.id.canastillas33CerradaSelec);
        canastillas41PerforadaSelec = (EditText) findViewById(R.id.canastillas41PerforadaSelec);
        canastillas41CerradaSelec = (EditText) findViewById(R.id.canastillas41CerradaSelec);
        tapaNormatizadaSelec = (EditText) findViewById(R.id.tapaNormalizadaSelec);

        checkBoxAceroInoxidable = (CheckBox) findViewById(R.id.checkBoxAceroInoxidable);
        checkBoxCostado = (CheckBox) findViewById(R.id.checkBoxCostado);

        calcularEstCanastillas = (Button) findViewById(R.id.calcularEstCanastillas);
        textoResultado = (TextView) findViewById(R.id.textoResultado);

        // set a listener
        menosAltura.setOnClickListener(this);
        masAltura.setOnClickListener(this);

        menosCuerpos.setOnClickListener(this);
        masCuerpos.setOnClickListener(this);

        menosPosiciones.setOnClickListener(this);
        masPosiciones.setOnClickListener(this);

        menosCuadroU.setOnClickListener(this);
        masCuadroU.setOnClickListener(this);

        menosModulos.setOnClickListener(this);
        masModulos.setOnClickListener(this);

        checkBoxAceroInoxidable.setOnClickListener(this);
        checkBoxCostado.setOnClickListener(this);

        /* Se hace este "setOnFocusChangeListener" con el fin de que con solo seleccionar una de
         * opciones de los campos de textos, el resultado total de la estanteria se borra. De este
         * modo se obliga al usuario a actualizar el resultado presionando el boton CALCULAR  */

        cuadroExtEst1Selec.setOnFocusChangeListener(this);
        cuadroExtEst2Selec.setOnFocusChangeListener(this);
        cuadroExtEst3Selec.setOnFocusChangeListener(this);
        cuadroExtEst4Selec.setOnFocusChangeListener(this);
        cuadroExtEst5Selec.setOnFocusChangeListener(this);
        travesanoEtxModularSelec.setOnFocusChangeListener(this);

        canastillas13PerforadaSelec.setOnFocusChangeListener(this);
        canastillas13CerradaSelec.setOnFocusChangeListener(this);
        canastillas18PerforadaSelec.setOnFocusChangeListener(this);
        canastillas18CerradaSelec.setOnFocusChangeListener(this);
        canastillas25PerforadaSelec.setOnFocusChangeListener(this);
        canastillas25CerradaSelec.setOnFocusChangeListener(this);
        canastillas33PerforadaSelec.setOnFocusChangeListener(this);
        canastillas33CerradaSelec.setOnFocusChangeListener(this);
        canastillas41PerforadaSelec.setOnFocusChangeListener(this);
        canastillas41CerradaSelec.setOnFocusChangeListener(this);

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
                if(contador_altura < 3) {
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

            case R.id.menosPosiciones:
                if(contador_posiciones > estanteria.getNumPosicionesMin()){
                    if(contador_posiciones == contador_cuadro_u){
                        contador_cuadro_u = contador_cuadro_u - 1;
                        estanteria.actCuadroU(Integer.toString(contador_cuadro_u));
                    }
                    contador_posiciones =  contador_posiciones - 1;
                    estanteria.actPosiciones(Integer.toString(contador_posiciones));
                }
                break;

            case R.id.masPosiciones:
                if(contador_posiciones < estanteria.getNumPosicionesMax()) {
                    contador_posiciones = contador_posiciones + 1;
                    estanteria.actPosiciones(Integer.toString(contador_posiciones));
                }
                break;

            case R.id.menosCuadroU:
                if(contador_cuadro_u > 2){
                    contador_cuadro_u =  contador_cuadro_u - 1;
                    estanteria.actCuadroU(Integer.toString(contador_cuadro_u));
                }
                break;

            case R.id.masCuadroU:
                if(contador_cuadro_u < contador_posiciones) {
                    contador_cuadro_u = contador_cuadro_u + 1;
                    estanteria.actCuadroU(Integer.toString(contador_cuadro_u));
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

            case R.id.checkBoxAceroInoxidable:
                    checkBoxCostado.setChecked(false);
                break;

            case R.id.checkBoxCostado:
                    checkBoxAceroInoxidable.setChecked(false);
                break;

            case R.id.calcularEstCanastillas:

                estanteria.actCuadroExtEst1Selec(cuadroExtEst1Selec.getText().toString());
                estanteria.actCuadroExtEst2Selec(cuadroExtEst2Selec.getText().toString());
                estanteria.actCuadroExtEst3Selec(cuadroExtEst3Selec.getText().toString());
                estanteria.actCuadroExtEst4Selec(cuadroExtEst4Selec.getText().toString());
                estanteria.actCuadroExtEst5Selec(cuadroExtEst5Selec.getText().toString());
                estanteria.actTravesanoEtxModularSelec(travesanoEtxModularSelec.getText().toString());

                estanteria.actCanastilla13Perforada(canastillas13PerforadaSelec.getText().toString());
                estanteria.actCanastilla13Cerrada(canastillas13CerradaSelec.getText().toString());
                estanteria.actCanastilla18Perforada(canastillas18PerforadaSelec.getText().toString());
                estanteria.actCanastilla18Cerrada(canastillas18CerradaSelec.getText().toString());
                estanteria.actCanastilla25Perforada(canastillas25PerforadaSelec.getText().toString());
                estanteria.actCanastilla25Cerrada(canastillas25CerradaSelec.getText().toString());
                estanteria.actCanastilla33Perforada(canastillas33PerforadaSelec.getText().toString());
                estanteria.actCanastilla33Cerrada(canastillas33CerradaSelec.getText().toString());
                estanteria.actCanastilla41Perforada(canastillas41PerforadaSelec.getText().toString());
                estanteria.actCanastilla41Cerrada(canastillas41CerradaSelec.getText().toString());
                estanteria.actTapaNormatizada(tapaNormatizadaSelec.getText().toString());

                estanteria.calcularCantidades(checkBoxAceroInoxidable.isChecked(),checkBoxCostado.isChecked());
                estanteria.calcularPrecio(checkBoxAceroInoxidable.isChecked(),checkBoxCostado.isChecked());

                estanteria.formatoPrecio(estanteria.getPrecioTotalEstanteria());

                textoResultado.setText(estanteria.getPrecioTotalEstanteria());

                break;

            default:
                break;
        }

        // No es necesario actualizar contador_altura ya que este es el mismo que controla los otro
        // estados

        contador_cuerpos = Integer.valueOf(estanteria.getCuerpos());
        contador_posiciones = Integer.valueOf(estanteria.getPosiciones());
        contador_cuadro_u = Integer.valueOf(estanteria.getCuadroU());
        contador_modulos = Integer.valueOf(estanteria.getModulos());

        textoAlturaSelec.setText(estanteria.getAltura());
        textoCuerposSelec.setText(estanteria.getCuerpos());
        textoPosicionesSelec.setText(estanteria.getPosiciones());
        textoCuadroUSelec.setText(estanteria.getCuadroU());
        textoModulosSelec.setText(estanteria.getModulos());

    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        textoResultado.setText("-");
    }

}
