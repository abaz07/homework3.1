public abstract class Auto implements Autoable {
    private final java.lang.String modelName;
    private final int wheelsCount;
    public Auto(java.lang.String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public java.lang.String getModelName() {
        return modelName;
    }
    public int getWheelsCount() {
        return wheelsCount;
    }
    public void service() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}