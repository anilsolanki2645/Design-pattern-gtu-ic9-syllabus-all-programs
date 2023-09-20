class Database{
	private static Database dbObject;
	
	private Database(){
		
	}
	
	public static Database getInstance(){
		
		if(dbObject == null){
			dbObject = new Database();
		}
		
		return dbObject;
	}
	
	public void getConnection(){
		System.out.println("You are now connected to the database.");
	}
}

class Singl_ton{
	public static void main(String args[]){
		Database db;
		db = Database.getInstance();
		db.getConnection();
	}
}