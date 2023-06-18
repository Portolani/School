package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student extends People{
	
	/*These are the attributes of the student*/
	
	private String schoolName;
	private String enrollmentDate;
	private String enrolledGrade;
	private List<Discipline> disciplines = new ArrayList<Discipline>();
	
	
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(String enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	public String getEnrolledGrade() {
		return enrolledGrade;
	}

	public void setEnrolledGrade(String enrolledGrade) {
		this.enrolledGrade = enrolledGrade;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
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
	

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
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
				return StudentStatus.APPROVED;
			} else {
				return StudentStatus.RECUPERATING;
			}
		}else {
			return StudentStatus.FAILED;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID, bornDate, disciplines, motherName, Name);
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
				&& Objects.equals(Name, other.Name);
	}

	@Override
	public String toString() {
		return "\nSchoolName = " + schoolName + 
				"\nEnrollment Date = " + enrollmentDate + 
				"\nEnrolled Grade = "
				+ enrolledGrade + 
				"\nDisciplines = " + 
				disciplines + 
				"\nName = " + Name + 
				"\nID = " + ID + 
				"\nMother Name = "
				+ motherName + 
				"\nBorn Date = " + bornDate + 
				"\nAge = " + age +
				"\nCPF = " + CPF;
	}

}
