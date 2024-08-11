package structuralPatterns.proxy;

public class ProxyCar implements Car{

    private String serialNumber;
    private Lada lada;

    public ProxyCar(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public void drive() {
        if (lada==null){
            lada = new Lada(serialNumber);
        }
        lada.drive();
    }
}
