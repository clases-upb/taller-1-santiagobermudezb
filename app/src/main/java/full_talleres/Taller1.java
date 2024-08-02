package full_talleres;

public class Taller1 {

    // Constantes
    public static final double KM_TO_METERS = 1000;
    public static final int SECONDS_IN_HOUR = 3600;
    public static final double CC_TO_LITERS = 0.001;
    public static final int TRM = 4170; // Tasa de cambio en pesos
    public static final double FAHRENHEIT_CONVERSION_CONSTANT = 32;
    public static final double FAHRENHEIT_CONVERSION_MULTIPLIER = 9.0 / 5.0;
    public static final double NEWTON_ON_EARTH = 9.81;
    public static final double NEWTON_ON_MOON = 0.165;
    public static final double CONSUMO_POR_KM = 0.2 / 60.8;
    public static final double CONSUMO_DESPEGUE = 1.2;
    public static final double CONSUMO_ATERRIZAJE = 0.4;

    /*
     2. Diseñe un algoritmo e implemente la función Convertir_km_seg que: reciba una velocidad entera en Km/seg 
     y la convierta a metros/seg y a metros/hora. Retorne un string del tipo: ### m/s - ### m/h. Si hay error, 
     devuelva el string "Error en la conversion"
    */
    public static String Convertir_km_seg(int velocidadKmSeg) {
        try {
            double metrosSeg = velocidadKmSeg * KM_TO_METERS;
            double metrosHora = metrosSeg * SECONDS_IN_HOUR;
            return String.format("%.1f m/s - %.2E m/h", metrosSeg, metrosHora);
        } catch (Exception e) {
            return "Error en la conversion";
        }
    }

    /*
     3. Diseñe un algoritmo e implemente la función Convertir_cm_lt que: reciba una cantidad double expresada en 
     cc (centímetros cúbicos) y devuelva un float con su equivalente en litros. Si hay algún error, retorne 0.
    */
    public static float Convertir_cm_lt(double cc) {
        try {
            return (float) (cc * CC_TO_LITERS);
        } catch (Exception e) {
            return 0;
        }
    }

    /*
     4. Diseñe un algoritmo e implemente la función Convertir_us_cops que reciba una cantidad entera de dólares 
     y devuelva su equivalente en pesos usando una TRM de $4170 pesos por cada dólar. La función recibe enteros
     y devuelve enteros, pueden ser grandes. Si hay algún error, retorne -1.
    */
    public static long Convertir_us_cops(int dolares) {
        try {
            return (long) (dolares * TRM);
        } catch (Exception e) {
            return -1;
        }
    }

    /*
     5. Diseñe un algoritmo e implemente la función Convertir_cent_far que recibe la temperatura real en grados 
     centígrados y la devuelve en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5). Si hay algún error, 
     retorne 0.
    */
    public static double Convertir_cent_far(double gradosC) {
        try {
            return FAHRENHEIT_CONVERSION_CONSTANT + (FAHRENHEIT_CONVERSION_MULTIPLIER * gradosC);
        } catch (Exception e) {
            return 0;
        }
    }

    /*
     6. Diseñe un algoritmo e implemente la función Calcular_segs que recibirá el número de Días, el número de horas, 
     el número de minutos y número segundos como enteros bytes, positivos y devuelva todo en segundos en un entero. 
     Si hay algún error, devuelva -1.
    */
    public static int Calcular_segs(byte dias, byte horas, byte minutos, byte segundos) {
        try {
            int totalSegs = (dias * 24 * SECONDS_IN_HOUR) + (horas * SECONDS_IN_HOUR) + (minutos * 60) + segundos;
            return totalSegs;
        } catch (Exception e) {
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
    public static String Calcular_peso_carga(float pesoTotal, float pesoVacio) {
        try {
            // Calcular el peso neto de la carga
            float pesoCarga = pesoTotal - pesoVacio;
            
            // Convertir el peso de toneladas a kilogramos
            float pesoCargaKilos = pesoCarga * 1000;
            
            // Devolver el resultado en el formato esperado
            return String.format("%.1f kilos - %.1f toneladas", pesoCargaKilos, pesoCarga);
        } catch (Exception e) {
            return "Error en la función Calcular_peso_carga";
        }
    }

    /*
     8. Diseñe un algoritmo e implemente la función Calcular_horasxviaje que calcule y devuelva un float con las horas  
     necesarias para alcanzar un destino que es recibido en un string, además de un short con la distancia en kms
     otro dato short que es la velocidad  promedio que alcanzará también el vehículo en kilómetros/hora.  
     Si hay algún error, devuelva -1.
    */
    public static float Calcular_horasxviaje(String destino, short distancia, short velocidad) {
        try {
            if (velocidad <= 0) return -1; // Evitar división por cero
            return (float) distancia / velocidad;
        } catch (Exception e) {
            return -1;
        }
    }

    /*
     9. Un avión necesita cargar combustible para cubrir sus rutas programadas en el día. 
     Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero. 
     En el despegue el avión consume 1.2 toneladas de combustible y en el aterrizaje consume 0.4 toneladas. 
     
     El piloto desea que sea diseñado un algoritmo e implementado en la función Calcular_combustible, 
     el kilometraje total para cada una de cuatro rutas que son datos enteros, y devuelva un float con la cantidad total 
     de combustible que debe ser cargado en el avión.
     
     Si hay algún error, devuelva -1.
    */
    public static float Calcular_combustible(int ruta1, int ruta2, int ruta3, int ruta4) {
        try {
            double distanciaTotal = ruta1 + ruta2 + ruta3 + ruta4;
            // Consumo de combustible por km
            double consumoPorKm = CONSUMO_POR_KM;
            // Consumo total de combustible para las rutas
            double consumoRutas = distanciaTotal * consumoPorKm;
            // Consumo total incluyendo despegue y aterrizaje
            double consumoTotal = CONSUMO_DESPEGUE + CONSUMO_ATERRIZAJE + consumoRutas;
            return (float) consumoTotal;
        } catch (Exception e) {
            return -1;
        }
    }

    /*
     10. Diseñe un algoritmo e implemente la función Calcular_peso_luna que recibe un byte con el peso en la tierra en kilos
     y devuelve un double el equivalente de ese peso en la luna en Newtons. Utilice las siguientes fórmulas.
     peso_tierra_new = peso_kilos * 9.81m/s2
     peso_luna_new = peso_tierra_new * 0.165
     
     Si hay algún error, devuelva 0.
    */
    public static double Calcular_peso_luna(byte pesoTierraKilos) {
        try {
            double pesoTierraNewtons = pesoTierraKilos * NEWTON_ON_EARTH;
            return pesoTierraNewtons * NEWTON_ON_MOON;
        } catch (Exception e) {
            return 0;
        }
    }
}
