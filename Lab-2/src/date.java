class date{
private int day; 
private int month;
private int year;
// Default constructor
	
	public  date(int dd,int mm,int yy){
		this.day=dd;
		this.month=mm;
		this.year=yy;
	}
	public String toString(){
return String.format(day+ " "+month+" "+year);
	}
	}