#include<windows.h>
#include<bits/stdc++.h>
#include<GL/glut.h>
#include<stdlib.h>
#include<stdio.h>
using namespace std;

float a,b,c,d,e;

void pp(float x, float y, float x1, float y1)
{
    glBegin(GL_LINES);
        glVertex2f(x,y);
        glVertex2f(x1,y1);
    glEnd();
}

float C_curve(float x,float y,float len,float alpha,int n)
{
    if(n>0){
        len=len/sqrt(2.0);
        C_curve(x,y,len,alpha+45.0,n-1);
        x=x+len*cos(alpha+45.0);
        y=y+len*sin(alpha+45.0);
        C_curve(x,y,len,alpha-45.0,n-1);
    }
    else{
        pp(x,y,x+len*cos(alpha),y+len*sin(alpha));
    }
}
void display ()
{
    C_curve(a,b,c,d,e);
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
    cout<<"Enter Co-ordinate and Length"<<endl;
    cin>>a>>b>>c>>d>>e;

    glutInit(&argc, argv);
    glutInitDisplayMode (GLUT_SINGLE | GLUT_RGB);
    glutInitWindowSize(500,500);
    glutInitWindowPosition(100,100);
    glutCreateWindow(" C curve Algorithm");
    init();
    glutDisplayFunc(display);
    glutMainLoop();
}
