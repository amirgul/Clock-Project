public class Clock
{
    private   int hours;        //0-23;     while 0-11 represent time before noon.
    private   int minutes;      //0-59;
    private boolean  isTrue;

    public Clock()
    {
        hours = 0;
        minutes = 0;
    }


    private boolean isValid(int newHours, int newMinutes)
    {
        if(((newHours < 0)||(newHours > 23))||((newMinutes < 0)||(newMinutes > 59)))
        {
            System.out.println("Wrong parameter enter for hours and minutes");
            isTrue = false;

        }
        else
        {
            hours = newHours;
            minutes = newMinutes;
            isTrue = true;

        }
        return  isTrue;

    }

    public void setTime(int newHours, int newMinutes)
    {
        if(((newHours < 0)||(newHours > 23))||((newMinutes < 0)||(newMinutes > 59)))
        {
            System.out.println("Wrong parameter enter for hours and minutes");
            isTrue = false;

        }
        else
        {
            hours = newHours;
            minutes = newMinutes;
            isTrue = true;

        }

    }
    public boolean setTime(int newHours, int newMinutes, boolean isAM)
    {
        if((newHours <1)||(newHours >12)||(newMinutes <0)||(newMinutes>59))
        {
            System.out.println("Wrong paramerer entered for hours and minutes");
            isAM = false;
        }
        else
        {
            hours = newHours;
            minutes = newMinutes;
            isAM = true;
        }
        return isAM;
    }

}
