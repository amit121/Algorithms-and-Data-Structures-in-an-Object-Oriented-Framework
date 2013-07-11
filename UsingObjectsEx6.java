public static void evenPrices(DrinksMachine m1,DrinksMachine m2)
{
  int price1=m1.getPrice(), price2=m2.getPrice();
  if(price1<price2)
     m1.setPrice(price2);
  else
     m2.setPrice(price1);
}
