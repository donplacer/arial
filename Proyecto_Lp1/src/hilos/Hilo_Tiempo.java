package hilos;
import java.text.SimpleDateFormat;
import java.util.Date;
import vista.FrmMenuPrincipal;
public class Hilo_Tiempo extends Thread{
	

	
		
		public void run() {
			while(true) {
				Date tiempo = new Date();
				SimpleDateFormat sdf1=new SimpleDateFormat("yyyy/MM/dd");
				SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
				FrmMenuPrincipal.lblFecha.setText(sdf1.format(tiempo));//FECHA
				FrmMenuPrincipal.lblReloj.setText(sdf.format(tiempo));//HORA
			}
		}	
	}


