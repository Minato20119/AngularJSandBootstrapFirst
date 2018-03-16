/**
 * 
 */
package com.minato.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Minato
 *
 */
@Controller
public class AppController {

	@RequestMapping("/")
	String home(ModelMap modal) {
		modal.addAttribute("title", "AngularJS vs Bootstrap");
		return "index";
	}

	 @RequestMapping("/partials/{page}")
	 String partialHandler(@PathVariable("page") final String page) {
	 return page;
	 }

}
