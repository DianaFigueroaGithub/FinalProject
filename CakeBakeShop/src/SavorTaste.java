public class SavorTaste {

    public static void main(String[] args){
        Cake cake = new Cake();
        cake.setPrice(400);
        System.out.println("**BASCI Cake Section**");
        System.out.println(" Basic Flavor Cake: "+cake.getFlavor());
        System.out.println(" This is the price for that Basic cake: $"+ cake.getPrice());

        System.out.println( "\n" + "**BirthDay Cake Section**");
        BirthDayCake bdhCake = new BirthDayCake();
        bdhCake.setCandles(6);
        bdhCake.setPrice(655.5);
        System.out.println(" BIRTHDAY Flavor cake: " + bdhCake.getFlavor());
        System.out.println(" Candles Quantity in the cake : " + bdhCake.getCandles());
        System.out.println(" This is the price for that BirthDay cake: " + "$" + bdhCake.getPrice());

        System.out.println("\n"+ "**WEEDING Cake Section**");
        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setPrice((long) 1500.5);
        weddingCake.setFlavor("Piña Colada");
        weddingCake.setLevels(4);
        System.out.println(" Weeding Flavor Cake: " + weddingCake.getFlavor());
        System.out.println(" Levels that form the cake: " + weddingCake.getLevels());
        System.out.println(" This is the price for that Weeding cake: " + "$" + weddingCake.getPrice());
    }
}
