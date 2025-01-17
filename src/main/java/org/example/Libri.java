package org.example;

public class Libri extends CatalogoBibliotecario {
    private String Autore;
    private String Genere;

    public Libri(int codiceIsbn, String titolo, int annoPublicazione, int numeroPagine, String autore, String genere) {
        super(codiceIsbn, titolo, annoPublicazione, numeroPagine);
        Autore = autore;
        Genere = genere;
    }

    public String getAutore() {
        return Autore;
    }

    public void setAutore(String autore) {
        Autore = autore;
    }

    public String getGenere() {
        return Genere;
    }

    public void setGenere(String genere) {
        Genere = genere;
    }

    @Override
    public String toString() {
        return "Libri{" +
                "Autore='" + Autore + '\'' +
                ", Genere='" + Genere + '\'' +
                ", CodiceIsbn=" + CodiceIsbn +
                ", Titolo='" + Titolo + '\'' +
                ", AnnoPublicazione=" + AnnoPublicazione +
                ", NumeroPagine=" + NumeroPagine +
                '}';
    }
}
