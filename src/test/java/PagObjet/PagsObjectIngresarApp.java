package PagObjet;

import java.io.File;
import MapsObjet.MapsObjetIngresarApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PagsObjectIngresarApp extends MapsObjetIngresarApp {
	
	//INSTANCIA DE APPIUM DRIVER, SE  INSTANCIA EL DRIVER PERO EN VERSION MOBILE
	public PagsObjectIngresarApp(AppiumDriver<MobileElement> driver) {
		super(driver);
		this.driver = driver;
	}
	
	//Metodo de login  
	
	public void ingresoexitoso_572160(String Evidencia,String Usuario,String Contrasena,File rutaCarpeta,String Usuario1) throws Exception {
			
		
		
			//tocarPantalla(550, 934);
			//click2(btnAceptar, 10, rutaCarpeta, Evidencia);
			
			click2(btnRecordarMiUsuario, 5, rutaCarpeta, Evidencia);
			click2(btnRecordarMiUsuario, 5, rutaCarpeta, Evidencia);			
			//toca pantalla en las coordenadas donde esta usuario
			//tocarPantalla(210, 342);
			click2(campollenar, 5, rutaCarpeta, Evidencia);
		
			
			//sendkey2(Usuario, campollenar, 5, rutaCarpeta, Evidencia);
			//toca pantalla en las coordenadas donde esta contraseña(dos veces porque no responde bien al primer tocar pantalla en la automatizacion porque manualmente si)
			
			click2(contrasena, 5, rutaCarpeta, Evidencia);
			
			sendkey2(Contrasena, contrasena, 5, rutaCarpeta, Evidencia);
			//click en iniciar sesion
			click2(btnIniciarSesion,10,rutaCarpeta,Evidencia);
			
			tiempoEspera(6000);
			
			click2(btnMenuGeneral, 5, rutaCarpeta, Evidencia);
			
			tocarPantalla(168, 1267);
			//click2(btnSalirSeguro, 5, rutaCarpeta, Evidencia);
			
			click2(btnAceptarSalir, 5, rutaCarpeta, Evidencia);
			
			//toca pantalla en las coordenadas donde esta usuario
			//tocarPantalla(210, 342);
			click2(campollenar, 5, rutaCarpeta, Evidencia);
		
			sendkey2(Usuario1, campollenar, 5, rutaCarpeta, Evidencia);
			//toca pantalla en las coordenadas donde esta contraseña(dos veces porque no responde bien al primer tocar pantalla en la automatizacion porque manualmente si)
			
			click2(contrasena, 5, rutaCarpeta, Evidencia);
			
			sendkey2(Contrasena, contrasena, 5, rutaCarpeta, Evidencia);
			//click en iniciar sesion
			click2(btnIniciarSesion,10,rutaCarpeta,Evidencia);
			
			
     }	
}
