import java.time.LocalDate;

public class Zdalem extends NaPewnoZdam{
    private String dataZadania;

    public Zdalem(String nazwaPrzedmiotu, Integer przewidywanaOcena, String nazwiskoNauczyciela, String dataZadania) {
        super(nazwaPrzedmiotu, przewidywanaOcena, nazwiskoNauczyciela);
        this.dataZadania =dataZadania;
    }
}
