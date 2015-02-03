package java3esimerkit;
//Attribuuttien m��rittlely

//Tuodaan java.awt-pakkauksesta luokka Color k�ytt��n.
import java.awt.Color;

/**
 * Esimerkki attribuuttien m��rittelyst�.
 * @author Mika Vesterholm.
 */
public class VarillinenYmpyra {
  /**
   * Vakio OLETUSS�DE, jonka arvoksi asetetaan 10. Oletuss�dett� ei voi 
   * muuttaa, koska muuttuja on lopullinen.
   */
  public static final int OLETUSS�DE = 10;

  /** Keskipisteen x- ja y-koordinaatit. */
  private int x, y;

  /** S�de, jonka arvoksi sijoitetaan oletuss�teen arvo. */
  private int s�de = OLETUSS�DE;

  /** 
   * Kuvion v�ri - viite Color-luokan olioon. Alustetaan viittamaan samaan      
   * olioon, johon Color-luokassa m��ritelty luokkakohtainen vakioarvoinen 
   * muuttuja RED viittaa. 
   */
  private Color v�ri = Color.RED;
}
