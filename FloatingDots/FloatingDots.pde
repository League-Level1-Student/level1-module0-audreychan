float x = 0;
float y = 0;
int numOfParticles = 0;

//float r = 0;
//float g = 0;
//float b = 0;

void setup(){
  size(600, 600);
}

void draw(){
  background(0);
  fill(#88CDFA);
  noStroke();
  
  //makeMagical();
  if(mousePressed){
    numOfParticles ++;
  }
  for(int i = 5; i < numOfParticles; i++){
    //r = random(25);
    //g = random(100);
    //b = random(255);
    fill(0, i - 25, i);
    
    x = getWormX(i);
    y = getWormY(i);
    ellipse(x, y, 20, 20);
  }
}

float frequency = .005;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}