public class Currency {
    static void getEUR(int d){
        System.out.println(d*0.85);
    }
    public void getGBP(int d){
        System.out.println(d*0.76);
    }
    public static void main(String[] args) {
        getEUR(7);
        Currency pound = new Currency();
        pound.getGBP(7);

    }
}