public class JedliksToyCar {
    private int driven = 0;
    private int battery = 100;
    
    public static JedliksToyCar buy() {
        JedliksToyCar car = new JedliksToyCar();
        return car;
    }

    public String distanceDisplay() {
        return "Driven " + this.driven + " meters";
    }

    public String batteryDisplay() {
        if (battery == 0) {
            return "Battery empty";
        }
        return "Battery at " + battery + "%";
    }


    public void drive() {
    if (battery == 0) {
        this.batteryDisplay();
    } else {
        driven = driven + 20;
        battery = battery - 1;
        this.distanceDisplay();
        this.batteryDisplay();
    }
}

}
