package task1;

public class Runner {
    public static void main(String[] args) {
        Clients clients1 = new Clients("Вася Пупкин", "AB348789812",
                "РБ , г. Минск , ул. Веры Хоружей, д. 15");
        Card card1 = new Card("BelCard","1234 8776 7667 3465",789, 123);
        Card card2 = new Card("BelCard","1234 8776 7667 3465",789, 123);
        Card card3 = new Card("MasterCard","1234 3456 1234 0875",435, 2344);
        Card card4 = new Card("MasterCard","3242 2345 2342 1321",654, 21367765);
        Card card5 = new Card("VisaCard","1237 3434 3421 3789",978, 324454645);
        Card card6 = new Card("VisaCard","1005 3256 7667 2423",123, 2452353);

        System.out.println(clients1.toString());
        System.out.println();
        String [] arr = new String[]{card1.toString(),card2.toString(),card3.toString(),card4.toString(),
                card5.toString(),card6.toString()};
       for(String st: arr){
           System.out.println(st);
       }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println("Карты совпадают: \n " + arr[i] + "\n" + arr[j]);
                }
            }
        }

    }


}
