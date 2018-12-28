package com.gestionqcm.qcm.controlleur;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.gestionqcm.qcm.model.ConnectionForm;
import com.gestionqcm.qcm.session.SessionBean;

@Controller
public class DeconnecteurController {
	
	@Autowired
	private SessionBean sessionBean;
	
	@RequestMapping(value = "/deconnecterEtudiant")
	public String deconnecter(HttpSession sessiomhttp,Model model)
	{
		ConnectionForm con =new ConnectionForm();
		model.addAttribute("connectionForm",con);

		sessiomhttp.invalidate();
		return "index";
		
	}

}
