package education;

import author.Author;

public class LessonStorage {

    private Student[] array = new Student[10];
    private int size = 0;

    public Student add(Student student) {
        if (array.length == size) {
            extend();
        }
        array[size++] = student;
        return student;
    }

    public Student getByIndex(int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid index");

        }
        return array[index];
    }

    private Student extend() {
        Student[] tmp = new Student[array.length + 10];
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

    public Student getname(String name) {
        for (int i = 0; i < size; i++) {
            if (array[i].getName().equals(name)) {
                return array[i];
            }
        }
        return null;
    }


    public void delete(Student lesson) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(lesson)) {
                ArrayUtil.deleteByIndex(array, i, size);
                size--;
                break;

            }
        }
    }
}