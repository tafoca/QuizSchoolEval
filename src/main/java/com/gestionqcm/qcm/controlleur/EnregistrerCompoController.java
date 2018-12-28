package com.gestionqcm.qcm.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestionqcm.qcm.entities.Choix;
import com.gestionqcm.qcm.entities.Questions;
import com.gestionqcm.qcm.metier.IqcmMetier;
import com.gestionqcm.qcm.model.QuestionForm;

@Controller
public class EnregistrerCompoController {
	@Autowired
	private IqcmMetier metier;


	
}
