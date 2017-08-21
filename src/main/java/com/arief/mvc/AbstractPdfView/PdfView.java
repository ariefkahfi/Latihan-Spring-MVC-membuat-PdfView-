package com.arief.mvc.AbstractPdfView;

import com.arief.mvc.domain.Person;
import com.lowagie.text.Cell;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfCell;
import com.lowagie.text.pdf.PdfTable;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import java.util.List;
import java.util.Map;

/**
 * Created by Arief on 8/21/2017.
 */



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PdfView extends AbstractPdfView {


    protected void buildPdfDocument(Map<String, Object> map, com.lowagie.text.Document document,
                                    com.lowagie.text.pdf.PdfWriter pdfWriter,
                                    HttpServletRequest httpServletRequest,
                                    HttpServletResponse httpServletResponse) throws Exception {

        List<Person> list = (List<Person>)map.get("person");

        document.add(new Paragraph("Tes Pdf File Spring MVC"));


        Table tabel = new Table(2);

        tabel.addCell(new Cell("ID PERSON"));
        tabel.addCell(new Cell("NAMA PERSON"));


        for(Person p : list){
            tabel.addCell(new Cell(String.valueOf(p.getId())));
            tabel.addCell(new Cell(p.getNama()));
        }

        document.add(tabel);


    }
}
