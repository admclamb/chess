package chess;
import java.util.HashMap;
class Notation {
  HashMap<String, String> map; 

  public Notation() {
    map = new HashMap<String, String>();
  }

  public String getPiece() {
    return map.get("piece");
  }

  public void setPiece(String piece) {
    map.put("piece", piece);
  }

  public String getSpecificity() {
    return map.get("specificity");
  }

  public void setSpecificity(String specificity) {
    map.put("specificity", specificity);
  }

  public String getDestination() {
    return map.get("destination");
  }

  public void setDestination(String destination) {
    map.put("destination", destination);
  }
}