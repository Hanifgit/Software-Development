using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace DialogMessageBox
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void ButtonYes_Click(object sender, EventArgs e)
        {
           DialogResult dr = MessageBox.Show(" 1: To Purchase, Press = Yes. \n 2: For Trial Version, Press = 2 \n 3: Cancel Order",
               "Purchase Software", MessageBoxButtons.YesNoCancel,MessageBoxIcon.Information);
            if(dr== DialogResult.Yes)
            {
                TextYes.Text = "You have Purchase software, Congratulations.";
                TextCancle.Text = "......";
            }
            if (dr == DialogResult.No)
            {
                TextYes.Text = "30 Trial Version starts, Congratulations.";
                TextCancle.Text = "......";
            }
            if (dr == DialogResult.Cancel)
            {
                TextCancle.Text = "You have Cancelled the order.";
                TextYes.Text = "......";
            }
        }
    }
}
