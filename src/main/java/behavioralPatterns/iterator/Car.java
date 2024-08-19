package behavioralPatterns.iterator;

public class Car implements Collection{
    private String model;
    private String[] parts;

    public Car(String model, String[] parts) {
        this.model = model;
        this.parts = parts;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String[] getParts() {
        return parts;
    }

    public void setParts(String[] parts) {
        this.parts = parts;
    }

    @Override
    public Iterator getIterator() {
        return new PartIterator();
    }

    private class PartIterator implements Iterator{

        int index;

        @Override
        public boolean hasNext() {
            if (index < parts.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return parts[index++];
        }
    }
}
