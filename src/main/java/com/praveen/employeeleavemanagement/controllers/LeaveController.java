/**
 * 
 */
package com.praveen.employeeleavemanagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.praveen.employeeleavemanagement.domains.Leave;
import com.praveen.employeeleavemanagement.services.LeaveService;


/**
 * @author Madan
 *
 */

@Controller
@RequestMapping("/leaves")
public class LeaveController {

	@Autowired
	private LeaveService service;
	
	@GetMapping({ "/", "" })
	private String index(Model model) {
		List<Leave> leaves=service.findAll();
		model.addAttribute("leaves", leaves);
		return "leaves/index";
	}
	
	@GetMapping("/create")
	private String create(Model model) {
		model.addAttribute("leave", new Leave());
		return "leaves/add";
		
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute Leave leave) {
		leave=service.save(leave);
		return "redirect:/leaves";
		
	}
}
