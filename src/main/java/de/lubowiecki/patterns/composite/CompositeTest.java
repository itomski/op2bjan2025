package de.lubowiecki.patterns.composite;

public class CompositeTest {

    public static void main(String[] args) {

        PdfDoc d1 = new PdfDoc();
        ExcelDoc d2 = new ExcelDoc("Einkaufsliste");
        PowerPointDoc d3 = new PowerPointDoc();

        d1.print();
        d2.print();
        d3.print();

        System.out.println();

        DocGroup gruppe = new DocGroup();
        gruppe.hinzufuegen(d2);
        gruppe.hinzufuegen(new ExcelDoc("Kundenliste"));
        gruppe.hinzufuegen(new ExcelDoc("Produktliste"));
        gruppe.hinzufuegen(new PowerPointDoc(100));
        gruppe.hinzufuegen(new PdfDoc());

        gruppe.print();

        System.out.println();

        DocGroup gruppe2 = new DocGroup();
        gruppe2.hinzufuegen(new PowerPointDoc(50));
        gruppe2.hinzufuegen(new PowerPointDoc(2));
        gruppe2.hinzufuegen(gruppe); // Eine Gruppe von Gruppen

        gruppe2.print();
    }
}
