package com.example.prodalcamodulaser;

/**
 * Created by Andres on 29/12/2016.
 */

public class estanteriaCarga {

    //declaración de atributos
    private String altura, cuerpos, niveles, cuadro, modulos, fondo;
    private Boolean aceroInoxidable;
    private int numNivelesMin, numNivelesMax;

    private int cant_parales, cant_tornillos_60,
            cant_tornillos_80, cant_tuerca_lujo, cant_tapon_rectangular;
    private float cant_cuadro;

    private String precio_total_parales, precio_total_cuadro, precio_total_travesanos,
            precio_total_tornillos_60, precio_total_tornillos_80, precio_total_tuerca_lujo,
            precio_total_tapon_rectangular, precio_total_estanteria;

    //declaración de constructor
    public estanteriaCarga(String altura, String cuerpos, String niveles, String cuadro,
                           String modulos, String fondo, Boolean aceroInoxidable) {
        this.altura = altura;
        this.cuerpos = cuerpos;
        this.niveles = niveles;
        this.cuadro = cuadro;
        this.modulos = modulos;
        this.fondo = fondo;
        this.aceroInoxidable = aceroInoxidable;
        this.numNivelesMin = 2;
        this.numNivelesMax = 13;

        this.cant_parales = 0;
        this.cant_cuadro = 0;
        this.cant_tornillos_60 = 0;
        this.cant_tornillos_80 = 0;
        this.cant_tuerca_lujo = 0;
        this.cant_tapon_rectangular = 0;

        this.precio_total_parales = "0";
        this.precio_total_cuadro = "0";
        this.precio_total_travesanos = "0";
        this.precio_total_tornillos_60 = "0";
        this.precio_total_tornillos_80 = "0";
        this.precio_total_tuerca_lujo = "0";
        this.precio_total_tapon_rectangular = "0";

        this.precio_total_estanteria = "0";
    }

    //declaración de métodos

    public String getAltura(){
        return this.altura;
    }
    public String getCuerpos(){
        return this.cuerpos;
    }
    public String getNiveles(){
        return this.niveles;
    }
    public String getCuadro(){ return this.cuadro; }
    public String getModulos() { return this.modulos; }
    public String getFondo() { return this.fondo; }
    public Boolean getAceroInoxidable() { return this.aceroInoxidable; }
    public int getNumNivelesMin() { return this.numNivelesMin; }
    public int getNumNivelesMax() { return this.numNivelesMax; }

    public int getCantParales(){
        return this.cant_parales;
    }
    public float getCantCuadro(){
        return this.cant_cuadro;
    }
    public int getCantTornillos60(){
        return this.cant_tornillos_60;
    }
    public int getCantTornillos80(){
        return this.cant_tornillos_80;
    }
    public int getCantTuercaLujo(){
        return this.cant_tuerca_lujo;
    }
    public int getCantTaponRectangular(){
        return this.cant_tapon_rectangular;
    }

    public String getPrecioTotalParales(){
        return this.precio_total_parales;
    }
    public String getPrecioTotalCuadro(){
        return this.precio_total_cuadro;
    }
    public String getPrecioTotalTravesanos(){ return this.precio_total_travesanos; }
    public String getPrecioTotalTornillos60(){
        return this.precio_total_tornillos_60;
    }
    public String getPrecioTotalTornillos80(){
        return this.precio_total_tornillos_80;
    }
    public String getPrecioTotalTuercaLujo(){
        return this.precio_total_tuerca_lujo;
    }
    public String getPrecioTotalTaponRectangular(){ return this.precio_total_tapon_rectangular; }
    public String getPrecioTotalEstanteria(){
        return this.precio_total_estanteria;
    }

    public void actAltura(String nuevoAltura){ this.altura = nuevoAltura; }
    public void actCuerpos(String nuevoCuerpos){ this.cuerpos = nuevoCuerpos; }
    public void actNiveles(String nuevoNiveles){ this.niveles = nuevoNiveles; }

    public void actCuadro(int estado_caudro){
        if(estado_caudro == 0){
            this.cuadro = "40x90";
        }
        else if(estado_caudro == 1){
            this.cuadro = "52x90";
        }
        else if(estado_caudro == 2){
            this.cuadro = "60x90";
        }
        else if(estado_caudro == 3){
            this.cuadro = "70x90";
        }
        else if(estado_caudro == 4){
            this.cuadro = "60x120";
        }
        else if(estado_caudro == 5){ // Este estado solo se alcanza con el checkbox inoxidable
            this.cuadro = "60x90I";
        }
    }

    public void actModulos(String nuevoModulos) { this.modulos = nuevoModulos; }
    public void actFondo(String nuevoFondo) { this.fondo = nuevoFondo; }
    public void actAceroInoxidable(Boolean nuevoAceroInoxidable) { this.aceroInoxidable = nuevoAceroInoxidable; }

    public void actEstanteriaCanastillas(int estado) {
        if(estado == 0){
            this.altura = "1.94";
            this.numNivelesMin = 2;
            this.numNivelesMax = 13;
            this.niveles = "2";;
        }
        else if(estado == 1){
            this.altura = "2.40";
            this.numNivelesMin = 3;
            this.numNivelesMax = 16;
            this.niveles = "3";
        }
    }

    /* Todos los calculos estan hechos en unidades */

    public void calcularCantidades(Boolean acero_inoxidable){
        this.cant_parales =
                (Integer.valueOf(this.cuerpos) + 1) * Integer.valueOf(this.modulos) * 2 +
                        (Integer.valueOf(this.cuerpos) + 1) * Integer.valueOf(this.modulos) * (Integer.valueOf(this.fondo) - 1);
        this.cant_cuadro =
                Integer.valueOf(this.niveles) *  Integer.valueOf(this.cuerpos) *
                        Integer.valueOf(this.modulos) * Integer.valueOf(this.fondo);
        this.cant_tornillos_60 =
                8 * Integer.valueOf(this.niveles) * Integer.valueOf(this.modulos) *  Integer.valueOf(this.fondo) ;
        this.cant_tornillos_80 =
                4 * Integer.valueOf(this.niveles) * (Integer.valueOf(this.cuerpos) - 1) *
                        Integer.valueOf(this.modulos) *  Integer.valueOf(this.fondo);
        this.cant_tuerca_lujo =
                Integer.valueOf(this.cant_tornillos_60) + Integer.valueOf(this.cant_tornillos_80);
        this. cant_tapon_rectangular =
                4 * (Integer.valueOf(this.cuerpos) + 1) * Integer.valueOf(this.modulos) +
                        2 * (Integer.valueOf(this.cuerpos) + 1) * Integer.valueOf(this.modulos) * (Integer.valueOf(this.fondo) - 1);

        /* No es necesario calcular las cantidades de algunos elementos pues ya estas son dadas
         * directamente. Por lo tanto se calcula directo el precio total
         */

    }

    public void calcularPrecio(Boolean acero_inoxidable) {

        if (acero_inoxidable == false) {
            if (this.altura == "1.94") {
                this.precio_total_parales = Integer.toString(this.cant_parales * Integer.valueOf(Producto.paral_194_carga.getPrecio()));
            } else if (this.altura == "2.40") {
                this.precio_total_parales = Integer.toString(this.cant_parales * Integer.valueOf(Producto.paral_240_carga.getPrecio()));
            }
        } else { // acero_inoxidable == true
            if (this.altura == "1.94") {
                this.precio_total_parales = Integer.toString(this.cant_parales * Integer.valueOf(Producto.paral_194_carga_inox.getPrecio()));
            } else if (this.altura == "2.40") {
                this.precio_total_parales = Integer.toString(this.cant_parales * Integer.valueOf(Producto.paral_240_carga_inox.getPrecio()));
            }
        }

        if (acero_inoxidable == false) {
            if (this.cuadro == "40x90") {
                this.precio_total_cuadro = Integer.toString(Math.round(this.cant_cuadro * Integer.valueOf(Producto.cuadro_carga_40_90.getPrecio())));
            }
            if (this.cuadro == "52x90") {
                this.precio_total_cuadro = Integer.toString(Math.round(this.cant_cuadro * Integer.valueOf(Producto.cuadro_carga_52_90.getPrecio())));
            }
            if (this.cuadro == "60x90") {
                this.precio_total_cuadro = Integer.toString(Math.round(this.cant_cuadro * Integer.valueOf(Producto.cuadro_carga_60_90.getPrecio())));
            }
            if (this.cuadro == "70x90") {
                this.precio_total_cuadro = Integer.toString(Math.round(this.cant_cuadro * Integer.valueOf(Producto.cuadro_carga_70_90.getPrecio())));
            }
            if (this.cuadro == "60x120") {
                this.precio_total_cuadro = Integer.toString(Math.round(this.cant_cuadro * Integer.valueOf(Producto.cuadro_carga_60_120.getPrecio())));
            }

        } else { // acero_inoxidable == true
            if (this.cuadro == "60x90I") {
                this.precio_total_cuadro = Integer.toString(Math.round(this.cant_cuadro * Integer.valueOf(Producto.cuadro_carga_60_90_I.getPrecio())));
            }
        }


        if (acero_inoxidable == false) {
            this.precio_total_tornillos_60 = Integer.toString(this.cant_tornillos_60 * Integer.valueOf(Producto.tornillos_60.getPrecio()));
        } else { // acero_inoxidable == true
            this.precio_total_tornillos_60 = Integer.toString(this.cant_tornillos_60 * Integer.valueOf(Producto.tornillos_60_inox.getPrecio()));
        }

        if (acero_inoxidable == false) {
            this.precio_total_tornillos_80 = Integer.toString(this.cant_tornillos_80 * Integer.valueOf(Producto.tornillos_80.getPrecio()));
        } else { // acero_inoxidable == true
            this.precio_total_tornillos_80 = Integer.toString(this.cant_tornillos_80 * Integer.valueOf(Producto.tornillos_80_inox.getPrecio()));
        }

        if (acero_inoxidable == false) {
            this.precio_total_tuerca_lujo = Integer.toString(this.cant_tuerca_lujo * Integer.valueOf(Producto.tuerca_lujo.getPrecio()));
        } else { // acero_inoxidable == true
            this.precio_total_tuerca_lujo = Integer.toString(this.cant_tuerca_lujo * Integer.valueOf(Producto.tuerca_inox.getPrecio()));
        }

        this.precio_total_tapon_rectangular = Integer.toString(this.cant_tapon_rectangular * Integer.valueOf(Producto.tapon_rectangular.getPrecio()));

        this.precio_total_estanteria = Integer.toString(
                Integer.valueOf(this.precio_total_parales) + Integer.valueOf(this.precio_total_cuadro) +
                        Integer.valueOf(this.precio_total_tornillos_60) +
                        Integer.valueOf(this.precio_total_tornillos_80) + Integer.valueOf(this.precio_total_tuerca_lujo) +
                        Integer.valueOf(this.precio_total_tapon_rectangular)
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
