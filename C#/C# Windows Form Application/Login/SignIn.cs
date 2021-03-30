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
    public partial class SignIn : Form
    {
        public SignIn()
        {
            InitializeComponent();
        }

        private void Login_Click(object sender, EventArgs e)
        {
            EnterLogin();
        }

        private void EnterLogin()
        {
            string id = UserId.Text;
            string Pass = Password.Text;

            if (id == "Papon" && Pass == "28517")
            {
                this.Hide();

                WindowForm F = new WindowForm();
                F.Show();
            }
            else
            {
                MessageBox.Show("User Id And Password is Incorrect...");
            }
        }

        private void ResetSignIn()
        {
            UserId.Text = "";
            Password.Text = "";
        }
        private void Reset_Click(object sender, EventArgs e)
        {
            ResetSignIn();
        }

        private void Password_KeyPress(object sender, KeyPressEventArgs e)
        {
            if(e.KeyChar == (char)Keys.Enter)
            {
                EnterLogin();
            }
            if (e.KeyChar == (char)Keys.F1)
            {
                ResetSignIn();
            }
        }
    }
}
