package Task1;

public class TV {
    private int channel = 1;
    private int volume = 0;
    private boolean isOn;

    public TV() {
        this.channel = 1;
        this.volume = 0;
    }

    public void turnOn(){
        this.isOn = true;
    }

    public void setChannel(int requestedChannel){
        if(this.isOn && (requestedChannel > 1 && requestedChannel < 100)) {
            this.channel = requestedChannel;
        } else {
            System.out.println("has to be between 1-100 eller tv ikker er tændt");
        }
    }

    public void setVolume(int amount){
        if(isOn && (amount > 1 && amount < 100)){
            this.volume = amount;
        } else{
            System.out.println("has to be between 1-100 eller tv ikke er tændt");
        }
    }

    public void channelDown() {
        if(this.channel > 0 && isOn) {
            this.channel--;
        }
    }

    public void channelUp() {
        if(this.channel < 100 && isOn) {
            this.channel++;
        }
    }

    public void volumeUp(){
        if(isOn && this.volume < 100){
            this.volume++;
        }
    }

    public void volumeDown(){
        if(isOn && this.volume >0){
            this.volume--;
        }
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isOn() {
        return isOn;
    }
}