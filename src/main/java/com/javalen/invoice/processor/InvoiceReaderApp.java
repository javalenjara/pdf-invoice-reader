package com.javalen.invoice.processor;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class InvoiceReaderApp {

    public static void main(String[] args) throws IOException {
        String path = "C:\\javalen\\docs\\personal\\documentos\\facturasEPM\\2021\\901\\202105_May.pdf";
        try (PDDocument invoicePDF = Loader.loadPDF(new File(path))){
            if (!invoicePDF.isEncrypted()){
                PDFTextStripper textStripper = new PDFTextStripper();
                String pdfInText = textStripper.getText(invoicePDF);
                System.out.println(pdfInText.trim());
            }
        }



    }
}
