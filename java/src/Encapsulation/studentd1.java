package Encapsulation;

public class studentd1 {

	private String sname;
	private int sid;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

}

class test {
	public static void main(String[] args) {

		studentd1 s = new studentd1();
		s.setSname("xyz");
		s.setSid(223);

		System.out.println(s.getSname());
		System.out.println(s.getSid());
	}

}