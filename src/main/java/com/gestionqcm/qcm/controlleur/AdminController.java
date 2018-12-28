package com.gestionqcm.qcm.controlleur;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestionqcm.qcm.entities.Enseignant;
import com.gestionqcm.qcm.entities.Etudiant;
import com.gestionqcm.qcm.metier.IqcmMetier;
import com.gestionqcm.qcm.model.ProfilEnseignant;
import com.gestionqcm.qcm.model.ProfilEtudiant;

@Controller
public class AdminController {
	@Autowired
private IqcmMetier metier;

	
	// Ajout d'un Etudiant parl'administrateur
	@RequestMapping(value="/ajoutEtudiantE")
public	String ajoutEtudiant(ProfilEtudiant pro,Model model)
{
	Etudiant etu=new Etudiant();
	
	
	//etu.setCodefiliere(pro.getFiliere());
	etu.setNometudiant(pro.getNom());
	etu.setPrenometudiant(pro.getPrenom());
	etu.setMatricule(pro.getMatricule());
	etu.setMotpasse(pro.getMotpasse());
	etu.setEmail(pro.getEmail());
	etu.setNationalite(pro.getNationalite());
	etu.setRegion(pro.getRegion());
	etu.setDepartement(pro.getDepartement());
	etu.setSexe(pro.getSexe());
	etu.setStatut(pro.getStatut());
	etu.setProfession(pro.getProfession());
	String fil=pro.getFiliere();
	
	if(!"".equalsIgnoreCase(pro.getDatenaissance()))
	{
	String date=pro.getDatenaissance();
	
	
	String an=date.substring(0, 3);
	String moi=date.substring(5, 6);
	String jour=date.substring(8, 9);
	int a=Integer.parseInt(an);
	int m=Integer.parseInt(moi);
	int j=Integer.parseInt(jour);
	a-=100;
	m+=10;
	j+=11;
	@SuppressWarnings("deprecation")
	Date dateF=new Date(a, m, j);
	etu.setDatenaissance(dateF);
	}
	
	Etudiant e = metier.addEtudiantToFiliere(etu,fil);
	if(e.equals(null))
	{
	pro.setReponse("Echec d'enregistrement");
		
	}
	else
	{
		pro.setFiliere(etu.getCodefiliere().getCodefiliere());
		pro.setReponse("Enregistrement reussit");
		model.addAttribute("ajoutEtudiant", pro);
		
	}
	return "espaceAdministrateur";

}
	
	// Ajout d'un enseignant parl'administrateur
	
	@RequestMapping(value="/ajoutEnseignantE")
	public	String ajoutEnseignant(ProfilEnseignant pro,ProfilEtudiant p,Model model)
	{
		Enseignant etu=new Enseignant();
		
		
		//etu.setCodefiliere(pro.getFiliere());
		etu.setNomenseignant(pro.getNomE());
		etu.setPrenomenseignant(pro.getPrenomE());
		etu.setCodeenseignant(pro.getCodeE());
		etu.setMotpasse(pro.getMotpasseE());
		etu.setEmail(pro.getEmailE());
		etu.setNationalite(pro.getNationalite());
		etu.setRegion(pro.getRegion());
		etu.setDepartement(pro.getDepartement());
		etu.setSexe(pro.getSexe());
		etu.setStatut(pro.getStatut());
		etu.setProfession(pro.getProfession());
		etu.setRole(pro.getRole());
		
		//pro.setAdminName(p.getAdminName());
		
		if(!"".equalsIgnoreCase(pro.getDatenaissance()))
		{
		String date=pro.getDatenaissance();
		String an=date.substring(0, 3);
		String moi=date.substring(5, 6);
		String jour=date.substring(8, 9);
		int a=Integer.parseInt(an);
		int m=Integer.parseInt(moi);
		int j=Integer.parseInt(jour);
		a-=100;
		m+=10;
		j+=11;
		@SuppressWarnings("deprecation")
		Date dateF=new Date(a, m, j);
		etu.setDatenaissance(dateF);
		}
		Enseignant e = metier.addEnseignant(etu);
		if(e.equals(null))
		{
		pro.setReponse("Echec d'enregistrement");
			
		}
		else
		{
			pro.setReponse("Enregistrement reussit");
			model.addAttribute("ajoutEnseignant", pro);
			
		}
		return "ajoutEnseignant";

	}
	
	@RequestMapping(value="/ajoutE")
	public String ajoutE(ProfilEnseignant pro, Model model)
	{
		
		model.addAttribute("ajoutEnseignant", pro);
		return "ajoutEnseignant";
		
	}
	
	@RequestMapping(value="/ajoutEt")
	public String ajoutEt(ProfilEtudiant pro, Model model)
	{
		//model.addAttribute("profilConnecteur", pro);
		model.addAttribute("ajoutEtudiant", pro);
		return "espaceAdministrateur";
		
	}
				

}
