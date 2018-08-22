PImage pictureOfRecord;

void setup(){
  size(500,500);
  pictureOfRecord = loadImage("record.png");
}

void draw(){
  image(pictureOfRecord, 0, 0);
}

void rotateImage(PImage image, int amountToRotate){
  translate(width/2, height/2);
  
}

//http://level1.jointheleague.org/Mod0Recipes/SpinningRecord.html