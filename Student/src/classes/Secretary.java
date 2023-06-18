package classes;

import java.util.Objects;

public class Secretary extends People {

	private String register;
	private String level;
	private String experienceTime;

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getExperienceTime() {
		return experienceTime;
	}

	public void setExperienceTime(String experienceTime) {
		this.experienceTime = experienceTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(experienceTime, level, register);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Secretary other = (Secretary) obj;
		return Objects.equals(experienceTime, other.experienceTime) && Objects.equals(level, other.level)
				&& Objects.equals(register, other.register);
	}

	@Override
	public String toString() {
		return "\nSecretary register = " + register + 
				"\nLevel = " + level + 
				"\nExperience Time = " + experienceTime + 
				"\nName = " + Name + 
				"\nID = " + ID + 
				"\nMotherName = " + motherName + 
				"\nBornDate = " + bornDate +
				"\nAge = " + age +
				"\nCPF = " + CPF;
	}

}
