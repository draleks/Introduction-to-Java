public class CarLogic {
    public void refuel(Car car, int fuel) {
        car.setFuel(car.getFuel() + fuel);
    }

    public void carMove(Car car) {
        if (car.getFuel() == 0) {
            System.out.println("refuel car");
        } else {
            car.getEngine().setIsStart(true);
            for (Wheel wheel : car.getListOfWheels()
            ) {
                wheel.setRotation(true);
            }
            System.out.println("Car move");
        }

    }

    public void carStop(Car car) {
        if (car.getEngine().getIsStart()) {
            for (Wheel wheel : car.getListOfWheels()
            ) {
                wheel.setRotation(false);
            }
            car.getEngine().setIsStart(false);
            System.out.println("Car stop");
        } else {
            System.out.println("Car is not moving");
        }

    }

    public void changeWheel(Car car, String nameOldWheel, Wheel newWheel) {
        if (car.getEngine().getIsStart()) {
            this.carStop(car);
        }
        for (Wheel wheel : car.getListOfWheels()) {
            if (wheel.getName().equals(nameOldWheel)) {
                wheel = newWheel;
                System.out.println("The wheel have changed");
            }
        }

    }
    public void viewCarModel(Car car){
        System.out.println("Model "+car.getModel());
    }
}
