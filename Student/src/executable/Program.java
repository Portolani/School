package executable;


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

		for(int pos = 1; pos <= 4; pos++) {
			String discipline = JOptionPane.showInputDialog(pos +" Discipline Name: ");
			String scoreValue = JOptionPane.showInputDialog("Discipline's Score: ");
			
			Discipline disciplines = new Discipline();
			disciplines.setDisciplineName(discipline);
			disciplines.setScore(Double.valueOf(scoreValue));
			
			student1.getDisciplines().add(disciplines);
		}
		
			JOptionPane.showMessageDialog(null, student1);
	/*----------------------------------------------------------------------------------------*/
		/*Removing disciplines*/
		
		int choose = JOptionPane.showConfirmDialog(null, "Would you like to remove any discipline?");
		
		if(choose == 0) {
			String removeDiscipline = JOptionPane.showInputDialog("Which discipline would you wish remove? 1, 2, 3 or 4");
			student1.getDisciplines().remove(Integer.valueOf(removeDiscipline).intValue() - 1);
		}
		
		/*--------------------------------------------------------------------*/
		/*Printing final result*/
		JOptionPane.showMessageDialog(null,student1);
	
	} 
		
}
