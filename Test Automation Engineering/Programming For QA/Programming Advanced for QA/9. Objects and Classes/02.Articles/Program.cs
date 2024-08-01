using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _02._Articles
{
    public class Program
    {
        static void Main(string[] args)
        {
         
            string[] articleInfo = Console.ReadLine().Split(", ");
            string title = articleInfo[0];
            string content = articleInfo[1];
            string author = articleInfo[2];

           
            Article article = new Article(title, content, author);

           
            int n = int.Parse(Console.ReadLine());

           
            for (int i = 0; i < n; i++)
            {
                string[] command = Console.ReadLine().Split(": ");
                string action = command[0];
                string parameter = command[1];

              
                switch (action)
                {
                    case "Edit":
                        article.Edit(parameter);
                        break;
                    case "ChangeAuthor":
                        article.ChangeAuthor(parameter);
                        break;
                    case "Rename":
                        article.Rename(parameter);
                        break;
                }
            }

          
            Console.WriteLine(article);
        }
    }
}
