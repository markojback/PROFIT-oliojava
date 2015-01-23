package markob;

    public class Laskin {
        
        /**
         * Summaa kaksi lukua
         * @param a ensimmäinen luku
         * @param b toinen luku
         * @param c kolmas luku
         * @return lukujen summa
         */
        public int summaa (int a, int b, int c){
            return a + b + c;
        }
        
        /**
         * Nollaa taulukon alkiot
         * 
         * Indeksi: 0 1 2
         * Taulu:   4 6 8
         * 
         * Nollauksen jälkeen
         * Indeksi: 0 1 2
         * Taulu:   0 0 0
         * @param taulu taulukko, jonka alkiot nollataan
         */
        public void nollaaTaulu (int [] taulu) {
            int pituus=taulu.length;
            for (int i=0;i<pituus;i++){
                taulu[i]=0;
            }

        }
        
        public int etsipienin (int [] taulu){
            int i = 0;
            int pienin = taulu [i];
            int pituus = taulu.length;
            
            for (i=1;i<pituus;i++){
                if (taulu [i] < taulu [i-1]){
                    pienin=taulu[i];
                }
             }
            return pienin;
            
        }
        
    /**
     * Pääohjelma
     * @param args
     */
        public static void main(String[] args) {
            Laskin laskin = new Laskin();
            
            //summaa metodi
            int summa = laskin.summaa(4,6,5);
            System.out.println(summa);
            
            
            //Uuden taulukon alustaminen arvoilla
            int  taulu [] = {8,5,6,8,4,3,6,2,5,9,7,6,1};
            System.out.println(laskin.summaa(taulu[0], taulu[1], taulu [2]));

            //Mitä tarkoittaa käytännössä, että taulukko on olioviite? Toteuta metodi ja pohdi
            int pituus=taulu.length;
            for (int i=0;i<pituus;i++){
                System.out.print(taulu[i]);
            }
            
            int pienin = laskin.etsipienin(taulu);
            System.out.print("\nPienin numero taulussa on " + pienin);
            System.out.print("\n");
            laskin.nollaaTaulu(taulu);
            
            for (int j=0;j<pituus;j++){
                System.out.print(taulu[j]);
            }

            
            
        }

    }
