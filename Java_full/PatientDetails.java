package com.ust.examples;
/*
 * Data encapsulation
 * 
 */
class PatientForm {
	private String pname;
	private int age;
	private boolean userVaccinated;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isUserVaccinated() {
		return userVaccinated;
	}
	public void setUserVaccinated(boolean userVaccinated) {
		this.userVaccinated = userVaccinated;
		if(userVaccinated == true) {
			System.out.println("Congrads you are vaccinated!");
		}else {
			System.out.println("Please vaccine As Soon as possible");
		}
	}
}
public class PatientDetails {

	public static void main(String[] args) {
		PatientForm pd =new PatientForm();
		pd.setPname("Arya");
		pd.setAge(23);
		pd.setUserVaccinated(false);
		System.out.println(pd.getPname()+" "+pd.getAge());

	}

}
