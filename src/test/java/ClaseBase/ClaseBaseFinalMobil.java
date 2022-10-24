package ClaseBase;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.TargetDataLine;
import javax.swing.JOptionPane;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Utilidades.GenerarReportePdf;
import com.itextpdf.text.DocumentException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidStartScreenRecordingOptions;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.screenrecording.CanRecordScreen;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class ClaseBaseFinalMobil {

	protected AppiumDriver<MobileElement> driver;

	String rutaOutput;

// CONSTRUCTOR DE CLASE
	public ClaseBaseFinalMobil(WebDriver driver)

	{
		super();
	}

	public void setrutaOutput(String rutaOutput, AppiumDriver<MobileElement> driver2) {
		this.rutaOutput = rutaOutput;
		this.driver = driver2;
	}

	public void intento(By locator, File rutaCarpeta) {
		{
			boolean intento;
			try {
				driver.findElement(By.id("logoutLink"));
				intento = true;
			} catch (NoSuchElementException e) {
				intento = false;
			}
		}
	}

	@SuppressWarnings("deprecation")
	public void recargarPag() {
		driver.getKeyboard().sendKeys(Keys.F5);
	}

// METODO ALERTA

	public void alert() {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.accept();
			tiempoEspera(3);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

// INGRESAR DATOS
	public void escribir(String palabra) throws Exception {

		char[] c = palabra.toCharArray();

		for (int i = 0; i < palabra.length(); i++) {
			String C = String.valueOf(c[i]);
			((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.valueOf(C)));
		}

		driver.hideKeyboard();
	}

// METODO DE NAVEGADOR
	@SuppressWarnings("rawtypes")
	public static AppiumDriver 
	appiumDriverConection(String platformName, String deviceName, String platformVersion,
			String appPackage, String appActivity, String noReset, String autoGrantPermissions)

	{
		AppiumDriver _driver = null;
		try {
// CEREARLAS CAPBILITIES DEL MOVIL
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("platformName", platformName);
			caps.setCapability("deviceName", deviceName);
			caps.setCapability("platformVersion", platformVersion);
			caps.setCapability("appPackage", appPackage);
			caps.setCapability("appActivity", appActivity);
			caps.setCapability("noReset", noReset);
			caps.setCapability("autoGrantPermissions", autoGrantPermissions);
// INSTANCIAR APPIUM DRIVER
			try {
				printConsola("Cargando Cability de appium, por favor espere...");
				_driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
			} 
			catch (MalformedURLException e) {
				printConsola(e.getMessage());
			}
			return _driver;
		} catch (Exception e) {
			printConsola(e.getMessage());
		}
		return _driver;
	}
	
				

	public void ventana(By locator) throws Exception
	{
		driver.findElementById("android:id/content").findElement(locator).click();
		
	}
	
	
// METODO CLICK
	public void click(By locator, File rutaCarpeta, String Evidencia) throws Exception {
		try {
			driver.findElement(locator).click();
			tiempoEspera(500);
			captureScreen2(rutaCarpeta, locator, Evidencia);
		} catch (Exception e) {
			captureScreenError(rutaCarpeta, locator, Evidencia, e.toString());
			throw new InterruptedException();
		}
	}
	
	//METOD CLICK 2 ESPERAR MAXIMO 10 SEGUNDOS
	
	public void click2(By locator, int t, File rutaCarpeta, String Evidencia) throws Exception {
       
		try {
            WebDriverWait wait = new WebDriverWait(driver, t);
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            tiempoEspera(1);
            driver.findElement(locator).click();
            captureScreen2(rutaCarpeta, locator, Evidencia);
            //capture(rutaCarpeta, locator, Evidencia);
            
            //aca
            } catch(Exception e) {
            captureScreenError(rutaCarpeta, locator, Evidencia, e.toString());
            throw new InterruptedException();
            
            //aca
            } 
		
	}
	
	public void click4(By locator, int t) throws Exception {
	       
		try {
			
            WebDriverWait wait = new WebDriverWait(driver, t);
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            tiempoEspera(1);
            driver.findElement(locator).click();
           
            //capture(rutaCarpeta, locator, Evidencia);

            } catch(Exception e) {
          
            throw new InterruptedException();
            
            } 
		
	}
	
	// METODO ENVIAR TEXTO
		public void sendkeyA(String inputText, By locator) throws Exception {
			try {
				driver.findElement(locator).sendKeys(inputText);
				
			} catch (Exception e) {
				
				throw new InterruptedException();
			}

		}


       
	
	
	public void click3(By locator, int t, File rutaCarpeta, String Evidencia,String msnPaso) throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, t);
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            tiempoEspera(1);
            driver.findElement(locator).click();
            captureScreen3(rutaCarpeta, locator, Evidencia, msnPaso);
            //capture(rutaCarpeta, locator, Evidencia);

            } catch(Exception e) {
            captureScreenError(rutaCarpeta, locator, Evidencia, e.toString());
            throw new InterruptedException();
            
            }
       }

	
	public void KeysWrite(String text) 
	{
		Keys.valueOf(text);
		
		
	}
	
	
	
	
	
	
	//captureScreen3

// METODO BORRAR
	public void borrar(By locator, File rutaCarpeta, String Evidencia) throws Exception {
		try {
			driver.findElement(locator).clear();
			tiempoEspera(1000);
			captureScreen2(rutaCarpeta, locator, Evidencia);
		} catch (Exception e) {
			captureScreenError(rutaCarpeta, locator, Evidencia, e.toString());
			throw new InterruptedException();
		}

	}

// METODO ENVIAR TEXTO
	public void sendkey(String inputText, By locator, File rutaCarpeta, String Evidencia) throws Exception {
		try {
			driver.findElement(locator).sendKeys(inputText);
			captureScreen2(rutaCarpeta, locator, Evidencia);
		} catch (Exception e) {
			captureScreenError(rutaCarpeta, locator, Evidencia, e.toString());
			throw new InterruptedException();
		}

	}
	
	// METODO ENVIAR TEXTO 2 MAXIMO 10
	public void sendkey2(String inputText,By locator, int t, File rutaCarpeta, String Evidencia) throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, t);
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            tiempoEspera(1);
            driver.findElement(locator).sendKeys(inputText);
            captureScreen2(rutaCarpeta, locator, Evidencia);
            //capture(rutaCarpeta, locator, Evidencia);

            } catch(Exception e) {
            captureScreenError(rutaCarpeta, locator, Evidencia, e.toString());
            throw new InterruptedException();
            
            }
       }
	
	// METODO ENVIAR TEXTO 2 MAXIMO 10
	public void sendkey3(String inputText,By locator, int t, File rutaCarpeta, String Evidencia,String msn) throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, t);
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            tiempoEspera(1);
            driver.findElement(locator).sendKeys(inputText);
            captureScreen3(rutaCarpeta, locator, Evidencia, msn);
            //capture(rutaCarpeta, locator, Evidencia);

            } catch(Exception e) {
            captureScreenError(rutaCarpeta, locator, Evidencia, e.toString());
            throw new InterruptedException();
            
            }
       }

// METODO ENTER SUBMIN
	public void submit(By locator, File rutaCarpeta, String Evidencia) throws Exception {
		try {
			driver.findElement(locator).submit();
			captureScreen2(rutaCarpeta, locator, Evidencia);
		} catch (Exception e) {
			captureScreenError(rutaCarpeta, locator, Evidencia, e.toString());
			throw new InterruptedException();
		}

	}

// METODO PRINT OUT

	public static void printConsola(String texto) {
		System.out.println(texto);
	}

// METODO CONTROL + A
	public void comando(By locator, File rutaCarpeta, String Evidencia) throws Exception {
		try {
			driver.findElement(locator).sendKeys(Keys.CONTROL, "a");
			captureScreen2(rutaCarpeta, locator, Evidencia);
		} catch (Exception e) {
			captureScreenError(rutaCarpeta, locator, Evidencia, e.toString());
			throw new InterruptedException();
		}

	}
	
	//Metodo de darle escape a la pagina
	public void escape() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
	}
	
	
	
	// METODO CONTROL + A
		public void comando2(By locator, File rutaCarpeta, String Evidencia) throws Exception {
			try {
				driver.findElement(locator).sendKeys(Keys.ESCAPE);
				captureScreen2(rutaCarpeta, locator, Evidencia);
			} catch (Exception e) {
				captureScreenError(rutaCarpeta, locator, Evidencia, e.toString());
				throw new InterruptedException();
			}

		}


// METODO CONTROL + A
	public void bspace(By locator, File rutaCarpeta, String Evidencia) throws Exception {
		try {
			driver.findElement(locator).sendKeys(Keys.BACK_SPACE);
			captureScreen2(rutaCarpeta, locator, Evidencia);
		}

		catch (Exception e) {
			captureScreenError(rutaCarpeta, locator, Evidencia, e.toString());
			throw new InterruptedException();
		}
	}

// METODO ENTER
	public void intro(By locator, File rutaCarpeta, String Evidencia) throws Exception {
		try {
			driver.findElement(locator).sendKeys(Keys.ENTER);
			captureScreen2(rutaCarpeta, locator, Evidencia);
		}

		catch (Exception e) {
			captureScreenError(rutaCarpeta, locator, Evidencia, e.toString());
			throw new InterruptedException();
		}
	}

// TAB 2.0
	@SuppressWarnings("deprecation")
	public void tab() {
		driver.getKeyboard().sendKeys(Keys.TAB);
	}

// METODO TAB
	public void tabulador(By locator, File rutaCarpeta, String Evidencia) throws Exception {
		try {
			driver.findElement(locator).sendKeys(Keys.TAB);
			captureScreen2(rutaCarpeta, locator, Evidencia);
		} catch (Exception e) {
			captureScreenError(rutaCarpeta, locator, Evidencia, e.toString());
			throw new InterruptedException();
		}

	}

// METODO TIEMPO DE ESPERA
	public void tiempoEspera(long tiempo) throws InterruptedException {
		Thread.sleep(tiempo);
	}

	public static String fechaHora() {
// TOMAMOS LA FECHA DEL SISTEMA
		LocalDateTime fechaSistema = LocalDateTime.now();

// DEFINIR FORMATO FECHA
		DateTimeFormatter fecha = DateTimeFormatter.ofPattern("yyyy-MM-dd HHmmss");

// DAR FORMATO A LA FECHA DEL SISTEMA
		String formatFecha = fecha.format(fechaSistema);
		return formatFecha;
	}

	public static String fechaHora2() {
// TOMAMOS LA FECHA DEL SISTEMA
		LocalDateTime fechaSistema = LocalDateTime.now();

// DEFINIR FORMATO FECHA
		DateTimeFormatter fecha = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

// DAR FORMATO A LA FECHA DEL SISTEMA
		String formatFecha = fecha.format(fechaSistema);
		return formatFecha;
	}

	public String HoraSistema() {
// TOMAMOS LA FECHA DEL SISTEMA
		LocalTime horaSistema = LocalTime.now();

// DEFINIR FORMATO FECHA
		DateTimeFormatter fecha = DateTimeFormatter.ofPattern("HHmmss");

// DAR FORMATO A LA FECHA DEL SISTEMA
		String hora = fecha.format(horaSistema);
		return hora;
	}
	
	public static String HoraSistema2() {
		// TOMAMOS LA FECHA DEL SISTEMA
				LocalTime horaSistema = LocalTime.now();

		// DEFINIR FORMATO FECHA
				DateTimeFormatter fecha = DateTimeFormatter.ofPattern("HHmmss");

		// DAR FORMATO A LA FECHA DEL SISTEMA
				String hora = fecha.format(horaSistema);
				return hora;
			}
	
	public void scroll() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", "down");
        js.executeScript("mobile: scroll", scrollObject);
    }

// METODO DE SCROLL BUENO

	public void scrollPage(int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + "," + y + ")", "");
	}

// TOUCH EN LA PANTALLA VERTICAL

	public void scrollVertical(File rutaCarpeta, int xini, int yini, int yfinal, int iteraciones, By locator,
			String Evidencia) throws Exception {

		for (int i = 1; i <= iteraciones; i++) {
			@SuppressWarnings("rawtypes")
			TouchAction touch = new TouchAction(driver);
			touch.press(PointOption.point(xini, yini)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
					.moveTo(PointOption.point(xini, yfinal)).release().perform();
		}
		captureScreen2(rutaCarpeta, locator, Evidencia);
	}
	
	
	public void scrollVertical1(File rutaCarpeta, int xini, int yini, int yfinal, int iteraciones,
			String Evidencia) throws Exception {

		for (int i = 1; i <= iteraciones; i++) {
			@SuppressWarnings("rawtypes")
			TouchAction touch = new TouchAction(driver);
			touch.press(PointOption.point(xini, yini)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
					.moveTo(PointOption.point(xini, yfinal)).release().perform();
		}
		
	}

// TOUCH EN LA PANTALLA HORIZONTAL

	public void scrollHorizontal(File rutaFile, int X, int Y, int XFin, int YFin, int iteraciones) throws Exception {

		for (int i = 1; i <= iteraciones; i++) {
			@SuppressWarnings("rawtypes")
			TouchAction touch = new TouchAction(driver);
			touch.press(PointOption.point(X, Y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
					.moveTo(PointOption.point(XFin, YFin)).release().perform();

		}
		captureScreen(rutaFile);
	}

// TOCAR PANTALLA

	public void tocarPantalla(int a, int b) {
		@SuppressWarnings("rawtypes")
		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(a, b)).release().perform();
	}

	public void captureScreen(File rutaCarpeta) throws Exception {

		String hora = HoraSistema();
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(rutaCarpeta + "\\" + hora + ".png"));

	}
	
	

// CAPTURAS DE PANTALLA
	public void captureScreenError(File rutaCarpeta, By locator, String Evidencia, String msnError) throws Exception {

		if (Evidencia.equals("SI")) {
			String hora = HoraSistema();
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(rutaCarpeta + "\\" + hora + ".png"));
			String rutaImagen = new File(rutaCarpeta + "\\" + hora + ".png").toString();

// INSTANCIAMOS LA CLASE GENERAR PDF
			GenerarReportePdf informePdf = new GenerarReportePdf();

// SE PROCEDE A INSERTAR LOCALIZADOR E IMAGEN EN EL PDF
			informePdf.crearbodyError(locator, rutaImagen, msnError);

// ELIMINAR IMAGEN CREADA
			eliminarArchivo(rutaImagen);
		}else 
		{
			
			System.out.println("Captura no tomada");
			
		}

	}

// CAPTURAS DE PANTALLA2
	public void captureScreen2(File rutaCarpeta, By locator, String Evidencia) throws Exception {

		if (Evidencia.equals("SI")) {
			String hora = HoraSistema();
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(rutaCarpeta + "\\" + hora + ".png"));
			String rutaImagen = new File(rutaCarpeta + "\\" + hora + ".png").toString();

// INSTANCIAMOS LA CLASE GENERAR PDF
			GenerarReportePdf informePdf = new GenerarReportePdf();

// SE PROCEDE A INSERTAR LOCALIZADOR E IMAGEN EN EL PDF
			informePdf.crearbody(locator, rutaImagen);

// ELIMINAR IMAGEN CREADA
			eliminarArchivo(rutaImagen);
		}

	}
	
	
	// CAPTURAS DE PANTALLA2
		public void captureScreen3(File rutaCarpeta, By locator, String Evidencia,String msnExito) throws Exception {

			if (Evidencia.equals("SI")) {
				
				String hora = HoraSistema();
				File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile, new File(rutaCarpeta + "\\" + hora + ".png"));
				String rutaImagen = new File(rutaCarpeta + "\\" + hora + ".png").toString();

	// INSTANCIAMOS LA CLASE GENERAR PDF
				GenerarReportePdf informePdf = new GenerarReportePdf();

	// SE PROCEDE A INSERTAR LOCALIZADOR E IMAGEN EN EL PDF
				informePdf.crearbodyExito(locator, rutaImagen, msnExito);

	// ELIMINAR IMAGEN CREADA
				eliminarArchivo(rutaImagen);
			}

		}

	
		// METODO DE SCROLL HACIA ABAJO
		public void scrollDown() throws Exception {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)");
			tiempoEspera(2000);
		}
	
		
		//Desplazamiento vertical por coordenada
		public void desplazarseVertical(int x, int y) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(" + x + "," + y + ")");
			};

	
	
	

	public void iniVideo() {

		((CanRecordScreen) driver).startRecordingScreen(new AndroidStartScreenRecordingOptions()
				.withVideoSize("1280x720").withTimeLimit(Duration.ofSeconds(200)));

	}
	

	
	
	//Metodo de cerrar video 
	public void finVideo(File rutaCarpeta) throws IOException {
		String hora = HoraSistema();
		String video = ((CanRecordScreen) driver).stopRecordingScreen();
		byte[] decode = Base64.getDecoder().decode(video);
		FileUtils.writeByteArrayToFile(new File(rutaCarpeta + "\\" + hora + ".mp4"), decode);
	}

//ELIMAR ARCHIVOS
	public void eliminarArchivo(String rutaImagen) {
		File fichero = new File(rutaImagen);
		fichero.delete();
	}

	public File crearCarpeta(String nomTest,String Evidencia) 
	{
		if(Evidencia.equals("SI")) 
		{
// ALMACENAMOS LA FECHA DEL SISTEMA
		String fecha = fechaHora();

// CREAMOS EL NOMBRE DE LA CARPETA
		String nomCarpeta = nomTest + "-" + fecha;

// OBTENEMOS LA RUTA DE ALOJAMIENTO DE SALIDA Y EL NOMBRE DE TEST A EJECUTAR
		File directorio = new File("./output/" + nomCarpeta);

// CREAMOS LA CARPETA
		directorio.mkdir();
		return directorio; 
		} 
		else 
		{
			
			printConsola("Carpeta no generada");
			
		}
		return null;
	} 
	
	
	// METODO PARA CREAR CARPETA PARA CAPTURA
		public static File createFolder(String nameFolder, String path, String evidence) {
			if(evidence.equals("SI")) {
				String fecha = fechaHora();
				String hora = HoraSistema2();
				String nomCarpeta = nameFolder + " " + fecha + " " + hora;
				File directorio = new File(path + nomCarpeta);
				directorio.mkdir();
				return directorio;	
			} else {
				print("No se creara creara el Folder para evidencia");
			}
			return null;
		}

	
	
	
	private static void print(String string) {
			// TODO Auto-generated method stub
			
		}

		//Se valida varios objetos que sea existente al convertirlo en un valor booleano de true o false
		public void ValidacionObjeto(boolean valor1, String caso, File rutaCarpeta,String Evidencia ,By locator) throws Exception 
		
		{
			
		//##Ver el metodo validar objeto, se validan varios objetos pero se usa la misma mecanica de validar objeto
			
			if(valor1 == true)
				
			{
				captureScreen3(rutaCarpeta, locator , Evidencia,"elemento identificado exitosamente" );			
			}
			else 
			{
				captureScreenError(rutaCarpeta, locator, Evidencia, "No se ha logrado identificar el elemento");
						
			}
		}
		

		
		//Metodo para validar que un elemento es visible, el visibility es traido por el sistema, retorna un verdadero o falso si el elemento esta presente
		public boolean validarElemento(By elementLocation, int time) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, time);
				wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
				return true ;
			} catch (Exception ex) {
				return false;
			}
		}
		
		//Se valida un objeto que sea existente al convertirlo en un valor booleano de true o false 
		
		/**
		 * Validacion objeto.
		 *
		 * @param valor1 the valor 1
		 * @param caso the caso
		 * @param folderPath the folder path
		 * @param Evidencia the evidencia
		 * @throws IOException Signals that an I/O exception has occurred.
		 * @throws DocumentException the document exception
		 */
		
		// METODO PARA ELIMINAR ARCHIVO
		public void deleteFile(String rutaImagen) {
			File fichero = new File(rutaImagen);
			fichero.delete();
		}
		
		

	    public  byte[] screenshot(File rutaCarpeta, String accion,By locator) throws IOException, DocumentException {

	        String hora = HoraSistema();

	        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	        //String rutaImagen = rutaCarpeta + "\\" + hora + "_"+funcion+".png";

	        String rutaImagen = rutaCarpeta + "\\" + hora + ".png";

	        FileUtils.copyFile(scrFile, new File(rutaImagen));

	        GenerarReportePdf generarReportePdf = new GenerarReportePdf();
			generarReportePdf.crearbody(locator, rutaImagen);

	        deleteFile(rutaImagen);



	        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

	    }
	
		
		//Metodo para seleccionar de forma random elementos de una lista
		public void listRandom(By elementLocation) throws DocumentException {
			WebElement Drplistdown = driver.findElement(elementLocation);
			Select objSel = new Select(Drplistdown);
			List<WebElement> weblist = objSel.getOptions();
			int iCnt = weblist.size();
			Random num = new Random();
			int iSelect = num.nextInt(iCnt);
			objSel.selectByIndex(iSelect);
			printConsola(Drplistdown.getAttribute("value"));
	}
	
		
		
		
		
		
		

// METODO INICIAL
	public void urlAcceso(String url)

	{
		driver.get(url);
	}

}





