package com.Utilidades;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.TargetDataLine;
import javax.swing.JOptionPane;

public class GrabarAudio 
{
	
	
	
	
	public static void GrabaAudio(String[] args) 
	{
		
		try 
		{
			AudioFormat audioFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED,44100,16,2,4,44100,false);
			
			DataLine.Info dataInfo = new DataLine.Info(TargetDataLine.class,audioFormat);
			if(!AudioSystem.isLineSupported(dataInfo)) 
			{
				System.out.println("Not Supported");
				
			}
			
			
			final TargetDataLine targetLine = (TargetDataLine)AudioSystem.getLine(dataInfo);
			targetLine.open();
			
			JOptionPane.showMessageDialog(null, "Hit ok to start recording");
			targetLine.start();
			
		
		
		Thread audioRecorderThread = new Thread() 
		{
			@Override public void run() 
			{
				AudioInputStream recordingStream = new AudioInputStream(targetLine);
				File outputFile = new File("record.wav");
				try 
				{
					
				AudioSystem.write(recordingStream, AudioFileFormat.Type.WAVE, outputFile);
					
				
					
				} 
				catch (IOException ex) 
				{
					System.out.println(ex);
					
				
					// TODO: handle exception
				}
				
				System.out.println("Stopped recording");
			}
			
		
			
		};
		audioRecorderThread.start();
		JOptionPane.showMessageDialog(null, "Hit ok to stopp recording");
		targetLine.stop();
		targetLine.close();	
		
	} 
	
	catch(Exception f)
	{
		System.out.println(f);
	
	}

	
} 
	

}
			
				
				
				
			
			

	
	



