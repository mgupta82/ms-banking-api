package com.hcl.auth;

import java.security.Principal;

import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableResourceServer
public class UserController {
	
	@RequestMapping("/user")
	public Principal principal(Principal p) {
		return p;
	}

}
