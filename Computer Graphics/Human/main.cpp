#include<windows.h>
#include<bits/stdc++.h>
#include<GL/glut.h>
#include<stdlib.h>
#include<stdio.h>
#include <GL/gl.h>
using namespace std;

int xx[5],yy[5],xx2[5],yy2[5];
float shift = 0; // a variable used to move the boat right and left
void pp(int x,int y)
{
     glBegin(GL_POINTS);
            glVertex2i(x+shift,y+shift);
     glEnd();
     //glutSwapBuffers();
}

void Head(int x,int y,int xc,int yc)
{
    pp(x+xc,y+yc); pp(y+xc,x+yc); pp(-y+xc,x+yc); pp(-x+xc,y+yc);
    pp(-x+xc,-y+yc);pp(-y+xc,-x+yc);pp(y+xc,-x+yc);pp(x+xc,-y+yc);
}

void Mouth(int x,int y,int xc,int yc)
{
    pp(-x+xc,-y+yc);pp(x+xc,-y+yc);
}

void Circle(int Radius,int xc,int yc){

    int p0=1-Radius;
    int x=0;
    int y=Radius;
    Mouth(x,y,xc,yc);
    while(x<=y){
        x++;
        if(p0<=0){
            p0=p0+2*x+1;
        }
        else{
            y--;
            p0=p0+2*x-2*y+1;
        }
       if(Radius==12) Mouth(x,y,xc,yc);
       else{
          Head(x,y,xc,yc);
       }
    }
    glFlush();
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
            vy=min(y1,y2);
            endd=x1;
        }
        pp(vx,vy);
        while(vx<endd){
            vx++;
            if(p0<0){
                p0=p0+(2*dy);
            }else{
               if(y1>y2) vy--;
               else vy++;
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
    glClear(GL_COLOR_BUFFER_BIT);

    //glColor3ub(114, 67, 54);
    //Head
    Circle(20,10,60);
    //Mouth
    Circle(12,10,60);
    //Left eye
    Circle(3,4,65);
    //Right eye
    Circle(3,16,65);

    //body
    print_point(10,40,10,-10);

    //left hand
    print_point(10,55,-30,38);
    //right hand
    print_point(10,20,40,60);

    //right leg
    print_point(10,-10,40,-60);
    //left leg
    print_point(-20,-40,10,-10);
}

void init(void)
{
    //glClearColor(0.7,0.7,0.7,0.7);
    glPointSize(2.5);
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluOrtho2D(-100,100,-100,100);
    glColor3f (0.0, 1.0, 0.0);
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
    glutInitWindowSize(700,700);
    glutInitWindowPosition(100,100);
    glutCreateWindow(" Human");
    init();
    glutDisplayFunc(display);
    glutSpecialFunc(key);
    glutMainLoop();
}

