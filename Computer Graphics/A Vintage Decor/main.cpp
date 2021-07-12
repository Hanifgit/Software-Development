#include<windows.h>
#include<bits/stdc++.h>
#include<GL/glut.h>
#include<iostream>
#include<stdlib.h>
#include<stdio.h>

using namespace std;

int pntX1=130, pntY1=820, r= 15, kn, cn, cc1=110, cc2=167, cc3=200;

float a, b, c,d,e,f,g,kx1,kx2,ky1,ky2,cx, cy,clen,calpha,ccx=0.1,ccy=0.2,ccz=0.3;

int xx1[75]=
{/*window*/100,100,100,300,100,60,60,75,50,0,0,300,340,340,325,348,0,0/*table*/,400,400,425,800,410,790,440,760/*pc
stand*/,620,630,575/*monitor*/,525,525,525,725/*keyb*/,545,545,565,680/*rd
track*/,110,150,190,230,270,250/*vase*/,435,470,435,435,450,455/*dash*/,625,650,650,650/*tree*/,250,275,120,150,0/*sun

ray*/,125,155,145/*monitorborder*/,522,522,522,729/*tool*/,550,550,565,635,550,650,565,635},
yy1[75]=
{/*window*/400,400,850,400,400,390,870,398,630,0,0,400,390,870,398,630,0,0/*table*
/,250,250,300,250,0,0,40,40/*pc
stand*/,295,295,295/*monitor*/,330,330,470,470/*keyb*/,260,260,280,280/*rd
track*/,450,450,450,450,450,700/*vase*/,295,295,295,400,400,400/*dash*/,350,425,400,375/*tree*/,500,500,500,500,00/*sun
ray*/,795,820,800/*monitorborder*/,325,325,475,475/*tool*/,150,150,175,175,0,0,20,
20},
xx2[75]=
{/*window*/300,100,300,300,60,60,100,75,100,0,0,340,340,300,325,300,0,0/*table*/,800,425,775,775,410,790,440,760/*pc
stand*/,620,630,675/*monitor*/,725,525,725,725/*keyb*/,700,565,680,700/*rd
track*/,130,170,210,250,290,300/*vase*/,435,470,470,470,435,465/*dash*/,625,700,700,700/*tree*/,250,275,120,150,0/*sun
ray*/,125,175,160/*monitorborder*/,729,522,729,729/*tool*/,650,565,635,650,550,650,565,635},
yy2[75]=
{/*window*/400,850,850,850,390,870,850,855,625,0,0,390,870,850,855,625,0,0/*table*
/,250,300,300,300,250,250,250,250/*pc
stand*/,330,330,295/*monitor*/,330,470,470,330/*keyb*/,260,280,280,260/*rd
track*/,450,450,450,450,450,600/*vase*/,400,400,295,400,500,580/*dash*/,450,425,400,375/*tree*/,550,580,570,590,0/*sun
ray*/,765,820,780/*monitorborder*/,325,475,475,325/*tool*/,150,175,175,150,150,150,150,150};

void init(void)
{
    glClearColor(0.90, 0.95, 0.71,0.7);
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluOrtho2D(-100,1000,0,1000);
}

void Timer(int iUnused)
{

    glutPostRedisplay();
    glutTimerFunc(60, Timer, 0);
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

void cir_pp(int xc, int yc)
{
    glBegin(GL_POINTS);

    glVertex2i(xc+pntX1, yc+pntY1);
    glEnd();
}

void circle()
{
    int xc = 0;
    int yc = r;
    float pc = 5/4 - 10;
    cir_pp(xc, yc);

    while (yc > xc)
    {
    if (pc < 0)
    {
    xc++;
    yc=yc;
    pc = pc+2*xc+1;
    }
    else
    {
    yc--;
    xc++;
    pc = pc+2*(xc-yc)+1;
    }
    cir_pp(xc, yc);
    cir_pp(xc, -yc);
    cir_pp(-xc, yc);
    cir_pp(-xc, -yc);

    cir_pp(yc, xc);
    cir_pp(-yc, xc);
    cir_pp(yc, -xc);
    cir_pp(-yc, -xc);
    }
}

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

void make_polygon(float x1, float y1,float x2,float y2,float x3,float y3,float x4,float y4)
{
    glBegin(GL_POLYGON);
    glVertex2f(x1,y1);
    glVertex2f(x2,y2);
    glVertex2f(x3,y3);
    glVertex2f(x4,y4);
    glEnd();
}

void pp_rain(int x,int y)
{
    /*if((x<100 or x>300) or (y<400 or y>1000))
    {
    return;
    }*/
    glColor3ub(56, 117, 163);
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

void display ()
{

    glClear(GL_COLOR_BUFFER_BIT);

    /*
    /// House
    glColor3ub(114, 67, 54);

    //1
    print_point(100,650,250,650);
    print_point(250,650,180,750);
    print_point(180,750,100,650);

    //2
    print_point(180,750,400,750);
    print_point(400,750,470,650);
    print_point(470,650,250,650);

    //3
    print_point(110,650,110,370);
    print_point(240,650,240,370);
    print_point(460,650,460,370);

    print_point(100,370,250,370);
    print_point(470,370,250,370);
    print_point(100,360,250,360);
    print_point(470,360,250,360);

    /// Window


    //rain
    glLineWidth(6);
    for(int i=1; i<=300; i++)
    {
      make_rain();
    }
*/
    glColor3ub(197, 227, 249);
    make_polygon(100,500,100,625,300,625,300,500);

    //sky
    glColor3ub(169, 213, 246);
    make_polygon(100,500,100,850,300,850,300,500);

    //road
    glColor3ub(107, 107, 107);
    make_polygon(100,400,100,500,300,500,300,400);

    //road track
    glPointSize(2.5);
    glColor3ub(255,255,255);//6

    print_point(xx1[37],yy1[37],xx2[37],yy2[37]);
    print_point(xx1[38],yy1[38],xx2[38],yy2[38]);
    print_point(xx1[39],yy1[39],xx2[39],yy2[39]);
    print_point(xx1[40],yy1[40],xx2[40],yy2[40]);
    print_point(xx1[41],yy1[41],xx2[41],yy2[41]);
    // print_point(xx1[42],yy1[42],xx2[42],yy2[42]);

    //sun
    glColor3ub(209, 81, 47);
    glPointSize(1.5);
    circle();

    //sun lite
    glColor3ub(209, 81, 47);//3
    print_point(xx1[58],yy1[58],xx2[58],yy2[58]);
    print_point(xx1[59],yy1[59],xx2[59],yy2[59]);
    print_point(xx1[60],yy1[60],xx2[60],yy2[60]);

    //cloud
    //glColor3ub(110, 167, 200);
    glColor3ub(cc1,cc2,cc3);
    g_pp(550,375,575,420,600,375);
    cc1=cc1+145,cc2=cc2+88,cc3=cc3+55;
    if(cc1>255)cc1=110;
    if(cc2>255)cc2=167;
    if(cc3>255)cc3=200;
    glPointSize(1.5);
    koch(100,800,300,800,10);

    //hill
    glColor3ub(147, 147, 147);
    g_pp(180,500,230,730,270,500);
    glColor3ub(110, 151, 174);
    g_pp(140,500,170,690,210,500);
    glColor3ub(60, 95, 118);
    g_pp(100,500,120,640,160,500);
    glColor3ub(60, 95, 118);
    g_pp(250,500,280,620,300,500);

    //tree
    glColor3ub(114, 67, 54);//5
    print_point(xx1[53],yy1[53],xx2[53],yy2[53]);
    print_point(xx1[54],yy1[54],xx2[54],yy2[54]);
    print_point(xx1[55],yy1[55],xx2[55],yy2[55]);
    print_point(xx1[56],yy1[56],xx2[56],yy2[56]);
    print_point(xx1[57],yy1[57],xx2[57],yy2[57]);
    glColor3ub(33, 57, 27);
    g_pp(240,545,250,570,260,545);
    g_pp(235,520,250,560,265,520);

    g_pp(265,560,275,590,285,560);
    g_pp(260,530,275,570,290,530);

    g_pp(110,550,120,580,130,550);
    g_pp(105,525,120,555,135,525);

    g_pp(140,570,150,600,160,570);
    g_pp(135,550,150,580,165,550);

    g_pp(130,520,150,560,170,520);

    //window
    glColor3ub(64, 64, 64);
    glPointSize(4.5);
    print_point(xx1[0],yy1[0],xx2[0],yy2[0]);
    print_point(xx1[1],yy1[1],xx2[1],yy2[1]);
    print_point(xx1[2],yy1[2],xx2[2],yy2[2]);
    print_point(xx1[3],yy1[3],xx2[3],yy2[3]);


    make_polygon(98,400,50,390,50,870,98,850);
    make_polygon(302,400,350,390,350,870,302,850);

    glColor3ub(255, 255, 255);
    make_polygon(60,405,60,850,90,840,90,410);
    make_polygon(310,410,310,840,340,855,340,410);

    glColor3ub(64, 64, 64);
    print_point(xx1[7],yy1[7],xx2[7],yy2[7]);
    print_point(xx1[8],yy1[8],xx2[8],yy2[8]);
    print_point(xx1[9],yy1[9],xx2[9],yy2[9]);

    print_point(xx1[10],yy1[10],xx2[10],yy2[10]);

    print_point(xx1[14],yy1[14],xx2[14],yy2[14]);
    print_point(xx1[15],yy1[15],xx2[15],yy2[15]);
    print_point(xx1[16],yy1[16],xx2[16],yy2[16]);
    print_point(xx1[17],yy1[17],xx2[17],yy2[17]);

    //table
    glColor3ub(114, 67, 54);
    make_polygon(400,250,425,300,775,300,800,250);
    glPointSize(3.5);
    glColor3ub(78, 35, 35);//4
    print_point(xx1[18],yy1[18],xx2[18],yy2[18]);
    print_point(xx1[19],yy1[19],xx2[19],yy2[19]);
    print_point(xx1[20],yy1[20],xx2[20],yy2[20]);
    print_point(xx1[21],yy1[21],xx2[21],yy2[21]);
    glPointSize(5.5);//4
    print_point(xx1[22],yy1[22],xx2[22],yy2[22]);
    print_point(xx1[23],yy1[23],xx2[23],yy2[23]);
    print_point(xx1[24],yy1[24],xx2[24],yy2[24]);
    print_point(xx1[25],yy1[25],xx2[25],yy2[25]);

    //tool
    make_polygon(550,150,565,175,635,175,650,150);
    glPointSize(3.5);
    glColor3ub(78, 35, 35);//4
    print_point(xx1[65],yy1[65],xx2[65],yy2[65]);
    print_point(xx1[66],yy1[66],xx2[66],yy2[66]);
    print_point(xx1[67],yy1[67],xx2[67],yy2[67]);

    print_point(xx1[68],yy1[68],xx2[68],yy2[68]);
    glPointSize(4.5);//4
    print_point(xx1[69],yy1[69],xx2[69],yy2[69]);
    print_point(xx1[70],yy1[70],xx2[70],yy2[70]);
    print_point(xx1[71],yy1[71],xx2[71],yy2[71]);
    print_point(xx1[72],yy1[72],xx2[72],yy2[72]);

    //pc stand
    glColor3ub(0, 0, 0);
    glPointSize(2.5);//3
    print_point(xx1[26],yy1[26],xx2[26],yy2[26]);
    print_point(xx1[27],yy1[27],xx2[27],yy2[27]);
    print_point(xx1[28],yy1[28],xx2[28],yy2[28]);

    //monitor
    glColor3ub(240, 240, 240);
    make_polygon(525,330,525,470,725,470,725,330);
    glPointSize(3.5);
    glColor3f(ccx,ccy,ccz);//4
    print_point(xx1[29],yy1[29],xx2[29],yy2[29]);
    print_point(xx1[30],yy1[30],xx2[30],yy2[30]);
    print_point(xx1[31],yy1[31],xx2[31],yy2[31]);
    print_point(xx1[32],yy1[32],xx2[32],yy2[32]);
    if(ccx>.9)ccx=0;
    if(ccy>.9)ccy=0;
    if(ccz>.9)ccz=0;
    ccx=ccx+0.01,ccy=ccy=ccy+0.02,ccz=ccz+0.03;

    //monitor border

    glColor3ub(0, 0, 0);
    glPointSize(4.5);//4
    print_point(xx1[61],yy1[61],xx2[61],yy2[61]);
    print_point(xx1[62],yy1[62],xx2[62],yy2[62]);
    print_point(xx1[63],yy1[63],xx2[63],yy2[63]);
    print_point(xx1[64],yy1[64],xx2[64],yy2[64]);

    //dash
    glColor3f(ccx,ccy,ccz);
    g_pp(550,375,575,420,600,375);
    if(ccx>.9)ccx=0;
    if(ccy>.9)ccy=0;
    if(ccz>.9)ccz=0;
    ccx=ccx+0.01,ccy=ccy=ccy+0.02,ccz=ccz+0.03;
    glColor3ub(110, 167, 200);
    glColor3f(ccx,ccy,ccz);//4
    print_point(xx1[49],yy1[49],xx2[49],yy2[49]);
    print_point(xx1[50],yy1[50],xx2[50],yy2[50]);
    print_point(xx1[51],yy1[51],xx2[51],yy2[51]);
    print_point(xx1[52],yy1[52],xx2[52],yy2[52]);
    if(ccx>.9)ccx=0;
    if(ccy>.9)ccy=0;
    if(ccz>.9)ccz=0;
    ccx=ccx+0.01,ccy=ccy=ccy+0.02,ccz=ccz+0.03;

    //keyb
    glColor3ub(69, 69, 69);
    make_polygon(545,260,565,280,680,280,700,260);
    glColor3ub(0, 0, 0);//4
    print_point(xx1[33],yy1[33],xx2[33],yy2[33]);
    print_point(xx1[34],yy1[34],xx2[34],yy2[34]);
    print_point(xx1[35],yy1[35],xx2[35],yy2[35]);
    print_point(xx1[36],yy1[36],xx2[36],yy2[36]);

    //flowers
    glColor3ub(167, 76, 97);
    glLineWidth(3.5);
    C_curve( 435, 520, 35, 60, 10);
    C_curve( 415, 540, 15, 60, 10);
    C_curve( 505, 600, 45, 90, 10);
    C_curve( 530, 635, 25, 90, 10);
    glColor3ub(0, 155, 0);//2
    glPointSize(3);
    print_point(xx1[47],yy1[47],xx2[47],yy2[47]);
    print_point(xx1[48],yy1[48],xx2[48],yy2[48]);

    //vase
    glColor3ub(198, 235, 251);
    make_polygon(435,295,435,400,470,400,470,295);
    glColor3ub(54, 72, 107);
    glPointSize(3);//4
    print_point(xx1[43],yy1[43],xx2[43],yy2[43]);
    print_point(xx1[44],yy1[44],xx2[44],yy2[44]);
    print_point(xx1[45],yy1[45],xx2[45],yy2[45]);
    print_point(xx1[46],yy1[46],xx2[46],yy2[46]);
    glColor3ub(54, 72, 107);
    glLineWidth(2.5);
    S_gasket(435,300,452.5,400,470,300,2);

    glFlush();

}

int main (int argc, char **argv)
{
    glutInit(&argc, argv);
    glutInitDisplayMode (GLUT_SINGLE | GLUT_RGB);
    glutInitWindowSize(1100,650);
    glutInitWindowPosition(90,65);
    glutCreateWindow(" First Glute Project");
    init();
    glutDisplayFunc(display);
    Timer(0);
    glutMainLoop();
}
