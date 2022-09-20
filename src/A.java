import java.util.Objects;

public class A {
	String name;
	String designation;

	public A(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(designation, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		return Objects.equals(designation, other.designation) && Objects.equals(name, other.name);
	}

	public static void main(String[] args) {
		A a = new A("darshan", "SENg");
		A a2 = new A("darshan","SENg");
		System.out.println(a.equals(a2));
		System.out.println(a.hashCode());
		System.out.println(a.hashCode());
		
	}

}
