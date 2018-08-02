import ddf.minim.*;
Minim minim;
AudioSample blip;
AudioSample score;
AudioPlayer music;


int x = 400;
int y = 300;
int xspeed = 4;
int yspeed = 4;
int pspeed = 7;
int pry = 300;
int ply = 300;
int rscore = 0;
int lscore = 0;

boolean leftUp = false;
boolean leftDown = false;
boolean rightUp = false;
boolean rightDown = false;

void setup(){
  size(800, 600);
  minim = new Minim(this);
  blip = minim.loadSample("PongBlip.wav", 128);
  score = minim.loadSample("PongScore.wav", 128);
  music = minim.loadFile("Music.mp3", 64);
  music.loop();
}

void draw(){
  background(0);
  fill(255);
  noStroke();

  //ball and paddles
  objects();
  
  //score
  score();
  
  //end game
  endGame();
  
  //paddle collision
  paddleBounce();
  
  //controls
  controls();
}

void objects(){
  ellipse(x, y, 15, 15);
  rect(width - 10, pry, 10, 70);
  rect(0, ply, 10, 70);
  x += xspeed;
  y += yspeed;
  if(ply <= 5){
    ply = 5;
  }
  if(ply >= 525){
    ply = 525;
  }
  if(pry <= 5){
    pry = 5;
  }
  if(pry >= 525){
    pry = 525;
  }
}

void score(){
  if(x <= 8){
    rscore ++;
    x = 400;
    y = 300;
    score.trigger();
  }
  if(x >= 792){
    lscore ++;
    x = 400;
    y = 300;
    score.trigger();
  }
  textSize(32);
  text("SCORE", 5, 25);
  textSize(20);
  text(lscore + " : " + rscore, 5, 47);
}

void endGame(){
  textSize(100);
  if(rscore == 5){
    textAlign(CENTER, CENTER);
    background(#711B06);
    text("RIGHT WINS!", 400, 300);
    xspeed = 0;
    yspeed = 0;
  }
  if(lscore == 5){
    textAlign(CENTER, CENTER);
    background(#711B06);
    text("LEFT WINS!", 400, 300);
    xspeed = 0;
    yspeed = 0;
  }
}

void paddleBounce(){
  if(x <= 18 && y <= ply + 70 && y >= ply){
    xspeed = -xspeed;
    blip.trigger();
  }
  if(x >= 782 && y <= pry + 70 && y >= pry){
    xspeed = -xspeed;
    blip.trigger();
  }
  if(y >= 575 || y <= 15){
    yspeed = -yspeed;
  }
}

void controls(){
  if(leftUp){
    ply -= pspeed;
  }
  if(leftDown){
    ply += pspeed;
  }
  if(rightUp){
    pry -= pspeed;
  }
  if(rightDown){
    pry += pspeed;
  }
}

void keyPressed(){
  if(keyCode == 'A'){
    leftUp = true;
  }
  if(keyCode == 'Z'){
    leftDown = true;
  }
  if(keyCode == 'K'){
    rightUp = true;
  }
  if(keyCode == 'M'){
    rightDown = true;
  }
}

void keyReleased(){
    if(keyCode == 'A'){
    leftUp = false;
  }
  if(keyCode == 'Z'){
    leftDown = false;
  }
  if(keyCode == 'K'){
    rightUp = false;
  }
  if(keyCode == 'M'){
    rightDown = false;
  }
}