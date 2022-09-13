package com.example.springboot;

import java.util.*;

import org.springframework.boot.jackson.JsonObjectSerializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Hello from Spring Boot!";
	}

	@GetMapping("/about")
	public Map<String, String> about() {
		HashMap<String, String> map = new HashMap<>();
		map.put("key", "value");
		map.put("foo", "bar");
		map.put("aa", "bb");

		// Map<String, String>[] returnVal = []
		// returnVal.add(map)
		return map;
	}

}
