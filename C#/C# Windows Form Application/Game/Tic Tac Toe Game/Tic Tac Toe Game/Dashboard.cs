using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;
using System.Media;

namespace Tic_Tac_Toe_Game
{
    public partial class Dashboard : Form
    {
        public Point mouseLocation;
        DBClass ObjDBAccess = new DBClass();
        DataTable dtUsers = new DataTable();
        public static string name = "",opName = "";
        public static int a = 0,b = 0,c = 0,d = 0,j = 0,f = 0,g = 0,h = 0,i = 0,count = 0,fp = 0, sp = 0;


        public Dashboard()
        {
            InitializeComponent();

        }

        private void one_Click(object sender, EventArgs e)
        {
            if (a==0)
            {
                running.BackColor = Color.White;
                SoundPlayer playe = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Click.wav");
                playe.Play();
                if (count % 2 == 0)
                {
                    Toss.Text = opName + " Turn";
                }
                else if(count % 2 == 1 ) Toss.Text = name + " Turn";
                // Toss.Text = "";
                count++;
               if (count % 2 == 1 && count > 0) one.Text = "O";
               else if (count % 2 == 0 && count > 0) one.Text = "X";
            }
            a++;
            if (a > 1) running.BackColor = Color.Red;
        }


        private void pictureBox1_Click(object sender, EventArgs e)
        {
            count = 0;
            fp = 0;
            sp = 0;
            this.Hide();
            MainPanel obj = new MainPanel();
            obj.Show();
        }

        private void two_Click(object sender, EventArgs e)
        {
            if (b == 0)
            {
                running.BackColor = Color.White;
                SoundPlayer playe = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Click.wav");
                playe.Play();
                if (count % 2 == 0 )
                {
                    Toss.Text = opName + " Turn";
                }
                else if (count % 2 == 1 ) Toss.Text = name + " Turn";
                //Toss.Text = "";
                count++;
            if (count % 2 == 1 && count > 0) two.Text = "O";
            else if (count % 2 == 0 && count > 0) two.Text = "X";
            }
            b++;
            if (b > 1) running.BackColor = Color.Red;
        }

        private void Home_Click_1(object sender, EventArgs e)
        {
            MainPanel.splayer.Play();
            one.Text = "";
            two.Text = "";
            three.Text = "";
            four.Text = "";
            five.Text = "";
            six.Text = "";
            seven.Text = "";
            eight.Text = "";
            nine.Text = "";
            count = 0;
            this.Close();
            MainPanel obj = new MainPanel();
            obj.Show();
        }

        private void panel_MouseDown(object sender, MouseEventArgs e)
        {
            mouseLocation = new Point(-e.X, -e.Y);
        }

        private void panel_MouseMove(object sender, MouseEventArgs e)
        {
            if (e.Button == MouseButtons.Left)
            {
                Point mousePos = Control.MousePosition;
                mousePos.Offset(mouseLocation.X, mouseLocation.Y);
                Location = mousePos;
            }
        }

        private void three_Click(object sender, EventArgs e)
        {
            if (c == 0)
            {
                running.BackColor = Color.White;
                SoundPlayer playe = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Click.wav");
                playe.Play();
                //Toss.Text = "";
                if (count % 2 == 0)
                {
                    Toss.Text = opName + " Turn";
                }
                else if (count % 2 == 1) Toss.Text = name + " Turn";
                count++;
                if (count % 2 == 1 && count > 0) three.Text = "O";
                else if (count % 2 == 0 && count > 0) three.Text = "X";
            }
            c++;
            if (c > 1) running.BackColor = Color.Red;
        }

        private void running_Click_1(object sender, EventArgs e)
        {
           // if(a==1 || b == 1 || c == 1 || d == 1 || j == 1 || f == 1 || g == 1 || h == 1 || i == 1) 
            running.BackColor = Color.White;
            SoundPlayer player = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Win.wav");
            player.Stop();

            count = 0;
            one.Text = "";
            two.Text = "";
            three.Text = "";
            four.Text = "";
            five.Text = "";
            six.Text = "";
            seven.Text = "";
            eight.Text = "";
            nine.Text = "";
            a = 0; b = 0; c = 0; d = 0; j = 0; f = 0; g = 0; h = 0; i = 0;
        }

        private void four_Click(object sender, EventArgs e)
        {
            if (d == 0)
            {
                running.BackColor = Color.White;
                SoundPlayer playe = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Click.wav");
                playe.Play();
               // Toss.Text = "";
                if (count % 2 == 0)
                {
                    Toss.Text = opName + " Turn";
                }
                else if (count % 2 == 1) Toss.Text = name + " Turn";
                count++;
               if (count % 2 == 1 && count > 0) four.Text = "O";
               else if (count % 2 == 0 && count > 0) four.Text = "X";
            }
            d++;
            if (d > 1) running.BackColor = Color.Red;
        }

        private void seven_Click(object sender, EventArgs e)
        {
            if (g == 0)
             {
                running.BackColor = Color.White;
                SoundPlayer playe = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Click.wav");
                playe.Play();
                //Toss.Text = "";
                if (count % 2 == 0)
                {
                    Toss.Text = opName + " Turn";
                }
                else if (count % 2 == 1) Toss.Text = name + " Turn";
                count++;
                if (count % 2 == 1 && count > 0) seven.Text = "O";
                else if (count % 2 == 0 && count > 0) seven.Text = "X";
        
            }
            g++;
            if (g > 1) running.BackColor = Color.Red;
        }

        private void eight_Click(object sender, EventArgs e)
        {

            if (h == 0)
            {
                running.BackColor = Color.White;
                SoundPlayer playe = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Click.wav");
                playe.Play();
                //Toss.Text = "";
                if (count % 2 == 0)
                {
                    Toss.Text = opName + " Turn";
                }
                else if (count % 2 == 1) Toss.Text = name + " Turn";
                count++;
                if (count % 2 == 1 && count > 0) eight.Text = "O";
                else if (count % 2 == 0 && count > 0) eight.Text = "X";
               
            }
            h++;
            if (h > 1) running.BackColor = Color.Red;
        }

        private void Dashboard_Load(object sender, EventArgs e)
        {
            // FPP.Text = MainPanel.fp.ToString();
            // SPP.Text = MainPanel.sp.ToString();
        }

        private void nine_Click(object sender, EventArgs e)
        {
            if (i == 0)
            {
                running.BackColor = Color.White;
                SoundPlayer playe = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Click.wav");
                playe.Play();
                //Toss.Text = "";
                if (count % 2 == 0)
                {
                    Toss.Text = opName + " Turn";
                }
                else if (count % 2 == 1) Toss.Text = name + " Turn";
                count++;
                if (count % 2 == 1 && count > 0) nine.Text = "O";
                else if (count % 2 == 0 && count > 0) nine.Text = "X";
                
            }
            i++;
            if (i > 1) running.BackColor = Color.Red;
        }

        public void close()
        {
            one.Text = "";
            two.Text = "";
            three.Text = "";
            four.Text = "";
            five.Text = "";
            six.Text = "";
            seven.Text = "";
            eight.Text = "";
            nine.Text = "";
        }

        private void panel_Paint(object sender, PaintEventArgs e)
        {
            Con.Text = "";
            Win.Text = "";

            if (MainPanel.Played % 2 == 0)
            {
                 if(a==0 && b == 0 && c == 0 && d == 0 && j == 0 && f == 0 && g == 0 && h == 0 && i == 0) 
                    Toss.Text = MainPanel.FP + " Turn first";

                name = MainPanel.FP;
                opName = MainPanel.SP;
            }
            else if (MainPanel.Played % 2 == 1)
            {
                if (a == 0 && b == 0 && c == 0 && d == 0 && j == 0 && f == 0 && g == 0 && h == 0 && i == 0)
                    Toss.Text = MainPanel.SP + " Turn first";
                name = MainPanel.SP;
                opName = MainPanel.FP;
            }

            Player1.Text = MainPanel.FP;
            Player2.Text = MainPanel.SP;
            
            if ((one.Text == "O" && two.Text == "O" && three.Text == "O") || (one.Text == "O" && four.Text == "O" && seven.Text == "O")
                || (five.Text == "O" && two.Text == "O" && eight.Text == "O") || (three.Text == "O" && six.Text == "O" && nine.Text == "O")
                || (five.Text == "O" && four.Text == "O" && six.Text == "O") || (five.Text == "O" && one.Text == "O" && nine.Text == "O")
                || (three.Text == "O" && seven.Text == "O" && five.Text == "O") || (eight.Text == "O" && nine.Text == "O" && seven.Text == "O"))
            {
                //Miusic//
                running.BackColor = Color.Red;

                SoundPlayer player = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Win.wav");
                player.Play();

                MainPanel.Played++;
                if (name == MainPanel.FP) fp++;
                else if((name == MainPanel.SP)) sp++;
                FPP.Text = fp.ToString();
                SPP.Text = sp.ToString();
                //if (name == MainPanel.FP) MessageBox.Show("Congratulations " + name + " are winner");
                //else MessageBox.Show("Congratulations " + name + " are winner");
                Toss.Text = "Congratulations!! " + name + " are winner";
                //Toss.Text = "";
               // Con.Text = "Congratulations!!\n";
               // Win.Text = Name + " are winner";
                a = 1; b = 1; c = 1; d = 1; j = 1; f = 1; g = 1; h = 1; i = 1;
                count = 0;
                 
                    one.Text = "";
                    two.Text = "";
                    three.Text = "";
                    four.Text = "";
                    five.Text = "";
                    six.Text = "";
                    seven.Text = "";
                    eight.Text = "";
                    nine.Text = "";
            }

            else if ((one.Text == "X" && two.Text == "X" && three.Text == "X") || (one.Text == "X" && four.Text == "X" && seven.Text == "X")
                || (five.Text == "X" && two.Text == "X" && eight.Text == "X") || (three.Text == "X" && six.Text == "X" && nine.Text == "X")
                || (five.Text == "X" && four.Text == "X" && six.Text == "X") || (five.Text == "X" && one.Text == "X" && nine.Text == "X")
                || (eight.Text == "X" && nine.Text == "X" && seven.Text == "X") || (three.Text == "X" && seven.Text == "X" && five.Text == "X"))
            {
                running.BackColor = Color.Red;

                SoundPlayer player = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Win.wav");
                player.Play();

                MainPanel.Played++;
                if (name == MainPanel.FP) sp++;
                else if ((name == MainPanel.SP)) fp++;
            
                 FPP.Text = fp.ToString();
                 SPP.Text = sp.ToString();

                // if (name == MainPanel.FP) MessageBox.Show("Congratulations " + name + " are winner");
                //else MessageBox.Show("Congratulations " + name + " are winner");
                Toss.Text = "Congratulations!! " + opName + " are winner";
                //Toss.Text = "";
                //Con.Text = "Congratulations!!\n";
               // Win.Text = opName + " are winner";
       
                a = 1; b = 1; c = 1; d = 1; j = 1; f = 1; g = 1; h = 1; i = 1;
                count = 0;
                one.Text = "";
                two.Text = "";
                three.Text = "";
                four.Text = "";
                five.Text = "";
                six.Text = "";
                seven.Text = "";
                eight.Text = "";
                nine.Text = "";
            }
             else if (count == 9)
            {
                running.BackColor = Color.Red;
                SoundPlayer player = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Wrong.wav");
                player.Play();
                MainPanel.Played++;
                count = 0;

                Toss.Text = "Draw this game";
                a = 1; b = 1; c = 1; d = 1; j = 1; f = 1; g = 1; h = 1; i = 1;
               // one.Text = "";
                //two.Text = "";
               // three.Text = "";
                //four.Text = "";
                //five.Text = "";
                //six.Text = "";
                //seven.Text = "";
                //eight.Text = "";
                //nine.Text = "";
            }
        }

        private void five_Click(object sender, EventArgs e)
        {
            if (j == 0)
            {
                running.BackColor = Color.White;
                SoundPlayer playe = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Click.wav");
                playe.Play();
                // Toss.Text = "";\
                if (count % 2 == 0)
                {
                    Toss.Text = opName + " Turn";
                }
                else if (count % 2 == 1) Toss.Text = name + " Turn";
                count++;
                if (count % 2 == 1 &&count > 0) five.Text = "O";
                 else if (count % 2 == 0 && count > 0) five.Text = "X";
                
            }
            j++;
            if (j > 1) running.BackColor = Color.Red;
        }

        private void six_Click(object sender, EventArgs e)
        {
            if (f == 0)
            {
                running.BackColor = Color.White;
                SoundPlayer playe = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Click.wav");
                playe.Play();
                //Toss.Text = "";
                if (count % 2 == 0)
                {
                    Toss.Text = opName + " Turn";
                }
                else if (count % 2 == 1) Toss.Text = name + " Turn";
                count++;
                if (count % 2 == 1 && count > 0) six.Text = "O";
                else if (count % 2 == 0 && count > 0) six.Text = "X";
             
            }
            f++;
            if (f > 1) running.BackColor = Color.Red;
        }
    }
}
