public class chars{
  int side;
  boolean dead;
  float x, y;
  float dx, dy;
  color c;
  boolean jump;
  float sideL;
  
  
  public chars(){
    side = 0;
    dead = true;
    sideL = 30;
    //x = width / 4.0;
    x = 0;
    y = (height - height / 4.0) - sideL;
    dx = 7.5;
    dy = 0;
  }
  
  void move(){
    x += dx;
    y += dy;
    if(y != height - (height / 4.0) - sideL){
      dy += 3.5;
    }
    else{
      dy = 0;
    }
  }
  
  void jump(){
    side++;
    dy -= 35;
  }
  
  void display(){
    fill(100, 140, 220);
    rect(x, y, sideL, sideL);
  }
}
