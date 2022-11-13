package Avto;


public class Bus extends Transport implements Competing {
    private final PasCapacity pasCapacity;

    public Bus(String brand, String model, double engineVolume, double pitStop, double bestLapTime, double maxSpeed, PasCapacity pasCapacity) {
        super(brand, model, engineVolume, pitStop, bestLapTime, maxSpeed);
        this.pasCapacity = pasCapacity;

    }

    public enum PasCapacity {
        ESPECIALLY_SMALL(null, 10), SMALL(null, 25), AVERAGE(40, 50), BIG(60, 80), ESPECIALLY_BIG(100, 120);

        private final Integer fromCapacity;
        private final int toCapacity;

        PasCapacity(Integer fromCapacity, int toCapacity) {
            this.fromCapacity = fromCapacity;
            this.toCapacity = toCapacity;
        }

        public String toString() {
            String fromCapacityString = fromCapacity != null ? "от " + fromCapacity : "";
            String toCapacityString = toCapacity != 0 ? " до " + toCapacity + " мест" : "";
            return "Вместимость автобуса" + fromCapacityString + toCapacityString;

        }
    }

    public PasCapacity getPasCapacity() {
        return pasCapacity;
    }

    public void printType() {
        if (this.pasCapacity == null) {
            System.out.println("Данных недостаточно");
        } else {
            System.out.println(this.pasCapacity);
        }
    }

    @Override
    public String infoEnum() {
        return getModel() + " " + getBrand() + "  " + getPasCapacity();
    }


    @Override
    public String info() {
        return getModel() + ": Пит-стоп " + getPitStop() + ", Лучшее время круга " + getBestLapTime() + ", Максимальная скорость " + getMaxSpeed() + ",  " + getPasCapacity();
    }

}


//    public Bus(String brand, String model, int yearMade, String country, String color, int maxSpeed, String refill) {
//        super(brand, model, yearMade, country, color, maxSpeed, refill);
//    }
//
//    public void refil() {
//        System.out.println(getRefill());
//    }

