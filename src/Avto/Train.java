//package Avto;
//
//public class Train extends Transport {
//    private int costTravel;
//    private int timeTravel;
//    private String pleaceAt;
//    private String pleaceDo;
//    private int currentCarriage;
//
//
//    public Train(String brand, String model, int yearMade, String country, String color, int maxSpeed, int costTravel, int timeTravel, String pleaceAt, String pleaceDo, int currentCarriage, String refill) {
//        super(brand, model, yearMade, country, color, maxSpeed, refill);
//        this.costTravel = costTravel;
//        this.timeTravel = timeTravel;
//        this.pleaceAt = pleaceAt;
//        this.pleaceDo = pleaceDo;
//        this.currentCarriage = currentCarriage;
//    }
//
//    public void refil() {
//        System.out.println(getRefill());
//    }
//
//    public int getCostTravel() {
//        return costTravel;
//    }
//
//    public int getTimeTravel() {
//        return timeTravel;
//    }
//
//    public String getPleaceAt() {
//        return pleaceAt;
//    }
//
//    public String getPleaceDo() {
//        return pleaceDo;
//    }
//
//    public int getCurrentCarriage() {
//        return currentCarriage;
//    }
//
//    @Override
//    public String toString() {
//        return getBrand() + " " + getModel() + ", " + getYearMade() + " года выпуска, сборка в: " + getCountry() + ", " + getColor() + " цвет кузова, Цена поездки: " + costTravel + " рублей."
//                + ", Время поездки: " + timeTravel + ", Количество вагонов: " + currentCarriage + ", ОТправляется от: " + pleaceAt + ", Следует до станции: " + pleaceDo;
//    }
//}
