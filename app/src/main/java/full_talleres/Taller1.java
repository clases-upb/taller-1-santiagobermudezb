package full_talleres;

public class Taller1 {
    
    public static void main(String[] args) {
     
    }

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

    public static String Convertir_km_seg(int kmSeg) {
        try {
            double mSeg = kmSeg * METROS_EN_KILOMETRO;
            double mHora = mSeg * SEGUNDOS_EN_HORA;
            return String.format("%.1f m/s - %.1E m/h", mSeg, mHora);
        } catch (Exception e) {
            return "Error en la conversion";
        }
    }

    public static float Convertir_cm_lt(double cc) {
        try {
            return (float) (cc * LITROS_EN_CENTIMETRO_CUBICO);
        } catch (Exception e) {
            return 0;
        }
    }

    public static long Convertir_us_cops(int dolares) {
        try {
            return Math.round(dolares * TRM);
        } catch (Exception e) {
            return -1;
        }
    }

    public static double Convertir_cent_far(double celsius) {
        try {
            return 32 + (9.0 * celsius / 5.0);
        } catch (Exception e) {
            return 0;
        }
    }

    public static int Calcular_segs(short dias, short horas, short minutos, short segundos) {
        try {
            return dias * 24 * 3600 + horas * 3600 + minutos * 60 + segundos;
        } catch (Exception e) {
            return -1;
        }
    }

    public static String Calcular_peso_carga(float pesoTotal, float pesoVacio) {
        try {
            float pesoCarga = pesoTotal - pesoVacio;
            return String.format("%.1f kilos - %.1f toneladas", pesoCarga * 1000, pesoCarga);
        } catch (Exception e) {
            return "Error en la función Calcular_peso_carga";
        }
    }

    public static float Calcular_horasxviaje(String destino, short distancia, short velocidad) {
        try {
            return (float) distancia / velocidad;
        } catch (Exception e) {
            return -1;
        }
    }

    public static float Calcular_combustible(int ruta1, int ruta2, int ruta3, int ruta4) {
        try {
            int[] rutas = {ruta1, ruta2, ruta3, ruta4};
            double consumoTotal = 0;
            for (int km : rutas) {
                consumoTotal += km * COMBUSTIBLE_POR_KM;
            }
            consumoTotal += CONSUMO_DESPEGUE + CONSUMO_ATERRIZAJE;
            return (float) consumoTotal;
        } catch (Exception e) {
            return -1;
        }
    }

    public static double Calcular_peso_luna(byte pesoTierra) {
        try {
            double pesoTierraNewtons = pesoTierra * GRAVEDAD_TIERRA;
            return pesoTierraNewtons * FACTOR_LUNA;
        } catch (Exception e) {
            return 0;
        }
    }
}
