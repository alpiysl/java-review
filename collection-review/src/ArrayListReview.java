import java.util.*;

public class ArrayListReview {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"jose"));
        students.add(new Student(2,"josein"));
        students.add(new Student(3,"ali"));
        students.add(new Student(4,"ron"));
        System.out.println("students = " + students);

        //for loop
        for (int i = 0; i < students.size(); i++) System.out.println(students.get(i));

        //iterator
        //1.forward iteration
        System.out.println("Print with forward iterator");
        Iterator iter = students.listIterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        //2.backward iteration
        System.out.println("Print with backward iterator");
        while (((ListIterator<?>) iter).hasPrevious()){
            System.out.println(((ListIterator<?>) iter).previous());
        }

        //Sorting element in the list
        System.out.println("print sorted list id desc");
        Collections.sort(students,new sortById());
        System.out.println(students);

        System.out.println("print sorted list name desc");
        Collections.sort(students,new sortByName());
        System.out.println(students);


    }

    static class sortById implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.id-o1.id;
        }
    }

    static class sortByName implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }
}
