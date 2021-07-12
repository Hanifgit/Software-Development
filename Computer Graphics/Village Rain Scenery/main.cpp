#include<windows.h>
#include<bits/stdc++.h>
#include<GL/glut.h>
#include<iostream>
#include<stdlib.h>
#include<stdio.h>

using namespace std;

float shift = 0; // a variable used to move the boat right and left

//Rain
void Timer(int iUnused)
{

    glutPostRedisplay();
    glutTimerFunc(60, Timer, 0);
}
void pp_rain(int x,int y)
{
    /*if((x<100 or x>300) or (y<400 or y>1000))
    {
    return;
    }*/
    //glColor3ub(56, 117, 163);
    glColor4f(1.0f, 1.0f, 1.0f, 0.0f);//white
    glBegin(GL_LINES);
    glVertex2i(x,y);
    glVertex2i(x+1,y);
    glEnd();
}
void make_rain()
{
    int x=(rand()*500)%1199;
    int y=(rand()*500)%849;
    pp_rain(x,y);
    pp_rain(-x,y);
    pp_rain(-x,y-50);
    pp_rain(x,y-100);
}

//Bresenham Line Drawing Algorithm
void both(int x, int y)
{
    glBegin(GL_POINTS);
    glVertex2i(x+shift,y+shift);
    glEnd();
    //glutSwapBuffers();
}
void bothMove(int x1,int y1,int x2,int y2)
{

    int m,dx,dy,x,y,t,p;
    if ((x2-x1)==0){
       m = (y2-y1);
    }
    else{
       m = (y2-y1)/(x2-x1);
    }

    if(abs(m)<1){
      if(x1>x2){
        t=x1;
        x1=x2;
        x2=t;

        t=y1;
        y1=y2;
        y2 =t;
    }

    dx=abs(x2-x1);
    dy=abs(y2-y1);

    p=2*dy-dx;

    x=x1;
    y=y1;

    while(x<=x2){
        both(x,y);
        x=x+1;
        if(p>=0){
            if (m<1){
              y=y+1;
            }
            else{
              y= y-1;
            }
            p=p+(2*dy)-(2*dx);
        }
        else{
            y=y;
            p=p+(2*dy);
        }
    }

    }

    if(abs(m)>=1){
      if(y1>y2){
        t=x1;
        x1=x2;
        x2=t;

        t=y1;
        y1=y2;
        y2 =t;
    }

    dx=abs(x2-x1);
    dy=abs(y2-y1);

    p=2*dx-dy;

    x=x1;
    y=y1;

    while(y<=y2)
    {
        both(x,y);
        y=y+1;
        if(p>=0){
         if (m>=1)
          x=x+1;
         else
          x= x-1;
          p=p+(2*dx)-(2*dy);
        }
        else{
            x=x;
            p=p+(2*dx);
        }
     }
    }
}
void pp(int x, int y)
{
    glBegin(GL_POINTS);
    glVertex2i(x,y);
    glEnd();
}
void print_point(int x1,int y1,int x2,int y2)
{

    int m,dx,dy,x,y,t,p;
    if ((x2-x1)==0){
       m = (y2-y1);
    }
    else{
       m = (y2-y1)/(x2-x1);
    }

    if(abs(m)<1){
      if(x1>x2){
        t=x1;
        x1=x2;
        x2=t;

        t=y1;
        y1=y2;
        y2 =t;
    }

    dx=abs(x2-x1);
    dy=abs(y2-y1);

    p=2*dy-dx;

    x=x1;
    y=y1;

    while(x<=x2){
        pp(x,y);
        x=x+1;
        if(p>=0){
            if (m<1){
              y=y+1;
            }
            else{
              y= y-1;
            }
            p=p+(2*dy)-(2*dx);
        }
        else{
            y=y;
            p=p+(2*dy);
        }
    }

    }

    if(abs(m)>=1){
      if(y1>y2){
        t=x1;
        x1=x2;
        x2=t;

        t=y1;
        y1=y2;
        y2 =t;
    }

    dx=abs(x2-x1);
    dy=abs(y2-y1);

    p=2*dx-dy;

    x=x1;
    y=y1;

    while(y<=y2)
    {
        pp(x,y);
        y=y+1;
        if(p>=0){
         if (m>=1)
          x=x+1;
         else
          x= x-1;
          p=p+(2*dx)-(2*dy);
        }
        else{
            x=x;
            p=p+(2*dx);
        }
     }
    }
}

//Mid Point Circle Algorithm
void Sun(int x,int y,int xc,int yc)
{
    pp(x+xc,y+yc); pp(y+xc,x+yc); pp(-y+xc,x+yc); pp(-x+xc,y+yc);
    pp(-x+xc,-y+yc);pp(-y+xc,-x+yc);pp(y+xc,-x+yc);pp(x+xc,-y+yc);
}

void Hill(int x,int y,int xc,int yc)
{
    pp(x+xc,y+yc);pp(-x+xc,y+yc);
}

void Circle(int Radius,int xc,int yc){

    int p0=1-Radius;
    int x=0;
    int y=Radius;
    if(Radius!=100)Sun(x,y,xc,yc);
    while(x<=y){
        x++;
        if(p0<=0){
            p0=p0+2*x+1;
        }
        else{
            y--;
            p0=p0+2*x-2*y+1;
        }
       if(Radius==100) Hill(x,y,xc,yc);
       else{
          Sun(x,y,xc,yc);
       }
    }
    glFlush();
}

// Koch curve Algorithm
void koch_pp(float kx,float ky,float kx1,float ky1,float kx2,float ky2,float kx3,float
ky3,float kx4,float ky4)
{
    glBegin(GL_POINTS);
    glVertex2f(kx1,ky1);
    glVertex2f(kx3,ky3);
    glVertex2f(kx,ky);
    glVertex2f(kx4,ky4);
    glVertex2f(kx2,ky2);
    glEnd();
}

void koch(float kx1,float ky1,float kx2,float ky2,int kn)
{

    float ang=60;
    ang=ang*3.14/180;
    float kx3=(2*kx1+kx2)/3;
    float ky3=(2*ky1+ky2)/3;
    float kx4=(kx1+2*kx2)/3;
    float ky4=(ky1+2*ky2)/3;
    float kx=kx3+(kx4-kx3)*0.5+(ky4-ky3)*0.8660;
    float ky=ky3-(kx4-kx3)*0.8660+(ky4-ky3)*0.5;

    if(kn>0)
    {
    koch(kx1,ky1,kx3,ky3,kn-1);
    koch(kx3,ky3,kx,ky,kn-1);
    koch(kx,ky,kx4,ky4,kn-1);
    koch(kx4,ky4,kx2,ky2,kn-1);
    }
    else
    {
    koch_pp(kx,ky,kx1,ky1,kx2,ky2,kx3,ky3,kx4,ky4);
    }
}

// Gasket Algorithm
void g_pp(float x,float y,float x1,float y1,float x2,float y2)
{
    glBegin(GL_TRIANGLES);
    glVertex2f(x,y);
    glVertex2f(x1,y1);
    glVertex2f(x2,y2);
    glEnd();
}

int S_gasket(float x1,float y1,float x2,float y2,float x3,float y3,int n)
{

    float x12,y12,x13,y13,x23,y23;
    if(n>0)
    {
    x12=(x1+x2)/2;

    y12=(y1+y2)/2;
    x13=(x1+x3)/2;
    y13=(y1+y3)/2;
    x23=(x2+x3)/2;
    y23=(y2+y3)/2;
    S_gasket(x1,y1,x12,y12,x13,y13,n-1);
    S_gasket(x12,y12,x2,y2,x23,y23,n-1);
    S_gasket(x13,y13,x23,y23,x3,y3,n-1);
    }
    else
    g_pp(x1,y1,x2,y2,x3,y3);

}

//C_curve Algorithm
void cpp( float x, float y,float x1,float y1)
{
    glBegin(GL_LINES);
    glVertex2f(x,y);
    glVertex2f(x1,y1);
    glEnd();
}

void C_curve (float cx, float cy, float clen, float calpha, int cn)
{
    if (cn > 0)
    {
    clen = clen/sqrt(2.0);
    C_curve(cx, cy, clen, (calpha + 45), (cn - 1));
    cx = cx + clen*cos(calpha + 45);

    cy = cy + clen*sin(calpha + 45);
    C_curve(cx, cy, clen, (calpha - 45), (cn - 1));
    }
    else
    cpp(cx, cy , (cx + clen*cos(calpha)), (cy + clen*sin(calpha)));
}

//Polygon
void make_polygon(float x1, float y1,float x2,float y2,float x3,float y3,float x4,float y4)
{
    glBegin(GL_POLYGON);
    glVertex2f(x1,y1);
    glVertex2f(x2,y2);
    glVertex2f(x3,y3);
    glVertex2f(x4,y4);
    glEnd();
}

// Tree
void HouseSideTree(){
     //
     glColor3ub(51, 204, 51);//green
     make_polygon(-40,800,-90,600,0,600,-40,800);
     S_gasket(-40,800,-90,600,0,600,4);
     //
     glColor3ub(114, 67, 54);
     make_polygon(-60,600,-60,350,-35,350,-35,600);
     print_point(-60,600,-60,350);
     print_point(-35,600,-35,350);

     /*----------------------------------*/

     //
     glColor3ub(51, 204, 51);//Green
     make_polygon(10,800,-20,610,60,610,10,800);
     S_gasket(10,800,-20,610,60,610,4);
     //
     glColor3ub(114, 67, 54);
     make_polygon(5,607,5,350,30,350,30,607);
     print_point(5,607,5,350);
     print_point(30,607,30,350);
}

void HouseUpponTree(){
     //
     glColor3ub(51, 204, 51);//Green
     make_polygon(300,830,280,760,320,760,300,830);
     S_gasket(300,830,280,760,320,760,4);
     //
     glColor3ub(114, 67, 54);
     make_polygon(290,760,290,750,300,750,300,760);
     print_point(290,760,290,750);
     print_point(300,760,300,750);

    /*----------------------------------*/
     //
     glColor3ub(51, 204, 51);//Green
     make_polygon(330,830,300,760,340,760,330,830);
     S_gasket(330,830,300,760,340,760,4);
     //
     glColor3ub(114, 67, 54);
     make_polygon(310,760,310,750,330,750,330,760);
     print_point(310,760,310,750);
     print_point(330,760,330,750);

}

void HillTree(){
    //
     glColor3f(0.0f, 1.0f, 0.0f);//Green
     S_gasket(-30,960,-50,920,-10,920,4);
     S_gasket(80,960,60,920,100,920,4);
     S_gasket(200,960,180,920,220,920,4);
     S_gasket(300,960,280,920,320,920,4);
     S_gasket(400,960,380,920,420,920,4);
     S_gasket(500,960,480,920,520,920,4);
     S_gasket(600,960,580,920,620,920,4);

     //
     glColor3ub(114, 67, 54);
     print_point(-35,920,-35,910);
     print_point(-30,920,-30,910);

     print_point(75,920,75,910);
     print_point(80,920,80,910);

     print_point(195,920,195,910);
     print_point(200,920,200,910);

     print_point(295,920,295,910);
     print_point(300,920,300,910);

     print_point(395,920,395,910);
     print_point(400,920,400,910);

     print_point(495,920,495,910);
     print_point(500,920,500,910);

     print_point(595,920,595,910);
     print_point(600,920,600,910);
}

void Tree(){
     /// Tree
     HouseSideTree();
     HouseUpponTree();
     HillTree();
}

//Garden
void Garden(){
    ///Garden
     glColor3f(0.0f, 1.0f, 0.0f);//Green
     C_curve( -50, 200, 30, 10, 10);
     C_curve( 10, 200, 30, 10, 10);
     C_curve( 80, 200, 30, 60, 10);
     C_curve( -50, 100, 30, 10, 10);
     C_curve( 10, 100, 30, 60, 10);
     C_curve( 80, 100, 30, 10, 10);
}

void Cloud(){
    /// cloud
    //glColor3ub(51, 204, 255);
    glColor3ub(255, 217, 255);
    koch(-100,985,000,985,5);
    koch(000,985,100,985,5);
    koch(100,985,200,985,5);
    koch(200,985,300,985,5);
    koch(300,985,400,985,5);
    koch(300,985,400,985,5);
    koch(400,985,500,985,5);
    koch(500,985,600,985,5);
    koch(600,985,700,985,5);
    koch(700,985,800,985,5);
    koch(800,985,900,985,5);
    koch(900,985,1000,985,5);
}

void House(){
    /// House

    //1
    glColor4f(1.0f, 0.5f, 0.0f, 0.0f);//orange/brown
    make_polygon(100,650,250,650,180,750,100,650);
    print_point(100,650,250,650);
    print_point(250,650,180,750);
    print_point(180,750,100,650);

    //2
    glColor3f(0.0f, 0.5f, 0.5f);//Blue-Green
    make_polygon(180,750,400,750,470,650,250,650);
    print_point(180,750,400,750);
    print_point(400,750,470,650);
    print_point(470,650,250,650);

    //3

    glColor3f(2.0f, 0.5f, 1.0f);//Lilac
    make_polygon(110,650,110,370,240,370,240,650);
    print_point(110,650,110,370);

    glColor3f(0.0f, 0.5f, 1.0f);//baby Blue
    make_polygon(240,650,240,370,460,370,460,650);
    print_point(240,650,240,370);
    print_point(460,650,460,370);

    glColor3f(0.1f, 0.1f, 0.1f);//Dark grey
    make_polygon(100,370,100,360,250,360,250,370);
    print_point(100,370,250,370);
    print_point(100,360,250,360);

    glColor3ub(114, 67, 54);
    make_polygon(470,370,470,360,250,360,250,370);
    print_point(470,370,250,370);
    print_point(470,360,250,360);
}

void Window(){
     /// Window
    glColor4f(1.0f, 0.5f, 0.0f, 0.0f);//orange/brown
    make_polygon(140,580,140,500,200,500,200,580);
    print_point(140,580,140,500);
    print_point(140,500,200,500);
    print_point(200,500,200,580);
    print_point(200,580,140,580);

    glColor3ub(114, 67, 54);
    print_point(170,580,170,500);
    print_point(140,540,200,540);
}

void Door(){
    /// Door
    glColor4f(1.0f, 1.0f, 0.0f, 0.0f);//yellow
    make_polygon(310,560,310,370,380,370,380,560);
    print_point(310,560,310,370);
    print_point(380,560,380,370);
    print_point(310,560,380,560);

    glColor3ub(114, 67, 54);
    print_point(345,560,345,370);
    print_point(310,480,380,480);
}

void Road(){
    /// Road
}

void River(){
    /// River
    glColor3ub(38, 154, 214);
    make_polygon(-100,870,-100,460,700,460,700,870);

    make_polygon(700,1000,600,815,1000,600,1000,1000);
    print_point(700,985,600,815);
    print_point(600,815,650,815);
    make_polygon(650,815,580,700,1000,700,1000,1000);
    print_point(650,815,580,700);
    print_point(580,700,650,700);
    make_polygon(650,700,580,600,1000,600,1000,1000);
    print_point(650,700,580,600);
    print_point(580,600,650,600);
    make_polygon(650,600,580,500,1000,500,1000,1000);
    print_point(650,600,580,500);
    print_point(580,500,650,500);
    make_polygon(650,500,580,400,1000,400,1000,1000);
    print_point(650,500,580,400);
    print_point(580,400,650,400);
    make_polygon(650,400,580,300,1000,300,1000,1000);
    print_point(650,400,580,300);
    print_point(580,300,650,300);
    make_polygon(650,300,650,300,1000,300,1000,1000);
    print_point(650,300,650,300);
    print_point(650,300,580,200);
    make_polygon(580,200,650,200,1000,650,1000,1000);
    print_point(580,200,650,200);
    print_point(650,200,580,100);
    make_polygon(580,100,650,100,1000,100,1000,1000);
    print_point(580,100,650,100);
    make_polygon(650,100,580,000,1000,000,1000,1000);
    print_point(650,100,580,000);
}

void Boat(){
    /// Boat 1

    glColor3ub(114, 67, 54);
    make_polygon(750,750,750,730,900,730,900,750);
    bothMove(750,750,900,750);
    bothMove(750,730,900,730);
    make_polygon(750,750,720,830,750,730,720,830);
    bothMove(750,750,720,830);
    bothMove(750,730,720,830);
    make_polygon(900,750,930,830,900,730,930,830);
    bothMove(900,750,930,830);
    bothMove(900,730,930,830);


    glColor3f(0.0f, 0.5f, 1.0f);//baby Blue
    make_polygon(770,750,775,800,865,800,870,750);
    bothMove(770,750,775,800);
    bothMove(870,750,865,800);
    bothMove(775,800,865,800);
    bothMove(770,775,865,775);

    //

    glColor3ub(204, 51, 0);
    make_polygon(800,855,800,920,835,920,835,855);
    bothMove(800,855,800,920);
    bothMove(800,855,835,855);
    bothMove(835,920,835,855);
    bothMove(800,920,835,920);

    glColor3ub(114, 67, 54);
    bothMove(815,750,815,920);
    bothMove(800,885,835,885);
    bothMove(900,820,930,630);

    /// Boat 2
    //glColor3f(0.0f, 0.5f, 0.5f);//Blue-Green

    glColor3ub(114, 67, 54);
    make_polygon(680,280,680,320,830,320,830,280);
    print_point(680,320,830,320);
    print_point(680,280,830,280);

    make_polygon(680,320,650,400,650,400,680,280);
    print_point(680,320,650,400);
    print_point(650,400,680,280);

    make_polygon(830,320,860,400,860,400,830,280);
    print_point(830,320,860,400);
    print_point(860,400,830,280);

    glColor3f(0.0f, 0.5f, 1.0f);//baby Blue
    make_polygon(700,320,705,400,805,400,810,320);
    print_point(700,320,705,400);
    print_point(810,320,805,400);
    print_point(705,400,805,400);
    print_point(705,370,805,370);
    print_point(750,320,750,400);

    glColor3ub(114, 67, 54);
    print_point(830,400,860,250);
}

void Hill(){
    /// Hill
    glColor3ub(114, 67, 54);
    print_point(-100,870,637,870);

    Circle(100,-50,810);
    Circle(100,70,810);
    Circle(100,190,810);
    Circle(100,290,810);
    Circle(100,390,810);
    Circle(100,490,810);
    Circle(100,585,810);
}

void Rain(){
    ///rain
    glLineWidth(6);
    for(int i=1; i<=300; i++)
    {
      make_rain();
    }
}

void Railing(){
    glColor3ub(204, 51, 0);

    //Railing 1
    print_point(-80,500,-80,400);
    print_point(-65,500,-65,400);
    print_point(-30,500,-30,400);
    print_point(-17,500,-17,400);
    print_point(0,500,0,400);
    print_point(40,500,40,400);
    print_point(60,500,60,400);
    print_point(80,500,80,400);
    print_point(100,500,100,400);

    print_point(-90,480,108,480);
    print_point(-90,460,108,460);
    print_point(-90,440,108,440);
    print_point(-90,420,108,420);

    //Railing 2
    print_point(470,500,470,400);
    print_point(490,500,490,400);
    print_point(510,500,510,400);
    print_point(520,500,520,400);
    print_point(540,500,540,400);
    print_point(560,500,560,400);
    print_point(580,500,580,400);

    print_point(462,480,585,480);
    print_point(462,460,585,460);
    print_point(462,440,585,440);
    print_point(462,420,585,420);

    //Railing 3
    print_point(-80,280,-80,180);
    print_point(-65,280,-65,180);
    print_point(-30,280,-30,180);
    print_point(-17,280,-17,180);
    print_point(0,280,0,180);
    print_point(40,280,40,180);
    print_point(60,280,60,180);
    print_point(80,280,80,180);
    print_point(100,280,100,180);

    print_point(-90,260,108,260);
    print_point(-90,240,108,240);
    print_point(-90,220,108,220);
    print_point(-90,200,108,200);
}

void display ()
{
     //g_pp(240,545,250,570,260,545);
     //cpp(240,545,250,570);

     glClear(GL_COLOR_BUFFER_BIT);

     Cloud();

     River();

     Railing();

     Tree();

     Garden();

     House();

     Window();

     Door();

     Road();

     Boat();

     Hill();

     Rain();

     //Sun
     glColor3ub(255, 204, 0);
     Circle(30,-78,975);

    glFlush();

}

void StartingText()
{
    //std::cout<<"Display 1 called"<<std::endl;
    char text[120];
    sprintf(text, "BEAUTY OF NATURE  BEAUTIFUL VILLAGE RAIN SCENARIO",5.00,8.00);
    glColor3f(0, 0, 0);
    glRasterPos2f( -20 , 12 );
    for(int i = 0; text[i] != '\0'; i++)
    {
        if(text[i]==' '  && text[i+1]==' ')
        {
            glutBitmapCharacter(GLUT_BITMAP_TIMES_ROMAN_24, text[i]);
            glRasterPos2f( -32 , 02 );
        }
        else glutBitmapCharacter(GLUT_BITMAP_TIMES_ROMAN_24, text[i]);
    }
    sprintf(text,"  PRESS G FOR VILLAGE RAIN SCENARIO VIEW",5.00,8.00);
    glColor3f(0, 0, 0);
    glRasterPos2f( -100 , 0 );
    for(int i = 0; text[i] != '\0'; i++)
    {
          if(text[i]==' '  && text[i+1]==' ')
        {
            glutBitmapCharacter(GLUT_BITMAP_TIMES_ROMAN_10, text[i]);
            glRasterPos2f( -30.5 , -10 );
        }
        else glutBitmapCharacter(GLUT_BITMAP_TIMES_ROMAN_10, text[i]);
    }
    sprintf(text,"  CREATED BY-",5.00,8.00);
    glColor3f(0, 0, 0);
    glRasterPos2f( -100 , 0 );
    for(int i = 0; text[i] != '\0'; i++)
    {
          if(text[i]==' '  && text[i+1]==' ')
        {
            glutBitmapCharacter(GLUT_BITMAP_TIMES_ROMAN_10, text[i]);
            glRasterPos2f( 18 , -25 );
        }
        else glutBitmapCharacter(GLUT_BITMAP_TIMES_ROMAN_10, text[i]);
    }
        sprintf(text,"  Rakibul Ahasan",5.00,8.00);
    glColor3f(0, 0, 0);
    glRasterPos2f( -100 , 0 );
    for(int i = 0; text[i] != '\0'; i++)
    {
          if(text[i]==' '  && text[i+1]==' ')
        {
            glutBitmapCharacter(GLUT_BITMAP_TIMES_ROMAN_10, text[i]);
            glRasterPos2f( 18 , -30 );
        }
        else glutBitmapCharacter(GLUT_BITMAP_TIMES_ROMAN_10, text[i]);
    }

}

void myintro(){
   // std::cout<<"Display 1 called"<<std::endl;
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
    glLoadIdentity();
    glTranslatef(0,0,-20);
    StartingText();
    glFlush();
    glutSwapBuffers();
}

void init(void)
{
    glClearColor(0.2f, 0.3f, 0.3f, 1.0f);
    glPointSize(2.5);
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluOrtho2D(-100,1000,0,1000);
}

void handleKeypress(unsigned char key, int x, int y) {
	switch (key) {
	    case  'G':
	        glutDestroyWindow(1);
	        glutInitWindowSize(1100,650);
            glutInitWindowPosition(90,65);
            glutCreateWindow("village scenario");
            glutKeyboardFunc(handleKeypress);
            glutDisplayFunc(display);
            //PlaySound(TEXT("bird-2.wav"), NULL, SND_ASYNC);
            break;
            break;

        case  'g':
            glutDestroyWindow(1);
	        glutInitWindowSize(1100,650);
            glutInitWindowPosition(90,65);
            glutCreateWindow("village scenario");
            glutDisplayFunc(display);
            glutKeyboardFunc(handleKeypress);
            //PlaySound(TEXT("bird-2.wav"), NULL, SND_ASYNC);
            break;
            break;
    }
}

void key(int key, int x, int y) {
	switch (key)
	{
	case GLUT_KEY_LEFT:
		shift--;
		glutPostRedisplay();
		break;
	case GLUT_KEY_RIGHT:
		shift++;
		glutPostRedisplay();
		break;


	}

}

int main (int argc, char **argv)
{
    glutInit(&argc, argv);
    glutInitDisplayMode (GLUT_SINGLE | GLUT_RGB);
    glutInitWindowSize(1100,650);
    glutInitWindowPosition(90,65);
    glutCreateWindow("village Rain scenery");
    init();
    //glutDisplayFunc(myintro);
    Timer(0);
    glutDisplayFunc(display);
    //glutKeyboardFunc(handleKeypress);
    //init();
    //glutSpecialFunc(key);
    glutMainLoop();
}
