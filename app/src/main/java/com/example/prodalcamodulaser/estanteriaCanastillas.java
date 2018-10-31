package com.example.prodalcamodulaser;

/**
 * Created by Andres on 23/12/2016.
 */

public class estanteriaCanastillas {

    //declaración de atributos
    private String altura, cuerpos, posiciones, cuadroU, modulos;
    private Boolean aceroInoxidable, costado;
    private int numPosicionesMin, numPosicionesMax;

    private int cant_parales, cant_travesanos, cant_tornillos_40,
            cant_tornillos_60, cant_tuerca_lujo, cant_bota_cuadrada, cant_tapon_cuadrado;
    private float cant_cuadroU;

    private String precio_total_parales, precio_total_cuadroU, precio_total_travesanos,
            precio_total_tornillos_40, precio_total_tornillos_60, precio_total_tuerca_lujo,
            precio_total_bota_cuadrada, precio_total_tapon_cuadrado, precio_total_estanteria;

    private String cant_cuadro_ext_est_1, cant_cuadro_ext_est_2, cant_cuadro_ext_est_3,
            cant_cuadro_ext_est_4, cant_cuadro_ext_est_5, cant_travesano_ext_mod;

    private String cant_canastilla_13_perf, cant_canastilla_13_cerr,
            cant_canastilla_18_perf, cant_canastilla_18_cerr,
            cant_canastilla_25_perf, cant_canastilla_25_cerr,
            cant_canastilla_33_perf, cant_canastilla_33_cerr,
            cant_canastilla_41_perf, cant_canastilla_41_cerr,
            cant_tapa_normatizada;

    private int precio_total_cuadro_ext_est_1, precio_total_cuadro_ext_est_2, precio_total_cuadro_ext_est_3,
            precio_total_cuadro_ext_est_4, precio_total_cuadro_ext_est_5, precio_total_travesano_ext_mod;

    private int precio_total_canastilla_13_perf, precio_total_canastilla_13_cerr,
            precio_total_canastilla_18_perf, precio_total_canastilla_18_cerr,
            precio_total_canastilla_25_perf, precio_total_canastilla_25_cerr,
            precio_total_canastilla_33_perf, precio_total_canastilla_33_cerr,
            precio_total_canastilla_41_perf, precio_total_canastilla_41_cerr,
            precio_total_tapa_normatizada;

    //declaración de constructor
    public estanteriaCanastillas(String altura, String cuerpos, String posiciones, String cuadroU,
                                 String modulos, Boolean aceroInoxidable, Boolean costado) {
        this.altura = altura;
        this.cuerpos = cuerpos;
        this.posiciones = posiciones;
        this.cuadroU = cuadroU;
        this.modulos = modulos;
        this.aceroInoxidable = aceroInoxidable;
        this.costado = costado;

        this.numPosicionesMin = 4;
        this.numPosicionesMax = 13;

        this.cant_parales = 0;
        this.cant_cuadroU = 0;
        this.cant_travesanos = 0;
        this.cant_tornillos_40 = 0;
        this.cant_tornillos_60 = 0;
        this.cant_tuerca_lujo = 0;
        this.cant_bota_cuadrada = 0;
        this.cant_tapon_cuadrado = 0;

        this.precio_total_parales = "0";
        this.precio_total_cuadroU = "0";
        this.precio_total_travesanos = "0";
        this.precio_total_tornillos_40 = "0";
        this.precio_total_tornillos_60 = "0";
        this.precio_total_tuerca_lujo = "0";
        this.precio_total_bota_cuadrada = "0";
        this.precio_total_tapon_cuadrado = "0";

        this.cant_cuadro_ext_est_1 = "0";
        this.cant_cuadro_ext_est_2 = "0";
        this.cant_cuadro_ext_est_3 = "0";
        this.cant_cuadro_ext_est_4 = "0";
        this.cant_cuadro_ext_est_5 = "0";
        this.cant_travesano_ext_mod = "0";

        this.cant_canastilla_13_perf = "0";
        this.cant_canastilla_13_cerr = "0";
        this.cant_canastilla_18_perf = "0";
        this.cant_canastilla_18_cerr = "0";
        this.cant_canastilla_25_perf = "0";
        this.cant_canastilla_25_cerr = "0";
        this.cant_canastilla_33_perf = "0";
        this.cant_canastilla_33_cerr = "0";
        this.cant_canastilla_41_perf = "0";
        this.cant_canastilla_41_cerr = "0";
        this.cant_tapa_normatizada = "0";

        this.precio_total_cuadro_ext_est_1 = 0;
        this.precio_total_cuadro_ext_est_2 = 0;
        this.precio_total_cuadro_ext_est_3 = 0;
        this.precio_total_cuadro_ext_est_4 = 0;
        this.precio_total_cuadro_ext_est_5 = 0;
        this.precio_total_travesano_ext_mod = 0;

        this.precio_total_canastilla_13_perf = 0;
        this.precio_total_canastilla_13_cerr = 0;
        this.precio_total_canastilla_18_perf = 0;
        this.precio_total_canastilla_18_cerr = 0;
        this.precio_total_canastilla_25_perf = 0;
        this.precio_total_canastilla_25_cerr = 0;
        this.precio_total_canastilla_33_perf = 0;
        this.precio_total_canastilla_33_cerr = 0;
        this.precio_total_canastilla_41_perf = 0;
        this.precio_total_canastilla_41_cerr = 0;
        this.precio_total_tapa_normatizada = 0;

        this.precio_total_estanteria = "0";
    }

    //declaración de métodos

    public String getAltura(){
        return this.altura;
    }
    public String getCuerpos(){
        return this.cuerpos;
    }
    public String getPosiciones(){
        return this.posiciones;
    }
    public String getCuadroU(){
        return this.cuadroU;
    }
    public String getModulos() { return this.modulos; }
    public Boolean getAceroInoxidable() { return this.aceroInoxidable; }
    public Boolean getCostado() { return this.costado; }
    public int getNumPosicionesMin() { return this.numPosicionesMin; }
    public int getNumPosicionesMax() { return this.numPosicionesMax; }

    public int getCantParales(){
        return this.cant_parales;
    }
    public float getCantCuadroU(){
        return this.cant_cuadroU;
    }
    public int getCantTravesanos(){ return this.cant_travesanos; }
    public int getCantTornillosCortos(){
        return this.cant_tornillos_40;
    }
    public int getCantTornillosLargos(){
        return this.cant_tornillos_60;
    }
    public int getCantTuercaLujo(){
        return this.cant_tuerca_lujo;
    }
    public int getCantBotaCuadrada(){
        return this.cant_bota_cuadrada;
    }
    public int getCantTaponCuadrado(){
        return this.cant_tapon_cuadrado;
    }

    public String getPrecioTotalParales(){
        return this.precio_total_parales;
    }
    public String getPrecioTotalCuadroU(){
        return this.precio_total_cuadroU;
    }
    public String getPrecioTotalTravesanos(){ return this.precio_total_travesanos; }
    public String getPrecioTotalTornillosCortos(){
        return this.precio_total_tornillos_40;
    }
    public String getPrecioTotalTornillosLargos(){
        return this.precio_total_tornillos_60;
    }
    public String getPrecioTotalTuercaLujo(){
        return this.precio_total_tuerca_lujo;
    }
    public String getPrecioTotalBotaCuadrada(){ return this.precio_total_bota_cuadrada; }
    public String getPrecioTotalTaponCuadrado(){ return this.precio_total_tapon_cuadrado; }
    public String getPrecioTotalEstanteria(){
        return this.precio_total_estanteria;
    }

    public void actAltura(String nuevoAltura){ this.altura = nuevoAltura; }
    public void actCuerpos(String nuevoCuerpos){ this.cuerpos = nuevoCuerpos; }
    public void actPosiciones(String nuevoPosiciones){ this.posiciones = nuevoPosiciones; }
    public void actCuadroU(String nuevoCuadroU){ this.cuadroU = nuevoCuadroU; }
    public void actModulos(String nuevoModulos) { this.modulos = nuevoModulos; }
    public void actAceroInoxidable(Boolean nuevoAceroInoxidable) { this.aceroInoxidable = nuevoAceroInoxidable; }
    public void actCostado(Boolean nuevoCostado) { this.costado = nuevoCostado; }

    /* Aqui cada vez que se actualiza el valor de lo que hay en el campo de texto de algunos
     * accesorios se garantiza que si el campo esta vacio en la variable se guarde un "0"
     */

    public void actCuadroExtEst1Selec(String nuevoCuadroExtEst1Selec){
        if(nuevoCuadroExtEst1Selec.isEmpty()){ this.cant_cuadro_ext_est_1 = "0"; }
        else { this.cant_cuadro_ext_est_1 = nuevoCuadroExtEst1Selec; } }

    public void actCuadroExtEst2Selec(String nuevoCuadroExtEst2Selec){
        if(nuevoCuadroExtEst2Selec.isEmpty()){ this.cant_cuadro_ext_est_2 = "0"; }
        else { this.cant_cuadro_ext_est_2 = nuevoCuadroExtEst2Selec; } }

    public void actCuadroExtEst3Selec(String nuevoCuadroExtEst3Selec){
        if(nuevoCuadroExtEst3Selec.isEmpty()){ this.cant_cuadro_ext_est_3 = "0"; }
        else { this.cant_cuadro_ext_est_3 = nuevoCuadroExtEst3Selec; } }

    public void actCuadroExtEst4Selec(String nuevoCuadroExtEst4Selec){
        if(nuevoCuadroExtEst4Selec.isEmpty()){ this.cant_cuadro_ext_est_4 = "0"; }
        else { this.cant_cuadro_ext_est_4 = nuevoCuadroExtEst4Selec; } }

    public void actCuadroExtEst5Selec(String nuevoCuadroExtEst5Selec){
        if(nuevoCuadroExtEst5Selec.isEmpty()){ this.cant_cuadro_ext_est_5 = "0"; }
        else { this.cant_cuadro_ext_est_5 = nuevoCuadroExtEst5Selec; } }

    public void actTravesanoEtxModularSelec(String nuevoTravesanoEtxModular){
        if(nuevoTravesanoEtxModular.isEmpty()){ this.cant_travesano_ext_mod = "0"; }
        else { this.cant_travesano_ext_mod = nuevoTravesanoEtxModular; } }

    /* Aqui cada vez que se actualiza el valor de lo que hay en el campo de texto de las
     * canastillas se garantiza que si el campo esta vacio en la variable se guarde un "0"
     */

    public void actCanastilla13Perforada(String nuevoCanastilla13Perforada){
        if(nuevoCanastilla13Perforada.isEmpty()){ this.cant_canastilla_13_perf = "0"; }
        else { this.cant_canastilla_13_perf = nuevoCanastilla13Perforada; } }
    public void actCanastilla13Cerrada(String nuevoCanastilla13Cerrada){
        if(nuevoCanastilla13Cerrada.isEmpty()){ this.cant_canastilla_13_cerr = "0"; }
        else { this.cant_canastilla_13_cerr = nuevoCanastilla13Cerrada; } }

    public void actCanastilla18Perforada(String nuevoCanastilla18Perforada){
        if(nuevoCanastilla18Perforada.isEmpty()){ this.cant_canastilla_18_perf = "0"; }
        else { this.cant_canastilla_18_perf = nuevoCanastilla18Perforada; } }
    public void actCanastilla18Cerrada(String nuevoCanastilla18Cerrada){
        if(nuevoCanastilla18Cerrada.isEmpty()){ this.cant_canastilla_18_cerr = "0"; }
        else { this.cant_canastilla_18_cerr = nuevoCanastilla18Cerrada; } }

    public void actCanastilla25Perforada(String nuevoCanastilla25Perforada){
        if(nuevoCanastilla25Perforada.isEmpty()){ this.cant_canastilla_25_perf = "0"; }
        else { this.cant_canastilla_25_perf = nuevoCanastilla25Perforada; } }
    public void actCanastilla25Cerrada(String nuevoCanastilla25Cerrada){
        if(nuevoCanastilla25Cerrada.isEmpty()){ this.cant_canastilla_25_cerr = "0"; }
        else { this.cant_canastilla_25_cerr = nuevoCanastilla25Cerrada; } }

    public void actCanastilla33Perforada(String nuevoCanastilla33Perforada){
        if(nuevoCanastilla33Perforada.isEmpty()){ this.cant_canastilla_33_perf = "0"; }
        else { this.cant_canastilla_33_perf = nuevoCanastilla33Perforada; } }
    public void actCanastilla33Cerrada(String nuevoCanastilla33Cerrada){
        if(nuevoCanastilla33Cerrada.isEmpty()){ this.cant_canastilla_33_cerr = "0"; }
        else { this.cant_canastilla_33_cerr = nuevoCanastilla33Cerrada; } }

    public void actCanastilla41Perforada(String nuevoCanastilla41Perforada){
        if(nuevoCanastilla41Perforada.isEmpty()){ this.cant_canastilla_41_perf = "0"; }
        else { this.cant_canastilla_41_perf = nuevoCanastilla41Perforada; } }
    public void actCanastilla41Cerrada(String nuevoCanastilla41Cerrada){
        if(nuevoCanastilla41Cerrada.isEmpty()){ this.cant_canastilla_41_cerr = "0"; }
        else { this.cant_canastilla_41_cerr = nuevoCanastilla41Cerrada; } }

    public void actTapaNormatizada(String nuevoTapaNormatizada){
        if(nuevoTapaNormatizada.isEmpty()){ this.cant_tapa_normatizada = "0"; }
        else { this.cant_tapa_normatizada = nuevoTapaNormatizada; } }

    public void actEstanteriaCanastillas(int estado) {
        if(estado == 0){
            this.altura = "0.90";
            this.numPosicionesMin = 2;
            this.numPosicionesMax = 6;
            this.posiciones = "2";
            this.cuadroU = "2";
        }
        else if(estado == 1){
            this.altura = "1.46";
            this.numPosicionesMin = 3;
            this.numPosicionesMax = 9;
            this.posiciones = "3";
            this.cuadroU = "3";
        }
        else if(estado == 2){
            this.altura = "1.94";
            this.numPosicionesMin = 4;
            this.numPosicionesMax = 13;
            this.posiciones = "4";
            this.cuadroU = "3";
        }
        else if(estado == 3){
            this.altura = "2.40";
            this.numPosicionesMin = 5;
            this.numPosicionesMax = 16;
            this.posiciones = "5";
            this.cuadroU = "4";
        }
    }

    /* Todos los calculos estan hechos en unidades */

    public void calcularCantidades(Boolean acero_inoxidable, Boolean costado){
        this.cant_parales =
                (Integer.valueOf(this.cuerpos) + 1) * Integer.valueOf(this.modulos) * 2;
        this.cant_cuadroU =
                Float.valueOf(this.cuadroU) *  Float.valueOf(this.cuerpos) * Float.valueOf(this.modulos);
        this.cant_travesanos =
                (Integer.valueOf(this.posiciones) - Integer.valueOf(this.cuadroU)) * Integer.valueOf(this.cuerpos) * Integer.valueOf(this.modulos) * 2;
        this.cant_tornillos_40 =
                6 * Integer.valueOf(this.posiciones) * Integer.valueOf(this.modulos) ;
        this.cant_tornillos_60 =
                3 * (Integer.valueOf(this.cuerpos) - 1) * Integer.valueOf(this.posiciones) * Integer.valueOf(this.modulos);
        this.cant_tuerca_lujo =
                Integer.valueOf(this.cant_tornillos_40) + Integer.valueOf(this.cant_tornillos_60);
        if(acero_inoxidable == false) {
            this.cant_bota_cuadrada =
                    2 * (Integer.valueOf(this.cuerpos) + 1) * Integer.valueOf(this.modulos);
        } else {
            this.cant_bota_cuadrada =
                    3 * (Integer.valueOf(this.cuerpos) + 1) * Integer.valueOf(this.modulos);
        }
        if(acero_inoxidable == false) {
            this. cant_tapon_cuadrado = 0;
        } else {
            this. cant_tapon_cuadrado = (Integer.valueOf(this.cuerpos) + 1) * Integer.valueOf(this.modulos);
        }

        /* No es necesario calcular las cantidades de algunos elementos pues ya estas son dadas
         * directamente. Por lo tanto se calcula directo el precio total
         */

    }

    public void calcularPrecio(Boolean acero_inoxidable, Boolean costado){

        if(acero_inoxidable == false) {
            if (this.altura == "0.90") {
                this.precio_total_parales = Integer.toString(this.cant_parales * Integer.valueOf(Producto.paral_090.getPrecio()));
            } else if (this.altura == "1.46") {
                this.precio_total_parales = Integer.toString(this.cant_parales * Integer.valueOf(Producto.paral_146.getPrecio()));
            } else if (this.altura == "1.94") {
                this.precio_total_parales = Integer.toString(this.cant_parales * Integer.valueOf(Producto.paral_194.getPrecio()));
            } else if (this.altura == "2.40") {
                this.precio_total_parales = Integer.toString(this.cant_parales * Integer.valueOf(Producto.paral_240.getPrecio()));
            }
        }
        else { // acero_inoxidable == true
            if (this.altura == "0.90") {
                this.precio_total_parales = Integer.toString(this.cant_parales * Integer.valueOf(Producto.paral_090_inox.getPrecio()));
            } else if (this.altura == "1.46") {
                this.precio_total_parales = Integer.toString(this.cant_parales * Integer.valueOf(Producto.paral_146_inox.getPrecio()));
            } else if (this.altura == "1.94") {
                this.precio_total_parales = Integer.toString(this.cant_parales * Integer.valueOf(Producto.paral_194_inox.getPrecio()));
            } else if (this.altura == "2.40") {
                this.precio_total_parales = Integer.toString(this.cant_parales * Integer.valueOf(Producto.paral_240_inox.getPrecio()));
            }
        }

        if(costado == false){
            if(acero_inoxidable == false) {
                this.precio_total_cuadroU = Integer.toString(Math.round(this.cant_cuadroU * Float.valueOf(Producto.cuadro_u.getPrecio())));
            } else { // acero_inoxidable == true
                this.precio_total_cuadroU = Integer.toString(Math.round(this.cant_cuadroU * Float.valueOf(Producto.cuadro_u_inox.getPrecio())));
            }
        }
        else{ // costado == true
            this.precio_total_cuadroU = Integer.toString(Math.round(this.cant_cuadroU * Float.valueOf(Producto.cuadro_u_costado.getPrecio())));
        }

        if(costado == false){
            if(acero_inoxidable == false) {
                this.precio_total_travesanos = Integer.toString(this.cant_travesanos * Integer.valueOf(Producto.travesano.getPrecio()));
            } else { // acero_inoxidable == true
                this.precio_total_travesanos = Integer.toString(this.cant_travesanos * Integer.valueOf(Producto.travesano_inox.getPrecio()));
            }
        }
        else{ // costado == true
            this.precio_total_travesanos = Integer.toString(this.cant_travesanos * Integer.valueOf(Producto.travesano_costado.getPrecio()));
        }

        if(acero_inoxidable == false) {
            this.precio_total_tornillos_40 = Integer.toString(this.cant_tornillos_40 * Integer.valueOf(Producto.tornillos_40.getPrecio()));
        } else{ // acero_inoxidable == true
            this.precio_total_tornillos_40 = Integer.toString(this.cant_tornillos_40 * Integer.valueOf(Producto.tornillos_40_inox.getPrecio()));
        }

        if(acero_inoxidable == false) {
            this.precio_total_tornillos_60 = Integer.toString(this.cant_tornillos_60 * Integer.valueOf(Producto.tornillos_60.getPrecio()));
        } else{ // acero_inoxidable == true
            this.precio_total_tornillos_60 = Integer.toString(this.cant_tornillos_60 * Integer.valueOf(Producto.tornillos_60_inox.getPrecio()));
        }

        if(acero_inoxidable == false) {
            this.precio_total_tuerca_lujo = Integer.toString(this.cant_tuerca_lujo * Integer.valueOf(Producto.tuerca_lujo.getPrecio()));
        } else { // acero_inoxidable == true
            this.precio_total_tuerca_lujo = Integer.toString(this.cant_tuerca_lujo * Integer.valueOf(Producto.tuerca_inox.getPrecio()));
        }

        this.precio_total_bota_cuadrada = Integer.toString(this.cant_bota_cuadrada * Integer.valueOf(Producto.bota_cuadrada.getPrecio()));

        this.precio_total_tapon_cuadrado = Integer.toString(this.cant_tapon_cuadrado * Integer.valueOf(Producto.tapon_cuadrado.getPrecio()));

        this.precio_total_cuadro_ext_est_1 = Integer.valueOf(this.cant_cuadro_ext_est_1) * Integer.valueOf(Producto.cuadro_ext_est_m_1.getPrecio());
        this.precio_total_cuadro_ext_est_2 = Integer.valueOf(this.cant_cuadro_ext_est_2) * Integer.valueOf(Producto.cuadro_ext_est_m_2.getPrecio());
        this.precio_total_cuadro_ext_est_3 = Integer.valueOf(this.cant_cuadro_ext_est_3) * Integer.valueOf(Producto.cuadro_ext_est_m_3.getPrecio());
        this.precio_total_cuadro_ext_est_4 = Integer.valueOf(this.cant_cuadro_ext_est_4) * Integer.valueOf(Producto.cuadro_ext_est_m_4.getPrecio());
        this.precio_total_cuadro_ext_est_5 = Integer.valueOf(this.cant_cuadro_ext_est_5) * Integer.valueOf(Producto.cuadro_ext_est_m_5.getPrecio());
        this.precio_total_travesano_ext_mod = Integer.valueOf(this.cant_travesano_ext_mod) * Integer.valueOf(Producto.travesano_extension_modular.getPrecio());

        this.precio_total_canastilla_13_perf = Integer.valueOf(this.cant_canastilla_13_perf) * Integer.valueOf(Producto.canastilla_13_cm_perforada.getPrecio());
        this.precio_total_canastilla_13_cerr = Integer.valueOf(this.cant_canastilla_13_cerr) * Integer.valueOf(Producto.canastilla_13_cm_cerrada.getPrecio());
        this.precio_total_canastilla_18_perf = Integer.valueOf(this.cant_canastilla_18_perf) * Integer.valueOf(Producto.canastilla_18_cm_perforada.getPrecio());
        this.precio_total_canastilla_18_cerr = Integer.valueOf(this.cant_canastilla_18_cerr) * Integer.valueOf(Producto.canastilla_18_cm_cerrada.getPrecio());
        this.precio_total_canastilla_25_perf = Integer.valueOf(this.cant_canastilla_25_perf) * Integer.valueOf(Producto.canastilla_25_cm_perforada.getPrecio());
        this.precio_total_canastilla_25_cerr = Integer.valueOf(this.cant_canastilla_25_cerr) * Integer.valueOf(Producto.canastilla_25_cm_cerrada.getPrecio());
        this.precio_total_canastilla_33_perf = Integer.valueOf(this.cant_canastilla_33_perf) * Integer.valueOf(Producto.canastilla_33_cm_perforada.getPrecio());
        this.precio_total_canastilla_33_cerr = Integer.valueOf(this.cant_canastilla_33_cerr) * Integer.valueOf(Producto.canastilla_33_cm_cerrada.getPrecio());
        this.precio_total_canastilla_41_perf = Integer.valueOf(this.cant_canastilla_41_perf) * Integer.valueOf(Producto.canastilla_41_cm_perforada.getPrecio());
        this.precio_total_canastilla_41_cerr = Integer.valueOf(this.cant_canastilla_41_cerr) * Integer.valueOf(Producto.canastilla_41_cm_cerrada.getPrecio());
        this.precio_total_tapa_normatizada = Integer.valueOf(this.cant_tapa_normatizada) * Integer.valueOf(Producto.tapa_normatizada.getPrecio());

        this.precio_total_estanteria = Integer.toString(
                Integer.valueOf(this.precio_total_parales) + Integer.valueOf(this.precio_total_cuadroU) +
                        Integer.valueOf(this.precio_total_travesanos) + Integer.valueOf(this.precio_total_tornillos_40) +
                        Integer.valueOf(this.precio_total_tornillos_60) + Integer.valueOf(this.precio_total_tuerca_lujo) +
                        Integer.valueOf(this.precio_total_tapon_cuadrado) + Integer.valueOf(this.precio_total_bota_cuadrada) +

                        this.precio_total_cuadro_ext_est_1 + this.precio_total_cuadro_ext_est_2 +
                        this.precio_total_cuadro_ext_est_3 + this.precio_total_cuadro_ext_est_4 +
                        this.precio_total_cuadro_ext_est_5 + this.precio_total_travesano_ext_mod +

                        this.precio_total_canastilla_13_perf + this.precio_total_canastilla_13_cerr +
                        this.precio_total_canastilla_18_perf + this.precio_total_canastilla_18_cerr +
                        this.precio_total_canastilla_25_perf + this.precio_total_canastilla_25_cerr +
                        this.precio_total_canastilla_33_perf + this.precio_total_canastilla_33_cerr +
                        this.precio_total_canastilla_41_perf + this.precio_total_canastilla_41_cerr +
                        this.precio_total_tapa_normatizada
        );
    }

    public void formatoPrecio(String precio){
        String temp_precio = "";
        for(int i = 1; i < precio.length() + 1; i++) {
            temp_precio = temp_precio.concat(String.valueOf(precio.charAt((precio.length() - i))));
            if(i % 3 == 0 && i != precio.length()){
                temp_precio = temp_precio.concat(".");
            }
        }
        this.precio_total_estanteria = reverse(temp_precio);
    }

    public static String reverse(String input){
        char[] in = input.toCharArray();
        int begin = 0;
        int end= in.length - 1;
        char temp;
        while(end > begin){
            temp = in[begin];
            in[begin] = in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }

}