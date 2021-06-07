#include<windows.h>
#include<bits/stdc++.h>
#include<GL/glut.h>
#include<stdlib.h>
#include<stdio.h>
using namespace std;

float a,b,c,d,e,f,g;

void pp(float x, float y, float x1, float y1, float x2, float y2)
{
    glBegin(GL_TRIANGLES);
        glVertex2f(x,y);
        glVertex2f(x1,y1);
        glVertex2f(x2,y2);
    glEnd();
}

int S_gasket(float x1,float y1,float x2,float y2,float x3,float y3,int n)
{
    if(n>0){
        float x12, y12, x23, y23, x31, y31;

        x12=(x1+x2)/2; y12=(y1+y2)/2;
        x23=(x2+x3)/2; y23=(y2+y3)/2;
        x31=(x1+x3)/2; y31=(y1+y3)/2;

        S_gasket(x1,y1,x12,y12,x31,y31,n-1);
        S_gasket(x12,y12,x2,y2,x23,y23,n-1);
        S_gasket(x31,y31,x23,y23,x3,y3,n-1);
    }
    else{
        pp(x1,y1,x2,y2,x3,y3);
    }
}
void display ()
{
    S_gasket(a,b,c,d,e,f,g);
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
    cout<<"Enter Co-ordinates and recursion times"<<endl;
    cin>>a>>b>>c>>d>>e>>f>>g;

    glutInit(&argc, argv);
    glutInitDisplayMode (GLUT_SINGLE | GLUT_RGB);
    glutInitWindowSize(500,500);
    glutInitWindowPosition(100,100);
    glutCreateWindow(" Gasket Algorithm");
    init();
    glutDisplayFunc(display);
    glutMainLoop();
}
