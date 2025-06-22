package factory;

public class TestClass {
    public static void main(String[] args){
        DocumentFactory df= new WordDocumentFactory();
        Document word=df.createDocument();
        System.out.println(word.open());

        DocumentFactory edf= new ExcelDocumentFactory();
        Document excel=edf.createDocument();
        System.out.println(excel.open());

        DocumentFactory pdf= new PdfDocumentFactory();
        Document pdfd=pdf.createDocument();
        System.out.println(pdfd.open());
    }
}
