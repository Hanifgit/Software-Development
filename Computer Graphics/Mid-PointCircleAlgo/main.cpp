#include <stdio.h>
#include <GL/gl.h>
#include <GL/glut.h>

float x=0,y,x2,y2,m,i,j,p;
int r;

void pp(float x,float y)
{
    glBegin(GL_POINTS);
             glVertex3f (x, y, 0.0);
    glEnd();
}

void make_symmetry(void)
{

glEnd();

    glColor3f (0.0, 1.0, 0.0);

    p=1-r;
    while((x<=y)){
        if(p<0){
          x=x+1;
          y=y;
          p=p+(2*x)+1;
        }else{
            x=x+1;
            y=y-1;
            p=p+(2*x)+1-(2*y);
        }
        pp(((x/100)), ((y/100)));
        pp (((y/100)), ((x/100)));
        pp ((-(x/100)), (-(y/100)));
        pp ((-(x/100)), ((y/100)));
        pp (((x/100)), (-(y/100)));
        pp (((y/100)), (-(x/100)));
        pp ((-(y/100)), (-(x/100)));
        pp ((-(y/100)), ((x/100)));
    }

    glFlush ();
}

void display ()
{
    ///algorithm
    make_symmetry();
    glFlush();
}

void init (void)
{

    glClearColor (0.0, 0.0, 0.0, 0.0);

    glMatrixMode(GL_PROJECTION);
    glOrtho(-1.0, 1.0, -1.0, 1.0, -1.0, 1.0);
}

int main(int argc, char** argv)
{

    printf("Enter radius: ");
    scanf("%d",&r);
    y=r;
    glutInit(&argc, argv);
    glutInitDisplayMode (GLUT_SINGLE | GLUT_RGB);
    glutInitWindowSize (500, 500);
    glutInitWindowPosition (100, 100);
    glutCreateWindow ("hello");
    init ();
    glutDisplayFunc(display);
    glutMainLoop();
    return 0;
}
