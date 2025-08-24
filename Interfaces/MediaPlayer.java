package Oops.Interfaces;

public class MediaPlayer implements Media {

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("Media player Starts.");
    }

    @Override
    public void stop() {
        System.out.println("Media player stops.");
    }
    
}
