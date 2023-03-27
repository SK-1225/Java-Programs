package org.javaprograms.Task3;
public class Basic_For_Loop {
    public static void main(String[] args) {
        int studentMaxheight = 7;
        final int STUDENT_MAX_HEIGHT = 7;

        for (int student = 0; student < STUDENT_MAX_HEIGHT; student++){
            System.out.println("The student height is calculated : "+student);
        }
        System.out.println("The student height is too long");
    }
}
