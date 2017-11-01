package codesiders.upqdocentes;
/**
 * Created by UPQ on 30/10/2017.
 */

/**
 * Clase que contiene los códigos usados en la aplicación para
 * mantener la integridad en las interacciones entre actividades
 * y fragmentos
 */
public class Constantes {
    public static final int CODIGO_DETALLE = 100;
    public static final int CODIGO_ACTUALIZACION = 101;
    private static final String PUERTO_HOST = "";
    private static final String IP = "http://10.0.3.2:";
    /**
     * URLs del Web Service
     */
    public static final String GET = IP + PUERTO_HOST + "/I%20Wish/obtener_metas.php";
    public static final String GET_BY_ID = IP + PUERTO_HOST + "/I%20Wish/obtener_meta_por_id.php";
    public static final String UPDATE = IP + PUERTO_HOST + "/I%20Wish/actualizar_meta.php";
    public static final String DELETE = IP + PUERTO_HOST + "/I%20Wish/borrar_meta.php";
    public static final String INSERT = IP + PUERTO_HOST + "/I%20Wish/insertar_meta.php";

    /**
     * Clave para el valor extra que representa al identificador de una meta
     */
    public static final String EXTRA_ID = "IDEXTRA";

}