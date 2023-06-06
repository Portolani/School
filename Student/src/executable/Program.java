package executable;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import classes.Discipline;
import classes.Student;

public class Program {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>();

		for (int qtdStudents = 1; qtdStudents <= 2; qtdStudents++) {

			Student student = new Student();

			String studentName = JOptionPane.showInputDialog("Student name: ");
			student.setStudentName(studentName);
			/*String ID = JOptionPane.showInputDialog("ID number: ");
			student.setID(ID);
			String motherName = JOptionPane.showInputDialog("Mother's name: ");
			student.setMotherName(motherName);
			String bornDate = JOptionPane.showInputDialog("Born date: ");
			student.setBornDate(bornDate); */

			for (int pos = 1; pos <= 4; pos++) {
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
		/*--------------------------------------------------------------------*/
		/* Printing final result */
		for (Student student : students) {
			System.out.println(student);
			System.out.println("----------------------------------------------------------");
		}

	}

}
