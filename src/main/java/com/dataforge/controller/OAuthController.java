package com.dataforge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OAuthController {

	     @GetMapping("/")
	     public String oauthTestingmethod() {
	    	 
	    	 return "welcome to oauth applciation to develoip";
	     }
}
