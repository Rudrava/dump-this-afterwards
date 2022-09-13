package com.example.springboot;

import java.util.*;

import org.json.JSONObject;
import org.springframework.boot.jackson.JsonObjectSerializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Hello from Spring Boot!";
	}

	@GetMapping("/json")
	public JSONObject json() {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("name", "Tom");
		jsonObj.put("birthday", "1940-02-10");
		jsonObj.put("age", 76);
		return jsonObj;
	}

}
