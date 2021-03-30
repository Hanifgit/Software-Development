using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace RadioButton
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void SubmitButton_Click(object sender, EventArgs e)
        {
            string input;

            if (RadioButton1.Checked){
                input = RadioButton1.Text;
                MessageBox.Show(input);
            }

            if (RadioButton2.Checked){
                input = RadioButton2.Text;
                MessageBox.Show(input);
            }

            if (RadioButton3.Checked){
                input = RadioButton3.Text;
                MessageBox.Show(input);
            }
        }
    }
}
