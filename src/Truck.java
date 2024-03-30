public class Truck extends MotorAuto{
    public Truck(java.lang.String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @java.lang.Override
    public void service() {
        super.service();
        checkTrailer();
    }
    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}