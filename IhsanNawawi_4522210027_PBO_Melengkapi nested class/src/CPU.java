import java.text.NumberFormat;
import java.util.Locale;

public class CPU {
    private double harga;
    private String merek;

    public CPU(double harga, String merek) {
        this.harga = harga;
        this.merek = merek;
    }

    public class Processor {
        int cores;
        String manufacturer;
        String name;

        Processor(int cores, String manufacturer, String name) {
            this.cores = cores;
            this.manufacturer = manufacturer;
            this.name = name;
        }

        public void getProcessorInfo() {
            System.out.println("Jumlah core: " + this.cores);
            System.out.println("Pabrik: " + this.manufacturer);
            System.out.println("Processor: " + this.name);
        }
    }

    public class RAM {
        int jumlahRAM;
        String manufacturer;

        RAM(int jumlahRAM, String manufacturer) {
            this.jumlahRAM = jumlahRAM;
            this.manufacturer = manufacturer;
        }

        public void getInfoRAM() {
            System.out.println("Jumlah RAM: " + this.jumlahRAM);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    public void getCPUInfo() {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        System.out.println("Komputer Merek: " + this.merek);

        // menuliskan harga yang double ke dalam format rupiah
        System.out.println("Harga: " + formatRupiah.format(this.harga));
    }

    // Inner Class: Harddisk
    public class Harddisk {
        String type;
        int capacityGB;

        public Harddisk(String type, int capacityGB) {
            this.type = type;
            this.capacityGB = capacityGB;
        }

        public void getHarddiskInfo() {
            System.out.println("Tipe Harddisk: " + this.type);
            System.out.println("Kapasitas: " + this.capacityGB + "GB");
        }
    }

    // Inner Class: Motherboard
    public class Motherboard {
        String model;
        String chipset;

        public Motherboard(String model, String chipset) {
            this.model = model;
            this.chipset = chipset;
        }

        public void getMotherboardInfo() {
            System.out.println("Model Motherboard: " + this.model);
            System.out.println("Chipset: " + this.chipset);
        }
    }

    // Inner Class: PowerSupply
    public class PowerSupply {
        String brand;
        int wattage;

        public PowerSupply(String brand, int wattage) {
            this.brand = brand;
            this.wattage = wattage;
        }

        public void getPowerSupplyInfo() {
            System.out.println("Merek Power Supply: " + this.brand);
            System.out.println("Daya: " + this.wattage + " Watt");
        }
    }

    // Inner Class: VGACard
    public class VGACard {
        String chipset;
        int memoryGB;

        public VGACard(String chipset, int memoryGB) {
            this.chipset = chipset;
            this.memoryGB = memoryGB;
        }

        public void getVGACardInfo() {
            System.out.println("Chipset VGA: " + this.chipset);
            System.out.println("Memori VGA: " + this.memoryGB + "GB");
        }
    }
}
