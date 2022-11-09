public class Main {
    public static void main(String[]args){

        BMW bmw = new BMW(3.5,new Motor(4),Colour.PINK,200);
        BMWx5 bmwx5 = new BMWx5(5.5, new Motor(6),Colour.BLUE,250,500);
        BMWx5 bmwx520 = new BMWx5(5.0, new Motor(8),Colour.YELLOW,300,400);
        System.out.println(bmw.printifo());
        bmw.metod();
        bmw.metod(80);
        System.out.println(bmwx5.printifo());
        bmwx5.metod();
        System.out.println(bmwx520.printifo());
        bmwx520.metod();
    }
}