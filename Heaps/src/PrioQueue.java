
import java.util.*;
public class PrioQueue {

    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Student> st = new PriorityQueue<>();

        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);



        while(!pq.isEmpty()){
            System.out.print(pq.peek()+" ");
            pq.remove();
        }
        System.out.println();
        st.add(new Student("A", 4));
        st.add(new Student("B", 2));
        st.add(new Student("C", 1));
        st.add(new Student("D", 5));

        while(!st.isEmpty()){
            System.out.println(st.peek().name+ "-->"+st.peek().rank);
            st.remove();
        }
    }
}
