package author;

public class AuthorStorage {
    private Author[] array = new Author[10];
    private int size = 0;

    public Author add(Author author) {
        if (array.length == size) {
            extend();
        }
        array[size++] = author;
        return author;
    }

    public Author getByIndex(int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid index");

        }
        return array[index];
    }

    private Author extend() {
        Author[] tmp = new Author[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
        return null;
    }
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
    }

}
