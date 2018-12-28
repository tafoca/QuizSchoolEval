package com.gestionqcm.qcm.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestionqcm.qcm.entities.Filiere;
import com.gestionqcm.qcm.metier.IqcmMetier;
import com.gestionqcm.qcm.model.FiliereForm;


@Controller
public class FiliereController {
	@Autowired
	private IqcmMetier metier;
	
	@RequestMapping(value="annuaireFiliere")
	public String listeFiliere(FiliereForm ff,Model model)
	{
		String page="annuaireFiliere";
		List<Filiere> listeF=metier.consulterFiliere();
		ff.setListF(listeF);
		model.addAttribute("filiereForm", ff);
		
		return page;
}

	
}