package com.tvt.code.extract;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import java.io.File;
import java.io.IOException;

public class PDFPageExtractor {

    public static void main(String[] args) {
        int startPageNumber = 10; // Change this to the starting page number of the range
        int endPageNumber = 20; // Change this to the ending page number of the range

        try {
            // Load the PDF document
            PDDocument document = PDDocument.load(new File("your-pdf-file.pdf"));

            // Get the page count
            int pageCount = document.getNumberOfPages();

            // Check if the page range is valid
            if (endPageNumber <= pageCount) {
                // Extract the pages within the range
                PDDocument extractedDocument = new PDDocument();
                for (int i = startPageNumber - 1; i < endPageNumber; i++) {
                    extractedDocument.addPage((PDPage) document.getDocumentCatalog().getPages().get(i));
                }

                // Save the extracted pages as a new PDF file
                extractedDocument.save("pages_" + startPageNumber + "_to_" + endPageNumber + ".pdf");
                System.out.println("Pages " + startPageNumber + " to " + endPageNumber + " extracted and saved as pages_" + startPageNumber + "_to_" + endPageNumber + ".pdf");

                // Close the extracted document
                extractedDocument.close();
            } else {
                System.out.println("Invalid page range.");
            }

            // Close the original document
            document.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
