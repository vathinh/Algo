package com.tvt.code.extract;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import java.io.File;
import java.io.IOException;

public class ExtractPdf {
    public static void main(String[] args) {
        int targetPageNumber = 24; // Change this to the desired page number

        try {
            // Load the PDF document
            PDDocument document = PDDocument.load(new File("path.pdf"));

            // Get the page count
            int pageCount = document.getNumberOfPages();

            // Check if the target page number is valid
            if (targetPageNumber >= 1 && targetPageNumber <= pageCount) {
                // Extract the target page
                PDDocument extractedDocument = new PDDocument();
                extractedDocument.addPage((PDPage) document.getDocumentCatalog().getPages().get(targetPageNumber - 1));

                // Save the extracted page as a new PDF file
                extractedDocument.save("page_" + targetPageNumber + ".pdf");
                System.out.println("Page " + targetPageNumber + " extracted and saved as page_" + targetPageNumber + ".pdf");

                // Close the extracted document
                extractedDocument.close();
            } else {
                System.out.println("Invalid page number.");
            }

            // Close the original document
            document.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
