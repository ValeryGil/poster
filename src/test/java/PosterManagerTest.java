import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void filmListEmpty() { // Пустой список.
        PosterManager man = new PosterManager();

        man.addFilm("");

        String[] expected = {""};
        String[] actual = man.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmListOne() { // Один фильм.
        PosterManager man = new PosterManager();

        man.addFilm("Cinema I");

        String[] expected = {"Cinema I"};
        String[] actual = man.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmList() { // Список фильмов.
        PosterManager man = new PosterManager();

        man.addFilm("Cinema I");
        man.addFilm("Cinema II");
        man.addFilm("Cinema III");

        String[] expected = {"Cinema I", "Cinema II", "Cinema III"};
        String[] actual = man.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmListAddLastLessDefault() { // Вывод списка добавленных фильмов меньше количества по умолчанию.
        PosterManager man = new PosterManager(4);

        man.addFilm("Cinema I");
        man.addFilm("Cinema II");
        man.addFilm("Cinema III");
        man.addFilm("Cinema IV");
        man.addFilm("Cinema V");
        man.addFilm("Cinema VI");
        man.addFilm("Cinema VII");

        String[] expected = {"Cinema VII", "Cinema VI", "Cinema V","Cinema IV"};
        String[] actual = man.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmListAddLastMoreDefault() { // Вывод списка добавленных фильмов больше количества по умолчанию.
        PosterManager man = new PosterManager(7);

        man.addFilm("Cinema I");
        man.addFilm("Cinema II");
        man.addFilm("Cinema III");
        man.addFilm("Cinema IV");
        man.addFilm("Cinema V");
        man.addFilm("Cinema VI");
        man.addFilm("Cinema VII");

        String[] expected = {"Cinema VII", "Cinema VI", "Cinema V", "Cinema IV", "Cinema III", "Cinema II", "Cinema I"};
        String[] actual = man.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void filmListAddLastDefault() { // Вывод списка добавленных фильмов по умолчанию.
        PosterManager man = new PosterManager();

        man.addFilm("Cinema I");
        man.addFilm("Cinema II");
        man.addFilm("Cinema III");
        man.addFilm("Cinema IV");
        man.addFilm("Cinema V");
        man.addFilm("Cinema VI");
        man.addFilm("Cinema VII");

        String[] expected = {"Cinema VII", "Cinema VI", "Cinema V", "Cinema IV","Cinema III"};
        String[] actual = man.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
