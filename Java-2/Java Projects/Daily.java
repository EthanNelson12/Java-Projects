class Daily extends Appointment
 {
     public Daily(int day, int month, int year, String des)
    {
        super(day, month, year, des);  
    }
    
    @Override
    public boolean occursOn(int d, int m, int y) 
     {
       if(d == getDay())
        {
          return true;
        }
        return false;
    }
}