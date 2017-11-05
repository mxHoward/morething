package com.morething.demo.controller;

import com.morething.demo.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/consumer")
public class ConsumerController {

	@Autowired
	private ConsumerService consumerService;

}
