namespace Registration
{
    partial class Form1
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
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.FirstNameTextBox = new System.Windows.Forms.TextBox();
            this.LastTextBox = new System.Windows.Forms.TextBox();
            this.EmailTextBox = new System.Windows.Forms.TextBox();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.SMSCheckBox = new System.Windows.Forms.CheckBox();
            this.ReportsCheckBox = new System.Windows.Forms.CheckBox();
            this.TransactionsCheckBox = new System.Windows.Forms.CheckBox();
            this.SMS = new System.Windows.Forms.Label();
            this.Transactions = new System.Windows.Forms.Label();
            this.SignButton = new System.Windows.Forms.Button();
            this.groupBox1.SuspendLayout();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(261, 58);
            this.label1.Margin = new System.Windows.Forms.Padding(5, 0, 5, 0);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(105, 19);
            this.label1.TabIndex = 0;
            this.label1.Text = "First Name : ";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(261, 106);
            this.label2.Margin = new System.Windows.Forms.Padding(5, 0, 5, 0);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(100, 19);
            this.label2.TabIndex = 1;
            this.label2.Text = "Last Name :";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(261, 154);
            this.label3.Margin = new System.Windows.Forms.Padding(5, 0, 5, 0);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(128, 19);
            this.label3.TabIndex = 2;
            this.label3.Text = "Email Address :";
            // 
            // FirstNameTextBox
            // 
            this.FirstNameTextBox.Location = new System.Drawing.Point(410, 56);
            this.FirstNameTextBox.Name = "FirstNameTextBox";
            this.FirstNameTextBox.Size = new System.Drawing.Size(447, 26);
            this.FirstNameTextBox.TabIndex = 3;
            // 
            // LastTextBox
            // 
            this.LastTextBox.Location = new System.Drawing.Point(410, 106);
            this.LastTextBox.Name = "LastTextBox";
            this.LastTextBox.Size = new System.Drawing.Size(447, 26);
            this.LastTextBox.TabIndex = 4;
            // 
            // EmailTextBox
            // 
            this.EmailTextBox.Location = new System.Drawing.Point(410, 151);
            this.EmailTextBox.Name = "EmailTextBox";
            this.EmailTextBox.Size = new System.Drawing.Size(447, 26);
            this.EmailTextBox.TabIndex = 5;
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.Transactions);
            this.groupBox1.Controls.Add(this.SMS);
            this.groupBox1.Controls.Add(this.TransactionsCheckBox);
            this.groupBox1.Controls.Add(this.ReportsCheckBox);
            this.groupBox1.Controls.Add(this.SMSCheckBox);
            this.groupBox1.Location = new System.Drawing.Point(265, 261);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(592, 162);
            this.groupBox1.TabIndex = 6;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Services";
            // 
            // SMSCheckBox
            // 
            this.SMSCheckBox.AutoSize = true;
            this.SMSCheckBox.Font = new System.Drawing.Font("Arial", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.SMSCheckBox.Location = new System.Drawing.Point(131, 25);
            this.SMSCheckBox.Name = "SMSCheckBox";
            this.SMSCheckBox.Size = new System.Drawing.Size(138, 20);
            this.SMSCheckBox.TabIndex = 0;
            this.SMSCheckBox.Text = "SMS Notifications";
            this.SMSCheckBox.UseVisualStyleBackColor = true;
            this.SMSCheckBox.CheckedChanged += new System.EventHandler(this.SMSCheckBox_CheckedChanged);
            // 
            // ReportsCheckBox
            // 
            this.ReportsCheckBox.AutoSize = true;
            this.ReportsCheckBox.Font = new System.Drawing.Font("Arial", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.ReportsCheckBox.Location = new System.Drawing.Point(131, 70);
            this.ReportsCheckBox.Name = "ReportsCheckBox";
            this.ReportsCheckBox.Size = new System.Drawing.Size(75, 20);
            this.ReportsCheckBox.TabIndex = 1;
            this.ReportsCheckBox.Text = "Reports";
            this.ReportsCheckBox.UseVisualStyleBackColor = true;
            this.ReportsCheckBox.CheckedChanged += new System.EventHandler(this.ReportsCheckBox_CheckedChanged);
            // 
            // TransactionsCheckBox
            // 
            this.TransactionsCheckBox.AutoSize = true;
            this.TransactionsCheckBox.Font = new System.Drawing.Font("Arial", 9.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.TransactionsCheckBox.Location = new System.Drawing.Point(131, 113);
            this.TransactionsCheckBox.Name = "TransactionsCheckBox";
            this.TransactionsCheckBox.Size = new System.Drawing.Size(158, 20);
            this.TransactionsCheckBox.TabIndex = 2;
            this.TransactionsCheckBox.Text = "Transactions Reports";
            this.TransactionsCheckBox.UseVisualStyleBackColor = true;
            this.TransactionsCheckBox.CheckedChanged += new System.EventHandler(this.TransactionsCheckBox_CheckedChanged);
            // 
            // SMS
            // 
            this.SMS.AutoSize = true;
            this.SMS.ForeColor = System.Drawing.Color.LightSalmon;
            this.SMS.Location = new System.Drawing.Point(331, 29);
            this.SMS.Margin = new System.Windows.Forms.Padding(5, 0, 5, 0);
            this.SMS.Name = "SMS";
            this.SMS.Size = new System.Drawing.Size(49, 19);
            this.SMS.TabIndex = 3;
            this.SMS.Text = "..........";
            // 
            // Transactions
            // 
            this.Transactions.AutoSize = true;
            this.Transactions.ForeColor = System.Drawing.Color.LightSalmon;
            this.Transactions.Location = new System.Drawing.Point(331, 117);
            this.Transactions.Margin = new System.Windows.Forms.Padding(5, 0, 5, 0);
            this.Transactions.Name = "Transactions";
            this.Transactions.Size = new System.Drawing.Size(57, 19);
            this.Transactions.TabIndex = 4;
            this.Transactions.Text = "........... ";
            // 
            // SignButton
            // 
            this.SignButton.Location = new System.Drawing.Point(753, 473);
            this.SignButton.Name = "SignButton";
            this.SignButton.Size = new System.Drawing.Size(104, 34);
            this.SignButton.TabIndex = 7;
            this.SignButton.Text = "Sign Up";
            this.SignButton.UseVisualStyleBackColor = true;
            this.SignButton.Click += new System.EventHandler(this.SignButton_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(10F, 19F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1333, 547);
            this.Controls.Add(this.SignButton);
            this.Controls.Add(this.groupBox1);
            this.Controls.Add(this.EmailTextBox);
            this.Controls.Add(this.LastTextBox);
            this.Controls.Add(this.FirstNameTextBox);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Margin = new System.Windows.Forms.Padding(5, 4, 5, 4);
            this.Name = "Form1";
            this.Text = "Form1";
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox FirstNameTextBox;
        private System.Windows.Forms.TextBox LastTextBox;
        private System.Windows.Forms.TextBox EmailTextBox;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.Label Transactions;
        private System.Windows.Forms.Label SMS;
        private System.Windows.Forms.CheckBox TransactionsCheckBox;
        private System.Windows.Forms.CheckBox ReportsCheckBox;
        private System.Windows.Forms.CheckBox SMSCheckBox;
        private System.Windows.Forms.Button SignButton;
    }
}

