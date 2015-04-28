package OOP;


public class Player extends Device {

    private String[] playerFormats ={"AA","AAC","AC3","ADX","AHX","AIFF","APE","ASF","AU","AUD","DMF","DTS","FLAC","MIDI","MOD",
            "MP1","MP2","MP3","MP4","MPC","Ogg Vorbis","Opus","RA","TTA","VOC","VOX","VQF","WAV","WMA","XM"};



    public String[] getPlayerFormats() {
        return playerFormats;
    }

    public void setPlayerFormats(String[] playerFormats) {
        this.playerFormats = playerFormats;
    }



}
