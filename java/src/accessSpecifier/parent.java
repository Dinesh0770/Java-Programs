package accessSpecifier;

 
//	
//	public String name="dinesh";
//	private String name1="dinesh";
//	protected String name2="dinesh";String name3="dinesh";
//	
	


 public class parent {

		
		public String name="dinesh";
		private String name1="dinesh";
		protected String name2="dinesh";String name3="dinesh";
	
		
		public static void main(String[] args) {
		
		parent p=new parent();
		System.out.println(p.name);
		System.out.println(p.name2);
		System.out.println(p.name3);
		System.out.println(p.name);
	}

}
