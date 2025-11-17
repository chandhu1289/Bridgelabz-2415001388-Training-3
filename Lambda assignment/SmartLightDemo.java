interface LightAction {
    void execute();
}

public class SmartLightDemo {
    public static void main(String[] args) {

        LightAction motion = () -> System.out.println("Lights ON: Bright White");

        LightAction nightMode = () -> System.out.println("Lights DIM: Warm Yellow");

        LightAction voice = () -> System.out.println("Lights Changing: Rainbow Mode");

        motion.execute();
        nightMode.execute();
        voice.execute();
    }
}
