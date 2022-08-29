package Computer;

public class Computer {
    private int cost;
    private String model;
    private int RAM;
    private int HDD;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getHDD() {
        return HDD;
    }

    public void setHDD(int HDD) {
        this.HDD = HDD;
    }

    public Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
    }

    public Computer(int cost, String model, int RAM, int HDD) {
        this.cost = cost;
        this.model = model;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    public void getInfo() {
        System.out.print("Cost:" + this.cost + "$" + "; Model:" + this.model + "; RAM:" + this.RAM + "; Volume of HDD:" + this.HDD + "G");
    }
}

class HDD {
    private String name;
    private int volume;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public HDD() {

    }

    public HDD(String name, int volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    /**
     * this is HDD method,
     *which show  info about HDD
     */
    public void getInfo() {
        System.out.print("Name of HDD" + name + "; Volume:" + volume + "G; Type:" + type);
    }
}

class RAM {
    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public RAM() {

    }

    public RAM(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public void getInfo() {
        System.out.print("Name of RAM:" + name + "; Volume:" + volume + "G");
    }

}
