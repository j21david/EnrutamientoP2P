package middleware_ServidorCent;

import java.util.ArrayList;

/**
 *
 * @author Bryan German
 */
public class Aplicacion_Middleware_ServidorCent {

    public static int contadorServidores = 0;
    public static int contadorClientes = 0;
    public static ArrayList<Object> servidores = new ArrayList<>();
    public static ArrayList<Object> clientes = new ArrayList<>();
    public static int numeroDeHilos= 0;

    public static void main(String[] args) {
        int puertoServidores = 5000;
        int puertoClientes = 5001;

            Thread servidor = new Thread(new Mythread_ServidorCent(puertoServidores,puertoClientes));
            Thread cliente = new Thread(new Mythread_ClienteCent(puertoClientes));
            servidor.start();
            cliente.start();
    }

}
