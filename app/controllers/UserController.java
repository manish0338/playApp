package controllers;

import com.fasterxml.jackson.databind.JsonNode;

import model.User;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

public class UserController extends Controller{

	@Transactional
	public  Result login(){
		try{
		JsonNode node = request().body().asJson();
		User u = new User();
		
		String username = node.get("username").textValue();
		String password = node.get("password").textValue();
		
		u.setUsername(username);
		u.setPassword(password);
		
		JPA.em().persist(u);

		}catch(Exception e){
			e.printStackTrace();
		}
		return ok();
	}
}
