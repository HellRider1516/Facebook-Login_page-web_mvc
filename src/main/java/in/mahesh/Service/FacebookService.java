package in.mahesh.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mahesh.Repo.FacebookRepo;
import in.mahesh.entity.Facebook;

@Service
public class FacebookService {
	@Autowired
	private FacebookRepo fr;
	
	public boolean saveFacebookDetails(Facebook facebook) {
		Facebook savedDetails = fr.save(facebook);
		if(savedDetails.getfId()!=null) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	public List<Facebook> getFacebookDetails(){
		return fr.findAll();
	}
	
	
	public String deleteFacebookDetails(Integer fId) {
		fr.deleteById(fId);
		return "Deleted Sucessfully";
	}
	
	
	
	
	
	
	
	public boolean editById(Facebook facebook){
		Facebook edit = fr.save(facebook);
		if(edit.getfId()!=null) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
