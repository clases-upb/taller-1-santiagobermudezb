package full_talleres;

public class Taller1 { 
    public static void main(String[] args) {

    }

    /* 
     2. Diseñe un algoritmo e implemente la función Convertir_km_seg que: reciba una velocidad entera en Km/seg 
     y la convierta a metros/seg y a metros/hora. Retorne un string del tipo: ### m/s - ### m/h. Si hay error, 
     devuelva el string "Error en la conversión"
    */

    public static String Convertir_km_seg(float velocidad_kilometros_segundos) {
        try {
            // Declarar las constantes y las variables del problema
            float vel_m_seg = 0;
            float vel_m_hra = 0;
            final int km_m = 1000;
            final int seg_hra = 3600;
    
            // Realizar los cálculos de conversión
            vel_m_seg = velocidad_kilometros_segundos * km_m; 
            vel_m_hra = velocidad_kilometros_segundos * km_m * seg_hra;
    
            return vel_m_seg + " m/s - " + vel_m_hra + " m/h";
        } catch (Exception errException) {
            return "Error en la conversión";
        }
    }

    /* 
     3. Diseñe un algoritmo e implemente la función Convertir_cm_lt que: reciba una cantidad double expresada en 
     cc (centímetros cúbicos) y devuelva un float con su equivalente en litros. Si hay algún error, retorne 0.
    */

   public static float Convertir_cm_lt (double cantidad_centimetros){
    try {
        // Declarar las variables y la constante del problema
        float cantidad_l = 0;
        final int litros_centimetros = 1000; 

        // Realizar la conversión
        cantidad_l = (float) (cantidad_centimetros / litros_centimetros);

        return cantidad_l; 
    } 
    
    catch (Exception erException) {
        return 0; 
    }
}


   /* 
    4. Diseñe un algoritmo e implemente la función Convertir_us_cops que reciba una cantidad entera de dólares 
    y devuelva su equivalente en pesos usando una TRM de $4170 pesos por cada dólar. La función recibe enteros
    y devuelve enteros, pueden ser grandes. Si hay algún error, retorne -1.
   */
   
   public static long Convertir_us_cops(int cantidad_dolares){
    try {
        // Declarar las variables y la constante del problema
        long Cantidad_Pesos = 0;
        final long trm = 4170;

        // Realizar la conversión
        Cantidad_Pesos = cantidad_dolares * trm;

        return Cantidad_Pesos; 
    } 

    catch (Exception errException) {
        return -1; 
    }
}

   /* 
    5. Diseñe un algoritmo e implemente la función Convertir_cent_far que recibe la temperatura real en grados 
    centígrados y la devuelve en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5). Si hay algún error, 
    retorne 0.
   */

   public static double Convertir_cent_far(double centigrados) {
    try {
        // Declarar las variables y las constantes del problema
        double C = centigrados; 
        final double Constante1 = 32; 
        final double division = 9.0 / 5.0; 

        // Realizar la conversión
        double Fahrenheit = Constante1 + (division * C);

        return Fahrenheit;
    } 
    
    catch (Exception errException) {
        return 0;
    }
}

   /* 
    6. Diseñe un algoritmo e implemente la función Calcular_segs que recibirá el número de Días, el número de horas, 
    el número de minutos y número segundos como enteros bytes, positivos y devuelva todo en segundos en un entero. 
    Si hay algún error, devuelva -1.
   */
  public static int Calcular_segs(short dias, short horas, short minutos, short segundos) {
    try {
        // Declarar las variables y las constantes del problema
        int seg_dia = 24 * 60 * 60;
        int seg_h = 60 * 60;
        int seg_min= 60;

        // Realizar el cálculo de segundos totales
        int total_seg = dias * seg_dia + horas * seg_h + minutos * seg_min + segundos;

        return total_seg;
    } 
    
    catch (Exception errException) {
        return -1;
    }
}

   /* 
    7. Un usuario tiene un sistema de báscula para pesar camiones. Diseñe un algoritmo e implemente la función 
    Calcular_peso_carga que reciba un float con el peso total del camión cargado en toneladas y otro float con 
    lo que pesa el camión vacío en toneladas, y devuelva el peso neto de la carga en kilos y toneladas 
    en un string del tipo: "### kilos - ### toneladas". 
    Si hay algún error, devuelva en un string "Error en la función Calcular_peso_carga"
   */

   public static String Calcular_peso_carga(float peso_total, float peso_vacio) {
    try {
        // Declarar las variables y la constante del problema
        final int ton_kl = 1000;
        float Peso_nt = peso_total - peso_vacio;
        float Peso_nt_kl = Peso_nt * ton_kl;
        float Peso_nt_ton = Peso_nt;

        String resultado = (Peso_nt_kl + " kilos - " + Peso_nt_ton + " toneladas");

        return resultado;
    } 
    
    catch (Exception errException) {
        return "Error en la función Calcular_peso_carga";
    }
}

   /* 
    8. Diseñe un algoritmo e implemente la función Calcular_horasxviaje que calcule y devuelva un float con las horas  
    necesarias para alcanzar un destino que es recibido en un string, además de un short con la distancia en kms
    otro dato short que es la velocidad promedio que alcanzará también el vehículo en kilómetros/hora.  
    Si hay algún error, devuelva -1.
   */

   public static float Calcular_horasxviaje(String destino, short distancia, short velocidad) {
    try {
        // Declarar la variable para el tiempo de viaje
        float tpo_viaje = 0;

        // Realizar el cálculo del tiempo de viaje
        tpo_viaje = (float) (distancia / velocidad);

        return (float) (int) tpo_viaje;

    } 
    
    catch (Exception errException) {
        return -1;
    }
}

   /* 
    9. Un avión necesita cargar combustible para cubrir sus rutas programadas en el día. 
    Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero. 
    En el despegue el avión consume 1.2 toneladas de combustible y en el aterrizaje consume 0.4 toneladas. 
   
    Diseñe un algoritmo e implemente la función Calcular_combustible, 
    el kilometraje total para cada una de cuatro rutas que son datos enteros, y devuelva un float con la cantidad total 
    de combustible que debe ser cargado en el avión.
   
    Si hay algún error, devuelva -1.
   */

   public static float Calcular_combustible(int ruta1, int ruta2, int ruta3, int ruta4) {
    try {
        // Declarar las variables y constantes del problema
        float aterrizaje = (float) 0.4;
        float despegue = (float) 1.2;
        float km = (float) (0.2 / 60.8); 
        final int cantidad_rutas = 4;
        
        // Calcular el combustible necesario para cada ruta
        float total_despegue = (despegue + aterrizaje) * cantidad_rutas;
        float ruta_1 = (float) (ruta1 * km);
        float ruta_2 = (float) (ruta2 * km);
        float ruta_3 = (float) (ruta3 * km);
        float ruta_4 = (float) (ruta4 * km);

        // Calcular el combustible total
        float total = ruta_1 + ruta_2 + ruta_3 + ruta_4 + total_despegue;

        return total;

    } 
    
    catch (Exception errException) {
        return -1;
    }
}

   /* 
    10. Diseñe un algoritmo e implemente la función Calcular_peso_luna que recibe un byte con el peso en la tierra en kilos
    y devuelve un double el equivalente de ese peso en la luna en Newtons. Utilice las siguientes fórmulas.
    peso_tierra_new = peso_kilos * 9.81 m/s²
    peso_luna_new = peso_tierra_new * 0.165
   
    Si hay algún error, devuelva 0.
   */

   public static double Calcular_peso_luna(byte peso_kilos) { 
    try {
        // Declarar variables y constantes
        double peso_tierra_nuevo = 0;
        double peso_luna_nuevo = 0;
        final float gravedad_tierra = (float)(9.81); 
        final float factor_luna = (float)(0.165);

        // Calcular el peso en la Tierra
        peso_tierra_nuevo = peso_kilos * gravedad_tierra;

        // Calcular el peso en la Luna
        peso_luna_nuevo = peso_tierra_nuevo * factor_luna;
        
        return peso_luna_nuevo;

    } 

    catch (Exception e) {
        return 0;
    }
}
}
