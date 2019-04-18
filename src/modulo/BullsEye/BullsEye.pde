 int size=175;
 void setup(){
   size(400,400);
  for (int i=0; i<=10;i++){
    if(i%2==0){
    fill (100,0,0);
}
  else{
    fill(255,255,255);
}
ellipse(200,200,size,size);
size-=20;
}
}
