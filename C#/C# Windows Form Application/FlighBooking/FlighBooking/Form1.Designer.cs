namespace FlighBooking
{
    partial class DocumentNo
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.LabelTo = new System.Windows.Forms.Label();
            this.LabelFrom = new System.Windows.Forms.Label();
            this.ToBox = new System.Windows.Forms.TextBox();
            this.FromBox = new System.Windows.Forms.TextBox();
            this.MonthCalendar = new System.Windows.Forms.MonthCalendar();
            this.FirstNameBox = new System.Windows.Forms.TextBox();
            this.LastNameBox = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.PassportButton = new System.Windows.Forms.RadioButton();
            this.IDButton = new System.Windows.Forms.RadioButton();
            this.Document = new System.Windows.Forms.Label();
            this.DocumentBox = new System.Windows.Forms.TextBox();
            this.DocumentIssue = new System.Windows.Forms.Label();
            this.DateTimeIssue = new System.Windows.Forms.DateTimePicker();
            this.DocumentExpiry = new System.Windows.Forms.Label();
            this.DateTimeExpiry = new System.Windows.Forms.DateTimePicker();
            this.label7 = new System.Windows.Forms.Label();
            this.NumericUpDown = new System.Windows.Forms.NumericUpDown();
            this.label8 = new System.Windows.Forms.Label();
            this.BookButton = new System.Windows.Forms.Button();
            this.groupBox1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.NumericUpDown)).BeginInit();
            this.SuspendLayout();
            // 
            // LabelTo
            // 
            this.LabelTo.AutoSize = true;
            this.LabelTo.Font = new System.Drawing.Font("Arial", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.LabelTo.Location = new System.Drawing.Point(76, 49);
            this.LabelTo.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.LabelTo.Name = "LabelTo";
            this.LabelTo.Size = new System.Drawing.Size(31, 16);
            this.LabelTo.TabIndex = 0;
            this.LabelTo.Text = "To :";
            // 
            // LabelFrom
            // 
            this.LabelFrom.AutoSize = true;
            this.LabelFrom.Font = new System.Drawing.Font("Arial", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.LabelFrom.Location = new System.Drawing.Point(314, 50);
            this.LabelFrom.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.LabelFrom.Name = "LabelFrom";
            this.LabelFrom.Size = new System.Drawing.Size(49, 16);
            this.LabelFrom.TabIndex = 1;
            this.LabelFrom.Text = "From :";
            // 
            // ToBox
            // 
            this.ToBox.Location = new System.Drawing.Point(115, 47);
            this.ToBox.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.ToBox.Name = "ToBox";
            this.ToBox.Size = new System.Drawing.Size(148, 22);
            this.ToBox.TabIndex = 2;
            // 
            // FromBox
            // 
            this.FromBox.Location = new System.Drawing.Point(371, 48);
            this.FromBox.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.FromBox.Name = "FromBox";
            this.FromBox.Size = new System.Drawing.Size(140, 22);
            this.FromBox.TabIndex = 3;
            // 
            // MonthCalendar
            // 
            this.MonthCalendar.CalendarDimensions = new System.Drawing.Size(2, 1);
            this.MonthCalendar.Location = new System.Drawing.Point(79, 85);
            this.MonthCalendar.Margin = new System.Windows.Forms.Padding(13, 11, 13, 11);
            this.MonthCalendar.Name = "MonthCalendar";
            this.MonthCalendar.TabIndex = 4;
            this.MonthCalendar.DateChanged += new System.Windows.Forms.DateRangeEventHandler(this.monthCalendar1_DateChanged);
            // 
            // FirstNameBox
            // 
            this.FirstNameBox.Location = new System.Drawing.Point(165, 280);
            this.FirstNameBox.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.FirstNameBox.Name = "FirstNameBox";
            this.FirstNameBox.Size = new System.Drawing.Size(148, 22);
            this.FirstNameBox.TabIndex = 5;
            // 
            // LastNameBox
            // 
            this.LastNameBox.Location = new System.Drawing.Point(412, 283);
            this.LastNameBox.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.LastNameBox.Name = "LastNameBox";
            this.LastNameBox.Size = new System.Drawing.Size(148, 22);
            this.LastNameBox.TabIndex = 6;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Arial", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(76, 282);
            this.label1.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(84, 16);
            this.label1.TabIndex = 7;
            this.label1.Text = "First Name :";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Arial", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(324, 284);
            this.label2.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(83, 16);
            this.label2.TabIndex = 8;
            this.label2.Text = "Last Name :";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Arial", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(71, 334);
            this.label3.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(123, 16);
            this.label3.TabIndex = 9;
            this.label3.Text = "Travel Document :";
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.PassportButton);
            this.groupBox1.Controls.Add(this.IDButton);
            this.groupBox1.Location = new System.Drawing.Point(198, 325);
            this.groupBox1.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Padding = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.groupBox1.Size = new System.Drawing.Size(175, 34);
            this.groupBox1.TabIndex = 10;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "  ";
            // 
            // PassportButton
            // 
            this.PassportButton.AutoSize = true;
            this.PassportButton.Location = new System.Drawing.Point(0, 10);
            this.PassportButton.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.PassportButton.Name = "PassportButton";
            this.PassportButton.Size = new System.Drawing.Size(88, 20);
            this.PassportButton.TabIndex = 0;
            this.PassportButton.TabStop = true;
            this.PassportButton.Text = "Passport";
            this.PassportButton.UseVisualStyleBackColor = true;
            this.PassportButton.CheckedChanged += new System.EventHandler(this.PassportButton_CheckedChanged);
            // 
            // IDButton
            // 
            this.IDButton.AutoSize = true;
            this.IDButton.Location = new System.Drawing.Point(96, 11);
            this.IDButton.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.IDButton.Name = "IDButton";
            this.IDButton.Size = new System.Drawing.Size(78, 20);
            this.IDButton.TabIndex = 1;
            this.IDButton.TabStop = true;
            this.IDButton.Text = "ID Card";
            this.IDButton.UseVisualStyleBackColor = true;
            this.IDButton.CheckedChanged += new System.EventHandler(this.radioButton2_CheckedChanged);
            // 
            // Document
            // 
            this.Document.AutoSize = true;
            this.Document.Font = new System.Drawing.Font("Arial", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Document.Location = new System.Drawing.Point(384, 339);
            this.Document.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.Document.Name = "Document";
            this.Document.Size = new System.Drawing.Size(97, 16);
            this.Document.TabIndex = 11;
            this.Document.Text = "Document No:";
            // 
            // DocumentBox
            // 
            this.DocumentBox.Location = new System.Drawing.Point(489, 337);
            this.DocumentBox.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.DocumentBox.Name = "DocumentBox";
            this.DocumentBox.Size = new System.Drawing.Size(148, 22);
            this.DocumentBox.TabIndex = 12;
            // 
            // DocumentIssue
            // 
            this.DocumentIssue.AutoSize = true;
            this.DocumentIssue.Font = new System.Drawing.Font("Arial", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.DocumentIssue.Location = new System.Drawing.Point(76, 383);
            this.DocumentIssue.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.DocumentIssue.Name = "DocumentIssue";
            this.DocumentIssue.Size = new System.Drawing.Size(149, 16);
            this.DocumentIssue.TabIndex = 13;
            this.DocumentIssue.Text = "Document Issue Date :";
            // 
            // DateTimeIssue
            // 
            this.DateTimeIssue.Location = new System.Drawing.Point(228, 381);
            this.DateTimeIssue.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.DateTimeIssue.Name = "DateTimeIssue";
            this.DateTimeIssue.Size = new System.Drawing.Size(264, 22);
            this.DateTimeIssue.TabIndex = 14;
            this.DateTimeIssue.ValueChanged += new System.EventHandler(this.dateTimePicker1_ValueChanged);
            // 
            // DocumentExpiry
            // 
            this.DocumentExpiry.AutoSize = true;
            this.DocumentExpiry.Font = new System.Drawing.Font("Arial", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.DocumentExpiry.Location = new System.Drawing.Point(499, 385);
            this.DocumentExpiry.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.DocumentExpiry.Name = "DocumentExpiry";
            this.DocumentExpiry.Size = new System.Drawing.Size(157, 16);
            this.DocumentExpiry.TabIndex = 15;
            this.DocumentExpiry.Text = "Document Expiry Date :";
            // 
            // DateTimeExpiry
            // 
            this.DateTimeExpiry.Location = new System.Drawing.Point(660, 384);
            this.DateTimeExpiry.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.DateTimeExpiry.Name = "DateTimeExpiry";
            this.DateTimeExpiry.Size = new System.Drawing.Size(267, 22);
            this.DateTimeExpiry.TabIndex = 16;
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Font = new System.Drawing.Font("Arial", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label7.Location = new System.Drawing.Point(79, 426);
            this.label7.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(73, 16);
            this.label7.TabIndex = 17;
            this.label7.Text = "Baggage :";
            // 
            // NumericUpDown
            // 
            this.NumericUpDown.Location = new System.Drawing.Point(157, 425);
            this.NumericUpDown.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.NumericUpDown.Name = "NumericUpDown";
            this.NumericUpDown.Size = new System.Drawing.Size(166, 22);
            this.NumericUpDown.TabIndex = 18;
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Font = new System.Drawing.Font("Arial", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label8.Location = new System.Drawing.Point(331, 429);
            this.label8.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(31, 16);
            this.label8.TabIndex = 19;
            this.label8.Text = "Kgs";
            // 
            // BookButton
            // 
            this.BookButton.BackColor = System.Drawing.Color.DarkSalmon;
            this.BookButton.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.BookButton.ForeColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.BookButton.Location = new System.Drawing.Point(79, 464);
            this.BookButton.Name = "BookButton";
            this.BookButton.Size = new System.Drawing.Size(848, 40);
            this.BookButton.TabIndex = 20;
            this.BookButton.Text = "Book (Without Paying)";
            this.BookButton.UseVisualStyleBackColor = false;
            this.BookButton.Click += new System.EventHandler(this.button1_Click);
            // 
            // DocumentNo
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(9F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1336, 671);
            this.Controls.Add(this.BookButton);
            this.Controls.Add(this.label8);
            this.Controls.Add(this.NumericUpDown);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.DateTimeExpiry);
            this.Controls.Add(this.DocumentExpiry);
            this.Controls.Add(this.DateTimeIssue);
            this.Controls.Add(this.DocumentIssue);
            this.Controls.Add(this.DocumentBox);
            this.Controls.Add(this.Document);
            this.Controls.Add(this.groupBox1);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.LastNameBox);
            this.Controls.Add(this.FirstNameBox);
            this.Controls.Add(this.MonthCalendar);
            this.Controls.Add(this.FromBox);
            this.Controls.Add(this.ToBox);
            this.Controls.Add(this.LabelFrom);
            this.Controls.Add(this.LabelTo);
            this.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.Name = "DocumentNo";
            this.Text = "Document No :";
            this.Load += new System.EventHandler(this.DocumentNo_Load);
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.NumericUpDown)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label LabelTo;
        private System.Windows.Forms.Label LabelFrom;
        private System.Windows.Forms.TextBox ToBox;
        private System.Windows.Forms.TextBox FromBox;
        private System.Windows.Forms.MonthCalendar MonthCalendar;
        private System.Windows.Forms.TextBox FirstNameBox;
        private System.Windows.Forms.TextBox LastNameBox;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.RadioButton PassportButton;
        private System.Windows.Forms.RadioButton IDButton;
        private System.Windows.Forms.Label Document;
        private System.Windows.Forms.TextBox DocumentBox;
        private System.Windows.Forms.Label DocumentIssue;
        private System.Windows.Forms.DateTimePicker DateTimeIssue;
        private System.Windows.Forms.Label DocumentExpiry;
        private System.Windows.Forms.DateTimePicker DateTimeExpiry;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.NumericUpDown NumericUpDown;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.Button BookButton;
    }
}

