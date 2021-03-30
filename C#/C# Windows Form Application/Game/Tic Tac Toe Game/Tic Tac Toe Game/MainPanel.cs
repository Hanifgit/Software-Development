using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Media;
using System.Runtime.InteropServices.WindowsRuntime;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Tic_Tac_Toe_Game
{
    public partial class MainPanel : Form
    {
        public Point mouseLocation;
        public static string FP, SP;
        public static int Played = 0,x = 0,ch1=0,ch2=0;
        public static SoundPlayer splayer = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\See.wav");
        public MainPanel()
        {
            InitializeComponent();
            splayer.Play();
            button_WOC1.Visible = false;
            Player1_.Visible = false;
            Player2.Visible = false;
            button_WOC2.Visible = false;
            pictureBox5.Visible = true;
        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {
           // this.Close();
            Application.Exit();
        }

        private void pictureBox2_Click(object sender, EventArgs e)
        {
            SoundPlayer splayer = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\See.wav");
            if (x % 2 == 0)
            {
                splayer.Stop();
                pictureBox2.Image = Image.FromFile("D:\\GitHub\\.NET-Dot-Net-\\C# Windows Form Application\\Game\\no_audio.png");
            }
            else
            {
                splayer.Play();
                pictureBox2.Image = Image.FromFile("D:\\GitHub\\.NET-Dot-Net-\\C# Windows Form Application\\Game\\icons8_sound_48px.png");
            }
            x++;
        }

        private void button1_Click_1(object sender, EventArgs e)
        {
            SoundPlayer playe = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Click.wav");
            playe.Play();

            Control ctrl = ((Control)sender);
            if (ch1 == 0 && ch2 == 0)
            switch (ctrl.BackColor.Name)
            {
                case "Red":
                    //button_WOC4.BackColor = Color.Yellow;
                   //button_WOC3.BackColor = Color.Purple;
                    break;
                case "Black":
                    //ctrl.BackColor = Color.White;
                   // button_WOC4.BackColor = Color.Yellow;
                   // button_WOC3.BackColor = Color.Purple;
                    break;
                case "White":
                    //ctrl.BackColor = Color.Red;
                    //button_WOC4.BackColor = Color.Yellow;
                    //button_WOC3.BackColor = Color.Purple;
                    break;
                case "Yellow":
                    //ctrl.BackColor = Color.Purple;
                   // button_WOC4.BackColor = Color.Yellow;
                   // button_WOC3.BackColor = Color.Purple;
                    //button_WOC4.BorderColor = Color.Yellow;
                    break;
                default:
                    button_WOC4.BorderColor = Color.Yellow;
                    button_WOC3.BorderColor = Color.Purple;
                    //ctrl.BackColor = Color.Red;
                    //button_WOC4.BackColor = Color.Yellow;
                    //button_WOC3.BackColor = Color.Purple;
                    break;
            }

            Dashboard.sp = 0;
            Dashboard.fp = 0;
            Dashboard.count = 0;
            Played = 0;
            if(ch2 == 1)
            {
                Computer obj = new Computer();
                obj.Show();
                this.Hide();
                ch2 = 0;
            }
            else if ((ch2==1 || ch1 ==1) && (Player1_.Text == "" || Player1_.Text == "First Player" || Player1_.Text == "Vaild Name"))
            {
                Player1_.Text = "Vaild Name";
                Player2.Text = "Vaild Name";
            }
            else if((ch2 == 1 || ch1 == 1) &&  (Player2.Text == "" || Player2.Text == "Second Player" || Player2.Text == "Vaild Name"))
            {
                Player1_.Text = "Vaild Name";
                Player2.Text = "Vaild Name";
            }
            else if(ch1==1)
            {
                splayer.Stop();
                FP = Player1_.Text;
                SP = Player2.Text;
                this.Hide();
                Dashboard obj = new Dashboard();
                obj.Show();
                ch1 = 0;
            }
        }

        private void MainPanel_MouseDown(object sender, MouseEventArgs e)
        {
            mouseLocation = new Point(-e.X, -e.Y);
           
        }

        private void MainPanel_MouseMove(object sender, MouseEventArgs e)
        {
            if (e.Button == MouseButtons.Left)
            {
                Point mousePos = Control.MousePosition;
                mousePos.Offset(mouseLocation.X, mouseLocation.Y);
                Location = mousePos;
            }
        }

        private void button_WOC4_Click(object sender, EventArgs e)
        {
            button_WOC1.Visible = true;
            Player1_.Visible = true;
            Player2.Visible = true;
            button_WOC2.Visible = true;
            pictureBox5.Visible = false;
            if (ch1==1) ch1 = 0;
            if (ch1 == 0)
            {
                Player1_.Text = "You";
                Player2.Text = "Computer";
                ch2 = 1;
                button_WOC4.BorderColor = Color.Yellow;
                button_WOC3.BorderColor = Color.MediumBlue;
                SoundPlayer playe = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Click.wav");
                playe.Play();
            }
           
            // this.Hide();
            // Computer obj = new Computer();
            //obj.Show();
        }

        private void Player1__Click(object sender, EventArgs e)
        {
            Player1_.Text = "";
        }

        private void label2_Click(object sender, EventArgs e)
        {
            button_WOC1.Visible = true;
            Player1_.Visible = true;
            Player2.Visible = true;
            button_WOC2.Visible = true;
            pictureBox5.Visible = false;
            if (ch1 == 1) ch1 = 0;
            if (ch1 == 0)
            {
                Player1_.Text = "You";
                Player2.Text = "Computer";
                ch2 = 1;
                button_WOC4.BorderColor = Color.Yellow;
                button_WOC3.BorderColor = Color.MediumBlue;
                SoundPlayer playe = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Click.wav");
                playe.Play();
            }
            //this.Hide();
            // Computer obj = new Computer();
            //obj.Show();
        }

        private void button_WOC3_Click(object sender, EventArgs e)
        {
            pictureBox5.Visible = false;
            button_WOC1.Visible = true;
            Player1_.Visible = true;
            Player2.Visible = true;
            button_WOC2.Visible = true;
            if (ch2 == 1) ch2 = 0;
            if (ch2 == 0)
            {
                ch1 = 1;
                button_WOC3.BorderColor = Color.Purple;
                button_WOC4.BorderColor = Color.DarkOrange;
                SoundPlayer playe = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Click.wav");
                playe.Play();
            }
             if (Player1_.Text == "First Player" || Player1_.Text == "Vaild Name" || Player1_.Text == "You")
            {
                Player1_.Text = "Vaild Name";
                Player2.Text = "Vaild Name";
            }
            if (Player2.Text == "Second Player" || Player2.Text == "Vaild Name" || Player2.Text == "Computer")
            {
                Player1_.Text = "Vaild Name";
                Player2.Text = "Vaild Name";
            }

        }

        private void label3_Click(object sender, EventArgs e)
        {
            pictureBox5.Visible = false;
            button_WOC1.Visible = true;
            Player1_.Visible = true;
            Player2.Visible = true;
            button_WOC2.Visible = true;

            if (ch2 == 1) ch2 = 0;
            if (ch2 == 0)
            {
                ch1 = 1;
                button_WOC3.BorderColor = Color.Purple;
                button_WOC4.BorderColor = Color.DarkOrange;
                SoundPlayer playe = new SoundPlayer(@"D:\GitHub\.NET-Dot-Net-\C# Windows Form Application\Game\Click.wav");
                playe.Play();
            }
            if (Player1_.Text == "First Player" || Player1_.Text == "Vaild Name" || Player1_.Text == "You")
            {
                Player1_.Text = "Vaild Name";
                Player2.Text = "Vaild Name";
            }
            if (Player2.Text == "Second Player" || Player2.Text == "Vaild Name" || Player2.Text == "Computer")
            {
                Player1_.Text = "Vaild Name";
                Player2.Text = "Vaild Name";
            }
        }

        private void Player2_Click_1(object sender, EventArgs e)
        {
            Player2.Text = "";
        }
    }
}
