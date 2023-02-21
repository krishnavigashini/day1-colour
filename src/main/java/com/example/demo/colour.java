package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class colour {
	String str1="Black";
	@GetMapping("/game")
	public String getMyFav()
	{
		return "My favourite color is "+str1;
	}

}