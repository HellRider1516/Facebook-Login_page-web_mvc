package in.mahesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.mahesh.Service.FacebookService;
import in.mahesh.entity.Facebook;

@Controller
public class FacebookController {
	@Autowired
	private FacebookService fs;
	
	@GetMapping("/facebook")
	public ModelAndView loadFacebookDetails() {
		ModelAndView mav =new ModelAndView();
		mav.addObject("fb", new Facebook());
		mav.setViewName("index");
		return mav;
	}
	
	@PostMapping("/facebook")
	public ModelAndView handleFacebookDetails(Facebook facebook) {
		boolean status = fs.saveFacebookDetails(facebook);
		ModelAndView mav =new ModelAndView();
		if(status) {
			mav.addObject("added", "Account Created");
		}else {
			mav.addObject("notadded", "Account not Created and retry again");
		}
		mav.setViewName("index");
		mav.addObject("fb", new Facebook());
		
		
		return mav;
	}
	
	@GetMapping("/show")
	public ModelAndView getAllFacebookLoginDetails() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("fbobj", fs.getFacebookDetails());
		mav.setViewName("index1");
		mav.addObject("fb", new Facebook());
		return mav;
	}
	
	@GetMapping("/delete/{fId}")
	public ModelAndView deleteTheData(@PathVariable(name = "fId") Integer fId) {
		 fs.deleteFacebookDetails(fId);
		 ModelAndView mav= new ModelAndView();
		 mav.addObject("delete", "deleted");
		 mav.setViewName("index1");
		 
		 return mav;
		
	}
	
	
	
	@GetMapping("/edit")
	public ModelAndView editFacebookDetails() {
		ModelAndView mav =new ModelAndView();
		mav.addObject("editDetails", new Facebook());
		mav.setViewName("index2");
		return mav;
	}
	
	
	@PostMapping("/edit")
	public ModelAndView editAlldetails(Facebook facebook) {
		boolean editById = fs.editById(facebook);
		ModelAndView mav=new ModelAndView();
		if(editById) {
			mav.addObject("sucess", "you  details has been Edited");
		}else {
			mav.addObject("error", "you  details has been not Edited");
		}
		mav.setViewName("index2");
		mav.addObject("editDetails", new Facebook());
		return mav;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	

}
