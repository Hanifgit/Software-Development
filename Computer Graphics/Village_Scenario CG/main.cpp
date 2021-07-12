#include<cstdio>
#include <windows.h>
#include<math.h>
#include <vector>
#include <cstdlib>
# define PI 3.14159265358979323846
#include <GL/gl.h>
#include <GL/glut.h>
using namespace std;

void init(void)
{
    //glClearColor(0.90, 0.95, 0.71,0.7);
    glClearColor(0.7,0.7,0.7,0.7);
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluOrtho2D(-100,100,-100,100);
    //glColor3f (0.0, 1.0, 0.0);
}

void Timer(int iUnused)
{
    glutPostRedisplay();
    glutTimerFunc(60, Timer, 0);
}

void pp_rain(int x,int y)
{
    /*
    if((x<100 or x>300) or (y<400 or y>1000))
    {
       return;
    } */

    //glColor3ub(56, 117, 163);
    glBegin(GL_LINES);
    glVertex2i(x,y);
    glVertex2i(x+1,y);
    glEnd();
}
void make_rain()
{
    int x= (rand())%200;
    int y= (rand())%200;
    pp_rain(x,y);
    pp_rain(-x,y);
    pp_rain(-x,y-50);
    pp_rain(x,y-100);
}

void pp(int x,int y)
{
     //glClearColor(1.0, 1.0, 1.0, 0.0);
     glBegin(GL_POINTS);
            glVertex2i(x,y);
     glEnd();
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

// Tree //
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
                 if(y1>y2)vy--;
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

    //rain
    //glPointSize(4.5);
    glLineWidth(6);
    for(int i=1; i<=300; i++)
    {
      make_rain();
    }



    //1
    glColor3ub(64, 64, 64);
     glPointSize(4.5);
    print_point(-70,30,-50,80);
    print_point(-50,50,-30,30);
    print_point(-70,30,-30,30);


    //2
    glColor3ub(255, 255, 255);
     glColor3ub(255, 255, 255);
    print_point(-50,50,-5,50);
    print_point(-5,50,14,30);
    print_point(-30,30,14,30);

    //3
    print_point(-65,30,-65,-20);
    print_point(-35,30,-35,-20);
    print_point(10,30,10,-20);

    //4
    print_point(-70,-20,15,-20);
    print_point(-70,-23,15,-23);

    //window
    print_point(-55,15,-45,15);
    print_point(-55,10,-45,10);
    print_point(-55,15,-55,5);
    print_point(-50,15,-50,5);
    print_point(-55,5,-45,5);
    print_point(-45,5,-45,15);

    //Door
    print_point(-20,10,-20,-20);
    print_point(-15,10,-15,-20);
    print_point(-10,10,-10,-20);
    print_point(-20,10,-10,10);

    //Tree
    S_gasket(-90,25,-75,25,-82,50,3);
    print_point(-85,25,-85,-20);
    print_point(-80,25,-80,-20);
    print_point(-85,-20,-90,-10);
    print_point(-80,-20,-70,-25);

    S_gasket(-40,53,-30,53,-35,65,2);
    S_gasket(-30,53,-20,53,-25,63,2);

    //
    print_point(-100,80,100,85);

    //
    print_point(12,30,18,25);
    print_point(18,25,20,20);
    print_point(20,20,20,-100);

    //both
    print_point(40,30,50,15);
    print_point(50,20,70,20);
    print_point(70,20,80,40);
    print_point(40,30,80,30);
    print_point(60,40,80,10);

    glFlush();


}


int main (int argc, char **argv)
{
    glutInit(&argc, argv);
    glutInitDisplayMode (GLUT_SINGLE | GLUT_RGB);
    glutInitWindowSize(1000,600);
    glutInitWindowPosition(100,100);
    glutCreateWindow(" Village Scenario");
    init();
    glutDisplayFunc(display);
    Timer(0);
    glutMainLoop();
    return 0;
}

