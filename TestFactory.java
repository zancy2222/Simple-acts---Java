abstract class Laptop {
    public abstract int getRAM();
    public abstract int getSSD();
    public abstract String getCPU();

    public String toString() {
        return "RAM=" + this.getRAM() + "GB, SSD=" + this.getSSD() + ", CPU=" + this.getCPU();
    }
}
class Minimum extends Laptop {
    private int ram;
    private int ssd;
    private String cpu;

    public Minimum(int ram, int ssd, String cpu) {
        this.ram = ram;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public int getRAM() {
        return this.ram;
    }

    public int getSSD() {
        return this.ssd;
    }

    public String getCPU() {
        return this.cpu;
    }
}
class Recommended extends Laptop {
    private int ram;
    private int ssd;
    private String cpu;

    public Recommended(int ram, int ssd, String cpu) {
        this.ram = ram;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public int getRAM() {
        return this.ram;
    }

    public int getSSD() {
        return this.ssd;
    }

    public String getCPU() {
        return this.cpu;
    }
}

class LaptopFactory {
    public static Laptop getSpecs(String type, int ram, int ssd, String cpu) {
        if ("min".equalsIgnoreCase(type))
            return new Minimum(ram, ssd, cpu);
        else if ("reco".equalsIgnoreCase(type))
            return new Recommended(ram, ssd, cpu);
        else
            return null;
    }
}

public class TestFactory {
    public static void main(String[] args) {
        Laptop min = LaptopFactory.getSpecs("min", 8, 256, "15-12450Hz");
        Laptop reco = LaptopFactory.getSpecs("reco", 16, 512, "17-12700Hz");

        System.out.println("Minimum Specs:");
        System.out.println(min);

        System.out.println("Recommended Specs:");
        System.out.println(reco);
    }
}
