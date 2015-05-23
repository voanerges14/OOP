package OOP;


import java.util.Arrays;

public class Player extends Device {

    private String[] playerFormats; //{"AA","AAC","AC3","ADX","AHX","AIFF","APE","ASF","AU","AUD","DMF","DTS","FLAC","MIDI","MOD",
                      // "MP1","MP2","MP3","MP4","MPC","Ogg Vorbis","Opus","RA","TTA","VOC","VOX","VQF","WAV","WMA","XM"};


    @Override
    public String toString() {
        return "Player{" +
                "playerFormats=" + Arrays.toString(playerFormats) +
                "} " + super.toString();
    }

    public Player(String name, int power,String[] playerFormats){      //constructor max
        super(name, power);
        this.playerFormats=playerFormats;
    }

    public Player(String name,String[] playerFormats){
        super(name);
        this.playerFormats=playerFormats;
    }


    public String[] getPlayerFormats() {
        return playerFormats;
    }

    public void setPlayerFormats(String[] playerFormats) {
        this.playerFormats = playerFormats;
    }

    public String compare(Device comparedDevice) {
       String result="";
        if (this.getPower() > comparedDevice.getPower())
                result=this.getName()+" used more power" + "("+this.getPower()+")" ;
        else
        if (this.getPower() < comparedDevice.getPower())
                result=comparedDevice.getName()+" used more power" + "("+comparedDevice.getPower()+")" ;
        else
                result="The same Power";

        return result;
    }

}
