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
    public partial class MainPanel : Form
    {
        public static string FP, SP;
        public MainPanel()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            FP = Player1.Text;
            SP = Player2.Text;
            this.Hide();
            Dashboard obj = new Dashboard();
            obj.Show();
        }

        private void Player1_Click(object sender, EventArgs e)
        {
            Player1.Text = "";
        }

        private void Player2_Click(object sender, EventArgs e)
        {
            Player2.Text = "";
        }
    }
}
