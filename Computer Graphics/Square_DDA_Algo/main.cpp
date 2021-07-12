#include<windows.h>
#include<bits/stdc++.h>
#include<GL/glut.h>
#include<stdlib.h>
using namespace std;

float a = 1,b = 1,c = 10,d = 1;
float e = 10,f = 1,g = 10,h = 10;
float x = 10,j = 10,k = 1,l = 10;
float m = 1,n = 10,o = 1,p = 1;

void display(void)
{
    float dx,dy,s,vx,vy;

    dx=c-a;
    dy=d-b;
    vx=a, vy=b;

    if(abs(dx)>abs(dy))
        s=dx;
    else
        s=dy;

    for(int i=a;i<=c;i++){
        vx = vx + (dx/s);
        //vy = vy + (dy/s);
        vy = vy;
        vx=round(vx);
        vy=round(vy);

        glBegin(GL_POINTS);
        //cout<<vx<<" "<<vy<<"\n";
           glVertex2i(vx,vy);
        glEnd();
    }
///---------------------------------------
    dx=g-e;
    dy=h-f;
    vx=e, vy=f;

    if(abs(dx)>abs(dy))
        s=dx;
    else
        s=dy;

    for(int i=f;i<=h;i++){
        //vx = vx + (dx/s);
        vx = vx;
        vy = vy + (dy/s);
        vx=round(vx);
        vy=round(vy);

        glBegin(GL_POINTS);
        //cout<<vx<<" "<<vy<<"\n";
           glVertex2i(vx,vy);
        glEnd();
    }
///----------------------------------------------
    dx=k-x;
    dy=l-j;
    vx=x, vy=j;

    if(abs(dx)>abs(dy))
        s=dx;
    else
        s=dy;

    for(int i=k;i<=x;i++){
        vx = vx - (dx/s);
        //vy = vy - (dy/s);
        vy = vy;
        vx=round(vx);
        vy=round(vy);

        glBegin(GL_POINTS);
        //cout<<vx<<" "<<vy<<"\n";
           glVertex2i(vx,vy);
        glEnd();
    }

///------------------------------------------
    dx=o-m;
    dy=p-n;
    vx=m, vy=n;

    if(abs(dx)>abs(dy))
        s=dx;
    else
        s=dy;

    for(int i=p;i<=n;i++){
        //vx = vx + (dx/s);
        vx = vx;
        vy = vy - (dy/s);
        vx=round(vx);
        vy=round(vy);

        glBegin(GL_POINTS);
        //cout<<vx<<" "<<vy<<"\n";
           glVertex2i(vx,vy);
        glEnd();
    }
    glFlush();
}

void init (void){
    glClearColor(0.7,0.7,0.7,0.7);
    glClear(GL_COLOR_BUFFER_BIT);
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluOrtho2D(-100,100,-100,100);
}

int main(int argc, char **argv)
{
   // cin>>x1>>y3>>x2>>y4;
   // cin>>x5>>y7>>x6>>y8;
    glutInit(&argc, argv);
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
    glutInitWindowSize(500,500);
    glutInitWindowPosition(100,100);
    glutCreateWindow("DDA Line Algorithm");
    init();
    glutDisplayFunc(display);

    glutMainLoop();
}
