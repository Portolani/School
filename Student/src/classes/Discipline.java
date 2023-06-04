package classes;

import java.util.Objects;

/*This Discipline class will serve for all objects and instances of grades and subjects*/
public class Discipline {

	private String disciplineName;
	private double score;


	public String getDisciplineName() {
		return disciplineName;
	}

	public void setDisciplineName(String disciplineName) {
		this.disciplineName = disciplineName;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public int hashCode() {
		return Objects.hash(disciplineName, score);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Discipline other = (Discipline) obj;
		return Objects.equals(disciplineName, other.disciplineName)
				&& Double.doubleToLongBits(score) == Double.doubleToLongBits(other.score);
	}

	@Override
	public String toString() {
		return "\nDiscipline Name = " + disciplineName + "\nScore = " + String.format("%.2f", score);
	}

}
