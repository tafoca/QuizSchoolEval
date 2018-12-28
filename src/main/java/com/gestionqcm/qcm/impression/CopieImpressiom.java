package com.gestionqcm.qcm.impression;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;


public class CopieImpressiom {
	
	
	   public CopieImpressiom() {
		
	       // boolean b = generationRecu(matricule, nom, prenom, classe);
	    }

	
	
	  public static PdfPCell getCellParagraph(Paragraph p, int x) {
	        PdfPCell cell = new PdfPCell(p);
	        cell.setPaddingTop(5);
	        cell.setBorder(PdfPCell.NO_BORDER);
	        cell.setColspan(x);

	        return cell;
	    }

	    public boolean generationRecu(String matricule, String nom, String prenom, String classe) {

	        boolean result = false;

	        try {

	            // taille de la page
	            Rectangle pageSize = new Rectangle(PageSize.A6.rotate());

	            // changement de la couleur de fond de la page
	            pageSize.setBackgroundColor(new BaseColor(208, 222, 238));

	            // font d'ecriture
	            Font font_roman_15_blue = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, new BaseColor(0, 0, 255));
	            Font font_courier_15_black = new Font(Font.FontFamily.COURIER, 12, Font.BOLD, BaseColor.BLACK);

	            // creation du document
	            Document document = new Document(pageSize);
	            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("/home/ivankaptue/Bureau/doc/recu_"+matricule+".pdf"));

	            // ouverture du document
	            document.open();

	            //gestion de l'entete
	            Paragraph header = new Paragraph("LYCEE BILINGUE DE DSCHANG", font_roman_15_blue);
	            header.setAlignment(Element.ALIGN_CENTER);

	            Paragraph dash = new Paragraph("------------------------------------------------", font_roman_15_blue);
	            dash.setAlignment(Element.ALIGN_CENTER);

	            document.add(dash);
	            document.add(header);
	            document.add(dash);

	            //gestion du contenu
	            PdfPTable table = new PdfPTable(2);
	            table.setWidthPercentage(90);

	            table.addCell(getCellParagraph(new Paragraph("Matricule     : ", font_courier_15_black), 1));
	            table.addCell(getCellParagraph(new Paragraph(matricule, font_roman_15_blue), 1));

	            table.addCell(getCellParagraph(new Paragraph("Nom et Prenom : ", font_courier_15_black), 1));
	            table.addCell(getCellParagraph(new Paragraph(nom + " " + prenom, font_roman_15_blue), 1));

	            table.addCell(getCellParagraph(new Paragraph("Classe        : ", font_courier_15_black), 1));
	            table.addCell(getCellParagraph(new Paragraph(classe, font_roman_15_blue), 1));

	            table.addCell(getCellParagraph(new Paragraph("Fait a        : ", font_courier_15_black), 1));
	            table.addCell(getCellParagraph(new Paragraph("Dschang", font_roman_15_blue), 1));

	            table.addCell(getCellParagraph(new Paragraph("Le            : ", font_courier_15_black), 1));
	            table.addCell(getCellParagraph(new Paragraph(new Date().toString(), font_roman_15_blue), 1));

	            document.add(table);

	            //gestion du footer        
	            Paragraph p = new Paragraph("fait par Mr : kaptue ivan ", font_courier_15_black);
	            Paragraph p1 = new Paragraph("Intendant au lycee bilingue de dschang.", font_courier_15_black);

	            p.setAlignment(Element.ALIGN_CENTER);
	            p1.setAlignment(Element.ALIGN_CENTER);

	            document.add(new Paragraph("   "));
	            document.add(p);
	            document.add(p1);

	            document.close();
	            System.out.println("reussie");
	            result = true;
	        } catch (DocumentException e) {
	            e.printStackTrace();
	        } catch (FileNotFoundException e1) {
	            e1.printStackTrace();
	        }

	        return result;
	    }


	
	
}
