using DataBaseProject.DatabaseProject;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace DataBaseProject
{
    public partial class SignUp : Form
    {
        Db
        public SignUp()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void textSignUP_Click(object sender, EventArgs e)
        {
            string userName = textName.Text;
            string userEmail = textEmail.Text;
            string userPassword = textPassword.Text;
            string userCountry = textCountry.Text;

            if (userName.Equals(""))
            {
                MessageBox.Show("Please enter your user name.");
            }
            else if (userEmail.Equals(""))
            {
                MessageBox.Show("Please enter your Email.");
            }
            else if (userPassword.Equals(""))
            {
                MessageBox.Show("Please enter your password.");
            }
            else if (userCountry.Equals(""))
            {
                MessageBox.Show("Please enter your country.");
            }
            else
            {

            }
        }
    }
}
