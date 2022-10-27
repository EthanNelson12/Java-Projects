class Monthly extends Appointment
{
    public Monthly(int day, int month, int year, String des)
    {
        super(day, month, year, des);
    }
    
    @Override
    public boolean occursOn(int d, int m, int y) 
    {
        if(m == getMonth())
        {
          return true;
        }
        return false;
    }
}
