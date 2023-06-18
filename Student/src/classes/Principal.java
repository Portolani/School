package classes;

import java.util.Objects;

public class Principal extends People {

	private String registerEducator;
	private String timeAsPrincipal;
	private String title;

	public String getRegisterEducator() {
		return registerEducator;
	}

	public void setRegisterEducator(String registerEducator) {
		this.registerEducator = registerEducator;
	}

	public String getTimeAsPrincipal() {
		return timeAsPrincipal;
	}

	public void setTimeAsPrincipal(String timeAsPrincipal) {
		this.timeAsPrincipal = timeAsPrincipal;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(registerEducator, timeAsPrincipal, title);
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
		Principal other = (Principal) obj;
		return Objects.equals(registerEducator, other.registerEducator)
				&& Objects.equals(timeAsPrincipal, other.timeAsPrincipal) && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "\nPrincipal register Educator = " + registerEducator + 
				"\nTime As Principal = " + timeAsPrincipal + 
				"\nTitle = " + title + 
				"\nName = " + Name + 
				"\nID = " + ID + 
				"\nMother Name = " + motherName + 
				"\nBorn Date = " + bornDate + 
				"\nAge = " + age +
				"\nCPF = " + CPF;
	}

}
