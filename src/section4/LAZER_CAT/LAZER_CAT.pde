



PImage catPic;
int x=450;
int y=211;
int a=313;
int s=220;
 void setup(){
   size(700,368);
catPic = loadImage("Notourious B.I.G.jpg");

catPic.resize(width, height);
background(catPic);

 }

void draw(){
  if(mousePressed){

println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
noStroke();
fill(70,255,255);
ellipse(x,y, 60,60);
ellipse(313,220,60,60);
}
void keyPressed() {
  x++;
  y++;
  a++;
  s++;
  if(x>368);
  
}