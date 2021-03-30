using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace FlighBooking
{
    public partial class DocumentNo : Form
    {
        public static Boolean password, IdCardNo;
        public static string To, From, StartTripDate, EndTripDate, FirstName, LastName, DocumentNumber,IssuDate,Expirydate;


        public DocumentNo()
        {
            InitializeComponent();
        }

        private void DocumentNo_Load(object sender, EventArgs e)
        {
            MonthCalendar.MaxSelectionCount = 100;
            MonthCalendar.ShowToday = true;
            NumericUpDown.Increment = 5;
            NumericUpDown.ReadOnly = true;
        }
        private void monthCalendar1_DateChanged(object sender, DateRangeEventArgs e)
        {

        }

        private void radioButton2_CheckedChanged(object sender, EventArgs e)
        {
            if (IDButton.Checked)
            {
                Document.Text = "Id Card NO :";
                DocumentIssue.Text = "Id Card Issue Date :";
                DocumentExpiry.Text = "Id Card Expiry Date :";
                IdCardNo = true;
            }
        }

        private void dateTimePicker1_ValueChanged(object sender, EventArgs e)
        {
            DateTime DT = DateTimeIssue.Value;
            DateTimeExpiry.MinDate = DT;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            To = ToBox.Text;
           From = FromBox.Text;
        }

        private void PassportButton_CheckedChanged(object sender, EventArgs e)
        {
            if (PassportButton.Checked)
            {
                Document.Text = "Passport NO :";
                DocumentIssue.Text = "Passport Issue Date :";
                DocumentExpiry.Text = "Passport Expiry Date:";
                password = true;
            }
        }
    }
}
