package com.vicky.mvcannotation.config;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vicky.mvcannotation.models.Demomodels;

@Controller
public class Democontroller {
	
	@Autowired
	Demomodels demo;
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	@RequestMapping("/create")
	public ModelAndView createmodel()
	{
		demo=new Demomodels(101,"vicky","Santacruz","vicky123@gmail.com");
		ModelAndView mv=new ModelAndView(); 
		//mv.addObject("ObjModel", demo);
		// requesting view named as create.jsp
		mv.setViewName("create");
	return	mv;
	}
	@RequestMapping("/view")
	public ModelAndView viewmodel()
	{
		System.out.println(demo);
		//following line would redirect the view
			// to url pattern "/" i.e. index
			// return "redirect:/";
		ModelAndView mv=new ModelAndView();
		// passing object of the class as an attribute
		// to view named as create.jsp
		mv.addObject("Objmodel",demo);
		mv.setViewName("view");
		return mv;
		
	}
	@RequestMapping("/edit")
	public ModelAndView editmodel()
	{
		/*
		 * ModelAndView mv=new ModelAndView(); mv.addObject("ObjModel",demo);
		 * mv.setViewName("edit"); return mv;
		 */
		return new ModelAndView("edit","command",demo);
	}
	/*
	 * @RequestMapping(path="/edit",method=RequestMethod.POST) public ModelAndView
	 * editmodel1(@RequestParam("newuserid")int newUserId,
	 * 
	 * @RequestParam("newusername")String newUserName,
	 * 
	 * @RequestParam("newuseraddr")String newUseraddr,
	 * 
	 * @RequestParam("newusermail")String newUsermail) { demo.setId(newUserId);
	 * demo.setName(newUserName); demo.setAddr(newUseraddr);
	 * demo.setEmail(newUsermail); ModelAndView mv=new ModelAndView();
	 * mv.addObject("ObjModel",demo); mv.setViewName("/view"); return mv; }
	 }*/
	@RequestMapping(path="/edit",method=RequestMethod.POST)
	public ModelAndView editModel(@Valid @ModelAttribute Demomodels demomodel,BindingResult result)
	{
		
		ModelAndView mv =new ModelAndView();
		if(!result.hasErrors())
		{
		mv.setViewName("view");
		mv.addObject("Objmodel",demomodel);
		}
		return mv;
		
	}
}
