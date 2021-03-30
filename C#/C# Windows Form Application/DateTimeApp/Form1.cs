using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace DateTimeApp
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label5_Click(object sender, EventArgs e)
        {

        }

        private void ShowButton_Click(object sender, EventArgs e)
        {
            label1.Text = DateTime.Value.ToString();
            label7.Text = DateTime.Value.ToString("dd MMMM, yyyy");
            label8.Text = DateTime.Value.ToLongDateString();
            label9.Text = DateTime.Value.ToShortTimeString();
            label10.Text = DateTime.Value.ToLongTimeString();
        }
    }
}
