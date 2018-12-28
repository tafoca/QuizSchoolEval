package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gestionqcm.qcm.entities.Etudiant;
import com.gestionqcm.qcm.metier.IqcmMetier;

public class test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
		IqcmMetier metier = (IqcmMetier) context.getBean("metier");

		Etudiant etu = new Etudiant("11sci0217", "Difo Mekontchou",
				"danydifo@yahoo.fr", "dio");

		metier.addEtudiantToFiliere(etu, "IN4");

	}

}
