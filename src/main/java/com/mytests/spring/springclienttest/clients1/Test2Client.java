package com.mytests.spring.springclienttest.clients1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange(url = "/{pv1}/{pv2}", accept = "application/json")
public interface Test2Client {

	@GetExchange
	String test2(@PathVariable String pv1, @PathVariable String pv2);

	/*@PostExchange(url = "/aaa", contentType = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	void postTest2(@PathVariable String pv1, @PathVariable String pv2,
					 @RequestParam String rpv1, @RequestParam String rpv2);*/

}