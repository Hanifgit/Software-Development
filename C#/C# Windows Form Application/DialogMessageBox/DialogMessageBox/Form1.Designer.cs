namespace DialogMessageBox
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
            this.ButtonYes = new System.Windows.Forms.Button();
            this.TextCancle = new System.Windows.Forms.Label();
            this.TextYes = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // ButtonYes
            // 
            this.ButtonYes.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.ButtonYes.Location = new System.Drawing.Point(276, 82);
            this.ButtonYes.Name = "ButtonYes";
            this.ButtonYes.Size = new System.Drawing.Size(104, 52);
            this.ButtonYes.TabIndex = 0;
            this.ButtonYes.Text = "Yes";
            this.ButtonYes.UseVisualStyleBackColor = true;
            this.ButtonYes.Click += new System.EventHandler(this.ButtonYes_Click);
            // 
            // TextCancle
            // 
            this.TextCancle.AutoSize = true;
            this.TextCancle.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.TextCancle.ForeColor = System.Drawing.Color.Red;
            this.TextCancle.Location = new System.Drawing.Point(110, 264);
            this.TextCancle.Name = "TextCancle";
            this.TextCancle.Size = new System.Drawing.Size(36, 18);
            this.TextCancle.TabIndex = 1;
            this.TextCancle.Text = ".......";
            // 
            // TextYes
            // 
            this.TextYes.AutoSize = true;
            this.TextYes.Font = new System.Drawing.Font("Arial", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.TextYes.ForeColor = System.Drawing.Color.ForestGreen;
            this.TextYes.Location = new System.Drawing.Point(110, 328);
            this.TextYes.Name = "TextYes";
            this.TextYes.Size = new System.Drawing.Size(40, 18);
            this.TextYes.TabIndex = 2;
            this.TextYes.Text = "........";
            this.TextYes.Click += new System.EventHandler(this.label2_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.TextYes);
            this.Controls.Add(this.TextCancle);
            this.Controls.Add(this.ButtonYes);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button ButtonYes;
        private System.Windows.Forms.Label TextCancle;
        private System.Windows.Forms.Label TextYes;
    }
}

