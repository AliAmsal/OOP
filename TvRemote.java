

package TvRemote;

class TV
{
    int channel;
    int volumeLevel;
    boolean on;
    public TV()
    {
        channel = 1;
        volumeLevel = 7;
        on = true;       
    }
    public void turnOn()
    {
        on = true;
    }
     public void turnOff()
    {
        on = false;
    }
     public void setChannel(int newChannel)
    {
        if(newChannel >= 1 && newChannel <= 120)
            channel = newChannel;
        else
            System.out.println("Channel out of range");
    }
     public void setVolume(int newVolumeLevel)
    {
        if(newVolumeLevel >= 1 && newVolumeLevel <= 7)
            volumeLevel = newVolumeLevel;
        else
            System.out.println("Volume Level out of range");
    }
     public void channelUp()
     {
         if(channel == 120)
             channel = 1;
          else
             channel++;
     }
      public void channelDown()
     {
         if(channel == 1)
             channel = 120;
          else
             channel--;
     }
       public void volumeUp()
     {
         if(volumeLevel < 7)
             volumeLevel++;
     }
       public void volumeDown()
     {
         if(volumeLevel > 1)
             volumeLevel--;
     }
    @Override
       public String toString()
       {
           return "Current channel: " + channel + " Current Volume Level: " + volumeLevel + " TV status?(ON): " + on;
       }
}


public class TvRemote {

    
    public static void main(String[] args) {
        TV a = new TV();
        a.setChannel(10);
        a.setVolume(5);
        a.channelUp();
        a.volumeDown();
        System.out.println(a.toString());
    }
    
}


