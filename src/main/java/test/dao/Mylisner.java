package test.dao;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import test.beans.Entity;

public class Mylisner implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("Context creted");
		List<Entity> list =new  ArrayList<Entity>();
		ServletContext context = sce.getServletContext();
		context.setAttribute("list", list);
	}

	
}
