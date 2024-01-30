/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 *
 * @author gills
 */


public class studentList {
    public static void main(String[] args) {
        Student[] studentList = new Student[3];

        // Correcting the syntax for object initialization.
        Student s1 = new Student(1, "sidhak");

        // Assigning the newly created student to the first position in the array.
        studentList[0] = s1;

        // Correcting the syntax for object creation and array assignment.
        studentList[1] = new Student(2, "gill");

        // It seems you meant to assign a different student to the third position in the array.
        // Previously, you were assigning two students to position 1.
        studentList[2] = new Student(3, "abc");

        // If you want to print out the student names, you can add a loop like this:
        for (int i = 0; i < studentList.length; i++) {
            System.out.println(studentList[i].getName());
        }
    }
}
