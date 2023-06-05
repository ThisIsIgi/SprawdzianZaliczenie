public class NaPewnoZdam {
    private String nazwaPrzedmiotu;
    private Integer przewidywanaOcena;
    private String nazwiskoNauczyciela;

    public NaPewnoZdam(String nazwaPrzedmiotu, Integer przewidywanaOcena, String nazwiskoNauczyciela) {
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
        this.przewidywanaOcena = przewidywanaOcena;
        this.nazwiskoNauczyciela = nazwiskoNauczyciela;
    }

    public String getNazwaPrzedmiotu() {
        return nazwaPrzedmiotu;
    }

    public void setNazwaPrzedmiotu(String nazwaPrzedmiotu) {
        this.nazwaPrzedmiotu = nazwaPrzedmiotu;
    }

    public Integer getPrzewidywanaOcena() {
        return przewidywanaOcena;
    }

    public void setPrzewidywanaOcena(Integer przewidywanaOcena) {
        this.przewidywanaOcena = przewidywanaOcena;
    }

    public String getNazwiskoNauczyciela() {
        return nazwiskoNauczyciela;
    }

    public void setNazwiskoNauczyciela(String nazwiskoNauczyciela) {
        this.nazwiskoNauczyciela = nazwiskoNauczyciela;
    }

    @Override
    public String toString() {
        return "Na pewno zdam z '" + nazwaPrzedmiotu + '\'' +
                ". Oczekuje dostać " + przewidywanaOcena +
                ". Nauczyciel '" + nazwiskoNauczyciela + '\'' +
                "jest najlepszy";
    }
    public void radosc(String tekst){
        for (int i = 0; i <przewidywanaOcena ; i++) {
            System.out.println(tekst);
        }
    }

}
