using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace DynamicMenus
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();

            MyMenus = new List<IMenuItem>();
            MyMenus.Add(new MulMenuItem { MenuText = "First", MenuCommand = new MyCommand() });
            MyMenus.Add(new MulMenuItem { MenuText = "Second", MenuCommand = new MyCommand() });

            this.DataContext = this;
        }

        public IList<IMenuItem> MyMenus { get; set; }
    }

    public interface IMenuItem
    {
        string MenuText { get; set; }

        /// <summary>
        /// Gets the sub menu items.
        /// </summary>
        IEnumerable<IMenuItem> SubMenuItems { get; }

        /// <summary>
        /// Gets the command that is associated with the Menu
        /// </summary>
        ICommand MenuCommand { get; }

        /// <summary>
        /// Gets the data (data context) that is associated with this menu item
        /// </summary>
        object Data { get; set; }
    }

    public class MyCommand : ICommand
    {
        public event EventHandler CanExecuteChanged;

        public bool CanExecute(object parameter)
        {
            return true;
        }

        public void Execute(object parameter)
        {
            MessageBox.Show("1");
        }
    }

    public class MulMenuItem : IMenuItem
    {
        public object Data { get; set; }

        public ICommand MenuCommand { get; set; }

        public string MenuText { get; set; }

        public IEnumerable<IMenuItem> SubMenuItems
        {
            get
            {
                return null;
            }
        }
    }
}
