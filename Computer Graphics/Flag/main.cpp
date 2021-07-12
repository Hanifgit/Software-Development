#include<windows.h>
#include<bits/stdc++.h>
#include<GL/glut.h>
#include<stdlib.h>
#include<stdio.h>
using namespace std;

int Radius=5,xc=10,yc=7;
int xx[5],yy[5],xx2[5],yy2[5];
//Global 1D array or variables

void pp(int x,int y)
{
     glBegin(GL_POINTS);
            glVertex2i(x,y);
    glEnd();
}
void make_symmetry(int x,int y)
{
    pp(x+xc,y+yc); pp(y+xc,x+yc); pp(-y+xc,x+yc); pp(-x+xc,y+yc);
    pp(-x+xc,-y+yc); pp(-y+xc,-x+yc); pp(y+xc,-x+yc); pp(x+xc,-y+yc);
}
void print_point(int x1,int y1,int x2,int y2)
{
    int dx,dy,s,vx,vy,endd,p0;
    dx=abs(x2-x1);
    dy=abs(y2-y1);
    p0=(2*dy)-dx;
    vx=x1,vy=y1,endd=x2;
    if(x1!=x2){
        if(x1>x2){
            vx=x2;
            vy=y2;
            endd=x1;
        }
        pp(vx,vy);
        while(vx<endd){
            vx++;
            if(p0<0){
                p0=p0+(2*dy);
            }else{
                vy++;
                 p0=p0+(2*dy)-(2*dx);
            }
            pp(vx,vy);
        }
    }
    else{
        for(int i=min(y1,y2);i<=max(y1,y2);i++){
            pp(vx,i);
        }
    }
    glFlush();//overflow/underflow
}


void display ()
{
    print_point(0,0,20,0);
    print_point(20,0,20,15);
    print_point(20,15,0,15);
    print_point(0,15,0,0);

    print_point(0,0,0,-20);
    print_point(1,15,1,-20);
    print_point(-5,-20,5,-20);
    print_point(-5,-21,5,-21);

    int p0=1-Radius;
    int x=0;
    int y=Radius;
    make_symmetry(x,y);
    while(x<=y){
        x++;
        if(p0<=0){
            p0=p0+2*x+1;
        }
        else{
            y--;
            p0=p0+2*x-2*y+1;
        }
     ///cout<<x<<' '<<y<<endl;
       make_symmetry(x,y);
    }
    glFlush();
}

void init(void)
{
    glClearColor(0.7,0.7,0.7,0.7);
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluOrtho2D(-100,100,-100,100);
}

int main (int argc, char **argv)
{
    //cin>>xx>>yy>>xx2>>yy2; //user input for co-ordinates
    //cout<<"Give All the co-ordinates value for a square"<<endl;
    //for(int i=0;i<4;i++){
       // cin>>xx[i]>>yy[i]>>xx2[i]>>yy2[i];
   // }
    glutInit(&argc, argv);
    glutInitDisplayMode (GLUT_SINGLE | GLUT_RGB);
    glutInitWindowSize(500,500);
    glutInitWindowPosition(100,100);
    glutCreateWindow(" Bangladesh Flag");
    init();
    glutDisplayFunc(display);
    glutMainLoop();
}

