namespace Tic_Tac_Toe_Game
{
    partial class Dashboard
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Dashboard));
            this.panel = new System.Windows.Forms.Panel();
            this.Win = new System.Windows.Forms.Label();
            this.Con = new System.Windows.Forms.Label();
            this.panel2 = new System.Windows.Forms.Panel();
            this.running = new System.Windows.Forms.Button();
            this.Home = new System.Windows.Forms.Button();
            this.panel1 = new System.Windows.Forms.Panel();
            this.pictureBox3 = new System.Windows.Forms.PictureBox();
            this.SPP = new System.Windows.Forms.Label();
            this.pictureBox2 = new System.Windows.Forms.PictureBox();
            this.label = new System.Windows.Forms.Label();
            this.FPP = new System.Windows.Forms.Label();
            this.Player2 = new System.Windows.Forms.Label();
            this.Player1 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.Toss = new System.Windows.Forms.Label();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.nine = new System.Windows.Forms.Button();
            this.eight = new System.Windows.Forms.Button();
            this.seven = new System.Windows.Forms.Button();
            this.six = new System.Windows.Forms.Button();
            this.five = new System.Windows.Forms.Button();
            this.four = new System.Windows.Forms.Button();
            this.three = new System.Windows.Forms.Button();
            this.two = new System.Windows.Forms.Button();
            this.one = new System.Windows.Forms.Button();
            this.panel.SuspendLayout();
            this.panel2.SuspendLayout();
            this.panel1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox3)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // panel
            // 
            this.panel.BackColor = System.Drawing.Color.MidnightBlue;
            this.panel.Controls.Add(this.Win);
            this.panel.Controls.Add(this.Con);
            this.panel.Controls.Add(this.panel2);
            this.panel.Controls.Add(this.panel1);
            this.panel.Controls.Add(this.Toss);
            this.panel.Controls.Add(this.pictureBox1);
            this.panel.Controls.Add(this.nine);
            this.panel.Controls.Add(this.eight);
            this.panel.Controls.Add(this.seven);
            this.panel.Controls.Add(this.six);
            this.panel.Controls.Add(this.five);
            this.panel.Controls.Add(this.four);
            this.panel.Controls.Add(this.three);
            this.panel.Controls.Add(this.two);
            this.panel.Controls.Add(this.one);
            this.panel.Dock = System.Windows.Forms.DockStyle.Fill;
            this.panel.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.panel.Location = new System.Drawing.Point(0, 0);
            this.panel.Name = "panel";
            this.panel.Size = new System.Drawing.Size(450, 450);
            this.panel.TabIndex = 0;
            this.panel.Paint += new System.Windows.Forms.PaintEventHandler(this.panel_Paint);
            this.panel.MouseDown += new System.Windows.Forms.MouseEventHandler(this.panel_MouseDown);
            this.panel.MouseMove += new System.Windows.Forms.MouseEventHandler(this.panel_MouseMove);
            // 
            // Win
            // 
            this.Win.AutoSize = true;
            this.Win.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Win.ForeColor = System.Drawing.Color.White;
            this.Win.Location = new System.Drawing.Point(151, 128);
            this.Win.Name = "Win";
            this.Win.Size = new System.Drawing.Size(48, 19);
            this.Win.TabIndex = 40;
            this.Win.Text = "Game";
            // 
            // Con
            // 
            this.Con.AutoSize = true;
            this.Con.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Con.ForeColor = System.Drawing.Color.White;
            this.Con.Location = new System.Drawing.Point(174, 103);
            this.Con.Name = "Con";
            this.Con.Size = new System.Drawing.Size(48, 19);
            this.Con.TabIndex = 39;
            this.Con.Text = "Game";
            // 
            // panel2
            // 
            this.panel2.Controls.Add(this.running);
            this.panel2.Controls.Add(this.Home);
            this.panel2.Location = new System.Drawing.Point(12, 389);
            this.panel2.Name = "panel2";
            this.panel2.Size = new System.Drawing.Size(426, 38);
            this.panel2.TabIndex = 38;
            // 
            // running
            // 
            this.running.FlatAppearance.BorderSize = 0;
            this.running.Font = new System.Drawing.Font("Arial Narrow", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.running.Location = new System.Drawing.Point(259, 4);
            this.running.Name = "running";
            this.running.Size = new System.Drawing.Size(120, 31);
            this.running.TabIndex = 38;
            this.running.Text = "PLAY AGAIN";
            this.running.UseVisualStyleBackColor = true;
            this.running.Click += new System.EventHandler(this.running_Click_1);
            // 
            // Home
            // 
            this.Home.Font = new System.Drawing.Font("Arial Narrow", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Home.Location = new System.Drawing.Point(47, 4);
            this.Home.Name = "Home";
            this.Home.Size = new System.Drawing.Size(120, 31);
            this.Home.TabIndex = 37;
            this.Home.Text = "GO TO HOME";
            this.Home.UseVisualStyleBackColor = true;
            this.Home.Click += new System.EventHandler(this.Home_Click_1);
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.pictureBox3);
            this.panel1.Controls.Add(this.SPP);
            this.panel1.Controls.Add(this.pictureBox2);
            this.panel1.Controls.Add(this.label);
            this.panel1.Controls.Add(this.FPP);
            this.panel1.Controls.Add(this.Player2);
            this.panel1.Controls.Add(this.Player1);
            this.panel1.Controls.Add(this.label1);
            this.panel1.Location = new System.Drawing.Point(105, 8);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(225, 91);
            this.panel1.TabIndex = 37;
            // 
            // pictureBox3
            // 
            this.pictureBox3.Image = ((System.Drawing.Image)(resources.GetObject("pictureBox3.Image")));
            this.pictureBox3.Location = new System.Drawing.Point(48, 11);
            this.pictureBox3.Name = "pictureBox3";
            this.pictureBox3.Size = new System.Drawing.Size(26, 26);
            this.pictureBox3.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox3.TabIndex = 40;
            this.pictureBox3.TabStop = false;
            // 
            // SPP
            // 
            this.SPP.AutoSize = true;
            this.SPP.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.SPP.ForeColor = System.Drawing.Color.White;
            this.SPP.Location = new System.Drawing.Point(113, 57);
            this.SPP.Name = "SPP";
            this.SPP.Size = new System.Drawing.Size(24, 25);
            this.SPP.TabIndex = 38;
            this.SPP.Text = "0";
            // 
            // pictureBox2
            // 
            this.pictureBox2.Image = ((System.Drawing.Image)(resources.GetObject("pictureBox2.Image")));
            this.pictureBox2.Location = new System.Drawing.Point(149, 11);
            this.pictureBox2.Name = "pictureBox2";
            this.pictureBox2.Size = new System.Drawing.Size(26, 26);
            this.pictureBox2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox2.TabIndex = 39;
            this.pictureBox2.TabStop = false;
            // 
            // label
            // 
            this.label.AutoSize = true;
            this.label.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label.ForeColor = System.Drawing.Color.White;
            this.label.Location = new System.Drawing.Point(103, 55);
            this.label.Name = "label";
            this.label.Size = new System.Drawing.Size(18, 25);
            this.label.TabIndex = 37;
            this.label.Text = ":";
            // 
            // FPP
            // 
            this.FPP.AutoSize = true;
            this.FPP.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.FPP.ForeColor = System.Drawing.Color.White;
            this.FPP.Location = new System.Drawing.Point(87, 57);
            this.FPP.Name = "FPP";
            this.FPP.Size = new System.Drawing.Size(24, 25);
            this.FPP.TabIndex = 36;
            this.FPP.Text = "0";
            // 
            // Player2
            // 
            this.Player2.AutoSize = true;
            this.Player2.Font = new System.Drawing.Font("Cambria", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Player2.ForeColor = System.Drawing.Color.White;
            this.Player2.Location = new System.Drawing.Point(143, 40);
            this.Player2.Name = "Player2";
            this.Player2.Size = new System.Drawing.Size(73, 22);
            this.Player2.TabIndex = 35;
            this.Player2.Text = "Player2";
            // 
            // Player1
            // 
            this.Player1.AutoSize = true;
            this.Player1.Font = new System.Drawing.Font("Cambria", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Player1.ForeColor = System.Drawing.Color.White;
            this.Player1.Location = new System.Drawing.Point(24, 40);
            this.Player1.Name = "Player1";
            this.Player1.Size = new System.Drawing.Size(73, 22);
            this.Player1.TabIndex = 34;
            this.Player1.Text = "Player1";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Cambria", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.ForeColor = System.Drawing.Color.White;
            this.label1.Location = new System.Drawing.Point(81, 9);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(62, 25);
            this.label1.TabIndex = 33;
            this.label1.Text = "Game";
            // 
            // Toss
            // 
            this.Toss.AutoSize = true;
            this.Toss.Font = new System.Drawing.Font("Cambria", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Toss.ForeColor = System.Drawing.Color.White;
            this.Toss.Location = new System.Drawing.Point(89, 127);
            this.Toss.Name = "Toss";
            this.Toss.Size = new System.Drawing.Size(48, 19);
            this.Toss.TabIndex = 34;
            this.Toss.Text = "Game";
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = ((System.Drawing.Image)(resources.GetObject("pictureBox1.Image")));
            this.pictureBox1.Location = new System.Drawing.Point(9, 8);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(26, 26);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox1.TabIndex = 33;
            this.pictureBox1.TabStop = false;
            this.pictureBox1.Click += new System.EventHandler(this.pictureBox1_Click);
            // 
            // nine
            // 
            this.nine.BackColor = System.Drawing.Color.White;
            this.nine.FlatAppearance.BorderSize = 0;
            this.nine.ForeColor = System.Drawing.Color.Green;
            this.nine.Location = new System.Drawing.Point(265, 289);
            this.nine.Name = "nine";
            this.nine.Size = new System.Drawing.Size(80, 61);
            this.nine.TabIndex = 26;
            this.nine.UseVisualStyleBackColor = false;
            this.nine.Click += new System.EventHandler(this.nine_Click);
            // 
            // eight
            // 
            this.eight.BackColor = System.Drawing.Color.White;
            this.eight.FlatAppearance.BorderSize = 0;
            this.eight.ForeColor = System.Drawing.Color.Green;
            this.eight.Location = new System.Drawing.Point(179, 289);
            this.eight.Name = "eight";
            this.eight.Size = new System.Drawing.Size(80, 61);
            this.eight.TabIndex = 25;
            this.eight.UseVisualStyleBackColor = false;
            this.eight.Click += new System.EventHandler(this.eight_Click);
            // 
            // seven
            // 
            this.seven.BackColor = System.Drawing.Color.White;
            this.seven.FlatAppearance.BorderSize = 0;
            this.seven.ForeColor = System.Drawing.Color.Green;
            this.seven.Location = new System.Drawing.Point(93, 289);
            this.seven.Name = "seven";
            this.seven.Size = new System.Drawing.Size(80, 61);
            this.seven.TabIndex = 24;
            this.seven.UseVisualStyleBackColor = false;
            this.seven.Click += new System.EventHandler(this.seven_Click);
            // 
            // six
            // 
            this.six.BackColor = System.Drawing.Color.White;
            this.six.FlatAppearance.BorderSize = 0;
            this.six.ForeColor = System.Drawing.Color.Green;
            this.six.Location = new System.Drawing.Point(265, 222);
            this.six.Name = "six";
            this.six.Size = new System.Drawing.Size(80, 61);
            this.six.TabIndex = 23;
            this.six.UseVisualStyleBackColor = false;
            this.six.Click += new System.EventHandler(this.six_Click);
            // 
            // five
            // 
            this.five.BackColor = System.Drawing.Color.White;
            this.five.FlatAppearance.BorderSize = 0;
            this.five.ForeColor = System.Drawing.Color.Green;
            this.five.Location = new System.Drawing.Point(179, 222);
            this.five.Name = "five";
            this.five.Size = new System.Drawing.Size(80, 61);
            this.five.TabIndex = 22;
            this.five.UseVisualStyleBackColor = false;
            this.five.Click += new System.EventHandler(this.five_Click);
            // 
            // four
            // 
            this.four.BackColor = System.Drawing.Color.White;
            this.four.FlatAppearance.BorderSize = 0;
            this.four.ForeColor = System.Drawing.Color.Green;
            this.four.Location = new System.Drawing.Point(93, 222);
            this.four.Name = "four";
            this.four.Size = new System.Drawing.Size(80, 61);
            this.four.TabIndex = 21;
            this.four.UseVisualStyleBackColor = false;
            this.four.Click += new System.EventHandler(this.four_Click);
            // 
            // three
            // 
            this.three.BackColor = System.Drawing.Color.White;
            this.three.FlatAppearance.BorderSize = 0;
            this.three.ForeColor = System.Drawing.Color.Green;
            this.three.Location = new System.Drawing.Point(265, 155);
            this.three.Name = "three";
            this.three.Size = new System.Drawing.Size(80, 61);
            this.three.TabIndex = 20;
            this.three.UseVisualStyleBackColor = false;
            this.three.Click += new System.EventHandler(this.three_Click);
            // 
            // two
            // 
            this.two.BackColor = System.Drawing.Color.White;
            this.two.FlatAppearance.BorderSize = 0;
            this.two.ForeColor = System.Drawing.Color.Green;
            this.two.Location = new System.Drawing.Point(179, 155);
            this.two.Name = "two";
            this.two.Size = new System.Drawing.Size(80, 61);
            this.two.TabIndex = 19;
            this.two.UseVisualStyleBackColor = false;
            this.two.Click += new System.EventHandler(this.two_Click);
            // 
            // one
            // 
            this.one.BackColor = System.Drawing.Color.White;
            this.one.FlatAppearance.BorderColor = System.Drawing.Color.White;
            this.one.FlatAppearance.BorderSize = 0;
            this.one.FlatAppearance.MouseDownBackColor = System.Drawing.Color.White;
            this.one.FlatAppearance.MouseOverBackColor = System.Drawing.Color.White;
            this.one.ForeColor = System.Drawing.Color.Green;
            this.one.Location = new System.Drawing.Point(93, 156);
            this.one.Name = "one";
            this.one.Size = new System.Drawing.Size(80, 60);
            this.one.TabIndex = 18;
            this.one.UseVisualStyleBackColor = false;
            this.one.Click += new System.EventHandler(this.one_Click);
            // 
            // Dashboard
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(450, 450);
            this.Controls.Add(this.panel);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "Dashboard";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Tic Tac Toe";
            this.Load += new System.EventHandler(this.Dashboard_Load);
            this.panel.ResumeLayout(false);
            this.panel.PerformLayout();
            this.panel2.ResumeLayout(false);
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox3)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion
        private System.Windows.Forms.Panel panel;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.Label Toss;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Label SPP;
        private System.Windows.Forms.Label label;
        private System.Windows.Forms.Label FPP;
        private System.Windows.Forms.Label Player2;
        private System.Windows.Forms.Label Player1;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Panel panel2;
        private System.Windows.Forms.Button running;
        private System.Windows.Forms.Button Home;
        private System.Windows.Forms.Button nine;
        private System.Windows.Forms.Button eight;
        private System.Windows.Forms.Button seven;
        private System.Windows.Forms.Button six;
        private System.Windows.Forms.Button five;
        private System.Windows.Forms.Button four;
        private System.Windows.Forms.Button three;
        private System.Windows.Forms.Button two;
        private System.Windows.Forms.Button one;
        private System.Windows.Forms.PictureBox pictureBox3;
        private System.Windows.Forms.PictureBox pictureBox2;
        private System.Windows.Forms.Label Win;
        private System.Windows.Forms.Label Con;
    }
}

