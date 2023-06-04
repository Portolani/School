package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
	
	/*These are the attributes of the student*/
	private String studentName;
	private String ID;
	private String motherName;
	private String bornDate;

	private List<Discipline> disciplines = new ArrayList<Discipline>();
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getBornDate() {
		return bornDate;
	}

	public void setBornDate(String bornDate) {
		this.bornDate = bornDate;
	}

	public List<Discipline> getDisciplines() {
		return disciplines;
	}

	public void setDisciplines(List<Discipline> disciplines) {
		this.disciplines = disciplines;
	
	}

	public double finalAverageScore() {
		double sum = 0;

		for (Discipline sums : disciplines) {
			sum += sums.getScore();
		}

		return sum / disciplines.size();

	}

/*	public boolean test() {
		if (finalAverageScore() >= 70.0) {
			return true;

		} else {
			return false;
		}
	}	*/
				
	public String result() {
		double average = this.finalAverageScore();
		if (average >= 50) {
			if(average >= 70) {
				return "APPROVED";
			} else {
				return "RECUPERATING";
			}
		}else {
			return "FAILED";
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID, bornDate, disciplines, motherName, studentName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(ID, other.ID) && Objects.equals(bornDate, other.bornDate)
				&& Objects.equals(disciplines, other.disciplines) && Objects.equals(motherName, other.motherName)
				&& Objects.equals(studentName, other.studentName);
	}

	@Override
	public String toString() {
		return "\nStudent Name = " + studentName + "\nID = " + ID + "\nMother Name = " + motherName + "\nBorn Date = "
				+ bornDate + "\nDisciplines = " + disciplines + "\n\nFinal Average Score = "
				+ String.format("%.2f", finalAverageScore()) + "\nResult = " + result();
	}

}
