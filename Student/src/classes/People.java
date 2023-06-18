package classes;

import java.util.Objects;

public class People {

	protected String Name;
	protected String ID;
	protected String motherName;
	protected String bornDate;
	protected String CPF;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
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

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CPF, ID, Name, bornDate, motherName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		People other = (People) obj;
		return Objects.equals(CPF, other.CPF) && Objects.equals(ID, other.ID) && Objects.equals(Name, other.Name)
				&& Objects.equals(bornDate, other.bornDate) && Objects.equals(motherName, other.motherName);
	}

	@Override
	public String toString() {
		return "\nName = " + Name + "\nID = " + ID + "\nMother Name = " + 
				motherName + 
				"\nBorn Date = " + bornDate
				+ "\nCPF = " + CPF;
	}

}
