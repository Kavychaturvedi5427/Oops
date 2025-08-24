package Oops.Interfaces;

public class NewCar {
    private Engine engine;
    private Media plyer=new MediaPlayer();
    
     public NewCar(Engine engine) {
        this.engine = engine;
    }
    
    public void Start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void Mediastart(){
        plyer.start();
    }
    
    public void MediaStop(){
        plyer.stop();
    }

    public void UpgradeEngine(Engine engine){
        this.engine=engine;
    }
}
