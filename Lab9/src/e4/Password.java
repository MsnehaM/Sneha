package e4;


public class Password {

	public static void main(String[] args) {

		String name = "MSneha";
		String pass = "sneha123";
		Authentication p = ((username, password) -> {
			if (username.equals(name) && password.equals(pass))
				return true;
			else
				return false;
		});
		System.out.println(p.checkIdentity("MSneha", "sneha123"));
	}
}