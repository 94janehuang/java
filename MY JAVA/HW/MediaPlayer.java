public class MediaPlayer {
    
interface MediaPlayer {
    void play();
    void stop();
}


abstract class Device {
    abstract String getDeviceName();
}


class MP3Player extends Device implements MediaPlayer {
    @Override
    String getDeviceName() {
        return "MP3 Player";
    }

    @Override
    public void play() {
        System.out.println("Playing music on MP3 Player");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music on MP3 Player");
    }
}


class SmartPhone extends Device implements MediaPlayer {
    @Override
    String getDeviceName() {
        return "Smartphone";
    }

    @Override
    public void play() {
        System.out.println("Playing music on Smartphone");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music on Smartphone");
    }
}

public class Main {
    public static void main(String[] args) {
        MP3Player mp3Player = new MP3Player();
        SmartPhone smartPhone = new SmartPhone();

        System.out.println(mp3Player.getDeviceName()); 
        mp3Player.play();  
        mp3Player.stop();  

        System.out.println(smartPhone.getDeviceName()); 
        smartPhone.play(); 
        smartPhone.stop();  
    }
}
}