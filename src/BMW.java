public class BMW extends Car{
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public BMW(double volume, Motor motor, Colour colour, int speed) {
        super(volume, motor, colour);
        this.speed = speed;
    }
    public  void metod(){
        System.out.println("This is BMW");
    }
    final public  void metod(int speed){
        System.out.println("This BMW speed" + speed);// перегрузка метода
    }
    @Override
    public String printifo(){
        return super.printifo() + "\nspeed" + speed;// перезапись метода
    }
}
