package com.example.messagingstompwebsocket.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.messagingstompwebsocket.service.SocketService;

@RestController
public class ServiceController {

	@Autowired
    private  SocketService greetingService;
	@GetMapping("/rest")
	public void greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		greetingService.sendMessages(name);
	}
}
