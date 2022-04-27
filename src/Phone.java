public class Phone {
    private String Color;
    private String OperatingSystem;
    private Integer BatteryCapacity;
    private Integer ScreenSize;
    private Integer Memory;
    private Integer Camera;
    public static String stock;

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getOperatingSystem() {
        return OperatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        OperatingSystem = operatingSystem;
    }

    public Integer getBatteryCapacity() {
        return BatteryCapacity;
    }

    public void setBatteryCapacity(Integer batteryCapacity) {
        BatteryCapacity = batteryCapacity;
    }

    public Integer getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(Integer screenSize) {
        ScreenSize = screenSize;
    }

    public Integer getMemory() {
        return Memory;
    }

    public void setMemory(Integer memory) {
        Memory = memory;
    }

    public Phone(String color, String operatingSystem, Integer batteryCapacity, Integer screenSize, Integer memory, Integer camera) {
        Color = color;
        OperatingSystem = operatingSystem;
        BatteryCapacity = batteryCapacity;
        ScreenSize = screenSize;
        Memory = memory;
        Camera = camera;
    }

    public Phone() {
    }

    @Override
    public String toString() {
        return "Phone{" +
                "Color='" + Color + '\'' +
                ", OperatingSystem='" + OperatingSystem + '\'' +
                ", BatteryCapacity=" + BatteryCapacity +
                ", ScreenSize=" + ScreenSize +
                ", Memory=" + Memory +
                '}';
    }

    public String toString(String color, String operatingSystem, Integer batteryCapacity, Integer screenSize, Integer memory) {
        return "Phone{" +
                "Color='" + Color + '\'' +
                ", OperatingSystem='" + OperatingSystem + '\'' +
                ", BatteryCapacity=" + BatteryCapacity +
                ", ScreenSize=" + ScreenSize +
                ", Memory=" + Memory +
                '}';
    }

    public String toString(String color, String operatingSystem, Integer batteryCapacity, Integer screenSize, Integer memory, Integer camera) {
        return "Phone{" +
                "Color='" + Color + '\'' +
                ", OperatingSystem='" + OperatingSystem + '\'' +
                ", BatteryCapacity=" + BatteryCapacity +
                ", ScreenSize=" + ScreenSize +
                ", Memory=" + Memory +
                ", Camera=" + Camera +
                '}';
    }
}
