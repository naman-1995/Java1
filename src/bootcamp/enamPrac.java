package bootcamp;


    enum product {

        villa(9),flat(2),bunglow(50),floor(5),club(80);
        private int price;
        product(int p) {
            price = p;
        }

        int getPrice() {
            return price;
        }
    }

    public class enamPrac {
        public static void main(String args[]){
            System.out.println("All product prices:");
            for (product c : product.values()) System.out.println(
                    c + " costs " + c.getPrice() + " crores.");
        }
    }

