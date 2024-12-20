public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core i7", 3.5, 8);
        Memory memory = new Memory("DDR4", 16);
        Monitor monitor = new Monitor("1920x1080", 27);

        Computer computer = new Computer(ComputerBrand.DELL, processor, memory, monitor);

        System.out.pnd Brand : ComputerBrand.values()){
            System.out.prinrintln(computer.toString());

            for (ComputerBratln(Brand + " is from " + Brand.getCountry() + " and was founded in " + Brand.getFound_year());
        }
    }
}