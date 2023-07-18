package test.controllers;

import java.sql.Date;
import java.util.List;

import javax.naming.Context;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import test.beans.Entity;

@Controller
public class Homecontroller {

	@Autowired
	ServletContext context;
	/* @RequestMapping(value = "/pqr" , method = RequestMethod.POST) */
	@RequestMapping("/display")
	public String data(HttpServletRequest req, HttpServletResponse res,Model m)
	{
		
      String name  = "view";
      m.addAttribute("page", name);
      List<Entity> list = (List<Entity>)context.getAttribute("list");
      m.addAttribute("Notes", list);
       return"display";
	}
	
	@RequestMapping("/add")
	public String Addnote(Model m)
	{
		Entity e1 = new Entity();
		m.addAttribute("page", "add");
		m.addAttribute("Entity", e1);
		return "display";
	}
	
	@RequestMapping(value = "/save" , method = RequestMethod.POST)
	public String save(@ModelAttribute("Entity") Entity e1, Model m)
	{
		System.out.println(e1);
		e1.setDate(null);
		
	   List<Entity>list = (List<Entity>)context.getAttribute("list");
	   list.add(e1);
	   m.addAttribute("msg", "Successfully added");
		return "display";
	}
}
