package labcodeinspection;

public class Email {// NOPMD - This field is mutable for demonstration purposes

	private String m_firstName;// NOPMD - This field is mutable for demonstration purposes
	private String m_lastName;// NOPMD - This field is mutable for demonstration purposes
	private String password = null;  //NOPMD - This field is mutable for demonstration purposes
	private String department;// NOPMD - This field is mutable for demonstration purposes
	private int defaultpasswordLength = 8;// NOPMD - This field is mutable for demonstration purposes
	private String email;

	public Email(String firstName, String lastName) { //NOPMD - This field is mutable for demonstration purposes
		this.m_firstName = firstName;
		this.m_lastName = lastName;
	}

	public void showInfo() {
		System.out.println("\nFIRST NAME= " + m_firstName + "\nLAST NAME= " + m_lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}

	public void setDeparment(int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		}
	}

	private String randomPassword(int length) {
		String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}

	public void generateEmail() {
		this.password = this.randomPassword(this.defaultpasswordLength);
		this.email = this.m_firstName.toLowerCase() + this.m_lastName.toLowerCase() + "@" + this.department
				+ ".espol.edu.ec";
	}
}
