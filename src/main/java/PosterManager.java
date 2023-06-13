public class PosterManager {

    private int filmLastCount;
    private String[] films = new String[0];

    public PosterManager(int filmLastCount) {
        this.filmLastCount = filmLastCount;
    }

    public PosterManager() {
        this.filmLastCount = 5;
    }

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (films.length <= filmLastCount) {
            resultLength = films.length;
        } else {
            resultLength = filmLastCount;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
