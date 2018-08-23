import ddf.minim.*;

PImage pictureOfRecord;
int imageAngle = 0;
Minim minim;
AudioPlayer song;

void setup(){
  size(500,500);
  pictureOfRecord = loadImage("record.png");
  minim = new Minim(this);
  song = minim.loadFile("YouSpinMeRound.mp3", 512);
}

void draw(){
  rotateImage(pictureOfRecord, imageAngle);
  image(pictureOfRecord, 0, 0);
  if(mousePressed){
    imageAngle ++;
    song.play();
  }
  else if(mousePressed == false){
    song.pause();
  }
}

void rotateImage(PImage image, int amountToRotate){
  translate(width/2, height/2);
  rotate(amountToRotate*TWO_PI/360);
  translate(-image.width/2, -image.height/2);
}