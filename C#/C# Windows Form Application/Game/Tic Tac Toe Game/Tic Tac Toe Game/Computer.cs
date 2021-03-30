using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Media;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Tic_Tac_Toe_Game
{
    public partial class Computer : Form
    {
        public Point mouseLocation;
        public static string name = "";
        public static int a = 0, b = 0, c = 0, d = 0, j = 0, f = 0, g = 0, h = 0, i = 0, count = 0, fp = 0, sp = 0;

        private void Home_Click(object sender, EventArgs e)
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

        private void running_Click(object sender, EventArgs e)
        {
            running.BackColor = Color.Green;
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

        private void panel_Paint(object sender, PaintEventArgs e)
        {
            if (MainPanel.Played % 2 == 0)
            {
                Toss.Text = You.Text + " Played First";
                name = MainPanel.FP;
            }
            else if (MainPanel.Played % 2 == 1)
            {
                Toss.Text = MainPanel.SP + " Played First";
                name = MainPanel.SP;
            }

            //You.Text = MainPanel.FP;
            //Com.Text = MainPanel.SP;

            if ((one.Text == "O" && two.Text == "O" && three.Text == "O") || (one.Text == "O" && four.Text == "O" && seven.Text == "O")
                || (five.Text == "O" && two.Text == "O" && eight.Text == "O") || (three.Text == "O" && six.Text == "O" && nine.Text == "O")
                || (five.Text == "O" && four.Text == "O" && six.Text == "O") || (five.Text == "O" && one.Text == "O" && nine.Text == "O")
                || (three.Text == "O" && seven.Text == "O" && five.Text == "O") || (eight.Text == "O" && nine.Text == "O" && seven.Text == "O"))
            {
                //Miusic//

                SoundPlayer player = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Win.wav");
                player.Play();
                running.BackColor = Color.Red;

                MainPanel.Played++;
                if (name == MainPanel.FP) fp++;
                else if ((name == MainPanel.SP)) sp++;
                FPP.Text = fp.ToString();
                SPP.Text = sp.ToString();
                //if (name == MainPanel.FP) MessageBox.Show("Congratulations " + name + " are winner");
                //else MessageBox.Show("Congratulations " + name + " are winner");
                Toss.Text = "Congratulations " + name + " are winner";
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

                SoundPlayer player = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Win.wav");
                player.Play();
                running.BackColor = Color.Red;

                MainPanel.Played++;
                if (name == MainPanel.FP) sp++;
                else if ((name == MainPanel.SP)) fp++;

                FPP.Text = fp.ToString();
                SPP.Text = sp.ToString();

                // if (name == MainPanel.FP) MessageBox.Show("Congratulations " + name + " are winner");
                //else MessageBox.Show("Congratulations " + name + " are winner");
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
            else if (count >= 9)
            {
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
                running.BackColor = Color.Red;
                SoundPlayer player = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Wrong.wav");
                player.Play();
            }
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

        public Computer()
        {
            InitializeComponent();
        }

        private void six_Click(object sender, EventArgs e)
        {
            if (f == 0)
            {
                SoundPlayer playe = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Click.wav");
                playe.Play();
                Toss.Text = "";
                count++;
              //if (count % 2 == 1 && count > 0) 
                    six.Text = "O";
                f++;
                if (one.Text == "O" && two.Text == "O" && c == 0)
                {
                    three.Text = "X";
                    c++;
                    count++;
                }
                else if (one.Text == "O" && three.Text == "O" && b == 0)
                {
                    two.Text = "X";
                    b++;
                    count++;
                }
                else if (two.Text == "O" && three.Text == "O" && a == 0)
                {
                    one.Text = "X";
                    a++;
                    count++;
                }
                else if (four.Text == "O" && five.Text == "O" && f == 0)
                {
                    six.Text = "X";
                    f++;
                    count++;
                }
                else if (four.Text == "O" && five.Text == "O" && j == 0)
                {
                    five.Text = "X";
                    j++;
                    count++;
                }
                else if (six.Text == "O" && five.Text == "O" && d == 0)
                {
                    four.Text = "X";
                    d++;
                    count++;
                }
                else if (seven.Text == "O" && eight.Text == "O" && i == 0)
                {
                    nine.Text = "X";
                    i++;
                    count++;
                }
                else if (seven.Text == "O" && nine.Text == "O" && h == 0)
                {
                    eight.Text = "X";
                    h++;
                    count++;
                }
                else if (eight.Text == "O" && nine.Text == "O" && g == 0)
                {
                    seven.Text = "X";
                    g++;
                    count++;
                }
                else if (one.Text == "O" && four.Text == "O" && g == 0)
                {
                    seven.Text = "X";
                    g++;
                    count++;
                }
                else if (one.Text == "O" && seven.Text == "O" && d == 0)
                {
                    four.Text = "X";
                    d++;
                    count++;
                }
                else if (four.Text == "O" && seven.Text == "O" && a == 0)
                {
                    one.Text = "X";
                    a++;
                    count++;
                }
                else if (two.Text == "O" && five.Text == "O" && h == 0)
                {
                    eight.Text = "X";
                    h++;
                    count++;
                }
                else if (two.Text == "O" && eight.Text == "O" && j == 0)
                {
                    five.Text = "X";
                    j++;
                    count++;
                }
                else if (five.Text == "O" && eight.Text == "O" && b == 0)
                {
                    two.Text = "X";
                    b++;
                    count++;
                }
                else if (three.Text == "O" && six.Text == "O" && i == 0)
                {
                    nine.Text = "X";
                    i++;
                    count++;
                }
                else if (three.Text == "O" && nine.Text == "O" && f == 0)
                {
                    six.Text = "X";
                    f++;
                    count++;
                }
                else if (six.Text == "O" && nine.Text == "O" && c == 0)
                {
                    three.Text = "X";
                    c++;
                    count++;
                }

                else if (one.Text == "O" && five.Text == "O" && i == 0)
                {
                    nine.Text = "X";
                    i++;
                    count++;
                }
                else if (one.Text == "O" && nine.Text == "O" && j == 0)
                {
                    five.Text = "X";
                    j++;
                    count++;
                }
                else if (nine.Text == "O" && five.Text == "O" && a == 0)
                {
                    nine.Text = "X";
                    a++;
                    count++;
                }
                else if (a == 0)
                {
                    one.Text = "X";
                    a++;
                    count++;
                }
                else if (b == 0)
                {
                    two.Text = "X";
                    b++;
                    count++;
                }
                else if (c == 0)
                {
                    three.Text = "X";
                    c++;
                    count++;
                }
                else if (d == 0)
                {
                    four.Text = "X";
                    d++;
                    count++;
                }
                else if (j == 0)
                {
                    five.Text = "X";
                    j++;
                    count++;
                }
                else if (f == 0)
                {
                    six.Text = "X";
                    f++;
                    count++;
                }
                else if (g == 0)
                {
                    seven.Text = "X";
                    g++;
                    count++;
                }
                else if (h == 0)
                {
                    eight.Text = "X";
                    h++;
                    count++;
                }
                else if (i == 0)
                {
                    nine.Text = "X";
                    i++;
                    count++;
                }
                //else if (count % 2 == 0 && count > 0) six.Text = "X";
            }
           // f++;
        }

        private void eight_Click(object sender, EventArgs e)
        {
            if (h == 0)
            {
                SoundPlayer playe = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Click.wav");
                playe.Play();
                Toss.Text = "";
                count++;
                //if (count % 2 == 1 && count > 0) 
                eight.Text = "O";
                h++;
                //else if (count % 2 == 0 && count > 0)
                if (one.Text == "O" && two.Text == "O" && c == 0)
                {
                    three.Text = "X";
                    c++;
                    count++;
                }
                else if (one.Text == "O" && three.Text == "O" && b == 0)
                {
                    two.Text = "X";
                    b++;
                    count++;
                }
                else if (two.Text == "O" && three.Text == "O" && a == 0)
                {
                    one.Text = "X";
                    a++;
                    count++;
                }
                else if (four.Text == "O" && five.Text == "O" && f == 0)
                {
                    six.Text = "X";
                    f++;
                    count++;
                }
                else if (four.Text == "O" && five.Text == "O" && j == 0)
                {
                    five.Text = "X";
                    j++;
                    count++;
                }
                else if (six.Text == "O" && five.Text == "O" && d == 0)
                {
                    four.Text = "X";
                    d++;
                    count++;
                }
                else if (seven.Text == "O" && eight.Text == "O" && i == 0)
                {
                    nine.Text = "X";
                    i++;
                    count++;
                }
                else if (seven.Text == "O" && nine.Text == "O" && h == 0)
                {
                    eight.Text = "X";
                    h++;
                    count++;
                }
                else if (eight.Text == "O" && nine.Text == "O" && g == 0)
                {
                    seven.Text = "X";
                    g++;
                    count++;
                }
                else if (one.Text == "O" && four.Text == "O" && g == 0)
                {
                    seven.Text = "X";
                    g++;
                    count++;
                }
                else if (one.Text == "O" && seven.Text == "O" && d == 0)
                {
                    four.Text = "X";
                    d++;
                    count++;
                }
                else if (four.Text == "O" && seven.Text == "O" && a == 0)
                {
                    one.Text = "X";
                    a++;
                    count++;
                }
                else if (two.Text == "O" && five.Text == "O" && h == 0)
                {
                    eight.Text = "X";
                    h++;
                    count++;
                }
                else if (two.Text == "O" && eight.Text == "O" && j == 0)
                {
                    five.Text = "X";
                    j++;
                    count++;
                }
                else if (five.Text == "O" && eight.Text == "O" && b == 0)
                {
                    two.Text = "X";
                    b++;
                    count++;
                }
                else if (three.Text == "O" && six.Text == "O" && i == 0)
                {
                    nine.Text = "X";
                    i++;
                    count++;
                }
                else if (three.Text == "O" && nine.Text == "O" && f == 0)
                {
                    six.Text = "X";
                    f++;
                    count++;
                }
                else if (six.Text == "O" && nine.Text == "O" && c == 0)
                {
                    three.Text = "X";
                    c++;
                    count++;
                }

                else if (one.Text == "O" && five.Text == "O" && i == 0)
                {
                    nine.Text = "X";
                    i++;
                    count++;
                }
                else if (one.Text == "O" && nine.Text == "O" && j == 0)
                {
                    five.Text = "X";
                    j++;
                    count++;
                }
                else if (nine.Text == "O" && five.Text == "O" && a == 0)
                {
                    nine.Text = "X";
                    a++;
                    count++;
                }
                else if (a == 0)
                {
                    one.Text = "X";
                    a++;
                    count++;
                }
                else if (b == 0)
                {
                    two.Text = "X";
                    b++;
                    count++;
                }
                else if (c == 0)
                {
                    three.Text = "X";
                    c++;
                    count++;
                }
                else if (d == 0)
                {
                    four.Text = "X";
                    d++;
                    count++;
                }
                else if (j == 0)
                {
                    five.Text = "X";
                    j++;
                    count++;
                }
                else if (f == 0)
                {
                    six.Text = "X";
                    f++;
                    count++;
                }
                else if (g == 0)
                {
                    seven.Text = "X";
                    g++;
                    count++;
                }
                else if (h == 0)
                {
                    eight.Text = "X";
                    h++;
                    count++;
                }
                else if (i == 0)
                {
                    nine.Text = "X";
                    i++;
                    count++;
                }
            }
            
        }

        private void five_Click(object sender, EventArgs e)
        {
            if (j == 0)
            {
                SoundPlayer playe = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Click.wav");
                playe.Play();
                Toss.Text = "";
                count++;
                //if (count % 2 == 1 && count > 0) 
                five.Text = "O";
                j++;
                //else if (count % 2 == 0 && count > 0) 
                if (one.Text == "O" && two.Text == "O" && c == 0)
                {
                    three.Text = "X";
                    c++;
                }
                else if (one.Text == "O" && three.Text == "O" && b == 0)
                {
                    two.Text = "X";
                    b++;
                }
                else if (two.Text == "O" && three.Text == "O" && a == 0)
                {
                    one.Text = "X";
                    a++;
                }
                else if (four.Text == "O" && five.Text == "O" && f == 0)
                {
                    six.Text = "X";
                    f++;
                }
                else if (four.Text == "O" && five.Text == "O" && j == 0)
                {
                    five.Text = "X";
                    j++;
                }
                else if (six.Text == "O" && five.Text == "O" && d == 0)
                {
                    four.Text = "X";
                    d++;
                }
                else if (seven.Text == "O" && eight.Text == "O" && i == 0)
                {
                    nine.Text = "X";
                    i++;
                }
                else if (seven.Text == "O" && nine.Text == "O" && h == 0)
                {
                    eight.Text = "X";
                    h++;
                }
                else if (eight.Text == "O" && nine.Text == "O" && g == 0)
                {
                    seven.Text = "X";
                    g++;
                }
                else if (one.Text == "O" && four.Text == "O" && g == 0)
                {
                    seven.Text = "X";
                    g++;
                }
                else if (one.Text == "O" && seven.Text == "O" && d == 0)
                {
                    four.Text = "X";
                    d++;
                }
                else if (four.Text == "O" && seven.Text == "O" && a == 0)
                {
                    one.Text = "X";
                    a++;
                }
                else if (two.Text == "O" && five.Text == "O" && h == 0)
                {
                    eight.Text = "X";
                    h++;
                }
                else if (two.Text == "O" && eight.Text == "O" && j == 0)
                {
                    five.Text = "X";
                    j++;
                }
                else if (five.Text == "O" && eight.Text == "O" && b == 0)
                {
                    two.Text = "X";
                    b++;
                }
                else if (three.Text == "O" && six.Text == "O" && i == 0)
                {
                    nine.Text = "X";
                    i++;
                }
                else if (three.Text == "O" && nine.Text == "O" && f == 0)
                {
                    six.Text = "X";
                    f++;
                }
                else if (six.Text == "O" && nine.Text == "O" && c == 0)
                {
                    three.Text = "X";
                    c++;
                }

                else if (one.Text == "O" && five.Text == "O" && i == 0)
                {
                    nine.Text = "X";
                    i++;
                }
                else if (one.Text == "O" && nine.Text == "O" && j == 0)
                {
                    five.Text = "X";
                    j++;
                }
                else if (nine.Text == "O" && five.Text == "O" && a == 0)
                {
                    nine.Text = "X";
                    a++;
                }
                else if (a == 0)
                {
                    one.Text = "X";
                    a++;
                }
                else if (b == 0)
                {
                    two.Text = "X";
                    b++;
                }
                else if (c == 0)
                {
                    three.Text = "X";
                    c++;
                }
                else if (d == 0)
                {
                    four.Text = "X";
                    d++;
                }
                else if (j == 0)
                {
                    five.Text = "X";
                    j++;
                }
                else if (f == 0)
                {
                    six.Text = "X";
                    f++;
                }
                else if (g == 0)
                {
                    seven.Text = "X";
                    g++;
                }
                else if (h == 0)
                {
                    eight.Text = "X";
                    h++;
                }
                else if (i == 0)
                {
                    nine.Text = "X";
                    i++;
                }
            }
            
        }

        private void seven_Click(object sender, EventArgs e)
        {
            if (g == 0)
            {
                SoundPlayer playe = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Click.wav");
                playe.Play();
                Toss.Text = "";
                count++;
                //if (count % 2 == 1 && count > 0) 
                seven.Text = "O";
                g++;
                //else if (count % 2 == 0 && count > 0) 
                if (one.Text == "O" && two.Text == "O" && c == 0)
                {
                    three.Text = "X";
                    c++;
                }
                else if (one.Text == "O" && three.Text == "O" && b == 0)
                {
                    two.Text = "X";
                    b++;
                }
                else if (two.Text == "O" && three.Text == "O" && a == 0)
                {
                    one.Text = "X";
                    a++;
                }
                else if (four.Text == "O" && five.Text == "O" && f == 0)
                {
                    six.Text = "X";
                    f++;
                }
                else if (four.Text == "O" && five.Text == "O" && j == 0)
                {
                    five.Text = "X";
                    j++;
                }
                else if (six.Text == "O" && five.Text == "O" && d == 0)
                {
                    four.Text = "X";
                    d++;
                }
                else if (seven.Text == "O" && eight.Text == "O" && i == 0)
                {
                    nine.Text = "X";
                    i++;
                }
                else if (seven.Text == "O" && nine.Text == "O" && h == 0)
                {
                    eight.Text = "X";
                    h++;
                }
                else if (eight.Text == "O" && nine.Text == "O" && g == 0)
                {
                    seven.Text = "X";
                    g++;
                }
                else if (one.Text == "O" && four.Text == "O" && g == 0)
                {
                    seven.Text = "X";
                    g++;
                }
                else if (one.Text == "O" && seven.Text == "O" && d == 0)
                {
                    four.Text = "X";
                    d++;
                }
                else if (four.Text == "O" && seven.Text == "O" && a == 0)
                {
                    one.Text = "X";
                    a++;
                }
                else if (two.Text == "O" && five.Text == "O" && h == 0)
                {
                    eight.Text = "X";
                    h++;
                }
                else if (two.Text == "O" && eight.Text == "O" && j == 0)
                {
                    five.Text = "X";
                    j++;
                }
                else if (five.Text == "O" && eight.Text == "O" && b == 0)
                {
                    two.Text = "X";
                    b++;
                }
                else if (three.Text == "O" && six.Text == "O" && i == 0)
                {
                    nine.Text = "X";
                    i++;
                }
                else if (three.Text == "O" && nine.Text == "O" && f == 0)
                {
                    six.Text = "X";
                    f++;
                }
                else if (six.Text == "O" && nine.Text == "O" && c == 0)
                {
                    three.Text = "X";
                    c++;
                }

                else if (one.Text == "O" && five.Text == "O" && i == 0)
                {
                    nine.Text = "X";
                    i++;
                }
                else if (one.Text == "O" && nine.Text == "O" && j == 0)
                {
                    five.Text = "X";
                    j++;
                }
                else if (nine.Text == "O" && five.Text == "O" && a == 0)
                {
                    nine.Text = "X";
                    a++;
                }
                else if (a == 0)
                {
                    one.Text = "X";
                    a++;
                }
                else if (b == 0)
                {
                    two.Text = "X";
                    b++;
                }
                else if (c == 0)
                {
                    three.Text = "X";
                    c++;
                }
                else if (d == 0)
                {
                    four.Text = "X";
                    d++;
                }
                else if (j == 0)
                {
                    five.Text = "X";
                    j++;
                }
                else if (f == 0)
                {
                    six.Text = "X";
                    f++;
                }
                else if (g == 0)
                {
                    seven.Text = "X";
                    g++;
                }
                else if (h == 0)
                {
                    eight.Text = "X";
                    h++;
                }
                else if (i == 0)
                {
                    nine.Text = "X";
                    i++;
                }
            }
           
        }

        private void three_Click(object sender, EventArgs e)
        {
            if (c == 0)
            {
                SoundPlayer playe = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Click.wav");
                playe.Play();
                Toss.Text = "";
                count++;
                //if (count % 2 == 1 && count > 0) 
                three.Text = "O";
                c++;
                //else if (count % 2 == 0 && count > 0) 
                if (one.Text == "O" && two.Text == "O" && c == 0)
                {
                    three.Text = "X";
                    c++;
                }
                else if (one.Text == "O" && three.Text == "O" && b == 0)
                {
                    two.Text = "X";
                    b++;
                }
                else if (two.Text == "O" && three.Text == "O" && a == 0)
                {
                    one.Text = "X";
                    a++;
                }
                else if (four.Text == "O" && five.Text == "O" && f == 0)
                {
                    six.Text = "X";
                    f++;
                }
                else if (four.Text == "O" && five.Text == "O" && j == 0)
                {
                    five.Text = "X";
                    j++;
                }
                else if (six.Text == "O" && five.Text == "O" && d == 0)
                {
                    four.Text = "X";
                    d++;
                }
                else if (seven.Text == "O" && eight.Text == "O" && i == 0)
                {
                    nine.Text = "X";
                    i++;
                }
                else if (seven.Text == "O" && nine.Text == "O" && h == 0)
                {
                    eight.Text = "X";
                    h++;
                }
                else if (eight.Text == "O" && nine.Text == "O" && g == 0)
                {
                    seven.Text = "X";
                    g++;
                }
                else if (one.Text == "O" && four.Text == "O" && g == 0)
                {
                    seven.Text = "X";
                    g++;
                }
                else if (one.Text == "O" && seven.Text == "O" && d == 0)
                {
                    four.Text = "X";
                    d++;
                }
                else if (four.Text == "O" && seven.Text == "O" && a == 0)
                {
                    one.Text = "X";
                    a++;
                }
                else if (two.Text == "O" && five.Text == "O" && h == 0)
                {
                    eight.Text = "X";
                    h++;
                }
                else if (two.Text == "O" && eight.Text == "O" && j == 0)
                {
                    five.Text = "X";
                    j++;
                }
                else if (five.Text == "O" && eight.Text == "O" && b == 0)
                {
                    two.Text = "X";
                    b++;
                }
                else if (three.Text == "O" && six.Text == "O" && i == 0)
                {
                    nine.Text = "X";
                    i++;
                }
                else if (three.Text == "O" && nine.Text == "O" && f == 0)
                {
                    six.Text = "X";
                    f++;
                }
                else if (six.Text == "O" && nine.Text == "O" && c == 0)
                {
                    three.Text = "X";
                    c++;
                }

                else if (one.Text == "O" && five.Text == "O" && i == 0)
                {
                    nine.Text = "X";
                    i++;
                }
                else if (one.Text == "O" && nine.Text == "O" && j == 0)
                {
                    five.Text = "X";
                    j++;
                }
                else if (nine.Text == "O" && five.Text == "O" && a == 0)
                {
                    nine.Text = "X";
                    a++;
                }
                else if (a == 0)
                {
                    one.Text = "X";
                    a++;
                }
                else if (b == 0)
                {
                    two.Text = "X";
                    b++;
                }
                else if (c == 0)
                {
                    three.Text = "X";
                    c++;
                }
                else if (d == 0)
                {
                    four.Text = "X";
                    d++;
                }
                else if (j == 0)
                {
                    five.Text = "X";
                    j++;
                }
                else if (f == 0)
                {
                    six.Text = "X";
                    f++;
                }
                else if (g == 0)
                {
                    seven.Text = "X";
                    g++;
                }
                else if (h == 0)
                {
                    eight.Text = "X";
                    h++;
                }
                else if (i == 0)
                {
                    nine.Text = "X";
                    i++;
                }
            }
            
        }

        private void four_Click(object sender, EventArgs e)
        {
            if (d == 0)
            {
                SoundPlayer playe = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Click.wav");
                playe.Play();
                Toss.Text = "";
                count++;
                //if (count % 2 == 1 && count > 0) 
                four.Text = "O";
                d++;
                //else if (count % 2 == 0 && count > 0) 
                if (one.Text == "O" && two.Text == "O" && c == 0)
                {
                    three.Text = "X";
                    c++;
                }
                else if (one.Text == "O" && three.Text == "O" && b == 0)
                {
                    two.Text = "X";
                    b++;
                }
                else if (two.Text == "O" && three.Text == "O" && a == 0)
                {
                    one.Text = "X";
                    a++;
                }
                else if (four.Text == "O" && five.Text == "O" && f == 0)
                {
                    six.Text = "X";
                    f++;
                }
                else if (four.Text == "O" && five.Text == "O" && j == 0)
                {
                    five.Text = "X";
                    j++;
                }
                else if (six.Text == "O" && five.Text == "O" && d == 0)
                {
                    four.Text = "X";
                    d++;
                }
                else if (seven.Text == "O" && eight.Text == "O" && i == 0)
                {
                    nine.Text = "X";
                    i++;
                }
                else if (seven.Text == "O" && nine.Text == "O" && h == 0)
                {
                    eight.Text = "X";
                    h++;
                }
                else if (eight.Text == "O" && nine.Text == "O" && g == 0)
                {
                    seven.Text = "X";
                    g++;
                }
                else if (one.Text == "O" && four.Text == "O" && g == 0)
                {
                    seven.Text = "X";
                    g++;
                }
                else if (one.Text == "O" && seven.Text == "O" && d == 0)
                {
                    four.Text = "X";
                    d++;
                }
                else if (four.Text == "O" && seven.Text == "O" && a == 0)
                {
                    one.Text = "X";
                    a++;
                }
                else if (two.Text == "O" && five.Text == "O" && h == 0)
                {
                    eight.Text = "X";
                    h++;
                }
                else if (two.Text == "O" && eight.Text == "O" && j == 0)
                {
                    five.Text = "X";
                    j++;
                }
                else if (five.Text == "O" && eight.Text == "O" && b == 0)
                {
                    two.Text = "X";
                    b++;
                }
                else if (three.Text == "O" && six.Text == "O" && i == 0)
                {
                    nine.Text = "X";
                    i++;
                }
                else if (three.Text == "O" && nine.Text == "O" && f == 0)
                {
                    six.Text = "X";
                    f++;
                }
                else if (six.Text == "O" && nine.Text == "O" && c == 0)
                {
                    three.Text = "X";
                    c++;
                }

                else if (one.Text == "O" && five.Text == "O" && i == 0)
                {
                    nine.Text = "X";
                    i++;
                }
                else if (one.Text == "O" && nine.Text == "O" && j == 0)
                {
                    five.Text = "X";
                    j++;
                }
                else if (nine.Text == "O" && five.Text == "O" && a == 0)
                {
                    nine.Text = "X";
                    a++;
                }
                else if (a == 0)
                {
                    one.Text = "X";
                    a++;
                }
                else if (b == 0)
                {
                    two.Text = "X";
                    b++;
                }
                else if (c == 0)
                {
                    three.Text = "X";
                    c++;
                }
                else if (d == 0)
                {
                    four.Text = "X";
                    d++;
                }
                else if (j == 0)
                {
                    five.Text = "X";
                    j++;
                }
                else if (f == 0)
                {
                    six.Text = "X";
                    f++;
                }
                else if (g == 0)
                {
                    seven.Text = "X";
                    g++;
                }
                else if (h == 0)
                {
                    eight.Text = "X";
                    h++;
                }
                else if (i == 0)
                {
                    nine.Text = "X";
                    i++;
                }
            }
           
        }

        private void two_Click(object sender, EventArgs e)
        {
            if (b == 0)
            {
                SoundPlayer playe = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Click.wav");
                playe.Play();
                Toss.Text = "";
                count++;
                //if (count % 2 == 1 && count > 0) 
                two.Text = "O";
                b++;
                //else if (count % 2 == 0 && count > 0) 
                if (one.Text == "O" && two.Text == "O" && c == 0)
                {
                    three.Text = "X";
                    c++;
                }
                else if (one.Text == "O" && three.Text == "O" && b == 0)
                {
                    two.Text = "X";
                    b++;
                }
                else if (two.Text == "O" && three.Text == "O" && a == 0)
                {
                    one.Text = "X";
                    a++;
                }
                else if (four.Text == "O" && five.Text == "O" && f == 0)
                {
                    six.Text = "X";
                    f++;
                }
                else if (four.Text == "O" && five.Text == "O" && j == 0)
                {
                    five.Text = "X";
                    j++;
                }
                else if (six.Text == "O" && five.Text == "O" && d == 0)
                {
                    four.Text = "X";
                    d++;
                }
                else if (seven.Text == "O" && eight.Text == "O" && i == 0)
                {
                    nine.Text = "X";
                    i++;
                }
                else if (seven.Text == "O" && nine.Text == "O" && h == 0)
                {
                    eight.Text = "X";
                    h++;
                }
                else if (eight.Text == "O" && nine.Text == "O" && g == 0)
                {
                    seven.Text = "X";
                    g++;
                }
                else if (one.Text == "O" && four.Text == "O" && g == 0)
                {
                    seven.Text = "X";
                    g++;
                }
                else if (one.Text == "O" && seven.Text == "O" && d == 0)
                {
                    four.Text = "X";
                    d++;
                }
                else if (four.Text == "O" && seven.Text == "O" && a == 0)
                {
                    one.Text = "X";
                    a++;
                }
                else if (two.Text == "O" && five.Text == "O" && h == 0)
                {
                    eight.Text = "X";
                    h++;
                }
                else if (two.Text == "O" && eight.Text == "O" && j == 0)
                {
                    five.Text = "X";
                    j++;
                }
                else if (five.Text == "O" && eight.Text == "O" && b == 0)
                {
                    two.Text = "X";
                    b++;
                }
                else if (three.Text == "O" && six.Text == "O" && i == 0)
                {
                    nine.Text = "X";
                    i++;
                }
                else if (three.Text == "O" && nine.Text == "O" && f == 0)
                {
                    six.Text = "X";
                    f++;
                }
                else if (six.Text == "O" && nine.Text == "O" && c == 0)
                {
                    three.Text = "X";
                    c++;
                }

                else if (one.Text == "O" && five.Text == "O" && i == 0)
                {
                    nine.Text = "X";
                    i++;
                }
                else if (one.Text == "O" && nine.Text == "O" && j == 0)
                {
                    five.Text = "X";
                    j++;
                }
                else if (nine.Text == "O" && five.Text == "O" && a == 0)
                {
                    nine.Text = "X";
                    a++;
                }
                else if (a == 0)
                {
                    one.Text = "X";
                    a++;
                }
                else if (b == 0)
                {
                    two.Text = "X";
                    b++;
                }
                else if (c == 0)
                {
                    three.Text = "X";
                    c++;
                }
                else if (d == 0)
                {
                    four.Text = "X";
                    d++;
                }
                else if (j == 0)
                {
                    five.Text = "X";
                    j++;
                }
                else if (f == 0)
                {
                    six.Text = "X";
                    f++;
                }
                else if (g == 0)
                {
                    seven.Text = "X";
                    g++;
                }
                else if (h == 0)
                {
                    eight.Text = "X";
                    h++;
                }
                else if (i == 0)
                {
                    nine.Text = "X";
                    i++;
                }
            }
           
        }

        private void nine_Click(object sender, EventArgs e)
        {
            if (i == 0)
            {
                SoundPlayer playe = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Click.wav");
                playe.Play();
                Toss.Text = "";
                count++;
               // if (count % 2 == 1 && count > 0) 
                nine.Text = "O";
                i++;
                //else if (count % 2 == 0 && count > 0)
                if (one.Text == "O" && two.Text == "O" && c == 0)
                {
                    three.Text = "X";
                    c++;
                }
                else if (one.Text == "O" && three.Text == "O" && b == 0)
                {
                    two.Text = "X";
                    b++;
                }
                else if (two.Text == "O" && three.Text == "O" && a == 0)
                {
                    one.Text = "X";
                    a++;
                }
                else if (four.Text == "O" && five.Text == "O" && f == 0)
                {
                    six.Text = "X";
                    f++;
                }
                else if (four.Text == "O" && five.Text == "O" && j == 0)
                {
                    five.Text = "X";
                    j++;
                }
                else if (six.Text == "O" && five.Text == "O" && d == 0)
                {
                    four.Text = "X";
                    d++;
                }
                else if (seven.Text == "O" && eight.Text == "O" && i == 0)
                {
                    nine.Text = "X";
                    i++;
                }
                else if (seven.Text == "O" && nine.Text == "O" && h == 0)
                {
                    eight.Text = "X";
                    h++;
                }
                else if (eight.Text == "O" && nine.Text == "O" && g == 0)
                {
                    seven.Text = "X";
                    g++;
                }
                else if (one.Text == "O" && four.Text == "O" && g == 0)
                {
                    seven.Text = "X";
                    g++;
                }
                else if (one.Text == "O" && seven.Text == "O" && d == 0)
                {
                    four.Text = "X";
                    d++;
                }
                else if (four.Text == "O" && seven.Text == "O" && a == 0)
                {
                    one.Text = "X";
                    a++;
                }
                else if (two.Text == "O" && five.Text == "O" && h == 0)
                {
                    eight.Text = "X";
                    h++;
                }
                else if (two.Text == "O" && eight.Text == "O" && j == 0)
                {
                    five.Text = "X";
                    j++;
                }
                else if (five.Text == "O" && eight.Text == "O" && b == 0)
                {
                    two.Text = "X";
                    b++;
                }
                else if (three.Text == "O" && six.Text == "O" && i == 0)
                {
                    nine.Text = "X";
                    i++;
                }
                else if (three.Text == "O" && nine.Text == "O" && f == 0)
                {
                    six.Text = "X";
                    f++;
                }
                else if (six.Text == "O" && nine.Text == "O" && c == 0)
                {
                    three.Text = "X";
                    c++;
                }

                else if (one.Text == "O" && five.Text == "O" && i == 0)
                {
                    nine.Text = "X";
                    i++;
                }
                else if (one.Text == "O" && nine.Text == "O" && j == 0)
                {
                    five.Text = "X";
                    j++;
                }
                else if (nine.Text == "O" && five.Text == "O" && a == 0)
                {
                    nine.Text = "X";
                    a++;
                }
                else if (a == 0)
                {
                    one.Text = "X";
                    a++;
                }
                else if (b == 0)
                {
                    two.Text = "X";
                    b++;
                }
                else if (c == 0)
                {
                    three.Text = "X";
                    c++;
                }
                else if (d == 0)
                {
                    four.Text = "X";
                    d++;
                }
                else if (j == 0)
                {
                    five.Text = "X";
                    j++;
                }
                else if (f == 0)
                {
                    six.Text = "X";
                    f++;
                }
                else if (g == 0)
                {
                    seven.Text = "X";
                    g++;
                }
                else if (h == 0)
                {
                    eight.Text = "X";
                    h++;
                }
                else if (i == 0)
                {
                    nine.Text = "X";
                    i++;
                }
            }
     
        }


        private void one_Click(object sender, EventArgs e)
        {
            if (a == 0)
            {
                SoundPlayer playe = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Click.wav");
                playe.Play();
                Toss.Text = "";
                count++;
                //if (count % 2 == 1 && count > 0) 
                one.Text = "O";
                a++;
                //else if (count % 2 == 0 && count > 0) 
                if (one.Text == "O" && two.Text == "O" && c == 0) {
                    three.Text = "X";
                    c++;
                }
                else if (one.Text == "O" && three.Text == "O" && b == 0) {
                    two.Text = "X";
                    b++;
                }
                else if (two.Text == "O" && three.Text == "O" && a == 0) {
                    one.Text = "X";
                    a++;
                }
                else if (four.Text == "O" && five.Text == "O" && f == 0)
                {
                    six.Text = "X";
                    f++;
                }
                else if (four.Text == "O" && five.Text == "O" && j == 0)
                {
                    five.Text = "X";
                    j++;
                }
                else if (six.Text == "O" && five.Text == "O" && d == 0)
                {
                    four.Text = "X";
                    d++;
                }
                else if (seven.Text == "O" && eight.Text == "O" && i == 0)
                {
                    nine.Text = "X";
                    i++;
                }
                else if (seven.Text == "O" && nine.Text == "O" && h == 0)
                {
                    eight.Text = "X";
                    h++;
                }
                else if (eight.Text == "O" && nine.Text == "O" && g == 0)
                {
                    seven.Text = "X";
                    g++;
                }
                else if (one.Text == "O" && four.Text == "O" && g == 0)
                {
                    seven.Text = "X";
                    g++;
                }
                else if (one.Text == "O" && seven.Text == "O" && d == 0)
                {
                    four.Text = "X";
                    d++;
                }
                else if (four.Text == "O" && seven.Text == "O" && a == 0)
                {
                    one.Text = "X";
                    a++;
                }
                else if (two.Text == "O" && five.Text == "O" && h == 0)
                {
                    eight.Text = "X";
                    h++;
                }
                else if (two.Text == "O" && eight.Text == "O" && j == 0)
                {
                    five.Text = "X";
                    j++;
                }
                else if (five.Text == "O" && eight.Text == "O" && b == 0)
                {
                    two.Text = "X";
                    b++;
                }
                else if (three.Text == "O" && six.Text == "O" && i == 0)
                {
                    nine.Text = "X";
                    i++;
                }
                else if (three.Text == "O" && nine.Text == "O" && f == 0)
                {
                    six.Text = "X";
                    f++;
                }
                else if (six.Text == "O" && nine.Text == "O" && c == 0)
                {
                    three.Text = "X";
                    c++;
                }

                else if (one.Text == "O" && five.Text == "O" && i == 0)
                {
                    nine.Text = "X";
                    i++;
                }
                else if (one.Text == "O" && nine.Text == "O" && j == 0)
                {
                    five.Text = "X";
                    j++;
                }
                else if (nine.Text == "O" && five.Text == "O" && a == 0)
                {
                    nine.Text = "X";
                    a++;
                }
                else if(a==0) {
                    one.Text = "X";
                    a++;
                 }
                else if (b == 0)
                {
                    two.Text = "X";
                    b++;
                }
                else if (c == 0)
                {
                    three.Text = "X";
                    c++;
                }
                else if (d == 0)
                {
                    four.Text = "X";
                    d++;
                }
                else if (j == 0)
                {
                    five.Text = "X";
                    j++;
                }
                else if (f == 0)
                {
                    six.Text = "X";
                    f++;
                }
                else if (g == 0)
                {
                    seven.Text = "X";
                    g++;
                }
                else if (h == 0)
                {
                    eight.Text = "X";
                    h++;
                }
                else if (i == 0)
                {
                    nine.Text = "X";
                    i++;
                }
            }
         
        }
    }
}
