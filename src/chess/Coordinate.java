package chess;

import java.util.HashMap;
import java.util.Map;
public class Coordinate {
  int x;
  int y;
  public Coordinate(int x, int y) {
    this.x=x;
    this.y=y;
  }

  public Map<String, Integer> getCoords() {
    Map<String, Integer> coords = new HashMap<String, Integer>();
    coords.put("x", x);
    coords.put("y", y);
    return coords;
  }
  
}
