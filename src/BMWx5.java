final public class BMWx5 extends BMW{
    private int horse;

    public int getHorse() {
        return horse;
    }

    public BMWx5(double volume, Motor motor, Colour colour, int speed, int horse) {
        super(volume, motor, colour, speed);
        this.horse = horse;
    }
    @Override
    public  void metod(){
        System.out.println("This is BMW x5");// наследуем от родителя

    }
    @Override
    public String printifo(){
        return super.printifo() + "\nhorse power" + horse;
    }
}

