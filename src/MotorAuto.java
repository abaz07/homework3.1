public abstract class MotorAuto extends Auto{
    public MotorAuto(java.lang.String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }
    @java.lang.Override
    public void service() {
        super.service();
        checkEngine();
    }
    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}