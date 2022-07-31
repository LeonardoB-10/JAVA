import java.util.Date;

public class Show {
	
	   	private int id;
	    private Date date;
	    private int seats;

	    
	    public Show(int ID, Date date, int seats) {
	        this.id = ID;
	        this.date = date;
	        this.seats = seats;
	    }


		@Override
		public String toString() {
			return "Show [id=" + id + ", date=" + date + ", seats=" + seats + "]";
		}

	    
	    
	    
}
