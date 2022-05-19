static chars character;

void setup(){
  size(1000, 800);
  character = new chars();
  
}

void draw(){
  background(255);
  fill(0);
  rect(0, height - height / 4.0, width, height / 4.0);
  character.move();
  character.display();
}

void mouseClicked(){
  if(character.y == height - (height / 4.0) - character.sideL) character.jump();
}
