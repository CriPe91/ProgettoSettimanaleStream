package org.example;

public abstract class CatalogoBibliotecario {
    protected int CodiceIsbn;
    protected String Titolo;
    protected int AnnoPublicazione;
    protected int NumeroPagine;

    public CatalogoBibliotecario(int codiceIsbn, String titolo, int annoPublicazione, int numeroPagine) {
        CodiceIsbn = codiceIsbn;
        Titolo = titolo;
        AnnoPublicazione = annoPublicazione;
        NumeroPagine = numeroPagine;
    }

    public int getCodiceIsbn() {
        return CodiceIsbn;
    }

    public void setCodiceIsbn(int codiceIsbn) {
        CodiceIsbn = codiceIsbn;
    }

    public String getTitolo() {
        return Titolo;
    }

    public void setTitolo(String titolo) {
        Titolo = titolo;
    }

    public int getAnnoPublicazione() {
        return AnnoPublicazione;
    }

    public void setAnnoPublicazione(int annoPublicazione) {
        AnnoPublicazione = annoPublicazione;
    }

    public int getNumeroPagine() {
        return NumeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        NumeroPagine = numeroPagine;
    }

    @Override
    public String toString() {
        return "CatalogoBibliotecario{" +
                "CodiceIsbn=" + CodiceIsbn +
                ", Titolo='" + Titolo + '\'' +
                ", AnnoPublicazione=" + AnnoPublicazione +
                ", NumeroPagine=" + NumeroPagine +
                '}';
    }
}
