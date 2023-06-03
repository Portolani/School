package executable;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import classes.Discipline;
import classes.Student;

public class Program {

	public static void main(String[] args) {

		Student student1 = new Student();

		String studentName = JOptionPane.showInputDialog("Student name :");
		student1.setStudentName(studentName);
		String ID = JOptionPane.showInputDialog("ID number :");
		student1.setID(ID);
		String motherName = JOptionPane.showInputDialog("Mother's name:");
		student1.setMotherName(motherName);
		String bornDate = JOptionPane.showInputDialog("Born date:");
		student1.setBornDate(bornDate);

		Discipline discipline1 = new Discipline();
		discipline1.setDisciplineName("JAVA");
		discipline1.setScore(100);
		
		student1.getDisciplines().add(discipline1);
		
		Discipline discipline2 = new Discipline();
		discipline2.setDisciplineName("Banco de Dados");
		discipline2.setScore(90);
		
		student1.getDisciplines().add(discipline2);
		
		Discipline discipline3 = new Discipline();
		discipline3.setDisciplineName("Lógica e Algoritmo");
		discipline3.setScore(95);
		
		student1.getDisciplines().add(discipline3);
		
		Discipline discipline4 = new Discipline();
		discipline4.setDisciplineName("JavaScript");
		discipline4.setScore(88);
		
		student1.getDisciplines().add(discipline4);
		
		/*--------------------------------------------------------------------*/
		/*Starting print*/
		JOptionPane.showMessageDialog(null,student1);
	
	} 
		
}
