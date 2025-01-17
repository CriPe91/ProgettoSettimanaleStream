package org.example;

public class Riviste extends CatalogoBibliotecario {
    private Enum<Periodicita> periodicitaEnum;

    public Riviste(int codiceIsbn, String titolo, int annoPublicazione, int numeroPagine, Enum<Periodicita> periodicitaEnum) {
        super(codiceIsbn, titolo, annoPublicazione, numeroPagine);
        this.periodicitaEnum = periodicitaEnum;
    }

    public Enum<Periodicita> getPeriodicitaEnum() {
        return periodicitaEnum;
    }

    public void setPeriodicitaEnum(Enum<Periodicita> periodicitaEnum) {
        this.periodicitaEnum = periodicitaEnum;
    }

    @Override
    public String toString() {
        return "Riviste{" +
                "periodicitaEnum=" + periodicitaEnum +
                ", CodiceIsbn=" + CodiceIsbn +
                ", Titolo='" + Titolo + '\'' +
                ", AnnoPublicazione=" + AnnoPublicazione +
                ", NumeroPagine=" + NumeroPagine +
                '}';
    }
}
