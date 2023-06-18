package executable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import classes.Discipline;
import classes.Student;
import classes.StudentStatus;

public class Program {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Welcome!");
		
		String login = JOptionPane.showInputDialog("Login: ");
		String password = JOptionPane.showInputDialog("Password");
		
		if(login.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {

		List<Student> students = new ArrayList<Student>();

		HashMap<String, List<Student>> maps = new HashMap<String, List<Student>>();

		for (int qtdStudents = 1; qtdStudents <= 5; qtdStudents++) {

			Student student = new Student();

			String studentName = JOptionPane.showInputDialog("Student name: ");
			student.setName(studentName);
			/*
			 * String ID = JOptionPane.showInputDialog("ID number: "); student.setID(ID);
			 * String motherName = JOptionPane.showInputDialog("Mother's name: ");
			 * student.setMotherName(motherName); String bornDate =
			 * JOptionPane.showInputDialog("Born date: "); student.setBornDate(bornDate);
			 */

			for (int pos = 1; pos <= 2; pos++) {
				String discipline = JOptionPane.showInputDialog(pos + " Discipline Name: ");
				String scoreValue = JOptionPane.showInputDialog("Discipline's Score: ");

				Discipline disciplines = new Discipline();
				disciplines.setDisciplineName(discipline);
				disciplines.setScore(Double.valueOf(scoreValue));

				student.getDisciplines().add(disciplines);
			}

			JOptionPane.showMessageDialog(null, student);
			/*----------------------------------------------------------------------------------------*/
			/* Removing disciplines */

			int choose = JOptionPane.showConfirmDialog(null, "Would you like to remove any discipline?");

			if (choose == 0) {

				int continueRemove = 0;
				int position = 1;

				while (continueRemove == 0) {
					String removeDiscipline = JOptionPane
							.showInputDialog("Which discipline would you wish remove? 1, 2, 3 or 4");
					student.getDisciplines().remove(Integer.valueOf(removeDiscipline).intValue() - position);
					position++;

					JOptionPane.showMessageDialog(null, student);

					continueRemove = JOptionPane.showConfirmDialog(null,
							"Would you like to remove any other discipline?");

				}
			}
			students.add(student);
		}

		maps.put(StudentStatus.APPROVED, new ArrayList<Student>());
		maps.put(StudentStatus.RECUPERATING, new ArrayList<Student>());
		maps.put(StudentStatus.FAILED, new ArrayList<Student>());

		for (Student student : students) {

			if (student.result().equalsIgnoreCase(StudentStatus.APPROVED)) {
				maps.get(StudentStatus.APPROVED).add(student);
			} else {
				if (student.result().equalsIgnoreCase(StudentStatus.RECUPERATING)) {
					maps.get(StudentStatus.RECUPERATING).add(student);
				} else {
					maps.get(StudentStatus.FAILED).add(student);
				}
			}
		}

		System.out.println("-------------Approved Students-----------");
		for (Student student : maps.get(StudentStatus.APPROVED)) {
			System.out.println("Student Name = " + student.getName());
			System.out.println("Result = " + student.result());
			System.out.println("Final Average = " + student.finalAverageScore());
			System.out.println();
		}
		System.out.println();
		System.out.println("-------------Recuperating Students----------");
		for (Student student : maps.get(StudentStatus.RECUPERATING)) {
			System.out.println("Student Name = " + student.getName());
			System.out.println("Result = " + student.result());
			System.out.println("Final Average = " + student.finalAverageScore());
		}

		System.out.println();
		System.out.println("-------------Failed Students----------");
		for (Student student : maps.get(StudentStatus.FAILED)) {
			System.out.println("Student Name = " + student.getName());
			System.out.println("Result = " + student.result());
			System.out.println("Final Average = " + student.finalAverageScore());
		}

		/*--------------------------------------------------------------------*/
		/* Printing final result */
		/*
		 * for (Student student : students) {
		 * 
		 * /* if (student.getName().equalsIgnoreCase("Hector")) { /*this if will
		 * show the name chosen
		 */
		/*
		 * students.remove(student); break; /* }else { /* System.out.println(student);
		 * System.out.println(
		 * "----------------------------------------------------------");
		 * 
		 * }
		 * 
		 * }
		 */

		/**/

		/*
		 * Printing student-by-student and discipline-by-discipline. And changing
		 * student and data:
		 */
		// for (int pos = 0; pos < students.size(); pos++) {

		// Student student = students.get(pos);

		// if (student.getName().equalsIgnoreCase("Felipe")) {
		// Student change = new Student();
		// change.setName("Student has be changed");

		// Discipline discipline = new Discipline();
		// discipline.setDisciplineName("Cybersecurity");
		// discipline.setScore(98);

		// change.getDisciplines().add(discipline);

		// students.set(pos, change);
		// student = students.get(pos);
		// }

		// System.out.println("Student = " + student.getName());
		// System.out.println("AVERAGE = " + student.finalAverageScore());
		// System.out.println("FINAL SITUATION = " + student.result());
		// System.out.println("---------------------------------------------------------");

		// for (int posd = 0; posd < student.getDisciplines().size(); posd++) {

		// Discipline disc = student.getDisciplines().get(posd);
		// System.out.println("Discipline = " + disc.getDisciplineName() + ", Score = "
		// + disc.getScore());

		// }

		// }
		} else {
			JOptionPane.showMessageDialog(null, "Login and/or password invalid");
		}
	}

}
