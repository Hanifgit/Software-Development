using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Tic_Tac_Toe_Game
{
    public partial class Dashboard : Form
    {
        public static string name;
        public static int count = 0, fp = 0, sp = 0;
        int a = 0,b = 0,c = 0,d = 0,j = 0,f = 0,g = 0,h = 0,i = 0;

        public Dashboard()
        {
            InitializeComponent();
        }

        private void one_Click(object sender, EventArgs e)
        {
            if (a==0)
            {
            count++;
            if (count % 2 == 1 && count > 0) one.Text = "O";
            else if (count % 2 == 0 && count > 0) one.Text = "X";
            }
            a++;
        }

        private void two_Click(object sender, EventArgs e)
        {
            if (b == 0)
            {
            count++;
            if (count % 2 == 1 && count > 0) two.Text = "O";
            else if (count % 2 == 0 && count > 0) two.Text = "X";
            }
            b++;
        }

        private void three_Click(object sender, EventArgs e)
        {
            if (c == 0)
            {
            count++;
            if (count % 2 == 1 && count > 0) three.Text = "O";
            else if (count % 2 == 0 && count > 0) three.Text = "X";
            }
            c++;
        }

        private void four_Click(object sender, EventArgs e)
        {
            if (d == 0)
            {
            count++;
            if (count % 2 == 1 && count > 0) four.Text = "O";
            else if (count % 2 == 0 && count > 0) four.Text = "X";
            }
            d++;
        }

        private void seven_Click(object sender, EventArgs e)
        {
            if (g == 0)
             {
            count++;
            if (count % 2 == 1 && count > 0) seven.Text = "O";
            else if (count % 2 == 0 && count > 0) seven.Text = "X";
            }
            g++;
        }

        private void eight_Click(object sender, EventArgs e)
        {

            if (h == 0)
            {
            count++;
            if (count % 2 == 1 && count > 0) eight.Text = "O";
            else if (count % 2 == 0 && count > 0) eight.Text = "X";
            }
            h++;
        }

        private void Dashboard_Load(object sender, EventArgs e)
        {
            FPP.Text = fp.ToString();
            SPP.Text = sp.ToString();

            // count = 0;
        }

        private void nine_Click(object sender, EventArgs e)
        {
            if (i == 0)
            {
            count++;
            if (count % 2 == 1 && count > 0) nine.Text = "O";
            else if (count % 2 == 0 && count > 0) nine.Text = "X";
            }
            i++;
        }

        private void panel_Paint(object sender, PaintEventArgs e)
        {
            Player1.Text = MainPanel.FP;
            Player2.Text = MainPanel.SP;
            if ((one.Text == "O" && two.Text == "O" && three.Text == "O") || (one.Text == "O" && four.Text == "O" && seven.Text == "O")
                || (five.Text == "O" && two.Text == "O" && eight.Text == "O") || (three.Text == "O" && six.Text == "O" && nine.Text == "O")
                || (five.Text == "O" && four.Text == "O" && six.Text == "O") || (five.Text == "O" && one.Text == "O" && nine.Text == "O")
                || (three.Text == "O" && seven.Text == "O" && five.Text == "O") || (eight.Text == "O" && nine.Text == "O" && seven.Text == "O"))
            {
                fp++;
                name = MainPanel.FP;
                this.Hide();
                WinnerBoard Board = new WinnerBoard();
                Board.Show();
            }

            if ((one.Text == "X" && two.Text == "X" && three.Text == "X") || (one.Text == "X" && four.Text == "X" && seven.Text == "X")
                || (five.Text == "X" && two.Text == "X" && eight.Text == "X") || (three.Text == "X" && six.Text == "X" && nine.Text == "X")
                || (five.Text == "X" && four.Text == "X" && six.Text == "X") || (five.Text == "X" && one.Text == "X" && nine.Text == "X")
                || (eight.Text == "X" && nine.Text == "X" && seven.Text == "X") || (three.Text == "O" && seven.Text == "O" && five.Text == "O"))
            {
                sp++;
                name = MainPanel.SP;
                this.Hide();
                WinnerBoard Board = new WinnerBoard();
                Board.Show();
            }
            if (count == 9)
            {
                this.Hide();
                WinnerBoard Board = new WinnerBoard();
                Board.Show();
            }
        }

        private void five_Click(object sender, EventArgs e)
        {
            if (j == 0)
            {
            count++;
            if (count % 2 == 1 && count > 0) five.Text = "O";
            else if (count % 2 == 0 && count > 0) five.Text = "X";
            }
            j++;
        }

        private void six_Click(object sender, EventArgs e)
        {
            if (f == 0)
            {
                count++;
                if (count % 2 == 1 && count > 0) six.Text = "O";
                else if (count % 2 == 0 && count > 0) six.Text = "X";
            }
            f++;
        }
    }
}
