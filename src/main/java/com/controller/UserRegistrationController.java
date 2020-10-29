package com.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dto.UserRegistrationDto;
import com.model.User;
import com.service.UserService;
   
@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute("user")
	public UserRegistrationDto userRegistrationDto() {
		return new UserRegistrationDto();
	}
	
	@GetMapping
	public String showRegistrationForm(Model model) {
		return "registration";
	}
	
	/* @ModelAttribute can bu used as a method parameter or
	 * at the method level, it indicates the purpose of that method is to add
	 * one or more model attributes
	 * 
	 */
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") @Valid UserRegistrationDto userDto,
			BindingResult result) {
		
		User existing = userService.findByEmail(userDto.getEmail());
		if(existing != null) {
			result.rejectValue("email", null, "There is already an account registered with that email");
		}
		
		if(result.hasErrors()) {
			return "registration";
		}
		
		userService.save(userDto);
		return "redirect:/registration?sucess";
	}
}
