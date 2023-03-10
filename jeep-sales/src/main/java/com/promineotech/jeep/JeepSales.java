package com.promineotech.jeep;

import java.util.LinkedList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.HttpClientErrorException.NotFound;

import com.promineotech.ComponentScanMarker;

@SpringBootApplication(scanBasePackageClasses = {ComponentScanMarker.class })
public class JeepSales {

	public static void main(String[] args) {
		// 
		SpringApplication.run(JeepSales.class, args);

		
	} // close main

} // close JeepSales
