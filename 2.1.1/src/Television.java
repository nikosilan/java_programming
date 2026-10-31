public class Television {
    private boolean on = false;
    private int channel = 1;

    // Check if the TV is on
    public boolean isOn() {
        return on;
    }

    // Turn the TV on or off
    public void pressOnOff() {
        on = !on;
    }

    // Get the current channel
    public int getChannel() {
        return channel;
    }

    // Change the channel if the TV is on
    public void setChannel(int channel) {
        if (on && channel >= 1) {
            if (channel > 10) {
                this.channel = 1;
            } else {
                this.channel = channel;
            }
        }
    }
}
