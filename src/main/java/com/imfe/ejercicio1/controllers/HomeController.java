package com.imfe.ejercicio1.controllers;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

		@RequestMapping(value="/")
		public String index() {
			return "index";
		}
		
		@RequestMapping(value="/pagina1")
		public String pagina1() {
			return "pagina1";
		}
		
		@RequestMapping(value="/pagina2")
		public String pagina2() {
			return "pagina2";
		}
		
		@RequestMapping(value="/pagina3")
		public String pagina3() {
			return "pagina3";
		}
		
		@RequestMapping(value="/pagina4")
		public String pagina4() {
			return "pagina4";
		}
		
		@RequestMapping(value="/aleatorio")
		public String aleatorio() {
			Random aleatorio = new Random();
			int aleat=aleatorio.nextInt(4)+1;
			
			
			return "pagina" +aleat;
		}
		
}
