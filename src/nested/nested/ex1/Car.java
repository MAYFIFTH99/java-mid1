package nested.nested.ex1;

public class Car {
    private String model;
    private int chargeLevel;
    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
    }
    public int getChargeLevel() {
        return chargeLevel;
    }
    public String getModel() {
        return model;
    }
    public void start() {
        System.out.println(model + " 시작 완료");
    }
    public class Engine {
        private Car car;

        public Engine(Car car) {
            this.car = car;
        }

        public void start() {
            System.out.println("충전 레벨 확인 : " + car.getChargeLevel());
            System.out.println(car.getModel() + "의 엔진을 구동합니다.");

        }
    }
}

