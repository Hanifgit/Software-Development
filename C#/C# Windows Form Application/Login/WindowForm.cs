using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Login
{
    public partial class WindowForm : Form
    {
        public WindowForm()
        {
            InitializeComponent();
        }

        private void Label_Click(object sender, EventArgs e)
        {
            Label.Text = "Text Me!!";
        }

        private void SetButton_Click(object sender, EventArgs e)
        {
            Label.Text = "Hello Papon.";
        }

        private void CancleButton_Click(object sender, EventArgs e)
        {
            Label.Text = "Papon, You Are Naughty Boy.";
        }

        private void LogOutButton_Click(object sender, EventArgs e)
        {
            this.Hide();
            SignIn logout = new SignIn();
            logout.Show();
        }
    }
}
