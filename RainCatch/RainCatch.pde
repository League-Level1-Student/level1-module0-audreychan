int y = -10;
float x = 250;
int score = 0;

void setup(){
  size(500, 500);
}

void draw(){
  background(#D3DFE8);
  fill(#4CADFA);
  noStroke();
  ellipse(x, y, 15, 15);
  
  fill(#BFBFBF);
  rect(mouseX, height - 50, 35, 50);
  
  y += 4;
  if(y >= height){
    y = -10;
    checkCatch();
    x = random(width);
  }
  
  fill(0);
  textSize(16);
  text("Score: " + score, 20, 20);
  
  if(score == 10){
    y = -10;
    textSize(40);
    text("You win!", 20, 250);
  }
}

void checkCatch(){
  println(x);
  if(x > mouseX && x < mouseX + 35){
    score ++;
    println("Score");
  }
  else if(score > 0){
    score --;
  }
}