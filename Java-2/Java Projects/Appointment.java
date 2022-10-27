class Appointment
{
    private String description;
    private int day;
    private int month;
    private int year;
    public Appointment(int day, int month, int year, String des)
        {
            this.day = day;
            this.month = month;
            this.year = year;
            description = des;
        }
    public boolean occursOn(int d, int m, int y)
    {
        if(d == day && m == month && y == year)
        {
            return true;
        }
        return false;
    }

    public String toString()
    {
        return description;
    }

    public int getDay()
    {
        return day;
    }

    public int getMonth()
    {
        return month;
    }

    public int getYear()
    {
        return year;
    }
    
}   