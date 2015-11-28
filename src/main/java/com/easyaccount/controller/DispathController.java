package com.easyaccount.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/easyaccount")
public class DispathController {

	@RequestMapping(value="/main",method=RequestMethod.GET)
	public String main(Model model){
		return "easyaccount/main";
	}

}
