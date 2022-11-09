public  class Car {
    private double volume;
    private Motor motor;
    private Colour colour;

    public double getVolume() {
        return volume;
    }

    public Motor getMotor() {
        return motor;
    }

    public Colour getColour() {
        return colour;

    }

    public Car(double volume, Motor motor, Colour colour) {
        this.volume = volume;
        this.motor = motor;
        this.colour = colour;
    }
    public String printifo(){
        return "volume" + volume + "\nmotor" + motor.getCilindr() + "\ncolour" + colour;
    }

}
