package Test;

public class A {

	String a1;
	String a2;
	String a3;

	public A build() {
		return new A(a1, a2, a3);
	}

	public String getA1() {
		return a1;
	}

	public void setA1(String a1) {
		this.a1 = a1;
	}

	public String getA2() {
		return a2;
	}

	@Override
	public String toString() {
		return "A [a1=" + a1 + ", a2=" + a2 + ", a3=" + a3 + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a1 == null) ? 0 : a1.hashCode());
		result = prime * result + ((a2 == null) ? 0 : a2.hashCode());
		result = prime * result + ((a3 == null) ? 0 : a3.hashCode());
		return result;
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
		if (a1 == null) {
			if (other.a1 != null)
				return false;
		} else if (!a1.equals(other.a1))
			return false;
		if (a2 == null) {
			if (other.a2 != null)
				return false;
		} else if (!a2.equals(other.a2))
			return false;
		if (a3 == null) {
			if (other.a3 != null)
				return false;
		} else if (!a3.equals(other.a3))
			return false;
		return true;
	}

	public void setA2(String a2) {
		this.a2 = a2;
	}

	public String getA3() {
		return a3;
	}

	public void setA3(String a3) {
		this.a3 = a3;
	}

	A(String b1, String b2, String b3) {
		this.a1 = b1;
		this.a2 = b2;
		this.a3 = b3;

	}

}
