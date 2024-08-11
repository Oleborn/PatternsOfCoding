package structuralPatterns.proxy;

public class Lada implements Car{

    private String serialNumber;

    public Lada(String serialNumber) {
        this.serialNumber = serialNumber;
        sell();
    }

    public void sell(){
        System.out.println("Продана Лада с серийным номером "+serialNumber);
    }

    @Override
    public void drive() {
        System.out.println("Лада с серийным номером "+serialNumber+" уехала");
    }
}
