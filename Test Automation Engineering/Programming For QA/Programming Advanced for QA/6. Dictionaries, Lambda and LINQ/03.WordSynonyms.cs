Dictionary<string, List<string>> wordSynonyms = new Dictionary<string, List<string>>();

int countWords = int.Parse(Console.ReadLine()); 


for (int count = 1; count <= countWords; count++)
{
    string word = Console.ReadLine(); 
    string synonym = Console.ReadLine();

    if (!wordSynonyms.ContainsKey(word))
    {
       
        wordSynonyms.Add(word, new List<string>());
        wordSynonyms[word].Add(synonym);
    }
    else
    {
        
        wordSynonyms[word].Add(synonym);
    }
}


foreach (KeyValuePair<string, List<string>> entry in wordSynonyms)
{
  
    Console.WriteLine(entry.Key + " - " + string.Join(", ", entry.Value));
}
