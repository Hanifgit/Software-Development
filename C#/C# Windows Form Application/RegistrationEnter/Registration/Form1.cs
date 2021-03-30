using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Registration
{
    public partial class Form1 : Form
    {
        public static string FName;
        public static string LName;
        public static string EmailName;
        public static Boolean SmsNotifications;
        public static Boolean ReportsServices;
        public static Boolean TransactionsReports;

        Confirmation c = new Confirmation();

        public Form1()
        {
            InitializeComponent();
        }

        private void SignButton_Click(object sender, EventArgs e)
        {
            FName = FirstNameTextBox.Text;
            LName = LastTextBox.Text;
            EmailName = EmailTextBox.Text;

            this.Hide();
            c.Show();
        }

        private void SMSCheckBox_CheckedChanged(object sender, EventArgs e)
        {
            if (SMSCheckBox.Checked)
            {
                SmsNotifications = true;
                SMS.Text = "Services Charges May Apply for SMS";
            }
            else
            {
                SmsNotifications = false;
                SMS.Text = "..........";
            }
        }

        private void ReportsCheckBox_CheckedChanged(object sender, EventArgs e)
        {
            if (ReportsCheckBox.Checked)
            {
                ReportsServices = true;
            }
            else
            {
                ReportsServices = false;
            }
        }

        private void TransactionsCheckBox_CheckedChanged(object sender, EventArgs e)
        {
            if (TransactionsCheckBox.Checked)
            {
                TransactionsReports = true;
                Transactions.Text = "Services Charges May Apply for Reports";
            }
            else
            {
                TransactionsReports = false;
                Transactions.Text = "..........";
            }
        }
    }
}
