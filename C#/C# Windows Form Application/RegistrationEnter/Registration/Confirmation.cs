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
    public partial class Confirmation : Form
    {
        public Confirmation()
        {
            InitializeComponent();
        }

        private void Confirmation_Load(object sender, EventArgs e)
        {
            FirstNameLabel.Text = Form1.FName;
            LastNameLabel.Text = Form1.LName;
            EmailLabel.Text = Form1.EmailName;

            if (Form1.SmsNotifications)
            {
                SMSLabel.Text = "✔";
            }

            if (Form1.ReportsServices)
            {
                ReportsLabel.Text = "✔";
            }

            if (Form1.TransactionsReports)
            {
                TransactionsLabel.Text = "✔";
            }
        }
    }
}
