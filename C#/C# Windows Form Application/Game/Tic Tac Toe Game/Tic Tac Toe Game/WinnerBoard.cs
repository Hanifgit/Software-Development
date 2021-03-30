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
    public partial class WinnerBoard : Form
    {
        public WinnerBoard()
        {
            InitializeComponent();
        }

        private void WinnerBoard_Load(object sender, EventArgs e)
        {
            if(Dashboard.name =="" ) Winner.Text =  "Draw this game";
            else if(Dashboard.name != "") Winner.Text = "Congratulations " + Dashboard.name + " are winner";
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Dashboard.count = Dashboard.fp = Dashboard.sp = MainPanel.Played = 0;
            this.Close();
            MainPanel obj = new MainPanel();
            obj.Show();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Dashboard.name ="";
            Dashboard.count = 0;
            this.Close();
            Dashboard obj = new Dashboard();
            obj.Show();
        }
    }
}
