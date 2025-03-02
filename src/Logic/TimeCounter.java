package Logic;

import java.util.Timer;
import java.util.TimerTask;

import GUI.Home;

public class TimeCounter extends TimerTask
{
    public static int i = 0;
    public void run()
    {
    	home.passaSec();
    }

	Timer timer=new Timer();
	Home home;
	
	public TimeCounter(Home h) {
		home=h;
	}
	
}
