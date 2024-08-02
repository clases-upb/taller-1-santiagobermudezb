package full_talleres;

public class Taller1 {
    // Constantes
    public static final double TRM = 4170.0;
    public static final double METROS_EN_KILOMETRO = 1000.0;
    public static final double SEGUNDOS_EN_HORA = 3600.0;
    public static final double LITROS_EN_CENTIMETRO_CUBICO = 0.001;
    public static final double CONSUMO_DESPEGUE = 1.2;
    public static final double CONSUMO_ATERRIZAJE = 0.4;
    public static final double COMBUSTIBLE_POR_KM = 0.2 / 60.8;
    public static final double GRAVEDAD_TIERRA = 9.81;
    public static final double FACTOR_LUNA = 0.165;

    public static void main(String[] args) {
        System.out.println("Taller 1");

        // Pruebas de las funciones
        System.out.println("Convertir_km_seg: " + Convertir_km_seg(10));
        System.out.println("Convertir_cm_lt: " + Convertir_cm_lt(1000));
        System.out.println("Convertir_us_cops: " + Convertir_us_cops(100));
        System.out.println("Convertir_cent_far: " + Convertir_cent_far(30));
        System.out.println("Calcular_segs: " + Calcular_segs((short) 1, (short) 2, (short) 3, (short) 4));
        System.out.println("Calcular_peso_carga: " + Calcular_peso_carga(10.5f, 2.5f));
        System.out.println("Calcular_combustible: " + Calcular_combustible(100, 200));
        System.out.println("Calcular_tiempo_vuelo: " + Calcular_tiempo_vuelo(100, 200));
        System.out.println("Calcular_peso_luna: " + Calcular_peso_luna(70));
    }

    /* 
     2.	Diseñe un algoritmo e implemente la función Convertir_km_seg que: reciba una velocidad entera en Km/seg 
     y la convierta a metros/seg y a metros/hora. Retorne un string del tipo: ### m/s - ### m/h. Si hay error, 
     devuelva el string "Error en la conversion"
    */
    public static String Convertir_km_seg(int kmSeg) {
        try {
            double mSeg = kmSeg * METROS_EN_KILOMETRO;
            double mHora = mSeg * SEGUNDOS_EN_HORA;
            return String.format("%.1f m/s - %.1E m/h", mSeg, mHora);
        } catch (Exception e) {
            return "Error en la conversion";
        }
    }

    /*3. Diseñe un algoritmo e implemente la función Convertir_cm_lt que: reciba una cantidad double expresada en 
    cc (centímetros cúbicos) y devuelva un float con su equivalente en litros. Si hay algún error, retorne 0.
    */
    public static float Convertir_cm_lt(double cc) {
        try {
            return (float) (cc * LITROS_EN_CENTIMETRO_CUBICO);
        } catch (Exception e) {
            return 0;
        }
    }

    /*4.	Diseñe un algoritmo e implemente la función Convertir_us_cops que reciba una cantidad entera de dólares 
   y devuelva su equivalente en pesos usando una TRM de $4170 pesos por cada dólar. La función recibe enteros
   y devuelve enteros, pueden ser grandes. Si hay algún error, retorne -1.
   */
    public static long Convertir_us_cops(int dolares) {
        try {
            return Math.round(dolares * TRM);
        } catch (Exception e) {
            return -1;
        }
    }

    /*5.	Diseñe un algoritmo e implemente la función Convertir_cent_far que recibe la temperatura real en grados 
   centígrados y la devuelve en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5). Si hay algún error, 
   retorne 0.
   */
    public static double Convertir_cent_far(double celsius) {
        try {
            return 32 + (9.0 * celsius / 5.0);
        } catch (Exception e) {
            return 0;
        }
    }

        /*6.	Diseñe un algoritmo e implemente la función Calcular_segs que recibirá el número de Días, el número de horas, 
   el número de minutos y número segundos como enteros bytes, positivos y devuelva todo en segundos en un entero. 
   Si hay algún error, devuelva -1.
   */
  public static int Calcular_segs(short dias, short horas, short minutos, short segundos) {
    try {
        return dias * 24 * 3600 + horas * 3600 + minutos * 60 + segundos;
    } catch (Exception e) {
        return -1;
    }
}

/*7.	Un usuario tiene un sistema de báscula para pesar camiones. Diseñe un algoritmo e implemente la función 
Calcular_peso_carga que reciba un float con el peso total del camión cargado en toneladas y otro float con 
lo que pesa el camión vacío en toneladas, y devuelva el peso neto de la carga en kilos y toneladas 
en un string del tipo: ### kg - ### t
*/
public static String Calcular_peso_carga(float pesoTotal, float pesoVacio) {
    try {
        float pesoNetoToneladas = pesoTotal - pesoVacio;
        float pesoNetoKilos = pesoNetoToneladas * 1000;
        return String.format("%.2f kg - %.2f t", pesoNetoKilos, pesoNetoToneladas);
    } catch (Exception e) {
        return "Error en el cálculo";
    }
}

/*8.	Diseñe un algoritmo e implemente la función Calcular_combustible que reciba la distancia en km y el consumo 
en km/l y devuelva el consumo total de combustible en litros. Si hay algún error, devuelva -1.
*/
public static double Calcular_combustible(double distancia, double consumo) {
    try {
        return distancia / consumo;
    } catch (Exception e) {
        return -1;
    }
}

/*9.	Diseñe un algoritmo e implemente la función Calcular_tiempo_vuelo que reciba la distancia en km y la velocidad 
en km/h y devuelva el tiempo de vuelo en horas. Si hay algún error, devuelva -1.
*/
public static double Calcular_tiempo_vuelo(double distancia, double velocidad) {
    try {
        return distancia / velocidad;
    } catch (Exception e) {
        return -1;
    }
}

/*10.	Diseñe un algoritmo e implemente la función Calcular_peso_luna que reciba el peso en la tierra en kg y 
devuelva el peso en la luna en kg. Si hay algún error, devuelva -1.
*/
public static double Calcular_peso_luna(double pesoTierra) {
    try {
        return pesoTierra * FACTOR_LUNA;
    } catch (Exception e) {
        return -1;
    }
}
}
