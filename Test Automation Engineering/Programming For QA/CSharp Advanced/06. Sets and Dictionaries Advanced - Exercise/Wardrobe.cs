using System;
using System.Collections.Generic;

namespace Wardrobe
{
    internal class Wardrobe
    {
        static void Main(string[] args)
        {
            int number = int.Parse(Console.ReadLine());
            Dictionary<string, Dictionary<string, int>> wardrobe = new Dictionary<string, Dictionary<string, int>>();
            for (int i = 0; i < number; i++)
            {
                string[] inpit = Console.ReadLine().Split(" -> ");
                string color = inpit[0];
                string[] clothes = inpit[1].Split(",");
                if (!wardrobe.ContainsKey(color))
                    wardrobe[color] = new Dictionary<string, int>();
                foreach (var item in clothes)
                {
                    if (!wardrobe.ContainsKey(color))
                    {
                        wardrobe[color] = new Dictionary<string, int>();
                    }
                    if (!wardrobe[color].ContainsKey(item))
                    {
                        wardrobe[color].Add(item, 1);
                    }
                    else
                    {
                        wardrobe[color][item]++;
                    }
                }
            }
            string[] searchedItem = Console.ReadLine().Split();
            string searchedColor = searchedItem[0];
            string searchedClothe = searchedItem[1];
            foreach (var itemColor in wardrobe)
            {
                Console.WriteLine($"{itemColor.Key} clothes:");
                foreach (var itemClothes in itemColor.Value)
                {
                    if (itemClothes.Key == searchedClothe && itemColor.Key == searchedColor)
                    {
                        Console.WriteLine($"* {itemClothes.Key} - {itemClothes.Value} (found!)");
                    }
                    else
                    {
                        Console.WriteLine($"* {itemClothes.Key} - {itemClothes.Value}");
                    }
                }
            }
        }
    }
}
