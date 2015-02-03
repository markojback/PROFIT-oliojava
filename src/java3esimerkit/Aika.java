package java3esimerkit;
/**
 * Aikojen esitt�miseen soveltuva luokka. Aika esitet��n tunteina, 
 * minuutteina ja sekunteina. Luokka on suunniteltu arvokeskeiseksi eli
 * olion tilaa ei voi muuttaa olion luomisen j�lkeen.
 * 
 * Metodien ja rakentajan parametreissa oletetaan, ett� parametrien arvot
 * eiv�t ole negatiivisia. Minuutit ja sekunnit voivat olla suurempia kuin
 * 59. T�ll�in lis�t��n tarvittaessa tunteja ja minuutteja, jotta ajalle
 * p�tee 0 &lt;= sekunnit, minuutit &lt;= 59. Esimerkiksi 
 * 
 * new Aika(0,0,120).getMinuutit() palauttaa 2.   
 * 
 * @author Mika Vesterholm
 */
public class Aika {
  private final int tunnit, minuutit, sekunnit;
  
  /**
   * Muodostaa Aika olion, joka on alustettu annetuilla tunneilla,
   * minuuteilla ja sekunneilla. Normalisoi sekunnit ja minuutit 
   * kasvattaen tarvittaessa tunteja ja minuutteja.
   * @param t tunnit, ei saa olla negatiivinen
   * @param m minuutit, ei saa olla negatiivinen
   * @param s sekunnit, ei saa olla negatiivinen
   */
  public Aika(int t, int m, int s) {
    sekunnit = s % 60;
    m = m + s / 60;
    minuutit = m % 60;
    tunnit = t + m / 60;
  }

  /**
   * Palauttaa ajan esitt�m�t tunnit.
   * @return ajan esitt�m�t tunnit
   */
  public int getTunnit()   { return tunnit; }

  /**
   * Palauttaa ajan esitt�m�t minuutit.
   * @return ajan esitt�m�t minuutit
   */
  public int getMinuutit() { return minuutit; }

  /**
   * Palauttaa ajan esitt�m�t sekunnit.
   * @return ajan esitt�m�t sekunnit
   */
  public int getSekunnit() { return sekunnit; }
  
  /**
   * Palauttaa ajan sekunteina.
   * @return aika sekunteina.
   */
  public long sekunteina() {
    return sekunnit + 60 * minuutit + 3600L * tunnit;
  }

  /**
   * Palauttaa ajan tunteina desimaaliosa kuvaa minuutit ja sekunnit.
   * @return aika tunteina.
   */
  public double tunteina() {
    return tunnit + (minuutit * 60 + sekunnit) / 3600.0 ;
  }
    
  /**
   * Palauttaa ajan merkkijonona muodossa tunnit:minuutit:sekunnit.
   * @return merkkijono, jonka muoto on tunnit:minuutit:sekunnit
   */
  public String toString() { 
    return "" + tunnit + ":"  + minuutit + ":" + sekunnit; 
  }
  
  /**
   * Palauttaa ajan, jossa t�h�n aikaan on lis�tty t tuntia. Vastaa kutsua
   * lis��(t, 0, 0).
   * @see lis��(int,int,int)
   * @param t lis�tt�v�t tunnit.
   */
  public Aika lis��Tunteja(final int t) { return lis��(t, 0, 0); }
  /**
   * Palauttaa ajan, jossa t�h�n aikaan on lis�tty m minuuttia. Vastaa 
   * kutsua lis��(0, m, 0).
   * @see lis��(int,int,int)
   * @param m lis�tt�v�t minuutit.
   */
  public Aika lis��Minuutteja(final int m) { return lis��(0, m, 0); }
  /**
   * Palauttaa ajan, jossa t�h�n aikaan on lis�tty s sekuntia. Vastaa 
   * kutsua lis��(0, 0, s).
   * @see lis��(int,int,int)
   * @param s lis�tt�v�t sekunnit.
   */
  public Aika lis��Sekunteja(final int s) { return lis��(0, 0, s); }

  /**
   * Palauttaa ajan, jossa t�h�n aikaan on lis�tty ajan a esitt�m� aika.
   * @param a lis�tt�v� aika, ei saa olla null
   * @return t�m�n ajan ja ajan a summan.
   */
  public Aika lis��(final Aika a) {
    return lis��(a.getTunnit(), a.getMinuutit(), a.getSekunnit());
  }

  /**
   * Palauttaa Aika olion, jossa t�h�n aikaan on lis�tty annettu m��r� 
   * tunteja, minuutteja ja sekunteja. 
   * @param t lis�tt�v�t tunnit, ei saa olla negatiivinen.
   * @param m lis�tt�v�t minuutit, ei saa olla negatiivinen.
   * @param s lis�tt�v�t sekunnit, ei saa olla negatiivinen.
   * @return ajan, jossa t�h�n aikaan on lis�tty parametrina annettu m��r�
   *         tunteja, minuutteja ja sekunteja.
   */
  public Aika lis��(final int t, final int m, final int s) {
    return new Aika(tunnit + t, minuutit + m, sekunnit + s);
  }
}
