public class UsingObjectsEx7
{
    public static void main(String[] args){
        DrinksMachine one = new DrinksMachine(50,10,10);
        returnNo(one);
        //System.out.println();
    }
    public static int returnNo(DrinksMachine one){
        int price = one.getPrice();//price = 50
        one.setPrice(0);//setprice = 0
        int count = 0;
        while(!one.cokesEmpty()){//while cokes are not empty
            one.pressCoke();//press a can of coke
            count++;//keep doing it tell they are empty
        }
        for(int i=0;i<count;i++){
            one.loadCoke(new Can("coke"));//load cans of coke into machine one, 'count' many times
        }
        //System.out.println(one.getPrice());
        one.setPrice(price);//set the price to the orginal price, 50 (it was 0)
        //System.out.println(one.getPrice());
        //System.out.println(count);
        return count;//return count which is 10
    }
}
