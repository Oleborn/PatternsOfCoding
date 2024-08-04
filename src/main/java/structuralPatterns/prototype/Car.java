package structuralPatterns.prototype;

public class Car implements Prototype {
    private int id;
    private String name;
    private Boolean trunk;

    public Car(int id, String name, Boolean trunk) {
        this.id = id;
        this.name = name;
        this.trunk = trunk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getTrunk() {
        return trunk;
    }

    public void setTrunk(Boolean trunk) {
        this.trunk = trunk;
    }


    @Override
    public Object copy() {
        Car copyCar = new Car(id, name, trunk);
        return copyCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", trunk=" + trunk +
                '}';
    }
}
