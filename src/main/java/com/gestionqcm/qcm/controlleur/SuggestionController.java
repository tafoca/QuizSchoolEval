package com.gestionqcm.qcm.controlleur;

import java.text.DateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gestionqcm.qcm.entities.Etudiant;
import com.gestionqcm.qcm.entities.Suggestion;
import com.gestionqcm.qcm.metier.IqcmMetier;
import com.gestionqcm.qcm.model.SuggestionForm;


@Controller
public class SuggestionController {
	@Autowired
	private IqcmMetier metier;
	
	@RequestMapping(value = "/suggererEtudiant",method= RequestMethod.POST)
	public String enregistrerSuggererEtudiant(@Valid SuggestionForm sudF,Model model,BindingResult br)
	{
		if(br.hasErrors())
		{	
			sudF.setReponse("Echec"+"Verifier vos Informations");
			model.addAttribute("suggestionForm", sudF);
		
			return "espaceSuggestion";
			
		}
		Suggestion sug =new Suggestion();
		String page="espaceSuggestion";
		if(!"".equalsIgnoreCase(sudF.getMatricule()))
		{
		Etudiant et=metier.consulterEtudiant(sudF.getMatricule());
		
		if(et != null)
		{
		
			sug.setDatesuggestion(new Date());
			sug.setMatricule(et);
			sudF.setReponse("Echec de l'envoie .... remplissez tous les champs SVP");
			if("''".equalsIgnoreCase(sudF.getTextSuggestion()))
			{
			sug.setObjet(sudF.getTextSuggestion());
			//et.getSuggestionList().add(sug);
			metier.addSuggestion(sug, sudF.getMatricule());
			
			sudF.setReponse("Suggestion Envoyer avec succes");
			sudF.setMatricule(null);
			sudF.setTextSuggestion(null);
			}
			model.addAttribute("suggestionForm", sudF);
			
		}
		}
		
		return page;
		
	}

	@RequestMapping(value = "/espaceSuggestion")
	public String SuggererEtudiant(@Valid SuggestionForm sudF,Model model,BindingResult br)
	{
	
		//Suggestion sug =new Suggestion();
		String page="espaceSuggestion";
			
			
			sudF.setMatricule(null);
			sudF.setTextSuggestion("Rien a signaler");
			model.addAttribute("suggestionForm", sudF);
			
	
		return page;
		
	}
	
}
