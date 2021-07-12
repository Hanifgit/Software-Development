#include<windows.h>
#include<bits/stdc++.h>
#include<GL/glut.h>
#include<stdlib.h>
using namespace std;

float a = 1,b = 7,c = 10,d = 7;
float u = 10,v = 7,w = 5,x = 12;
float e = 5,f = 12,g = 1,h = 7;


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

    ///--------------------------------

    dx=w-u;
    dy=x-v;
    vx=u, vy=v;

    if(abs(dx)>abs(dy))
        s=dx;
    else
        s=dy;

    for(int i=w;i<=u;i++){
        vx=vx + (dx/s);
        vy=vy + (dy/s);
        vx=round(vx);
        vy=round(vy);

        glBegin(GL_POINTS);
          //cout<<vx<<" "<<vy<<"\n";
        glVertex2i(vx,vy);
        glEnd();
    }

    //--------------------------------

    dx=g-e;
    dy=h-f;
    vx=e, vy=f;

    if(abs(dx)>abs(dy))
        s=dx;
    else
        s=dy;

    for(int i=g;i<=e;i++){
        vx = vx - (dx/s);
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
